package Projetos.Projeto5_GestaoFuncionarios.sistema_telas;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Projetos.Projeto5_GestaoFuncionarios.sistema.Navegador;

public class Inicio extends JPanel
{
    JLabel labelTitulo;
    
    public Inicio()
    {
        criarComponentes();
        criarEventos();
        Navegador.habilitaMenu();
    }
    
    private void criarComponentes()
    {
        setLayout(null); // Não usaremos gerenciador de layout
        
        // O componente JLabel está sendo inicializado com seu texto e alinhamento de exibição
        labelTitulo = new JLabel("Escolha uma opção no menu superior", JLabel.CENTER);
        // Definidos o posicionamento e o tamanho do componente JLabel
        labelTitulo.setBounds(20, 100, 660, 40);
        
        add(labelTitulo); // Componente JLabel adicionado à tela
        
        setVisible(true); // tela tornada visível
    }
    
    private void criarEventos()
    {
        //TODO
    }
}