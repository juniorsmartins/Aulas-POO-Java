/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Controller;

import ProjetoContaBancaria.Modelo.PessoaFisica;
import ProjetoContaBancaria.Modelo.PessoaJuridica;

import java.util.Scanner;

/**
 * @author Junior Martins
 * @since 16/01/21 - 08h57
 */
public class Banco 
{
    // Declaração de variáveis
    static int quantasContas, tipoPessoa, tipoConta, contador, roleta;
    static String opcao = new String();
    
    // Declaração e Instanciação de objeto para armazenar dados de entrada do teclado
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Declaração de Instância
        PessoaFisica[] cidadao;
        PessoaJuridica[] empresa;

        System.out.print("Criar quantas contas? ");
        quantasContas = Integer.parseInt(teclado.next());
        pulaLinha();

        for (roleta = 0; roleta < quantasContas; roleta++)
        {
            System.out.print("Escolha o tipo (Fisica - 1 / Juridica - 2): ");
            tipoPessoa = Integer.parseInt(teclado.next());
            pulaLinha();

            do
            {
                if (tipoPessoa == 1)
                {
                    do
                    {
                        System.out.print("Escolha a conta (Corrente - 1 / Poupança - 2 ");
                        tipoConta = Integer.parseInt(teclado.next());
                        pulaLinha();

                        if (tipoConta == 1)
                        {

                        }
                        else if (tipoConta == 2)
                        {

                        }
                        else
                        {
                            System.out.println("Tente Novamente!");
                        }
                    } while((tipoConta < 1) || (tipoConta > 2));
                }
                else if (tipoPessoa == 2)
                {
                    do
                    {
                        System.out.print("Escolha a conta (Corrente - 1 / Poupança - 2 ");
                        tipoConta = Integer.parseInt(teclado.next());
                        pulaLinha();

                        if (tipoConta == 1)
                        {

                        }
                        else if (tipoConta == 2)
                        {

                        }
                        else
                        {
                            System.out.println("Tente Novamente!");
                        }
                    } while((tipoConta < 1) || (tipoConta > 2));
                }
                else 
                {
                    System.out.println("Tente Novamente!");
                }
            } while ((tipoPessoa < 1) || (tipoPessoa > 2));
        }
    }

    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}