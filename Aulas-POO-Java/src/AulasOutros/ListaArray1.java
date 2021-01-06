package AulasOutros;

import java.awt.List;
import java.util.ArrayList;

public class ListaArray1 {
    
    public static void main(String[] args)
    {
        
        ArrayList<String> listaAlunos = new ArrayList<String>();
        
        
        listaAlunos.add("Mário"); // Adicionar na lista
        int tamanhoLista = listaAlunos.size(); // Saber tamanho da lista
        System.out.println("Tamanho: " + tamanhoLista);
        listaAlunos.add("Pedro");
        listaAlunos.add("Augusto");
        System.out.println("Tamanho: " + listaAlunos.size());
        System.out.println(listaAlunos.get(0));
        System.out.println(listaAlunos.get(1));
        System.out.println(listaAlunos.get(2));
        
        
        
    }
    
}
