package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Main.*;

public class Uteis 
{
    public static void pulaLinha(int linhas)
    {
        for(int contador = 0; contador < linhas; contador++)
            System.out.print("\n");            
    }
    
    public static void opcaoInvalida()
    {
        pulaLinha(2);
        System.out.print("Opção Inválida! Tecle <Enter> para continuar...");
        opcao = scan.nextLine();
        pulaLinha(1);
    }
}