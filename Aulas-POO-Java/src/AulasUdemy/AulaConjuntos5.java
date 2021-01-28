/*
 * Implementação de Conjuntos em Java
 */
package AulasUdemy;

import java.util.HashSet;
import java.util.Set;

public class AulaConjuntos5 
{
    public static void main(String[] args) 
    {
        Set<String> nomes = new HashSet<String>();
        
        System.out.println(nomes);
        
        nomes.add("Angelina");
        nomes.add("Betania");
        nomes.add("Maira");
        
        System.out.println(nomes);
    }
}