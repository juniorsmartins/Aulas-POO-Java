package BootcampInterJavaDIO;

import java.util.Hashtable;
import java.util.Map;

public class AulaMap_HashTable 
{
    public static void main(String[] args) 
    {
        Hashtable<String, Integer> estudantes = new Hashtable<>();
        
        estudantes.put("Carlos", 41);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);
        
        System.out.println(estudantes);
        
        estudantes.put("Pedro", 55);
        
        pulaLinha(1);
        
        System.out.println(estudantes);
        
        // Remove um estudante
        estudantes.remove("Pedro");
        
        pulaLinha(1);
        
        System.out.println(estudantes);
        
        pulaLinha(1);
        
        // Recupera um estudante no indice 2
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println("Idade de Mariana: " + idadeEstudante);
        
        pulaLinha(1);
        
        // Mostra o tamanho da hashtable
        System.out.println(estudantes.size());
        
        pulaLinha(1);
        
        // Navega nos registros da hashtable
        for(Map.Entry<String, Integer> entry: estudantes.entrySet())
        {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        
        pulaLinha(1);
        
        for(String key: estudantes.keySet())
        {
            System.out.println(key + " ---- " + estudantes.get(key));
        }
        
        pulaLinha(2);
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i=0; i < linhas; i++) System.out.print("\n");
    }
}