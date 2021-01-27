package AulasUdemy;

import java.util.LinkedList;
import java.util.List;

public class ClassFila 
{
    private List<String> nomes = new LinkedList<String>();
    
    @Override
    public String toString()
    {
        return this.nomes.toString();
    }
    
}