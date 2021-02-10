package EstudoParaCertificacaoJava.Basico;

public class Basico01_EscopoDeVariavel 
{
    public static void main(String[] args)
    {
        
        int valor1 = 2;
        int valor2 = 3;
        int soma = somar(valor1, valor2);
        
        System.out.println("A soma dos valores é: " + soma);
        
    }
    
    /*
     * Parâmetros (valorA e valorB) somente podem ser utilizados dentro do método
    */
    public static int somar(int valorA, int valorB)
    {
        return (valorA + valorB);
    }
}