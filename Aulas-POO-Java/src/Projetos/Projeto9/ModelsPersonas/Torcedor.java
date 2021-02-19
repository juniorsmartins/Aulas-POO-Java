package Projetos.Projeto9.ModelsPersonas;

public final class Torcedor extends Fisica implements InterfacePessoa
{
    // Atributos de Classe
    public static int totalCadastrosTorcedor;
    
    // Atributos de Instância
    private String time;
    
    // Métodos Construtores
    public Torcedor(String nome, String sobrenome, String cpf, String pais, String time)
    {
        this.gerarId();
        this.editarNome(nome);
        this.editarSobrenome(sobrenome);
        this.editarDocumento(cpf);
        this.editarPaisOrigem(pais);
        this.editarTime(time);
    }
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosTorcedor()
    {
        return Torcedor.totalCadastrosTorcedor;
    }
    protected static void setTotalCadastrosTorcedor()
    {
        Torcedor.totalCadastrosTorcedor += 1;
    }
    
    // Métodos Getters de Instância
    protected String getTime()
    {
        return this.time;
    }
    
    // Métodos Setters de Instância
    protected void setTime(String time)
    {
        this.time = time;
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
    public void gerarId()
    {
        this.setId();
        Pessoa.setTotalCadastrosPessoa();
        Fisica.setTotalCadastrosFisica();
        Torcedor.setTotalCadastrosTorcedor();
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
    public void editarDocumento(String cp)
    {
        this.setCpf(cp);
    }
    @Override
    public void editarTime(String time)
    {
        this.setTime(time);
    }
}