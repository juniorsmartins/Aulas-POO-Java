package AulasUdemy;

public class AulaListaDuplaLigada_Celula 
{
    private Object elementos;
    private AulaListaDuplaLigada_Celula proximo;
    private AulaListaDuplaLigada_Celula anterior;

    public AulaListaDuplaLigada_Celula (Object elementos, AulaListaDuplaLigada_Celula proximo)
    {
        this.elementos = elementos;
        this.proximo = proximo;
    }
    
    public AulaListaDuplaLigada_Celula (Object elementos)
    {
        this(elementos, null);
    }
    
    public AulaListaDuplaLigada_Celula getProximo ()
    {
        return this.proximo;
    }
    
    public void setProximo (AulaListaDuplaLigada_Celula proximo)
    {
        this.proximo = proximo;
    }
    
    public Object getElemento ()
    {
        return this.elementos;
    }
    
    public AulaListaDuplaLigada_Celula getAnterior ()
    {
        return this.anterior;
    }
    
    public void setAnterior (AulaListaDuplaLigada_Celula anterior)
    {
        this.anterior = anterior;
    }
}