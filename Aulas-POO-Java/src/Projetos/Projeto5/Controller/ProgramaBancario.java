/*
 * Exercício para aprendizagem de Java
 */
package Projetos.Projeto5.Controller;

import Projetos.Projeto5.Modelo.PessoaFisica;
import Projetos.Projeto5.Modelo.PessoaJuridica;
import Projetos.Projeto5.Modelo.ContaCorrente;
import Projetos.Projeto5.Modelo.ContaPoupanca;

import java.util.Scanner;

/**
 * @author Junior Martins
 * @since 18/01/21 - 18h00
 */
public class ProgramaBancario 
{
    // Declaração de variáveis
    static int quantasContas, tipoPessoa, tipoConta, contador, roleta;
    static String opcao = new String();
    
    /**
     * teclado - Declaração e Instanciação de objeto para armazenar dados de entrada
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Declaração de Instância
        PessoaFisica[] cidadao;
        PessoaJuridica[] empresa;

        
        

    }

    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}