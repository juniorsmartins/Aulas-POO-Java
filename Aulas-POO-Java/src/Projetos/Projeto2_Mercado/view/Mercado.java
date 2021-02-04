package Projetos.Projeto2_Mercado.view;

import Projetos.Projeto2_Mercado.control.Utils;
import static Projetos.Projeto2_Mercado.control.Utils.*;
import Projetos.Projeto2_Mercado.model.Produto;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Mercado 
{
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Produto> produtos;
    private static Map<Produto, Integer> carrinho;
    
    public static void main(String[] args) 
    {
        produtos = new ArrayList<Produto>();
        carrinho = new HashMap<Produto, Integer>();
        Mercado.menu();
    }
    
    private static void menu()
    {
        System.out.println("======================");
        System.out.println("==   Bem-vindo(a)   ==");
        System.out.println("==    Geek Shop     ==");
        System.out.println("======================");
        System.out.println("==      Opções      ==");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Comprar produto");
        System.out.println("4 - Ver carrinho");
        System.out.println("5 - Sair do sistema");
        System.out.println("======================");
        pulaLinha();
        System.out.print("Qual escolhe? ");
        
        int opcao = 0;
        try
        {
            opcao = Integer.parseInt(Mercado.teclado.nextLine());
        }
        catch(InputMismatchException e)
        {
            Mercado.menu();
        }
        catch(NumberFormatException f)
        {
            Mercado.menu();
        }
        
        switch(opcao)
        {
            case 1:
                Mercado.cadastrarProduto();
                break;
            case 2:
                Mercado.listarProduto();
                break;
            case 3:
                Mercado.comprarProduto();
                break;
            case 4:
                Mercado.verCarrinho();
                break;
            case 5:
                System.out.println("Volte sempre!");
                Utils.pausar(2);
                System.exit(0);
            default:
                System.out.println("Opção Inválida!");
                Utils.pausar(2);
                Mercado.menu();
                break;
        }
    }
    
    private static void cadastrarProduto()
    {
        System.out.println("Cadastrar Produto!");
    }

    private static void listarProduto()
    {
        System.out.println("Listar Produto!");
    }

    private static void comprarProduto()
    {
        System.out.println("Comprar Produto!");
    }

    private static void verCarrinho()
    {
        System.out.println("Visualizar Produto!");
    }
}