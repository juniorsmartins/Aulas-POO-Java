package BootcampInterJavaDIO;

import java.util.Map;
import java.util.HashMap;

public class AulaMap_HashMap 
{
    public static void main(String[] args) 
    {
        Map<String, Integer> mundialFifa = new HashMap<>();
        
        // Adiciona no mapa
        mundialFifa.put("Brasil", 5);
        mundialFifa.put("Alemanha",4);
        mundialFifa.put("Itália", 4);
        mundialFifa.put("Uruguai", 2);
        mundialFifa.put("Argentina", 2);
        mundialFifa.put("França", 2);
        mundialFifa.put("Inglaterra", 1);
        mundialFifa.put("Espanha", 1);
        
        System.out.println(mundialFifa);
        
        pulaLinha(1);
        
        // Atualiza o valor para a chave Brasil
        mundialFifa.put("Brasil", 6);
        System.out.println(mundialFifa);
        
        pulaLinha(1);
        
        // Retorna o valor da chave Argentina
        System.out.println("Argentina: " + mundialFifa.get("Argentina"));
        
        pulaLinha(1);
        
        // Retorna se existe ou não um campeão França
        System.out.println("Existe campeão França: " + mundialFifa.containsKey("França"));
        
        // Remove o campeão França
        mundialFifa.remove("França");
        
        pulaLinha(1);
        
        // Retorna se existe ou não um hexa campeão
        System.out.println("Existe hexa-campeão: " + mundialFifa.containsValue(6));
        
        pulaLinha(1);
        
        // Retorna o tamanho do mapa
        System.out.println("Tamanho: " + mundialFifa.size());
        
        pulaLinha(1);
        
        System.out.println(mundialFifa);
        
        pulaLinha(2);
        
        // Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : mundialFifa.entrySet())
        {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        
        pulaLinha(2);
        
        // Navega nos registros do mapa
        for(String key: mundialFifa.keySet())
        {
            System.out.println(key + " -- " + mundialFifa.get(key));
        }
        
        pulaLinha(2);
        
        mundialFifa.clear();
        
        System.out.println(mundialFifa);
        
        pulaLinha(2);
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i=0; i < linhas; i++) System.out.print("\n");
    }
}