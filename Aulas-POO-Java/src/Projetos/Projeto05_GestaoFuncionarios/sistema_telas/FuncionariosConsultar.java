package Projetos.Projeto05_GestaoFuncionarios.sistema_telas;

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
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Projetos.Projeto05_GestaoFuncionarios.sistema.BancoDeDados;
import Projetos.Projeto05_GestaoFuncionarios.sistema.Navegador;
import Projetos.Projeto05_GestaoFuncionarios.sistema_entidades.Funcionario;

public class FuncionariosConsultar extends JPanel
{
    Funcionario funcionarioAtual;
    JLabel labelTitulo, labelFuncionario;
    JTextField campoFuncionario;
    JButton botaoPesquisar, botaoEditar, botaoExcluir;
    DefaultListModel<Funcionario> listasFuncionariosModelo = new DefaultListModel();
    JList<Funcionario> listaFuncionarios;
    
    public FuncionariosConsultar()
    {
        
    }
    
    private void criarComponentes()
    {
        setLayout(null); // Não será utilizado gerenciador de layout
        
        // Instanciados os componentes da tela
        labelTitulo = new JLabel("Consulta de Funcionários", JLabel.CENTER);
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
        labelFuncionario = new JLabel("Nome do Funcionário", JLabel.LEFT);
        campoFuncionario = new JTextField();
        botaoPesquisar = new JButton("Pesquisar Funcionário");
        botaoEditar = new JButton("Editar Funcionário");
        botaoEditar.setEnabled(false);
        botaoExcluir = new JButton("Excluir Funcionário");
        botaoExcluir.setEnabled(false);
        listasFuncionariosModelo = new DefaultListModel();
        listaFuncionarios = new JList();
        listaFuncionarios.setModel(listasFuncionariosModelo);
        listaFuncionarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        // Componentes posicionados e com tamanhos definidos
        labelTitulo.setBounds(20, 20, 660, 40);
        labelFuncionario.setBounds(150, 120, 400, 20);
        campoFuncionario.setBounds(150, 140, 400, 40);
        botaoPesquisar.setBounds(560, 140, 130, 40);
        listaFuncionarios.setBounds(150, 200, 400, 240);
        botaoEditar.setBounds(560, 360, 130, 40);
        botaoExcluir.setBounds(560, 400, 130, 40);
        
        // Componentes adicionados à tela
        add(labelTitulo);
        add(labelFuncionario);
        add(campoFuncionario);
        add(listaFuncionarios);
        add(botaoPesquisar);
        add(botaoEditar);
        add(botaoExcluir);
        
        // Tela tornada visível
        setVisible(true);
    }
    
    private void criarEventos()
    {
        /*
         * Ao ser acionado, o botão pesquisar chamará o método sqlPesquisarFuncionario
        */
        botaoPesquisar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sqlPesquisarFuncionarios(campoFuncionario.getText());
            }
        });
        
        /*
         * Ao ser acionado, o botão Editar Funcionário chamará o método funcionariosEditar da classe Navegador,
         * utilizando como argumento o funcionário selecionado na JList.
        */
        botaoEditar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Navegador.funcionariosEditar(funcionarioAtual);
            }
        });
        
        /*
         * Ao ser acionado, o botão Excluir Funcionário chamará o método sqlDeletarFuncionario
        */
        botaoExcluir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sqlDeletarFuncionario();
            }
        });
        
        /*
         * Ao se selecionar um funcionário na lista, esse funcionário será armazenado na variável funcionarioAtual, e
         * os botões Editar Cargo e Excluir Cargo serão habilitados.
        */
        listaFuncionarios.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e) 
            {
                funcionarioAtual = listaFuncionarios.getSelectedValue();
                if (funcionarioAtual == null)
                {
                    botaoEditar.setEnabled(false);
                    botaoExcluir.setEnabled(false);
                }
                else
                {
                    botaoEditar.setEnabled(true);
                    botaoExcluir.setEnabled(true);
                }
            }
        });
    }
    
    /*
     * Realiza-se a conexão com o banco de dados para obter todos os funcionários cadastrados no banco, 
     * de acordo com o nome que foi digitado, para inserir na JList.
    */
    private void sqlPesquisarFuncionarios(String nome)
    {
        // Conexão
        Connection conexao;
        // Instrução SQL
        Statement instrucaoSQL;
        ResultSet resultados;
        
        try
        {
            // Conectando ao banco de dados
            conexao = DriverManager.getConnection(BancoDeDados.stringDeConexao, BancoDeDados.usuario, BancoDeDados.senha);
            // Criando a instrução SQL
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultados = instrucaoSQL.executeQuery("SELECT * FROM funcionarios WHERE nome like '%" + nome + "%' order by nome ASC");
            
            listasFuncionariosModelo.clear();
            
            while (resultados.next())
            {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(resultados.getInt("id"));
                funcionario.setNome(resultados.getString("nome"));
                funcionario.setSobrenome(resultados.getString("sobrenome"));
                funcionario.setDataNascimento(resultados.getString("dataNascimento"));
                funcionario.setEmail(resultados.getString("email"));
                if(resultados.getString("cargo") != null) funcionario.setCargo(Integer.parseInt(resultados.getString("cargo")));
                funcionario.setSalario(Double.parseDouble(resultados.getString("salario")));
                
                listasFuncionariosModelo.addElement(funcionario);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao consultar funcionários.");
            Logger.getLogger(FuncionariosInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}