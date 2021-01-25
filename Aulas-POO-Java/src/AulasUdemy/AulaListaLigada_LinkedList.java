package AulasUdemy;

import java.util.LinkedList;

public class AulaListaLigada_LinkedList 
{
    public static void main(String[] args) 
    {
        LinkedList<String> lista = new LinkedList<String>();
        
        System.out.println(lista.size());
        
        lista.add("Felicity");
        lista.add("Angelina");
        lista.add(0, "Maria");
        
        System.out.println(lista);

        System.out.println(lista.size());
    }
}