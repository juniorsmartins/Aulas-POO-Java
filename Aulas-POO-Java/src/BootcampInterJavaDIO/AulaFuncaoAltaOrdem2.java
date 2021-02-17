package BootcampInterJavaDIO;

public class AulaFuncaoAltaOrdem2 
{
    public static void main(String[] args) 
    {
        Calculos soma = (a, b) -> a + b;
        Calculos subtracao = (a, b) -> a - b;
        Calculos divisao = (a, b) -> a / b;
        Calculos multiplicacao = (a, b) -> a * b;
        
        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(subtracao, 4, 3));
        System.out.println(executarOperacao(divisao, 4, 2));
        System.out.println(executarOperacao(multiplicacao, 7, 3));
    }
    
    public static int executarOperacao(Calculos calculo, int a, int b) 
    {
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculos
{
    public int calcular(int a, int b);
}