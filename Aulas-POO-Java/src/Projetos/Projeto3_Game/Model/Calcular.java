package Projetos.Projeto3_Game.Model;

import java.util.Random;

public class Calcular 
{
    Random rand;
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;
    
    public Calcular(int dificuldade)
    {
        rand = new Random();

        this.operacao = rand.nextInt(3); // 0 - somar, 1 - diminuir, 2 - multiplicar
        this.setDificuldade(dificuldade);
        this.gerarValores(dificuldade);
    }

    // Métodos Especiais de Instância
    private void gerarValores(int dificuldade)
    {
        switch(dificuldade)
        {
            case 1:
                // Nível Fácil
                this.valor1 = rand.nextInt(10); // vai gerar valor de 0 a 9
                this.valor2 = rand.nextInt(10); // gerará valor de 0 a 9
                break;
            case 2:
                // Nível Normal
                this.valor1 = rand.nextInt(100); // gerará valor de 0 a 99
                this.valor2 = rand.nextInt(100); // gerará valor de 0 a 99
                break;
            case 3:
                // Nível Hard
                this.valor1 = rand.nextInt(1000); // gerará valor de 0 a 999
                this.valor2 = rand.nextInt(1000); // gerará valor de 0 a 999
                break;
            case 4:
                // Nível Insane
                this.valor1 = rand.nextInt(10000); // gerará valor de 0 a 9999
                this.valor2 = rand.nextInt(10000); // gerará valor de 0 a 9999
                break;
            default:
                // Nível Impossible
                this.valor1 = rand.nextInt(100000); // gerará valor de 0 a 99999
                this.valor2 = rand.nextInt(100000); // gerará valor de 0 a 99999
                break;
        }
    }
    
    @Override
    public String toString()
    {
        String operac;
        switch(this.getOperacao())
        {
            case 0:
                operac = "Somar";
                break;
            case 1:
                operac = "Diminuir";
                break;
            case 2:
                operac = "Multiplicar";
                break;
            default:
                operac = "Operacao Desconhecida!";
                break;
        }
        return ("Valor 1: " + this.getValor1() + "\nValor2 : " + this.getValor2() + "\nDificuldade: " + this.getDificuldade() + "\nOperacao: " + operac);
    }
    
    public boolean somar(int resposta)
    {
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;
        
        if (resposta == this.getResultado())
        {
            System.out.println("Resposta correta!");
            certo = true;
        }
        else
        {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean diminuir(int resposta)
    {
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;
        
        if (resposta == this.getResultado())
        {
            System.out.println("Resposta correta!");
            certo = true;
        }
        else
        {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean multiplicar(int resposta)
    {
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;
        
        if (resposta == this.getResultado())
        {
            System.out.println("Resposta correta!");
            certo = true;
        }
        else
        {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    // Métodos Getters 
    public int getDificuldade()
    {
        return this.dificuldade;
    }

    public int getValor1()
    {
        return this.valor1;
    }

    public int getValor2()
    {
        return this.valor2;
    }

    public int getOperacao()
    {
        return this.operacao;
    }

    public int getResultado()
    {
        return this.resultado;
    }
    
    // Métodos Setters
    private void setDificuldade(int dificuldade)
    {
        this.dificuldade = dificuldade;
    }

    private void setOperacao(int operacao)
    {
        this.operacao = operacao;
    }

    private void setResultado(int resultado)
    {
        this.resultado = resultado;
    }
}