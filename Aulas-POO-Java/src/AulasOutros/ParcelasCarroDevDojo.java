package AulasOutros;

import java.util.Scanner;

public class ParcelasCarroDevDojo 
{
    public static Scanner teclado = new Scanner(System.in);
    public static float valorCarro;
    public static float parcelaMaxima;
    public static int parcelaCarro;
    public static float valorParcela;
    public static int totalParcelas;
    public static float parcelado;
    public static String opcao = new String();

    public static void main(String[] args) 
    {
        do 
        {
            valorCarro();
            parcelaMaxima();
            parcelaCarro();
            imprimirResultado();
            
            pulaLinha();
            repetirAcao();
            pulaLinha();
        } while (opcao.equals("S") || opcao.equals("s"));
    }

    public static void valorCarro()
    {
        System.out.print("Qual o valor do carro: ");
        valorCarro = Float.parseFloat(teclado.nextLine());
    }

    public static void parcelaMaxima()
    {
        System.out.print("Qual o valor máximo da parcela: ");
        parcelaMaxima = Float.parseFloat(teclado.nextLine());
    }
    
    public static void parcelaCarro()
    {
        int contador = 1;
        parcelado = valorCarro;
        while (parcelado > parcelaMaxima)
        {
            parcelado = (float) (valorCarro / contador);

            if (parcelado >= parcelaMaxima)
            {
                valorParcela = parcelado;
                totalParcelas = contador;
            }
            contador++;            
        }
    }

    public static void imprimirResultado()
    {
        System.out.println("Parcelas: " + totalParcelas);
        System.out.println("Valor: " + valorParcela);
    }
    
    public static void repetirAcao()
    {
        System.out.print("Repetir? ('S' - 'N') ");
        opcao = teclado.nextLine();
    }
    
    public static void pulaLinha()
    {
        System.out.println("\n");
    }
}
