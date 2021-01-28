package AulasUdemy;

import java.util.LinkedList;

/*
 * Uma das características dos conjuntos é a não aceitação de elementos repetidos
*/
public class AulaConjuntos4 
{
    public static void main(String[] args) 
    {
        LinkedList<String> conjunto = new LinkedList<String>();
        
        System.out.println(conjunto);
        
        conjunto.add("Angelina");
        conjunto.add("Felicity");
        conjunto.add("Mariana");
        
        System.out.println(conjunto);
        
//        for (int i = 97; i < 123; i++) 
//        {
//            System.out.print((char)i + " "); // tabela ASCII
//        }
//        System.out.println("");

        System.out.println("\nTeste!");
        String nome = "Angelina";
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toLowerCase().charAt(0));
        System.out.println(nome.toLowerCase().charAt(0) % 26);
    }
}