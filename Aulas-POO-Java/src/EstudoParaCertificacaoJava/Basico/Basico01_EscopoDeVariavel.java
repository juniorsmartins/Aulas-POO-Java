package EstudoParaCertificacaoJava.Basico;

public class Basico01_EscopoDeVariavel 
{
    public static void main(String[] args)
    {
        
        int valor1 = 2;
        int valor2 = 5;
        int soma = somar(valor1, valor2);
        
        System.out.println("A soma dos valores é: " + soma);
        
        /*
         * Variáveis contador e valor3 somente podem ser utilizadas dentro do for (bloco de código do for)
        */
        for(int contador = 1, valor3 = 5; contador <11; contador++)
        {
            System.out.format("\nTabuada: %d x %d = %d", contador, valor3, (contador * valor3));
        }
        
        /*
         * O parâmetro 3 e a variável i só poderão ser utilizados dentro do método pulaLinha
        */
        pulaLinha(3);
        System.out.println("Teste de linha");

        /*
         * A variável maissoma só poderá ser utilizada dentro do bloco de código do IF
        */
        if(soma > 5)
        {
            int maissoma = 3;
            pulaLinha(1);
            System.out.printf("A soma é: %d e somado com %d fica: %d", soma, maissoma, (soma + maissoma));
            pulaLinha(2);
        }
    }
    
    /*
     * Os parâmetros valorA e valorB somente podem ser utilizados dentro do método somar
    */
    public static int somar(int valorA, int valorB)
    {
        return (valorA + valorB);
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i = 0; i < linhas; i++) 
            System.out.print("\n");
    }
}