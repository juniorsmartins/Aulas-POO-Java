package AulasGustavoGuanabara;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class EstruturaDeRepeticaoEnquantoIV {


    public static void main(String[] args) {
        byte contador = 0;
        int valor = 0, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Soma de números!");
        do {
            System.out.println("Digite um valor: ");
            valor = teclado.nextInt();
            soma += valor;
            System.out.println("Quer repetir? [S/N]");
            resposta = toUpperCase(teclado.next());
        } while (resposta.equals("S"));
        System.out.println("A resposta é: " + soma);
    }
    
}
