package AulasUdemy;

/**
 * Classe que representa uma célula (container) onde teremos o objeto (valor) e uma celula que será a ligação para o próximo.
 * 
 * @author Geek University
 */
public class AulaListaLigada_Celula 
{
    private Object elemento;
    private AulaListaLigada_Celula proximo;

    public AulaListaLigada_Celula (Object elemento, AulaListaLigada_Celula proximo)
    {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public AulaListaLigada_Celula getProximo ()
    {
        return this.proximo;
    }
    
    public void setProximo (AulaListaLigada_Celula proximo)
    {
        this.proximo = proximo;
    }
    
    public Object getElemento ()
    {
        return this.elemento;
    }
}