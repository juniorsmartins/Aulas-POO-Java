package SocioTorcedor.Controller;

import SocioTorcedor.Model.Plano;
import SocioTorcedor.Model.Torcedor;

public class ProgramaMain 
{
    private static byte opcaoMenuPrincipal;

    public static void main(String[] args) 
    {
        opcaoMenuPrincipal = menuPrincipal();


        
    }
    
    public static byte menuPrincipal()
    {
        System.out.println("------------------------------");
        System.out.println("------------ MENU ------------");
        System.out.println("------------------------------");
        System.out.println("--- Cadastrar Torcedor - 1 ---");
        System.out.println("---    Assinar Plano - 2   ---");
        System.out.println("---    Ver Vantagens - 3   ---");
        System.out.println("---        Sair - 4        ---");
        System.out.println("------------------------------");
    }
    
    
    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}