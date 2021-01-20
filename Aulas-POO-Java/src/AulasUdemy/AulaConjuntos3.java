package AulasUdemy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AulaConjuntos3 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> pessoas = new HashMap<>();
        
        // Na primeira posição são chaves e na segunda são valores
        pessoas.put(21, "Maria Aparecida");
        pessoas.put(41, "Pedro Almodovar");
        pessoas.put(33, "Bruno Galio");
        
        // Coleção de Chaves
        System.out.println("Chaves: " + pessoas.keySet());

        // Coleção de Valores
        System.out.println("Valores: " + pessoas.values());
        
        // Coleção de Associações
        System.out.println("Associações: " + pessoas.entrySet());
        
        
        // Outro tipo de For Each a partir do Java 8 - serve para iterar com coleção de chaves
        pessoas.keySet().forEach(idade -> 
        {
            System.out.println(pessoas.get(idade));
        });
        // Iterar com coleção de chaves
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade: chaves)
        {
            System.out.println(pessoas.get(idade));
        }
        
        
        // Iterar com coleção de valores
        pessoas.values().forEach(nome -> {
            System.out.println(nome);
        });
        // Iterar com coleção de valores
        Collection<String> valores = pessoas.values();
        for (String nome: valores)
        {
            System.out.println(nome);
        }
        
        
        // Iterar com coleção de Associaçoes
        Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
        for (Entry<Integer, String> associacao: associacoes)
        {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
        // Iterar com coleção de Associações
        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });
    }
}