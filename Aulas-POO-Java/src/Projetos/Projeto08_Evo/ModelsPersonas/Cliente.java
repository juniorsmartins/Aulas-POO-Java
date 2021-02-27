package Projetos.Projeto08_Evo.ModelsPersonas;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Cliente 
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static long totalCliente;
    public static long totalClienteDeletado;
    
    // Atributos de Instância
    private long id = 0;
    private String dataCadastro;
    private String nomenclatura1;
    private String nomenclatura2;
    private String documento;
    private int telefone;
    private String dataOrigem;
    private String email;
    private String rua;
    private int numero;
    private int cep;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;
    
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
    public long getId()
    {
        return this.id;
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
    public int getTelefone()
    {
        return this.telefone;
    }
    public String getDataOrigem()
    {
        return this.dataOrigem;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getRua()
    {
        return this.rua;
    }
    public int getNumero()
    {
        return this.numero;
    }
    public int getCep()
    {
        return this.cep;
    }
    public String getBairro()
    {
        return this.bairro;
    }
    public String getComplemento()
    {
        return this.complemento;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    public String getEstado()
    {
        return this.estado;
    }
    public String getPais()
    {
        return this.pais;
    }

    // Métodos Setters de Instância
    public void setId()
    {
        this.id = Cliente.totalCliente;
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
    public void setTelefone(int tel)
    {
        this.telefone = tel;
    }
    public void setDataOrigem(String datOrigem)
    {
        this.dataOrigem = datOrigem;
    }
    public void setEmail(String mail)
    {
        this.email = mail;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    public void setCep(int cep)
    {
        this.cep = cep;
    }
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }
    public void setComplemento(String complemento)
    {
        this.complemento = complemento;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    public void setPais(String pais)
    {
        this.pais = pais;
    }
}