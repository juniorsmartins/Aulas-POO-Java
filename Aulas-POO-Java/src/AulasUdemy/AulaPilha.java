package AulasUdemy;

import java.util.LinkedList;
import java.util.List;

public class AulaPilha 
{
    private List<String> nomes = new LinkedList<String>();
    
    
    /**
     * Em uma pilha, inserimos elementos sempre no topo
     * @param nome 
     */
    public void insere (String nome)
    {
        //TODO
    }
    
    /**
     * Em uma pilha, removemos elementos sempre do topo
     * @return 
     */
    public String remove() 
    {
        //TODO
        return "";
    }
    
    public boolean vazia()
    {
        //TODO
        return false;
    }
    
    @Override
    public String toString ()
    {
        return this.nomes.toString();
    }
}