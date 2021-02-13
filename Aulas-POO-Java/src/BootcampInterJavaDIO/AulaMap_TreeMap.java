package BootcampInterJavaDIO;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AulaMap_TreeMap 
{
    public static void main(String[] args) 
    {
        TreeMap<String, String> treeCapitals = new TreeMap<>();
        
        // Monta a árvore com as capitais
        treeCapitals.put("RS", "Porto Alegre");
        treeCapitals.put("SC", "Florianópolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "São Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("MG", "Belo Horizonte");
        
        System.out.println(treeCapitals);
        
        pulaLinha(1);
        
        // Retorna o primeiro elemento no topo da árvore
        System.out.println(treeCapitals.firstKey());
        
        pulaLinha(1);
        
        // Retorna o último elemento no final da árvore
        System.out.println(treeCapitals.lastKey());
        
        pulaLinha(1);
        
        // Retorna o primeiro elemento logo abaixo do parâmetro enviado
        System.out.println(treeCapitals.lowerKey("SC"));
        
        pulaLinha(1);
        
        // Retorna o primeiro elemento logo acima do parâmetro enviado
        System.out.println(treeCapitals.higherKey("SC"));
        
        pulaLinha(1);
        
        // Exibe todas as capitais
        System.out.println(treeCapitals);
        
        pulaLinha(1);
        
        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitals.firstEntry().getKey() + " - " + treeCapitals.firstEntry().getValue());
        
        pulaLinha(1);
        
        // Retorna a ultima capital no final da árvore
        System.out.println(treeCapitals.lastEntry().getKey() + " - " + treeCapitals.lastEntry().getValue());
        
        pulaLinha(1);
        
        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitals.lowerEntry("SC").getKey() + " - " + treeCapitals.lowerEntry("SC").getValue());
        
        pulaLinha(1);
        
        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitals.higherEntry("SC").getKey() + " - " + treeCapitals.higherEntry("SC").getValue());
        
        pulaLinha(2);
        
        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();
        
        // Retorna a primeira capital no topo da árvore e a remove do map
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
        
        // Retorna a primeira capital no final da árvore e a remove do map
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());
        
        pulaLinha(1);
        
        // Exite 
        System.out.println(treeCapitals);
        
        pulaLinha(2);
        
        // Navega em todas as chaves do iterator
        Iterator<String> iterator = treeCapitals.keySet().iterator();
        while(iterator.hasNext())
        {
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitals.get(key));
        }
        
        pulaLinha(2);
        
        for(String capital: treeCapitals.keySet())
        {
            System.out.println(capital + " - " + treeCapitals.get(capital));
        }
        
        pulaLinha(2);
        
        for(Map.Entry<String, String> capital: treeCapitals.entrySet())
        {
            System.out.println(capital.getKey() + " - " + capital.getValue());
        }
        
        pulaLinha(2);
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i=0; i < linhas; i++) System.out.print("\n");
    }
}