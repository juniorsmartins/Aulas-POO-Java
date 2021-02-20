package Projetos.Projeto9.ModelsPersonas;

public final class Entidade extends Juridica implements InterfacePJ
{
    // Atributos de Classe
    public static int totalCadastrosEntidade;
    
    // Atributos de Instância
    
    // Métodos Construtores
    public Entidade(String razao, String fantasia, String cnpj, String pais, String time)
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
    public static int getTotalCadastrosEntidade()
    {
        return Entidade.totalCadastrosEntidade;
    }
    protected static void setTotalCadastrosEntidade()
    {
        Entidade.totalCadastrosEntidade += 1;
    }
    
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
        Entidade.setTotalCadastrosEntidade();
    }
    @Override
    public void editarPaisOrigem(String pais)
    {
        this.setPaisOrigem(pais);
    }
    @Override
    public void editarNome(String nome)
    {
        this.setRazaoSocial(nome);
    }
    @Override
    public void editarSobrenome(String sobre)
    {
        this.setNomeFantasia(sobre);
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