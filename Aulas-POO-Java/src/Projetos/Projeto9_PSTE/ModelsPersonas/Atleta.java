package Projetos.Projeto9_PSTE.ModelsPersonas;

public final class Atleta extends Fisica implements InterfacePF
{
    // Atributos de Classe
    public static int totalCadastrosAtleta;
    
    // Atributos de Instância
    
    // Métodos Construtores
    public Atleta()
    {
        //TODO - sobrecarga de construtor
    }
    public Atleta(String nome, String sobrenome, String cpf, String pais, String time)
    {
        this.gerarId();
        this.setDataCadastro();
        this.editarNome(nome);
        this.editarSobrenome(sobrenome);
        this.editarDocumento(cpf);
        this.editarPaisOrigem(pais);
        this.editarTime(time);
    }
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosAtleta()
    {
        return Atleta.totalCadastrosAtleta;
    }
    protected static void setTotalCadastrosAtleta()
    {
        Atleta.totalCadastrosAtleta += 1;
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
        return this.getNome();
    }
    @Override
    public String verSobrenome()
    {
        return this.getSobrenome();
    }
    @Override
    public String verDocumento()
    {
        return this.getCpf();
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
        System.out.println("Nome: " + this.verNome());
        System.out.println("Sobrenome: " + this.verSobrenome());
        System.out.println("CPF: " + this.verDocumento());
        System.out.println("País: " + this.verPaisOrigem());
        System.out.println("Time: " + this.verTime());
        return "";
    }

    @Override
    public void gerarId()
    {
        this.setId();
        Pessoa.setTotalCadastrosPessoa();
        Fisica.setTotalCadastrosFisica();
        Atleta.setTotalCadastrosAtleta();
    }
    @Override
    public void editarPaisOrigem(String pais)
    {
        this.setPaisOrigem(pais);
    }
    @Override
    public void editarNome(String nome)
    {
        this.setNome(nome);
    }
    @Override
    public void editarSobrenome(String sobre)
    {
        this.setSobrenome(sobre);
    }
    @Override
    public void editarDocumento(String doc)
    {
        this.setCpf(doc);
    }
    @Override
    public void editarTime(String time)
    {
        this.setTime(time);
    }
}