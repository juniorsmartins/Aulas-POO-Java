package BootcampInterJavaDIO;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AulaList_ArrayList 
{
    public static void main(String[] args) 
    {
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Carlos"); // Adiciona elemento na lista
        nomes.add("Pedro");
        nomes.add("Julia");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        nomes.set(2, "Larissa"); // Adiciona item na lista - Neste caso, sobrepõe a posição 2 por Larissa

        Collections.sort(nomes); // Ordenação alfabética com Strings
        System.out.println(nomes);
        
        nomes.remove(3); // Remove um elemento na posição informada
        System.out.println(nomes);
        
        nomes.remove("Carlos"); // Remove o elemento "Carlos"
        System.out.println(nomes);
        
        String nome = nomes.get(2); // O get retorna o valor da posição 1
        System.out.println(nome);
        
        int posicao = nomes.indexOf("João"); // Retorna o índice do elemento João na lista
        System.out.println(posicao);
        
        int tamanho = nomes.size(); // O size retornará o tamanho da lista
        System.out.println(tamanho);
        
        boolean existe = nomes.contains("Pedro");
        System.out.println(existe);// Verifica se existe ou não Pedro na lista
        
        for(String nomeItem: nomes) // ForEach dos itens da lista de nomes
        {
            System.out.print("-> " + nomeItem + " ");
        }
        System.out.println("");
        
        Iterator<String> iterator = nomes.iterator(); // criar um iterador de strings
        while (iterator.hasNext()) // Faz loop enquanto houver mais um elemento na lista
        {
            System.out.println("------->" + iterator.next()); // retorna um elemento pelo next
        }

        nomes.clear(); // Lismpa totalmente a lista
        
        boolean listaVazia = nomes.isEmpty(); // Verifica se a lista está ou não vazia
        System.out.println(listaVazia);
    }
}