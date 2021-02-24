package Projetos.Projeto9.ModelsPersonas;

public final class Empresa extends Juridica implements InterfacePJ
{
    // Atributos de Classe
    public static int totalCadastrosEmpresa;
    
    // Atributos de Instância
    
    // Métodos Construtores
    public Empresa()
    {
        //TODO - sobrecarga de construtores
    }
    public Empresa(String razao, String fantasia, String cnpj, String pais, String time)
    {
        this.gerarId();
        this.setDataCadastro();
        this.editarNome(razao);
        this.editarSobrenome(fantasia);
        this.editarDocumento(cnpj);
        this.editarPaisOrigem(pais);
        this.editarTime(time);
    }
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosEmpresa()
    {
        return Empresa.totalCadastrosEmpresa;
    }
    protected static void setTotalCadastrosEmpresa()
    {
        Empresa.totalCadastrosEmpresa += 1; 
    }
    
    // Métodos Getters de Instância
    
    // Métodos Setters de Instância

    // Implementações da Interface Pessoa
    @Override
    public int verId()
    {
        return this.getId();
    }
    @Override
    public String verPaisOrigem()
    {
        return this.getPaisOrigem();
    }
    @Override
    public String verDataCadastro()
    {
        return this.getDataCadastro();
    }
    @Override
    public String verNome()
    {
        return this.getRazaoSocial();
    }
    @Override
    public String verSobrenome()
    {
        return this.getNomeFantasia();
    }
    @Override
    public String verDocumento()
    {
        return this.getCnpj();
    }
    @Override
    public String verTime()
    {
        return this.getTime();
    }
    @Override
    public String toString()
    {
        System.out.println("\nID: " + this.verId());
        System.out.println("Razão Social: " + this.verNome());
        System.out.println("Nome Fantasia: " + this.verSobrenome());
        System.out.println("CNPJ: " + this.verDocumento());
        System.out.println("País: " + this.verPaisOrigem());
        System.out.println("Time: " + this.verTime());
        return "";
    }
    
    @Override
    public void gerarId()
    {
        this.setId();
        Pessoa.setTotalCadastrosPessoa();
        Juridica.setTotalCadastrosJuridica();
        Empresa.setTotalCadastrosEmpresa();
    }
    @Override
    public void editarPaisOrigem(String pais)
    {
        this.setPaisOrigem(pais);
    }
    @Override
    public void editarNome(String razao)
    {
        this.setRazaoSocial(razao);
    }
    @Override
    public void editarSobrenome(String fantasia)
    {
        this.setNomeFantasia(fantasia);
    }
    @Override
    public void editarDocumento(String doc)
    {
        this.setCnpj(doc);
    }
    @Override
    public void editarTime(String time)
    {
        this.setTime(time);
    }
}