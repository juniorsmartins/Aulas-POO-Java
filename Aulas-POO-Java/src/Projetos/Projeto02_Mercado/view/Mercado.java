package Projetos.Projeto02_Mercado.view;

import Projetos.Projeto02_Mercado.control.Utils;
import static Projetos.Projeto02_Mercado.control.Utils.*;
import Projetos.Projeto02_Mercado.model.Produto;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Mercado 
{
    private static Scanner teclado = new Scanner(System.in); // Permite acesso de informações pelo teclado
    private static ArrayList<Produto> produtos; // Declaração para criar uma lista para armazenar produtos
    private static Map<Produto, Integer> carrinho; // Declaração para criar interface que mapeia valores para chaves 
    
    public static void main(String[] args) 
    {
        produtos = new ArrayList<Produto>(); // Instanciação de lista para armazenar produtos
        carrinho = new HashMap<Produto, Integer>(); // Instanciação de intervaça para mapear valores/chaves
        Mercado.menu(); // Chama o método Menu
    }
    
    private static void menu()
    {
        pulaLinha(2);
        System.out.println("======================"); // Menu de abertura do programa
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
        int opcao = 0;
        System.out.print("Qual escolhe? ");
        try // Tratamento de erro para a opção selecionada do Menu
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
        catch(Exception m)
        {
            Mercado.menu();
        }
        
        switch(opcao) // Rotea a opção escolhida para os métodos executores correspondentes
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
                Mercado.sair();
                break;
            default:
                System.out.println("Opção inválida!");
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
        String nome = Mercado.teclado.nextLine(); // Entrada de dados do tipo String (reforçado com casting) pelo teclado
        
        System.out.print("Preço do produto: ");
        Double preco = Double.parseDouble(Mercado.teclado.nextLine()); // Entrada de dados do tipo String convertido para tipo Double

        Produto produto = new Produto(nome, preco); // instanciou/manufaturou um objeto do tipo produto
        Mercado.produtos.add(produto); // adicionou o objeto produto na lista de produtos
        
        pulaLinha(1);
        System.out.print("Cadastrado com sucesso! Produto: " + produto.getNome() + "\n");
        Utils.pausar(1);
        Mercado.menu();
    }

    private static void listarProduto()
    {
        if(Mercado.produtos.size() > 0)
        {
            pulaLinha(2);
            System.out.println("======================");
            System.out.println("= Lista de Produtos! =");
            System.out.println("======================");
            for(Produto itens: Mercado.produtos)
            {
                System.out.println(itens);
                System.out.println("======================");
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
        if(Mercado.produtos.size() > 0)
        {
            pulaLinha(2);
            System.out.println("======================");
            System.out.println("====   Produtos   ====");
            System.out.println("======================");
            for(Produto item: Mercado.produtos)
            {
                System.out.println(item);
                System.out.println("======================");
            }
            
            System.out.print("Qual comprar? (digite código) ");
            int codigo = Integer.parseInt(Mercado.teclado.nextLine());
            boolean temNaCesta = false;
            for(Produto prods: Mercado.produtos)
            {
                if(prods.getCodigo() != codigo)
                {
                    pulaLinha(1);
                    System.out.println("Produto não encontrado! Código " + codigo + " incompatível!");
                    Utils.pausar(2);
                    Mercado.menu();
                }
                else
                {
                    int quant = 0;
                    try
                    {
                        quant = Mercado.carrinho.get(prods);
                        // atualiza quantidade de produto do carrinho
                        Mercado.carrinho.put(prods, quant + 1);
                    }
                    catch(NullPointerException e)
                    {
                        // Primeiro produto no carrinho
                        Mercado.carrinho.put(prods, 1);
                    }
                    System.out.println("O produto " + prods.getNome() + " foi adicionado ao carrinho!");
                    temNaCesta = true;
                }
                
                if(temNaCesta)
                {
                    System.out.print("Deseja adicionar mais produtos ao carrinho (S ou N)? ");
                    String repete = (String)Mercado.teclado.nextLine();
                    if(repete.equals("s") || repete.equals("S"))
                    {
                        Mercado.comprarProduto();
                    }
                    else
                    {
                        System.out.println("Por favor, aguarde enquanto fechamos seu pedido!");
                        Utils.pausar(2);
                        Mercado.fecharPedido();
                    }
                }
            }
        }
        else
        {
            pulaLinha(1);
            System.out.println("Ainda não existem produtos!");
            Utils.pausar(2);
            Mercado.menu();
        }
    }

    private static void verCarrinho()
    {
        if(Mercado.carrinho.size() > 0)
        {
            pulaLinha(2);
            System.out.println("======================");
            System.out.println("====   Carrinho   ====");
            System.out.println("======================");
            for(Produto item: Mercado.carrinho.keySet())
            {
                System.out.println("Produto: " + item + "\nQuantidade: " + Mercado.carrinho.get(item));
                System.out.println("======================");
            }
        }
        else
        {
            pulaLinha(1);
            System.out.print("Ainda não existem produtos no carrinho!");
        }
        Utils.pausar(2);
        Mercado.menu();
    }

    public static void sair() // Método para encerrar a execução do sistema - Sair
    {
        pulaLinha(1);
        System.out.println("Volte sempre!");
        System.out.println("Que a força esteja com você!");
        Utils.pausar(2);
        System.exit(0);
    }
    
    private static void fecharPedido()
    {
        Double valorTotal = 0.0;
        pulaLinha(2);
        System.out.println("======================");
        System.out.println("====    Pedido    ====");
        System.out.println("======================");
        for(Produto p: Mercado.carrinho.keySet())
        {
            int quant = Mercado.carrinho.get(p);
            valorTotal += p.getPreco() * quant;
            System.out.println(p);
            System.out.println("Quantidade: " + quant);
            System.out.println("======================");
        }
        
        System.out.println("Fatura de: " + Utils.doubleParaString(valorTotal));
        Mercado.carrinho.clear();
        System.out.println("Obrigado pela preferência!");
        Utils.pausar(3);
        Mercado.menu();
    }
    
}