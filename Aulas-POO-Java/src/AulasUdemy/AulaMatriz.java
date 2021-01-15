// Curso de Java da Udemy
// Aula de Matriz
package AulasUdemy;

/**
 * @author Junior Martins
 * @since 14/01/2021 - 20h41
 */
public class AulaMatriz 
{
    public static void main(String[] args)
    {
        // Declaração de Matriz
        int matrizes[][];
        
        // Declaração e definição de tamanho;
        byte matrizinha[][] = new byte[3][3];
        
        // Declaração, definição de tamanho e inicialização de valores
        int mxtrix[][] = { {1, 3, 5}, {4, 8, 6}, {2, 7, 9} };
        
        for (byte linha = 0; linha < mxtrix.length; linha++)
        {
            for (byte coluna = 0; coluna < mxtrix.length; coluna++)
                System.out.println("Posição " + linha + " " + coluna + ": " + mxtrix[linha][coluna]);
        }
    }
}