package Projetos.Projeto07_PSTE.Controller;

import static Projetos.Projeto07_PSTE.Controller.Main.*;

public class Uteis 
{
    public static void pulaLinha(int linhas)
    {
        for(int contador = 0; contador < linhas; contador++)
            System.out.print("\n");            
    }
    
    public static void opcaoInvalida()
    {
        pulaLinha(1);
        System.out.print("Opção Inválida! Tecle <Enter> para continuar...");
        opcao = scan.nextLine();
    }
    
    public static void listaVazia()
    {
        pulaLinha(1);
        System.out.println("***** Lista Vazia! *****");
    }
    
    public static void tecleEnter()
    {
        pulaLinha(1);
        System.out.print("Tecle <Enter> para continuar...");
        String opcao = scan.nextLine();
    }
    
    public static void naoEncontrado()
    {
        pulaLinha(1);
        System.out.print("**** Não encontrado! ****");
    }
    
    public static void encontradoNaLista()
    {
        pulaLinha(1);
        System.out.print("**** Encontrado com sucesso! ****");
    }
    
    public static void createOK()
    {
        pulaLinha(1);
        System.out.println("**** Cadastrado com sucesso! ****");
    }
    
    public static void objetoEditado()
    {
        pulaLinha(1);
        System.out.println("**** Editado com sucesso! ****");
    }
    
    public static void deletadoOK()
    {
        pulaLinha(1);
        System.out.println("**** Deletado com sucesso! ****");
    }
}