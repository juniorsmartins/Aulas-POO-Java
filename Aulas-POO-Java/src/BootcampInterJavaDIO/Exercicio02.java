package BootcampInterJavaDIO;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio02 
{
    public static void main(String[] args) 
    {
        Queue<String> funcionarios = new LinkedList<>();

        funcionarios.add("Juliana");
        funcionarios.add("Pedro");
        funcionarios.add("Carlos");
        funcionarios.add("Larissa");
        funcionarios.add("João");
        
        for(String colaborador: funcionarios)
        {
            System.out.println("-->> " + colaborador);
        }
        
        Iterator<String> iteradorColaborador = funcionarios.iterator();
        while(iteradorColaborador.hasNext())
        {
            System.out.println(iteradorColaborador.next());
        }
        
        pulaLinha(2);
        
        System.out.println(funcionarios.peek());
        System.out.println(funcionarios);
        
        pulaLinha(1);
        
        System.out.println(funcionarios.poll());
        System.out.println(funcionarios);
        
        pulaLinha(1);
        
        funcionarios.add("Daniel");
        System.out.println(funcionarios);
        int posicao = 0;
        for(String item: funcionarios)
        {
            if(item.equals("Daniel"))
            {
                System.out.println("A posição de Daniel é: " + posicao);
            }
            posicao++;
        }
        
        pulaLinha(1);
        
        int tamanho = funcionarios.size();
        System.out.println("Tamanho: " + tamanho);
        
        pulaLinha(1);
        
        boolean vazia = funcionarios.isEmpty();
        System.out.println("A lista está vazia: " + vazia);
        
        pulaLinha(1);
        
        boolean contem = funcionarios.contains("Carlos");
        System.out.println("A lista contém Carlos: " + contem);
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i=0; i < linhas; i++)
            System.out.print("\n");
    }
}