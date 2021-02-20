package Projetos.Projeto9.ModelsPersonas;

public final class Colaborador extends Fisica implements InterfacePF
{
    // Atributo de Classe
    public static int totalCadastrosColaborador;
    
    // Atributos de Instância

    // Métodos Construtores
    public Colaborador(String nome, String sobrenome, String cpf, String pais, String time)
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
    public static int getTotalCadastrosColaborador()
    {
        return Colaborador.totalCadastrosColaborador;
    }
    protected static void setTotalCadastrosColaborador()
    {
        Colaborador.totalCadastrosColaborador += 1;
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
        Colaborador.setTotalCadastrosColaborador();
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