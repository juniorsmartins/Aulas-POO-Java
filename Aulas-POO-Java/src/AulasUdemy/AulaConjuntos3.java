package AulasUdemy;

import java.util.HashMap;
import java.util.Map;

public class AulaConjuntos3 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> pessoas = new HashMap<>();
        
        // Na primeira posição são chaves e na segunda são valores
        pessoas.put(21, "Maria Aparecida");
        pessoas.put(41, "Pedro Almodovar");
        pessoas.put(33, "Bruno Galio");
        
        // Coleção de chaves
        System.out.println("Chaves: " + pessoas.keySet());

        // Coleção de valores
        System.out.println("Valores: " + pessoas.values());
        
        // Outro tipo de For Each a partir do Java 8
        pessoas.keySet().forEach(idade -> 
        {
            System.out.println(pessoas.get(idade));
        });
    }
}