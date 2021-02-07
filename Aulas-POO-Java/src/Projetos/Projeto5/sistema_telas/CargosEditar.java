package Projetos.Projeto5.sistema_telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Projetos.Projeto5.sistema.BancoDeDados;
import Projetos.Projeto5.sistema_entidades.Cargo;

public class CargosEditar extends JPanel
{
    Cargo cargoAtual;
    JLabel labelTitulo;
    JLabel labelCargo;
    JTextField campoCargo;
    JButton botaoGravar;

    public CargosEditar(Cargo cargo)
    {
        cargoAtual = cargo;
        criarComponentes();
        criarEventos();
    }
    
    private void criarComponentes()
    {
        setLayout(null);
        
        /*
         * Os componentes JLabel são inicializados com texto e alinhamento específicos
         * O componente JButton é inicializado somente com seu texto de exibição
         * O componente JTextField é inicializado com o nome do cargo
        */
        labelTitulo = new JLabel("Editar Cargo", JLabel.CENTER);
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
        labelCargo = new JLabel("Nome do cargo", JLabel.LEFT);
        campoCargo = new JTextField(cargoAtual.getNome());
        botaoGravar = new JButton("Salvar");
        
        /* 
         * Definição de posicionamento e tamanho dos componentes
        */
        labelTitulo.setBounds(20, 20, 660, 40);
        labelCargo.setBounds(150, 120, 400, 20);
        campoCargo.setBounds(150, 140, 400, 40);
        botaoGravar.setBounds(250, 380, 200, 40);
        
        // Componentes são adicionados na tela
        add(labelTitulo);
        add(labelCargo);
        add(campoCargo);
        add(botaoGravar);
        
        // Torna a tela visível
        setVisible(true);
    }
    
    // O botão Salvar chamará o método sqlAtualizarCargo
    private void criarEventos()
    {
        botaoGravar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cargoAtual.setNome(campoCargo.getText());
                sqlAtualizarCargo();
            }
        });
    }
    
    /*
     * É realizada a conexão com o banco de dados para que os dados do cargo selecionado sejam atualizados com 
     * os dados digitados
    */
    private void sqlAtualizarCargo()
    {
        // Validando nome
        if(campoCargo.getText().length() <=3)
        {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome corretamente.");
            return;
        }
        
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
            
            // Criando a instrução SQL
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            instrucaoSQL.executeUpdate("UPDATE cargos set nome='" + campoCargo.getText() + "' WHERE id=" + cargoAtual.getId() +"");
            
            JOptionPane.showMessageDialog(null, "Cargo atualizado com sucesso!");
            
            conexao.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar o cargo");
            Logger.getLogger(CargosInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}