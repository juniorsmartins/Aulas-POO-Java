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
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Projetos.Projeto5.sistema.BancoDeDados;
import Projetos.Projeto5.sistema_entidades.Cargo;

public class CargosConsultar extends JPanel
{
    Cargo cargoAtual;
    JLabel labelTitulo;
    JLabel labelCargo;
    JTextField campoCargo;
    JButton botaoPesquisar, botaoEditar, botaoExcluir;
    DefaultListModel<Cargo> listasCargosModelo = new DefaultListModel();
    JList<Cargo> listaCargos;
    
    public CargosConsultar()
    {
        criarComponentes();
        criarEventos();
    }
    
    private void criarComponentes()
    {
        setLayout(null); // definido não usar gerenciador de layout
        
        /*
         * Componente da tela instanciados
        */
        labelTitulo = new JLabel("Consulta de Cargos", JLabel.CENTER);
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
        labelCargo = new JLabel("Nome do cargo", JLabel.LEFT);
        campoCargo = new JTextField();
        botaoPesquisar = new JButton("Pesquisar cargo");
        botaoEditar = new JButton("Editar cargo");
        botaoEditar.setEnabled(false);
        botaoExcluir = new JButton("Excluir cargo");
        botaoExcluir.setEnabled(false);
        listasCargosModelo = new DefaultListModel();
        listaCargos = new JList();
        listaCargos.setModel(listasCargosModelo);
        listaCargos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        /*
         * Posicionamento e tamanho de telas definido
        */
        labelTitulo.setBounds(20, 20, 660, 40);
        labelCargo.setBounds(150, 120, 400, 20);
        campoCargo.setBounds(150, 140, 400, 40);
        botaoPesquisar.setBounds(560, 140, 130, 40);
        listaCargos.setBounds(150, 200, 400, 240);
        botaoEditar.setBounds(560, 360, 130, 40);
        botaoExcluir.setBounds(560, 400, 130, 40);
        
        /*
         * Componentes adicionados na tela
        */
        add(labelTitulo);
        add(labelCargo);
        add(campoCargo);
        add(listaCargos);
        add(botaoPesquisar);
        add(botaoEditar);
        add(botaoExcluir);
        
        setVisible(true); // Tela tornada visível
    }
    
    private void criarEventos()
    {
        // ao ser acionado, o botão pesquisar cargo, chamará o método 
        // sqlPesquisarCargo, passando o valor do texto digitado o 
        // JTextField campoCargo
        botaoPesquisar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sqlPesquisarCargos(campoCargo.getText());
            }
        });
        
        botaoEditar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });

        /*
         * Ao ser acionado, o botão excluir cargo chamará o método sqlDeleterCargo
        */
        botaoExcluir.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sqlDeletarCargo();
            }
        });
        
        /*
         * ao selecionar algum cargo na lista, este será armazenado na variável
         * cargoAtual, e os botões Editar Cargo e Excluir Cargo serão habilitados
        */
        listaCargos.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                cargoAtual = listaCargos.getSelectedValue();
                if(cargoAtual == null)
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
     * realizada conexão com banco de dados para obter todo os cargos cadastrados e adicioná-los à lista de seleção
    */
    private void sqlPesquisarCargos(String nome)
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
            
            // Criando a instrução SQL
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultados = instrucaoSQL.executeQuery("SELECT * FROM cargos WHERE nome like '%" + nome + "%'");
            
            listasCargosModelo.clear();
            
            while(resultados.next())
            {
                Cargo cargo = new Cargo();
                cargo.setId(resultados.getInt("id"));
                cargo.setNome(resultados.getString("nome"));
                
                listasCargosModelo.addElement(cargo);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao consultar os cargos.");
            Logger.getLogger(CargosInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
     * Precisa selecionar um cargo na JList e clicar em Excluir Cargo
     * Ao ser acionado, o botão Excluir Cargo executará o método sqlDeletarCargo. E esse método se conectará com o 
     * banco de dados e executará a instrução SQL que irá remover o cargo selecionado
    */
    private void sqlDeletarCargo()
    {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Cargo" + cargoAtual.getNome() + 
                                                        "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if(confirmacao == JOptionPane.YES_OPTION)
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
                // Criando a instrução SQL
                instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                instrucaoSQL.executeUpdate("DELETE cargos WHERE id=" + cargoAtual.getId()+"");
                
                JOptionPane.showMessageDialog(null, "Cargo deletado com sucesso!");
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o cargo.");
                Logger.getLogger(CargosInserir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}