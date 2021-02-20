package Projetos.Projeto9.ModelsPersonas;

public final class Colaborador extends Fisica implements InterfacePessoa
{
    // Atributo de Classe
    public static int totalCadastrosColaborador;

    // Métodos Construtores
    public Colaborador()
    {
        //TODO
    }
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosColaborador()
    {
        return Colaborador.totalCadastrosColaborador;
    }
    public static void setTotalCadastrosColaborador()
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
    public void verTudo()
    {
        System.out.println("\nID: " + this.verId());
        System.out.println("Nome: " + this.verNome());
        System.out.println("Sobrenome: " + this.verSobrenome());
        System.out.println("CPF: " + this.verDocumento());
        System.out.println("País: " + this.verPaisOrigem());
        System.out.println("Time: " + this.verTime());
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