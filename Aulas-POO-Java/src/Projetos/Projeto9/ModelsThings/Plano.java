package Projetos.Projeto9.ModelsThings;

import Projetos.Projeto9.ModelsPersonas.Torcedor;
import java.util.Date;

public class Plano 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    private String tipo;
    private float valor;
    private Date dataAssociacao;
    private Date dataRenovacao;
    private Date dataDesligamento;
    private String indicadoPor;
    private Boolean status;
    private Torcedor torcedor;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    // Métodos Abstratos
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Getters
    public String getTipo()
    {
        return this.tipo;
    }
    public float getValor()
    {
        return this.valor;
    }
    public Date getDataAssociacao()
    {
        return this.dataAssociacao;
    }
    public Date getDataRenovacao()
    {
        return this.dataRenovacao;
    }
    public Date getDataDesligamento()
    {
        return this.dataDesligamento;
    }
    public String getIndicadoPor()
    {
        return this.indicadoPor;
    }
    public Boolean getStatus()
    {
        return this.status;
    }
    public Torcedor getTorcedor()
    {
        return this.torcedor;
    }
    
    // Métodos Setters
    private void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    private void setValor(float valor)
    {
        this.valor = valor;
    }
    private void setDataAssociacao(Date data)
    {
        this.dataAssociacao = data;
    }
    private void setDataRenovacao(Date data)
    {
        this.dataRenovacao = data;
    }
    private void setDataDesligamento(Date data)
    {
        this.dataDesligamento = data;
    }
    private void setIndicadoPor(String indicacao)
    {
        this.indicadoPor = indicacao;
    }
    private void setStatus(Boolean status)
    {
        this.status = status;
    }
    private void setTorcedor(Torcedor torcedor)
    {
        this.torcedor = torcedor;
    }
}