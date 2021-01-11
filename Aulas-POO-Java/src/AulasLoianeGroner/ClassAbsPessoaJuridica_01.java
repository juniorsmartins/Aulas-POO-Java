package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class ClassAbsPessoaJuridica_01 extends ClassAbsCliente_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalPJ;

    // Atributos de Instância
    private String dataPJ;
    private String idPJ;
    private String cnpjPJ;
    private String razaoSocialPJ;
    private String nomeFantasiaPJ;
    private String dataAberturaPJ;
    private String setorEconomicoPJ;
    private String portePJ;
    private String tipoPJ;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected ClassAbsPessoaJuridica_01()
    {
        ClassAbsPessoaJuridica_01.totalPJ += 1;
        this.setDataPJ();
        this.setIdPJ();
    }

    // Métodos Especiais de Classe
    protected static void setTotalPJ()
    {
        ClassAbsPessoaJuridica_01.totalPJ += 1;
    }
    public static long getTotalPJ()
    {
        return ClassAbsPessoaJuridica_01.totalPJ;
    }

    // Métodos Especiais de Instância
    // Métodos Setters e Getters 
    protected void setDataPJ()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataPJ = formatar.format(data);
    }
    protected void setIdPJ()
    {
        this.idPJ = (this.getDataPJ() + "-" + ClassAbsCliente_01.getTotalClientes() + "." + ClassAbsPessoaJuridica_01.getTotalPJ());
    }
    public void setCnpjPJ(String cnpj)
    {
        this.cnpjPJ = cnpj;
    }
    public void setRazaoSocialPJ(String razaoSocial)
    {
        this.razaoSocialPJ = razaoSocial;
    }
    public void setNomeFantasiaPJ(String nomeFantasia)
    {
        this.nomeFantasiaPJ = nomeFantasia;
    }
    public void setDataAberturaPJ(String dataAbertura)
    {
        this.dataAberturaPJ = dataAbertura;
    }
    public void setSetorEconomicoPJ(String setorEconomico)
    {
        this.setorEconomicoPJ = setorEconomico;
    }
    public void setPortePJ(String porte)
    {
        this.portePJ = porte;
    }
    public void setTipoPJ(String tipo)
    {
        this.tipoPJ = tipo;
    }
    
    public String getDataPJ()
    {
        return this.dataPJ;
    }
    public String getIdPJ()
    {
        return this.idPJ;
    }
    public String getCnpjPJ()
    {
        return this.cnpjPJ;
    }
    public String getRazaoSocialPJ()
    {
        return this.razaoSocialPJ;
    }
    public String getNomeFantasiaPJ()
    {
        return this.nomeFantasiaPJ;
    }
    public String getDataAberturaPJ()
    {
        return this.dataAberturaPJ;
    }
    public String getSetorEconomicoPJ()
    {
        return this.setorEconomicoPJ;
    }
    public String getPortePJ()
    {
        return this.portePJ;
    }
    public String getTipoPJ()
    {
        return this.tipoPJ;
    }
}