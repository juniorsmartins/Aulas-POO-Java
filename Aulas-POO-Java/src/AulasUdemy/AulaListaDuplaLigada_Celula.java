package AulasUdemy;

public class AulaListaDuplaLigada_Celula 
{
    private Object elemento;
    private AulaListaDuplaLigada_Celula proximo;
    private AulaListaDuplaLigada_Celula anterior;

    public AulaListaDuplaLigada_Celula (Object elemento, AulaListaDuplaLigada_Celula proximo)
    {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public AulaListaDuplaLigada_Celula (Object elemento)
    {
        this(elemento, null);
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
        return this.elemento;
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