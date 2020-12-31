package AulasLivros;

import java.util.Scanner;

public class Caneta {

    public static void main(String[] args) {
        
     ProjetoCaneta caneta = new ProjetoCaneta();
        Scanner teclado = new Scanner(System.in);
     
        System.out.print("Modelo: ");
        caneta.modelo = teclado.nextLine();
        System.out.print("Preço: ");
        caneta.preco = teclado.nextFloat();
        caneta.tampa = true;
        caneta.carga = 3;
                
        System.out.println(" ");
        System.out.println("APRESENTAÇÃO");
        System.out.println("Modelo: " + caneta.modelo);
        System.out.println("Preço: " + caneta.preco);
        System.out.println("Tampa: " + caneta.tampa);
        System.out.println("Carga: " + caneta.carga + "%.");

        caneta.destampar();
        caneta.rabiscar();
        caneta.rabiscar();
        caneta.verificaCarga();
    }
}
