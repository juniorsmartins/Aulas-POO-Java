/*
 * Exercício: Array de Alunos
 * 
 * Faça uma classe que contenha apenas um método main( ). Nesse método crie uma array de 5 posições
 * do tipo Pessoa. Crie um objeto do tipo Aluno para cada posição da array. Especifique um nome, um endereço,
 * uma data de nascimento, uma nota e uma turma para cada aluno. Imprima os dados de todos os alunos
 * utilizando um laço for.
 */
package AulasLivros;

import java.util.Scanner;

/**
 * @author Junior Martins
 * @since 29.12.20
 * @version 1.0
 */
public class ArrayDeAlunos {
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        Pessoa alunoJose = new Pessoa();
        Pessoa alunoMario = new Pessoa();
        Pessoa alunoMaria = new Pessoa();
        
        System.out.print("Digite nome: ");
        alunoJose.nome = teclado.nextLine();        
        System.out.print("Digite nota de Estatística: ");
        alunoJose.notaEstatistica = teclado.nextFloat();
        System.out.print("Digite nota de Algoritmo: ");
        alunoJose.notaAlgoritmo = teclado.nextFloat();
        System.out.print("Digite nota de Programação: ");
        alunoJose.notaProgramacao = teclado.nextFloat();
        System.out.println("------------------------------------");

        System.out.print("Digite nome: ");
        alunoMario.nome = teclado.next();        
        System.out.print("Digite nota de Estatística: ");
        alunoMario.notaEstatistica = teclado.nextFloat();
        System.out.print("Digite nota de Algoritmo: ");
        alunoMario.notaAlgoritmo = teclado.nextFloat();
        System.out.print("Digite nota de Programação: ");
        alunoMario.notaProgramacao = teclado.nextFloat();
        System.out.println("------------------------------------");

        System.out.print("Digite nome: ");
        alunoMaria.nome = teclado.next();        
        System.out.print("Digite nota de Estatística: ");
        alunoMaria.notaEstatistica = teclado.nextFloat();
        System.out.print("Digite nota de Algoritmo: ");
        alunoMaria.notaAlgoritmo = teclado.nextFloat();
        System.out.print("Digite nota de Programação: ");
        alunoMaria.notaProgramacao = teclado.nextFloat();        
        System.out.println("------------------------------------");

        System.out.println("APRESENTAÇÃO");
        System.out.println("Nome: " + alunoJose.nome);
        alunoJose.fezProvas();
        alunoJose.calculaMedia();
        alunoJose.aprovadoOuNao();
        
        System.out.println("APRESENTAÇÃO");
        System.out.println("Nome: " + alunoMario.nome);
        alunoMario.fezProvas();
        alunoMario.calculaMedia();
        alunoMario.aprovadoOuNao();
        
        System.out.println("APRESENTAÇÃO");
        System.out.println("Nome: " + alunoMaria.nome);
        alunoMaria.fezProvas();
        alunoMaria.calculaMedia();
        alunoMaria.aprovadoOuNao();
    }
}
