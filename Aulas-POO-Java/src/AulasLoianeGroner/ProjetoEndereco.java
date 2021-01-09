package AulasLoianeGroner;

public class ProjetoEndereco {

    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atriburos de Classe
    public static long totalEnderecos;
    
    // Atributos de Instância
    private String ruaEndereco;
    private short numeroEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private String estadoEndereco;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public ProjetoEndereco(String rua, short numero, String bairro, String cidade, String estado)
    {
        this.setRuaEndereco(rua);
        this.setNumeroEndereco(numero);
        this.setBairroEndereco(bairro);
        this.setCidadeEndereco(cidade);
        this.setEstadoEndereco(estado);
    }
    
    // Métodos Especiais de Classe

    // Métodos Especiais de Instância
    public void statusEndereco()
    {
        System.out.println("--------- Endereço ----------");
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
    
    protected void setNumeroEndereco(short numero)
    {
        this.numeroEndereco = numero;
    }
    public short getNumeroEndereco()
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
