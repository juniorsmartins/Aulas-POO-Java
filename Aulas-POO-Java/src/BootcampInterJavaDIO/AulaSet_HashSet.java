package BootcampInterJavaDIO;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class AulaSet_HashSet 
{
    public static void main(String[] args) 
    {
        Set<Double> notas = new HashSet<>();
        
        // Adiciona notas ao Set
        notas.add(5.8);
        notas.add(9.3);
        notas.add(6.5);
        notas.add(10.0);
        notas.add(5.4);
        notas.add(7.3);
        notas.add(3.8);
        notas.add(4.0);
        
        System.out.println(notas);
        
        // Remove nota do Set
        notas.remove(3.8);
        
        System.out.println(notas);
        
        pulaLinha(1);
        
        // Reforma a quantidade de itens do Set
        System.out.println("Tamanho do Set: " + notas.size());
        
        pulaLinha(1);
        
        // Navega em todos os itens do iterator
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        
        pulaLinha(2);
        
        for(Double nota: notas)
        {
            System.out.print(nota + " ");
        }
        
        pulaLinha(2);
        
        notas.clear();
        
        // Retorna se o Set está vazio ou não
        System.out.println(notas.isEmpty());
        
        pulaLinha(1);
        
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i = 0; i < linhas; i++) System.out.print("\n");
    }
}