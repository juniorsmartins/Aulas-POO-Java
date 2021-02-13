package BootcampInterJavaDIO;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Exercicio01 
{
    public static void main(String[] args) 
    {
        List<String> nomes = new Vector<>();
        
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        
        for(String nomeItens: nomes)
        {
            System.out.print(nomeItens + " ");
        }
        
        nomes.set(2, "Roberto");
        System.out.println("\n\nGet: " + nomes.get(1));
        nomes.remove(3);
        
        int tamanho = nomes.size();
        System.out.println("\n" + tamanho);
        
        nomes.remove("João");
        System.out.println(nomes.size());
        
        boolean contem = nomes.contains("Juliana");
        System.out.println("\nContém: " + contem);
        
        List<String> nomes2 = new Vector<>();
        nomes2.add("Ïsmael");
        nomes2.add("Catarina");
        nomes2.add("Rodrigo");
        
        System.out.println("\n" + nomes2);
        
        for(String itens: nomes2)
        {
            nomes.add(itens);
        }
        
        Collections.sort(nomes);
        
        System.out.println("\nLista 1 completa: " + nomes);
        
        nomes.clear();
        
        System.out.println("\nlista 1 limpa: " + nomes);
    }
}