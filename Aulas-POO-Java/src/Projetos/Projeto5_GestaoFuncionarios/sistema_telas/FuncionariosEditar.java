package Projetos.Projeto5_GestaoFuncionarios.sistema_telas;

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

import Projetos.Projeto5_GestaoFuncionarios.sistema.*;
import Projetos.Projeto5_GestaoFuncionarios.sistema_entidades.*;

public class FuncionariosEditar extends JPanel
{
    Funcionario funcionarioAtual;
    
    private void criarComponentes()
    {
        setLayout(null);
        
        String textoLabel = "Editar Funcionario" + funcionarioAtual.getNome() + " " + funcionarioAtual.getSobrenome();
        labelTitulo = new JLabel(textoLabel, JLabel.CENTER);
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
        labelNome = new JLabel("Nome:", JLabel.LEFT);
        campoNome = new JTextField(funcionarioAtual.getNome());
        labelSobrenome = new JLabel("Sobrenome:", JLabel.LEFT);
        campoSobrenome = new JTextField(funcionarioAtual.getSobrenome());
        labelDataNascimento = new JLabel("Data de Nascimento:", JLabel.LEFT);
        campoDataNascimento = new JFormattedTextField(funcionarioAtual.getDataNascimento());
        try
        {
            MaskFormatter dateMask = new MaskFormatter("##/##/####");
            dateMask.install(campoDataNascimento);
        }
        catch(ParseException ex)
        {
            Logger.getLogger(FuncionariosInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
        labelEmail = new JLabel("E-mail:", JLabel.LEFT);
        campoEmail = new JTextField(funcionarioAtual.getEmail());
        labelCargo = new JLabel("Cargo:", JLabel.LEFT);
        comboboxCargo = new JComboBox();
        labelSalario = new JLabel("Salário", JLabel.LEFT);
        DecimalFormat formatter = new DecimalFormat("###0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        campoSalario = new JFormattedTextField(formatter);
        campoSalario.setValue(funcionarioAtual.getSalario());
        botaoGravar = new JButton("Salvar");
        
        labelTitulo.setBounds(20, 20, 660, 40);
        labelNome.setBounds(150, 80, 400, 20);
        campoNome.setBounds(150, 100, 400, 40);
        labelSobrenome.setBounds(150, 140, 400, 20);
        campoSobrenome.setBounds(150, 160, 400, 40);
        labelDataNascimento.setBounds(150, 200, 400, 20);
        campoDataNascimento.setBounds(150, 220, 400, 40);
        labelEmail.setBounds(150, 260, 400, 20);
        campoEmail.setBounds(150, 280, 400, 40);
        labelCargo.setBounds(150, 320, 400, 40);
        comboboxCargo.setBounds(150, 340, 400, 40);
        labelSalario.setBounds(150, 380, 400, 20);
        campoSalario.setBounds(150, 400, 400, 40);
        botaoGravar.setBounds(560, 400, 130, 40);
        
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
        
        sqlCarregarCargos(funcionarioAtual.getCargo());
        
        setVisible(true);
    }
    
    private void criarEventos()
    {
        botaoGravar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                funcionarioAtual.setNome(campoNome.getText());
                funcionarioAtual.setSobrenome(campoSobrenome.getText());
                funcionarioAtual.setDataNascimento(campoDataNascimento.getText());
                funcionarioAtual.setEmail(campoEmail.getText());
                Cargo cargoSelecionado = (Cargo) comboboxCargo.getSelectedItem();
                if(cargoSelecionado != null) funcionarioAtual.setCargo(cargoSelecionado.getId());
                funcionarioAtual.setSalario(Double.valueOf(campoSalario.getText().replace(",", ".")));
                
                sqlAtualizarFuncionario();
            }
        });
    }
    
    private void sqlCarregarCargos(int cargoAtual)
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
            resultados = instrucaoSQL.executeQuery("SELECT * from cargos order by nome asc");
            
            while(resultados.next())
            {
                Cargo cargo = new Cargo();
                cargo.setId(resultados.getInt("Id"));
                cargo.setNome(resultados.getString("nome"));
                comboboxCargo.addItem(cargo);
                
                if(cargoAtual == cargo.getId()) comboboxCargo.setSelectedItem(cargo);
            }
            comboboxCargo.updateUI();
            
            conexao.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar cargos.");
            Logger.getLogger(FuncionariosInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void sqlAtualizarFuncionario()
    {
        // Validando Nome
        if(campoNome.getText().length() <= 3)
        {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome corretamente.");
            return;
        }
        
        // Validando sobrenome
        if(campoSobrenome.getText().length() <= 3)
        {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o sobrenome corretamente.");
            return;
        }
        
        // Validando Salário
        if(Double.parseDouble(campoSalario.getText().replace(",", ".")) <= 100)
        {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o salário corretamente");
            return;
        }
        
        // Validando email
        Boolean emailValidado = false;
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(campoEmail.getText());
        emailValidado = m.matches();
        
        if(!emailValidado)
        {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o e-mail corretamente.");
            return;
        }
        
        // Conexão
        Connection conexao;
        // Instrução SQL
        PreparedStatement instrucaoSQL;
        // Resultados
        ResultSet resultados;
        
        try
        {
            // Conectando ao Banco de Dados
            conexao = DriverManager.getConnection(BancoDeDados.stringDeConexao, BancoDeDados.usuario, BancoDeDados.senha);
            String template = "INSERT INTO funcionarios (nome, sobrenome, dataNascimento, email, cargo, salario)";
            template = template + "WhERE id=" + funcionarioAtual.getId();
            instrucaoSQL = conexao.prepareStatement(template);
            instrucaoSQL.setString(1, campoNome.getText());
            instrucaoSQL.setString(2, campoSobrenome.getText());
            instrucaoSQL.setString(3, campoDataNascimento.getText());
            instrucaoSQL.setString(4, campoEmail.getText());
            Cargo cargoSelecionado = (Cargo) comboboxCargo.getSelectedItem();
            if(cargoSelecionado != null)
            {
                instrucaoSQL.setInt(5, cargoSelecionado.getId());
            }
            else
            {
                instrucaoSQL.setNull(5, java.sql.Types.INTEGER);
            }
            instrucaoSQL.setString(6, campoSalario.getText().replace(",", "."));
            instrucaoSQL.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
            Navegador.inicio();
            
            conexao.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar o Funcionário.");
            Logger.getLogger(FuncionariosInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}