package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProjetoEndereco {

    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atriburos de Classe
    public static int totalEnderecos;
    
    // Atributos de Instância
    private String ruaEndereco;
    private String dataEndereco;
    private String idEndereco;
    private int numeroEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private String estadoEndereco;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public ProjetoEndereco()
    {
        ProjetoEndereco.setTotalEnderecos();
        this.setDataEndereco();
        this.setIdEndereco();
        this.setRuaEndereco(" ");
        this.setBairroEndereco(" ");
        this.setCidadeEndereco(" ");
        this.setEstadoEndereco(" ");
    }
    public ProjetoEndereco(String rua, int numero, String bairro, String cidade, String estado)
    {
        ProjetoEndereco.setTotalEnderecos();
        this.setRuaEndereco(rua);
        this.setNumeroEndereco(numero);
        this.setBairroEndereco(bairro);
        this.setCidadeEndereco(cidade);
        this.setEstadoEndereco(estado);
    }
    
    // Métodos Especiais de Classe
    private static void setTotalEnderecos()
    {
        ProjetoEndereco.totalEnderecos += 1;
    }
    public static int getTotalEnderecos()
    {
        return ProjetoEndereco.totalEnderecos;
    }

    // Métodos Especiais de Instância
    public void statusEndereco()
    {
        System.out.println("--------- Endereço ----------");
        System.out.println("Total: " + ProjetoEndereco.getTotalEnderecos());
        System.out.println("Data: " + this.getDataEndereco());
        System.out.println("ID: " + this.getIdEndereco());
        System.out.println("Rua: " + this.getRuaEndereco());
        System.out.println("Número: " + this.getNumeroEndereco());
        System.out.println("Bairro: " + this.getBairroEndereco());
        System.out.println("Cidade: " + this.getCidadeEndereco());
        System.out.println("Estado: " + this.getEstadoEndereco());
    }
    
    // Métodos Setters e Getters
    protected void setRuaEndereco(String endereco)
    {
        this.ruaEndereco = endereco;
    }
    public String getRuaEndereco()
    {
        return this.ruaEndereco;
    }

    protected void setDataEndereco()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataEndereco = formatar.format(data);
    }
    public String getDataEndereco()
    {
        return this.dataEndereco;
    }
    
    protected void setIdEndereco()
    {
        this.idEndereco = (this.getDataEndereco() + "-" + ProjetoEndereco.getTotalEnderecos());
    }
    public String getIdEndereco()
    {
        return this.idEndereco;
    }
    
    protected void setNumeroEndereco(int numero)
    {
        this.numeroEndereco = numero;
    }
    public int getNumeroEndereco()
    {
        return this.numeroEndereco;
    }
    
    protected void setBairroEndereco(String bairro)
    {
        this.bairroEndereco = bairro;
    }
    public String getBairroEndereco()
    {
        return this.bairroEndereco;
    }

    protected void setCidadeEndereco(String cidade) {
        this.cidadeEndereco = cidade;
    }
    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    protected void setEstadoEndereco(String estado) {
        this.estadoEndereco = estado;
    }
    public String getEstadoEndereco() {
        return estadoEndereco;
    }

}
