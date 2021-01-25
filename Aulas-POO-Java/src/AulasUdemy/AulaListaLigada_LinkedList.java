package AulasUdemy;

public class AulaListaLigada_LinkedList 
{
    private AulaListaLigada_Celula primeira = null;
    private int total = 0;
    
    public void adicionaNoComeco (Object elemento)
    {
        AulaListaLigada_Celula nova = new AulaListaLigada_Celula (elemento, this.primeira);
        this.primeira = nova;
        this.total = this.total + 1;
    }
    
    public void adiciona (Object elemento)
    {
        //TODO
    }
    
    public void adiciona (int posicao, Object elemento)
    {
        //TODO
    }

    public Object pega (int posicao)
    {
        //TODO
        return null;
    }

    public void remove (int posicao)
    {
        //TODO
    }
    
    public int tamanho ()
    {
        //TODO
        return 0;
    }
    
    public boolean contem (Object obj)
    {
        //TODO
        return false;
    }
    
    @Override
    public String toString ()
    {
        if (total == 0) 
        {
            return "[]";
        }
        return "TODO";
        
    }
}