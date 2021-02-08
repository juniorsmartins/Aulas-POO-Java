package Projetos.Projeto5_GestaoFuncionarios.sistema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Projetos.Projeto5_GestaoFuncionarios.sistema_entidades.Cargo;

public class Navegador 
{
    // Menu
    private static boolean menuConstruido;
    private static boolean menuHabilitado;
    private static JMenuBar menuBar;
    private static JMenu menuArquivo, menuFuncionarios, menuCargos, menuRelatorios;
    private static JMenuItem miSair, miFuncionariosConsultar, miFuncionariosCadastrar, miCargosConsultar;
    private static JMenuItem miCargosCadastrar, miRelatoriosCargos, miRelatoriosSalarios;
    
    /*
     * O método login é responsável por instanciar a classe da tela de login,
     * alterar o título da janela e chamar o método atualizarTela
    */
    public static void login()
    {
        Sistema.tela = new Login();
        Sistema.frame.setTitle("Funcionários Company SA");
        Navegador.atualizarTela();
    }
    
    /*
     * O método Início é responsável por instanciar a classe da tela de início, 
     * alterar o título da janela e chamar o método atualizarTela
    */
    public static void inicio()
    {
        Sistema.tela = new Inicio();
        Sistema.frame.setTitle("Funcionários Company SA");
        Navegador.atualizarTela();
    }
    
    /*
     * O método cargosCadastrar é responsável por instanciar a classe da tela CargosInserir,
     * alterar o título da janela e chamar o método atualizarTela
    */
    public static void cargosCadastrar()
    {
        Sistema.tela = new CargosInserir();
        Sistema.frame.setTitle("Funcionários Company SA - Cadastrar cargos");
        Navegador.atualizarTela();
    }
    
    /*
     * O método cargosConsultar é responsável por instanciar a classe da tela CargosConsultar,
     * alterar o título da janela e chamar o método atualizarTela
    */    
    public static void cargosConsultar()
    {
        Sistema.tela = new CargosConsultar();
        Sistema.frame.setTitle("Funcionários Company SA - Consultar cargos");
        Navegador.atualizarTela();
    }
    
    /*
     * O método cargosEditar é responsável por instanciar a classe da tela CargosEditar,
     * alterar o título da janela e chamar o método atualizarTela
    */
    public static void cargosEditar(Cargo cargo)
    {
        Sistema.tela = new CargosEditar(cargo);
        Sistema.frame.setTitle("Funcionarios Company SA - Editar cargos");
        Navegador.atualizarTela();
    }
    
    /*
     * O método atualizarTela é responsável por remover a tela atual e adicionar e
     * adicionar a próxima tela, que foi instanciada na variável Sistema.tela pelos
     * métodos anteriores
    */
    public static void atualizarTela()
    {
        Sistema.frame.getContentPane().removeAll();
        Sistema.tela.setVisible(true);
        Sistema.frame.add(Sistema.tela);
        
        Sistema.frame.setVisible(true);
    }
    
    private static void construirMenu()
    {
        if(!menuConstruido)
        {
            menuConstruido = true;
            
            menuBar = new JMenuBar(); // JMenuBar instanciado
            
            // Menu arquivo
            /*
             * Criado o primeiro item do Menu, com o nome Arquivo, e adicionado um botão para fechar a aplicação (sair)
            */
            menuArquivo = new JMenu("Arquivo");
            menuBar.add(menuArquivo);
            miSair = new JMenuItem("Sair");
            menuArquivo.add(miSair);
            
            // Menu funcionários
            /*
             * Criado o segundo item do Menu, com o nome Funcionários. A ele adicionado um botão para acessar
             * a tela de cadastro de funcionários (Cadastrar) e outro botão para acessar a tela de consulta
             * de funcionários (Consultar)
            */
            menuFuncionarios = new JMenu("Funcionários");
            menuBar.add(menuFuncionarios);
            miFuncionariosCadastrar = new JMenuItem("Cadastrar");
            menuFuncionarios.add(miFuncionariosCadastrar);
            miFuncionariosConsultar = new JMenuItem("Consutlar");
            menuFuncionarios.add(miFuncionariosConsultar);
            
            // Menu Cargos
            /*
             * Criado o terceiro item do Menu, com o nome Cargos. A ele adicionado um botão para acessar 
             * a tela de cadastro de cargos (Cadastrar) e outro botão para acessar a tela de consulta
             * de cargos (Consultar)
            */
            menuCargos = new JMenu("Cargos");
            menuBar.add(menuCargos);
            miCargosCadastrar = new JMenuItem("Cadastrar");
            menuCargos.add(miCargosCadastrar);
            miCargosConsultar = new JMenuItem("Consultar");
            menuCargos.add(miCargosConsultar);
            
            // Menu Relatórios
            /*
             * Criado o quarto item do Menu, com o nome Relatórios. A ele adicionado um botão para acessar a tela
             * de relatórios do sistema. 
            */
            menuRelatorios = new JMenu("Relatórios");
            menuBar.add(menuRelatorios);
            miRelatoriosCargos = new JMenuItem("Funcionários por cargos");
            menuRelatorios.add(miRelatoriosCargos);
            miRelatoriosSalarios = new JMenuItem("Salários dos funcionários");
            menuRelatorios.add(miRelatoriosSalarios);
            
            criarEventosMenu();
        }
    }
    
    /*
     * O método habilitaMenu é responsável por verificar se o menu já foi criado e habilitado. Em caso negativo, 
     * ele criará o menu chamando o método construirMenu e adicionará o menu ao JFrame do sistema.
    */
    public static void habilitaMenu()
    {
        if(!menuConstruido) construirMenu();
        if(!menuHabilitado) 
        {
            menuHabilitado = true;
            Sistema.frame.setJMenuBar(menuBar);
        }
    }
    
    /*
     * O método desabilitaMenu é responsável por verificar se o menu está habilitado. Em caso positivo (if verdadeiro), ele 
     * desabilita o menu e remove o JMenuBar do JFrame do sistema.
    */
    public static void desabilitaMenu()
    {
        if(menuHabilitado)
        {
            menuHabilitado = false;
            Sistema.frame.setJMenuBar(null);
        }
    }
    
    private static void criarEventosMenu()
    {
        miSair.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        
        // Funcionário
        miFuncionariosCadastrar.addActionListener(new ActionListener() 
        {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               
           }
        });
        miFuncionariosConsultar.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        
        // Cargos
        miCargosCadastrar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cargosCadastrar();
            }
        });
        miCargosConsultar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cargosConsultar();
            }
        });
        
        // Relatórios
        miRelatoriosCargos.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        miRelatoriosSalarios.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
    }
}