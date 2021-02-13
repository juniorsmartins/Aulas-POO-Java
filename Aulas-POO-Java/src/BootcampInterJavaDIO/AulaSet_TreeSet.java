package BootcampInterJavaDIO;

import java.util.Iterator;
import java.util.TreeSet;

public class AulaSet_TreeSet 
{
    public static void main(String[] args) 
    {
        TreeSet<String> capitais = new TreeSet<>();
        
        // Monta a árvore com as capitais
        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");
        capitais.add("Cuiabá");
        
        System.out.println(capitais);
        
        // Retorna o elemento que esta no topo/raiz da árvore
        System.out.println("Capital no topo da árvore: " + capitais.first());
        
        // Retorna a última capital no final/folha da árvore
        System.out.println("Capital na ponta/folha da árvore: " + capitais.last());
        
        // Retorna o primeiro elemento logo abaixo do elemento que enviei como parâmetro (Florianópolis)
        System.out.println(capitais.lower("Florianopólis"));
        
        // Retorna o primeiro elemento acima do elemento que enviei como parâmetro (Florianópolis)
        System.out.println(capitais.higher("Florianópolis"));
        
        // Exibe todas as capitais no console
        System.out.println(capitais);
        
        // Retorna e remove do Set a primeira capital no topo da árvore
        System.out.println(capitais.pollFirst());
        
        // Retorna e remove do Set a primeira capital no final da árvore
        System.out.println(capitais.pollLast());
        
        // Exibe todas as capitais 
        System.out.println(capitais);
        
        // Navega em todos os itens do iterator
        Iterator<String> iterator = capitais.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        for(String capital: capitais) System.out.println(capital);
    }
}