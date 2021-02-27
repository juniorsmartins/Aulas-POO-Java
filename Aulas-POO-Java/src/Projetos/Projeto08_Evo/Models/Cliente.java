package Projetos.Projeto08_Evo.Models;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Cliente 
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    protected static long totalCliente;
    protected static long totalClienteDel;
    
    // Atributos de Instância
    protected long idCliente;
    protected String dataCadastro;
    protected String nomenclatura1;
    protected String nomenclatura2;
    protected String documento;
    protected String dataOrigem;
    protected Endereco endereco;
    protected Contato contato;
    
    // ***** ÁREA DE CONSTRUTORES *****
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static long getTotalCliente()
    {
        return Cliente.totalCliente = totalCliente - totalClienteDel;
    }
    public static void setTotalCliente()
    {
        Cliente.totalCliente += 1;
    }
    public static long getTotalClienteDeletado()
    {
        return Cliente.totalClienteDel;
    }
    public static void setTotalClienteDeletado()
    {
        Cliente.totalClienteDel += 1;
    }
    
    // Métodos Getters de Instância
    public long getIdCliente()
    {
        return this.idCliente;
    }
    public String getDataCadastro()
    {
        return this.dataCadastro;
    }
    public String getNomenclatura1()
    {
        return this.nomenclatura1;
    }
    public String getNomenclatura2()
    {
        return this.nomenclatura2;
    }
    public String getDocumento()
    {
        return this.documento;
    }
    public String getDataOrigem()
    {
        return this.dataOrigem;
    }
    public Endereco getEndereco()
    {
        return this.endereco;
    }
    public Contato getContato()
    {
        return this.contato;
    }

    // Métodos Setters de Instância
    public void setIdCliente()
    {
        this.idCliente = Cliente.getTotalCliente();
    }
    public void setDataCadastro()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        this.dataCadastro = formatar.format(data);
    }
    public void setNomenclatura1(String nome1)
    {
        this.nomenclatura1 = nome1;
    }
    public void setNomenclatura2(String nome2)
    {
        this.nomenclatura2 = nome2;
    }
    public void setDocumento(String doc)
    {
        this.documento = doc;
    }
    public void setDataOrigem(String datOrigem)
    {
        this.dataOrigem = datOrigem;
    }
    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }
    public void setContato(Contato contato)
    {
        this.contato = contato;
    }
}