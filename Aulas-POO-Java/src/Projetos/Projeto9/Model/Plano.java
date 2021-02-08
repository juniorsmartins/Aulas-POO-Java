package Projetos.Projeto9.Model;

public class Plano 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    private String tipo;
    private float valor;
    private String dataAssociacao;
    private String dataRenovacao;
    private String dataDesligamento;
    private String indicadoPor;
    private Boolean status;
    private Torcedor[] membros = new Torcedor[5];
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public Plano(String nome, float valor)
    {
        this.setNomePlano(nome);
        this.setValorPlano(valor);
    }

    // Métodos Abstratos
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância

    // Métodos Setters e Getters
    private void setNomePlano(String nome)
    {
        this.nomePlano = nome;
    }
    public String getNomePlano()
    {
        return this.nomePlano;
    }

    private void setValorPlano(float valor)
    {
        this.valorPlano = valor;
    }
    public float getValorPlano()
    {
        return this.valorPlano;
    }
}