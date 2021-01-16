/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

/**
 * @author Junior Martins
 * @since 16/01/21 - 10h33
 */
public abstract class Cliente 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    protected String nomeCliente;
    protected boolean statusCliente;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Abstratos
    public abstract void ativarCliente();
    public abstract void desativarCliente();

    // Métodos Setters e Getters
    public String getNomeCliente()
    {
        return this.nomeCliente;
    }
    public void setNomeCliente(String nome)
    {
        this.nomeCliente = nome;
    }

    public boolean getStatusCliente()
    {
        return this.statusCliente;        
    }
    protected void setStatusCliente(boolean status)
    {
        this.statusCliente = status;        
    }
}