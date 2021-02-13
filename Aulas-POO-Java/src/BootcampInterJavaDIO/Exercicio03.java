package BootcampInterJavaDIO;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Exercicio03 
{
    public static void main(String[] args) 
    {
        Set<Integer> nums = new LinkedHashSet<>();
        
        nums.add(3);
        nums.add(88);
        nums.add(20);
        nums.add(44);
        nums.add(3);
        
        for(Integer item: nums) System.out.println(item);
        
        pulaLinha(1);
        
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
        pulaLinha(1);
        
        nums.remove(3);
        System.out.println(nums);
        
        pulaLinha(1);
        
        nums.add(23);
        System.out.println(nums);
        
        pulaLinha(1);
        
        System.out.println("Tamanho: " + nums.size());

        System.out.println("Vazio: " + nums.isEmpty());
        
        pulaLinha(2);
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i=0; i < linhas; i++) System.out.print("\n");
    }
}