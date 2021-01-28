package AulasUdemy;

import java.util.LinkedList;

/*
 * Uma das características dos conjuntos é a não aceitação de elementos repetidos
*/
public class AulaConjuntos4 
{
    public static void main(String[] args) 
    {
//        LinkedList<String> conjunto = new LinkedList<String>();
//        
//        System.out.println(conjunto);
//        
//        conjunto.add("Angelina");
//        conjunto.add("Felicity");
//        conjunto.add("Mariana");
//        
//        System.out.println(conjunto);
        
//        for (int i = 97; i < 123; i++) 
//        {
//            System.out.print((char)i + " "); // tabela ASCII
//        }
//        System.out.println("");

//        System.out.println("\nTeste!");
//        String nome = "Angelina";
//        System.out.println(nome.toLowerCase());
//        System.out.println(nome.toLowerCase().charAt(0));
//        System.out.println(nome.toLowerCase().charAt(0) % 26);
//        System.out.println("");
        
        ClassConjunto conjunto = new ClassConjunto();
        
        conjunto.adiciona("Junior");
        conjunto.adiciona("Mario");
        conjunto.adiciona("Roberta");
        conjunto.adiciona("Mariana");
        conjunto.adiciona("Barbara");
        conjunto.adiciona("Amelia");
        conjunto.adiciona("Junior");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Fabiana");
        conjunto.adiciona("Camila");
        conjunto.adiciona("Karla");
        conjunto.adiciona("Beatriz");
        conjunto.adiciona("Debora");
        conjunto.adiciona("Marcia");
        conjunto.adiciona("Janaina");
        conjunto.adiciona("Isadora");
        conjunto.adiciona("Isabele");
        conjunto.adiciona("Patricia");
        conjunto.adiciona("Ivone");

        System.out.println(conjunto);
    }
}