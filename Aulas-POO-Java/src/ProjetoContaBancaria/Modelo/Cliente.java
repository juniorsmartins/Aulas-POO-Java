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

    // Métodos Setters e Getters
    public abstract String getNomeCliente();
    public abstract void setNomeCliente(String nome);
    public abstract boolean getStatusCliente();
    protected abstract void setStatusCliente(boolean status);
    public abstract void ativarCliente();
    public abstract void desativarCliente();
}