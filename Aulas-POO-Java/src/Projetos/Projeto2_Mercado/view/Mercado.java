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
        pulaLinha(1);
        System.out.println("======================");
        System.out.println("==   Bem-vindo(a)   ==");
        System.out.println("==    Geek Shop     ==");
        System.out.println("======================");
        System.out.println("==      Opções      ==");
        System.out.println("==  1 - Cadastrar   ==");
        System.out.println("==  2 - Listar      ==");
        System.out.println("==  3 - Comprar     ==");
        System.out.println("== 4 - Ver carrinho ==");
        System.out.println("==  5 - Sair        ==");
        System.out.println("======================");
        pulaLinha(1);
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
                pulaLinha(1);
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
        pulaLinha(2);
        System.out.println("======================");
        System.out.println("= Cadastrar Produto! =");
        System.out.println("======================");
        System.out.print("Nome do produto: ");
        String nome = (String)Mercado.teclado.nextLine();
        System.out.print("Preço do produto: ");
        Double preco = Double.parseDouble(Mercado.teclado.nextLine());            

        Produto produto = new Produto(nome, preco); // instanciou o objeto produto
        Mercado.produtos.add(produto); // adicionou o objeto produto na lista de produtos
        
        pulaLinha(1);
        System.out.print("O produto " + produto.getNome() + " foi cadastrado com sucesso!");
        Utils.pausar(1);
        
        pulaLinha(2);
        int deNovo;
        do
        {
            System.out.print("Cadastrar novo? (1 - sim ou 2 - não) ");
            deNovo = Integer.parseInt(Mercado.teclado.nextLine());            
        } while(deNovo != 1 && deNovo != 2);

        if(deNovo == 1)
        {
            Mercado.cadastrarProduto();
        }
        else
        {
            Mercado.menu();
        }
    }

    private static void listarProduto()
    {
        if(Mercado.produtos.size() >0)
        {
            System.out.println("======================");
            System.out.println("= Lista de Produtos! =");
            System.out.println("======================");
            pulaLinha(1);
            for(Produto p: Mercado.produtos)
            {
                System.out.println(p);
                pulaLinha(1);
            }
        }
        else
        {
            pulaLinha(1);
            System.out.println("Ainda não existem produtos cadastradaos!");
            pulaLinha(1);
        }
        
        Utils.pausar(2);
        Mercado.menu();
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