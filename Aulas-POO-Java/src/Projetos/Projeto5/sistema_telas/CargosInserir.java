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

public class CargosInserir extends JPanel
{
    JLabel labelTitulo;
    JLabel labelCargo;
    JTextField campoCargo;
    JButton botaoGravar;
    
    public CargosInserir()
    {
        criarComponentes();
        criarEventos();
    }
    
    private void criarComponentes()
    {
        setLayout(null); // definido que não será usado nenhum gerenciador de Layout
        
        /*
         * Nas linhas abaixo, foram instanciados os componentes da tela:
         * - Os componentes JLabel estão sendo inicializados com texto e alinhamento específicos
         * - Já o componente JButton, está sendo inicializado somente com texto de exibição
        */
        labelTitulo = new JLabel("Cadastro de Cargo", JLabel.CENTER);
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
        labelCargo = new JLabel("Nome do cargo", JLabel.LEFT);
        campoCargo = new JTextField();
        botaoGravar = new JButton("Adicionar Cargo");
        
        /*
         * Abaixo, componentes adicionados a tela
        */
        add(labelTitulo);
        add(labelCargo);
        add(campoCargo);
        add(botaoGravar);
        
        setVisible(true); // Tela tornada visível
    }
    
    /*
     * Nas linhas abaixo, está sendo definido que, ao ser acionado, o botão Adicionar Cargo
     * irá criar uma instância da entidade Cargo atribuindo ao cargo o valor do texto digitado
     * no JTextField campoCargo e por fim chamar o método sqlInserirCargo
    */
    private void criarEventos()
    {
        botaoGravar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Cargo novoCargo = new Cargo();
                novoCargo.setNome(campoCargo.getText());
                
                sqlInserirCargo(novoCargo);
            }
        });
    }
    
    private void sqlInserirCargo(Cargo novoCargo)
    {
        // validando o conteúdo do campo Nome do cargo - Caso não possua mais de três caracteres, aparecerá mensagem ao usuário pedindo para preencher correto
        if(campoCargo.getText().length() <= 3)
        {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome corretamente");
            return;
        }
        
        /*
         * Nas linha abaixo, até o fim do try/catch, realizamos a conexão com o banco de dados para inserir um novo cargo, de acordo com os dados que foram 
         * adicionados ao campo Nome do cargo
        */
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
            
            // Criando a Instrução SQL
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            instrucaoSQL.executeUpdate("INSERT INTO cargos(nome) VALUES ('"+novoCargo.getNome()+"')");
            
            JOptionPane.showMessageDialog(null, "Cargo adicionado com sucesso!");
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao adicionar o cargo.");
            Logger.getLogger(CargosInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}