/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

/**
 * @author Junior Martins
 * @since 16/01/21 - 10h33
 */
public class PessoaJuridica extends Cliente
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters

    // Métodos de SuperClasse
    @Override
    public abstract String getNomeCliente()
    {
        return super.nomeCliente;
    }
    public abstract void setNomeCliente(String nome)
    {
        
    }

    public abstract boolean getStatusCliente()
    {
        
    }
    protected abstract void setStatusCliente(boolean status)
    {
        
    }

    public abstract void ativarCliente()
    {
        
    }
    public abstract void desativarCliente()
    {
        
    }
}