package AulasOutros;

import java.util.HashMap;
import java.util.Map;

public class AulaHashMap 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> produtos = new HashMap<>();
        
        produtos.put(1, "Banana");
        produtos.put(2, "Abacaxi");
        produtos.put(3, "Melancia");
        produtos.put(4, "Morango");
        produtos.put(5, "Laranja");
        produtos.put(1, "Manga");
        
        for (Map.Entry<Integer, String> produto : produtos.entrySet())
        {
            System.out.format("%d: %s%n", produto.getKey(), produto.getValue());
        }
    }
}