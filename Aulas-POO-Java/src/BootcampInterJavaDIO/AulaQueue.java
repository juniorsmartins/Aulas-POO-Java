package BootcampInterJavaDIO;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class AulaQueue 
{
    public static void main(String[] args) 
    {
        Queue<String> filaBanco = new LinkedList<>();
        
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        
        System.out.println(filaBanco);
        
        String clientePraAtender = filaBanco.poll(); // Retorna o primeiro elemento da fila e o remove da fila
        System.out.println(clientePraAtender);
        System.out.println(filaBanco);
        
        String primeiroCliente = filaBanco.peek(); // Retorna o primeiro elemento da fila, mas não remove dela
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        
        String primeiroClienteOuErro = filaBanco.element(); // Retorna o primeiro elemento da fila, mas não remove dela (retorna exceção pra fila vazia)
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);
        
//        filaBanco.clear();
        
        System.out.println("\n");
        
        for(String cliente: filaBanco)
        {
            System.out.println(cliente);
        }
        
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext())
        {
            System.out.println("--->>> " + iteratorFilaBanco.next());
        }
        
        System.out.println(filaBanco.size()); // Mostra quantos elementos existem na lista
        
        System.out.println(filaBanco.isEmpty()); // Diz se a lista está vazia
        
        
    }
}