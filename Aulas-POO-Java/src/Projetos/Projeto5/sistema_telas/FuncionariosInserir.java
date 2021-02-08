package Projetos.Projeto5.sistema_telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Projetos.Projeto5.sistema.BancoDeDados;
import Projetos.Projeto5.sistema.Navegador;
import Projetos.Projeto5.sistema_entidades.Cargo;
import Projetos.Projeto5.sistema_entidades.Funcionario;

public class FuncionariosInserir extends JPanel
{
    JLabel labelTitulo, labelNome, labelSobrenome, labelDataNascimento, labelEmail, labelCargo, labelSalario;
    JTextField campoNome, campoSobrenome, campoEmail;
    JButton botaoGravar;
    JFormattedTextField campoDataNascimento, campoSalario;
    JComboBox comboboxCargo;
    
    private void criarComponentes()
    {
        setLayout(null); // Definido não usar gerenciador de layout
        
        /*
         * Componentes de tela instanciados
        */
        labelTitulo = new JLabel("Cadastro de Funcionario", JLabel.CENTER);
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
        labelNome = new JLabel("Nome: ", JLabel.LEFT);
        campoNome = new JTextField();
        labelSobrenome = new JLabel("Sobrenome: ", JLabel.LEFT);
        campoSobrenome = new JTextField();
        labelDataNascimento = new JLabel("Data de Nascimento: ", JLabel.LEFT); // DAQUI - começa aqui
        campoDataNascimento = new JFormattedTextField();
        try
        {
            MaskFormatter dateMask = new MaskFormatter("##/##/####");
            dateMask.install(campoDataNascimento);
        }
        catch(ParseException ex)
        {
            Logger.getLogger(FuncionariosInserir.class.getName()).log(Level.SEVERE, null, ex);
        } // ATÉ AQUI - Definida uma máscara para o campo de data de nascimento
        labelEmail = new JLabel ("E-mail: ", JLabel.LEFT);
        campoEmail = new JTextField();
        labelCargo = new JLabel("Cargo: ", JLabel.LEFT);
        comboboxCargo = new JComboBox(); // Definido o formato do campo de salário
        labelSalario = new JLabel("Salário: ", JLabel.LEFT);
        DecimalFormat formatter = new DecimalFormat("###0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        campoSalario = new JFormattedTextField(formatter);
        campoSalario.setValue(0.00);
        botaoGravar = new JButton("Adicionar");
        
        /*
         * Definidos o posicionamento e o tamanho dos componentes de tela
        */
        labelTitulo.setBounds(20, 20, 660, 40);
        labelNome.setBounds(150, 80, 400, 20);
        campoNome.setBounds(150, 100, 400, 40);
        labelSobrenome.setBounds(150, 140, 400, 20);
        campoSobrenome.setBounds(150, 160, 400, 20);
        labelDataNascimento.setBounds(150, 200, 400, 20);
        campoDataNascimento.setBounds(150, 220, 400, 40);
        labelEmail.setBounds(150, 260, 400, 20);
        campoEmail.setBounds(150, 280, 400, 40);
        labelCargo.setBounds(150, 320, 400, 20);
        comboboxCargo.setBounds(150, 340, 400, 40);
        labelSalario.setBounds(150, 380, 400, 20);
        campoSalario.setBounds(150, 400, 400, 40);
        botaoGravar.setBounds(560, 400, 130, 40);
        
        /*
         * Componentes adicionados à tela
        */
        add(labelTitulo);
        add(labelNome);
        add(campoNome);
        add(labelSobrenome);
        add(campoSobrenome);
        add(labelDataNascimento);
        add(campoDataNascimento);
        add(labelEmail);
        add(campoEmail);
        add(labelCargo);
        add(comboboxCargo);
        add(labelSalario);
        add(campoSalario);
        add(botaoGravar);
        
        // Chamada do método sqlCarregarCargos
        sqlCarregarCargos();
        
        // Comando para tornar a tela visível
        setVisible(true);
    }
    
    private void criarEventos()
    {
        /*
         * Definido que, ao ser acionado, o botão Salvar irá chamar o método sqlInserirFuncionário
        */
        botaoGravar.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Funcionario novoFuncionario = new Funcionario();
                novoFuncionario.setNome(campoNome.getText());
                novoFuncionario.setSobrenome(campoSobrenome.getText());
                novoFuncionario.setDataNascimento(campoDataNascimento.getText());
                novoFuncionario.setEmail(campoEmail.getText());
                Cargo cargoSelecionado = (Cargo)comboboxCargo.getSelectedItem();
                if(cargoSelecionado != null) novoFuncionario.setCargo(cargoSelecionado.getId());
                novoFuncionario.setSalario(Double.valueOf(campoSalario.getText().replace(",", ".")));
                sqlInserirFuncionanrio(novoFuncionario);
            }
        });
    }
    
    private void sqlCarregarCargos()
    {
        // Conexão
        Connection conexao;
        // Instrução SQL
        Statement instrucaoSQL;
        // Resultados
        ResultSet resultados;
        
        try
        {
            // Conectando ao banco de dados
            conexao = DriverManager.getConnection(BancoDeDados.stringDeConexao, BancoDeDados.usuario, BancoDeDados.senha);
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultados = instrucaoSQL.executeQuery("SELECTED * from cargos order by nome asc");
            comboboxCargo.removeAll();
            
            while(resultados.next())
            {
                Cargo cargo = new Cargo();
                cargo.setId(resultados.getInt("Id"));
                cargo.setNome(resultados.getString("nome"));
                comboboxCargo.addItem(cargo);
            }
            comboboxCargo.updateUI();
            
            conexao.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar os cargos.");
            Logger.getLogger(FuncionariosInserir.class.getName().log(Level.SEVERE, null, ex));
        }
    }

    
}