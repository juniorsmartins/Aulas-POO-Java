package Projetos.Projeto5.sistema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Projetos.Projeto5.sistema_entidades.Cargo;
import Projetos.Projeto5.sistema_telas.*;

public class Navegador 
{
    // Menu
    private static boolean menuConstruido;
    private static boolean menuHabilitado;
    private static JMenuBar menuBar;
    private static JMenu menuArquivo, menuFuncionarios, menuCargos, menuRelatorio;
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
            
            menuBar = new JMenuBar();
            
            // Menu arquivo
            menuArquivo = new JMenu("Arquivo");
            menuBar.add(menuArquivo);
            miSair = new JMenuItem("Sair");
            menuArquivo.add(miSair);
            
            // Menu funcionários
            menuFuncionarios = new JMenu("Funcionarios");
            menuBar.add(menuFuncionarios);
            miFuncionariosCadastrar = new JMenuItem("Cadastrar");
            menuFuncionarios.add(miFuncionariosCadastrar);
            miFuncionariosConsultar = new JMenuItem("Consutlar");
            menuFuncionarios.add(miFuncionariosConsultar);
            
            // Menu Cargos
            menuCargos = new JMenu("Cargos");
            menuBar.add(menuCargos);
            miCargosCadastrar = new JMenuItem("Cadastrar");
            menuCargos.add(miCargosCadastrar);
            miCargosConsultar = new JMenuItem("Consultar");
            menuCargos.add(miCargosConsultar);
            
            // Menu Relatórios
            menuRelatorios = new JMenu("Relatórios");
            menuBar.add(menuRelatorios);
            miRelatoriosCargos = new JMenuItem("Funcionários por cargos");
            menuRelatorios.add(miRelatoriosCargos);
            
        }
    }
}