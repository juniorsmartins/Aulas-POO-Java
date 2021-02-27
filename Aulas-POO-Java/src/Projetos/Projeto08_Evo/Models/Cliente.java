package Projetos.Projeto08_Evo.Models;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Cliente 
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static long totalCliente;
    public static long totalClienteDeletado;
    
    // Atributos de Instância
    private String dataCadastro;
    private String nomenclatura1;
    private String nomenclatura2;
    private String documento;
    private String dataOrigem;
    private Endereco endereco;
    private Contato contato;
    
    // ***** ÁREA DE CONSTRUTORES *****
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static long getTotalCliente()
    {
        return Cliente.totalCliente = totalCliente - totalClienteDeletado;
    }
    public static void setTotalCliente()
    {
        Cliente.totalCliente += 1;
    }
    public static long getTotalClienteDeletado()
    {
        return Cliente.totalClienteDeletado;
    }
    public static void setTotalClienteDeletado()
    {
        Cliente.totalClienteDeletado += 1;
    }
    
    // Métodos Getters de Instância
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