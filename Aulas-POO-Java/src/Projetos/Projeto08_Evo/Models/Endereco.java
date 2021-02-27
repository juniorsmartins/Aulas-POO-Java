package Projetos.Projeto08_Evo.Models;

public class Endereco 
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    
    // Atributos de Instância
    private long idEndereco;
    private String rua;
    private int numero;
    private int cep;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;

    // ***** ÁREA DE CONSTRUTORES *****
    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais, int cep)
    {
        this.setIdEndereco();
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setCep(cep);
    }
    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String estado, String pais, int cep)
    {
        this.setIdEndereco();
        this.setRua(rua);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setCep(cep);
    }
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe

    // Métodos Getters de Instância
    public long getIdEndereco()
    {
        return this.idEndereco;
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
    public void setIdEndereco()
    {
        this.idEndereco = Cliente.getTotalCliente();
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