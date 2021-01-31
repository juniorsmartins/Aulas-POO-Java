/*
 * Exercício para aprendizagem de Java
 */
package Projetos.Projeto1.Modelo;

/**
 * @author Junior Martins
 * @since 16/01/21 - 10h33
 */
public abstract class Cliente 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    private String cidade;
    protected String denominacao;
    private boolean statusCadastro;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    public void ativarCadastro()
    {
        this.setStatusCadastro(true);
    }
    public void desativarCadastro()
    {
        this.setStatusCadastro(false);
    }

    // Métodos Abstratos
    public abstract String getDenominacao();
    public abstract void setDenominacao(String nome);

    // Métodos Setters e Getters
    public String getCidade()
    {
        return this.cidade;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public boolean getStatusCadastro()
    {
        return this.statusCadastro;        
    }
    private void setStatusCadastro(boolean status)
    {
        this.statusCadastro = status;        
    }
}