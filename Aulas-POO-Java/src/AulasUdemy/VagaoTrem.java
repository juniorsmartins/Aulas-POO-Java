package AulasUdemy;

/**
 * Treino de Lista Duplamente Ligada
 * @author Junior Martins
 */
public class VagaoTrem 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    private VagaoTrem anterior;
    private Object carga;
    private VagaoTrem proximo;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public VagaoTrem (Object carga, VagaoTrem anterior, VagaoTrem proximo)
    {
        this.carga = carga;
        this.anterior = anterior;
        this.proximo = proximo;
    }
    
    // Métodos de Classe
    // Métodos de Instância
    // Métodos Abstratos

    // Métodos Setters e Getters
    public void setAnterior (VagaoTrem anterior)
    {
        this.anterior = anterior;
    }
    public VagaoTrem getAnterior ()
    {
        return this.anterior;
    }

    public void setProximo (VagaoTrem proximo)
    {
        this.proximo = proximo;
    }
    public VagaoTrem getProximo ()
    {
        return this.proximo;
    }
}