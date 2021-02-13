package BootcampInterJavaDIO;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class AulaSet_LinkedHashSet 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        
        // Adicição ao Set
        nums.add(16);
        nums.add(2);
        nums.add(8);
        nums.add(4);
        nums.add(1);
        
        System.out.println(nums);
        
        pulaLinha(1);
        
        // Remove do Set
        nums.remove(4);
        System.out.println(nums);
        
        pulaLinha(1);
        
        // Retorna a quantia de itens do Set
        System.out.println(nums.size());
        
        pulaLinha(1);
        
        // Navega pelos itens com iterator
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next() + " ");
        }
        
        pulaLinha(1);
        
        for(Integer itens: nums)
        {
            System.out.println(itens + " ");
        }
        
        pulaLinha(1);

        nums.clear();
        
        // Informa se o Set está ou não vazio
        System.out.println("Vazio: " + nums.isEmpty());
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i = 0; i < linhas; i++) System.out.print("\n");
    }
}