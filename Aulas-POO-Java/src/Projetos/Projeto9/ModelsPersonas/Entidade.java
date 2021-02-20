package Projetos.Projeto9.ModelsPersonas;

public class Entidade extends Juridica implements InterfacePessoa
{
    // Atributos de Classe
    public static int totalCadastrosEntidade;
    
    // Métodos Construtores
    public Entidade()
    {
        //TODO
    }
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosEntidade()
    {
        return Entidade.totalCadastrosEntidade;
    }
    public static void setTotalCadastrosEntidade()
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
    public void verTudo()
    {
        System.out.println("\nID: " + this.verId());
        System.out.println("Razão Social: " + this.verNome());
        System.out.println("Nome Fantasia: " + this.verSobrenome());
        System.out.println("CNPJ: " + this.verDocumento());
        System.out.println("País: " + this.verPaisOrigem());
        System.out.println("Time: " + this.verTime());
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