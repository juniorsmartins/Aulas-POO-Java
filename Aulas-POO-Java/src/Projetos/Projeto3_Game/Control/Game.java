package Projetos.Projeto3_Game.Control;

import java.util.Scanner;
import Projetos.Projeto3_Game.Model.Calcular;

public class Game 
{
    static Scanner teclado = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calculo;
    
    public static void main(String[] args) 
    {
        Game.jogar();
    }
    
    public static void jogar()
    {
        System.out.println("Nível de dificuldade (1, 2, 3 ou 4): ");
        int dificuldade = Game.teclado.nextInt();
        
        Game.calculo = new Calcular(dificuldade);
        
        System.out.println("Informe resultado da seguinte operação: ");
        
        // Somar
        if(calculo.getOperacao() == 0)
        {
            System.out.print(calculo.getValor1() + " + " + calculo.getValor2() + " = ");
            int resposta = Game.teclado.nextInt();
            
            if(calculo.somar(resposta))
            {
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }

        // Diminuir
        if(calculo.getOperacao() == 1)
        {
            System.out.print(calculo.getValor1() + " - " + calculo.getValor2() + " = ");
            int resposta = Game.teclado.nextInt();
            
            if(calculo.diminuir(resposta))
            {
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }

        // Multiplicar
        if(calculo.getOperacao() == 2)
        {
            System.out.print(calculo.getValor1() + " * " + calculo.getValor2() + " = ");
            int resposta = Game.teclado.nextInt();
            
            if(calculo.multiplicar(resposta))
            {
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }

        System.out.print("Deseja continuar? (0 - não ou 1 - sim) ");
        int continuar = Game.teclado.nextInt();
        
        if (continuar == 1)
        {
            Game.jogar();
        }
        else
        {
            System.out.println(" ");
            System.out.println("Você fez o total de " + Game.pontos + " ponto(s).");
            System.out.println("Até uma próxima vez!");
            System.exit(0);
        }
    }
}