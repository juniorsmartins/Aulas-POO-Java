package Projetos.Projeto9.ModelsPersonas;

public final class Torcedor extends Fisica implements InterfaceTorcedor
{
    public static int totalCadastrosTorcedor;
    
    private String time;
    
    public Torcedor(String nome, String sobrenome, String cpf, String nacionalidade, String time)
    {
        this.gerarId();
        this.editarNome(nome);
        this.editarSobrenome(sobrenome);
        this.editarCpf(cpf);
        this.editarNacionalidade(nacionalidade);
        this.editarTime(time);
    }
    
    public static int getTotalCadastrosTorcedor()
    {
        return Torcedor.totalCadastrosTorcedor;
    }
    protected static void setTotalCadastrosTorcedor()
    {
        Torcedor.totalCadastrosTorcedor += 1;
    }
    
    protected String getTime()
    {
        return this.time;
    }
    
    protected void setTime(String time)
    {
        this.time = time;
    }

    // Implementações da Interface Torcedor
    @Override
    public int verId()
    {
        return this.getId();
    }
    @Override
    public String verNacionalidade()
    {
        return this.getNacionalidade();
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
    public String verCpf()
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
    public void editarNacionalidade(String nacionalidade)
    {
        this.setNacionalidade(nacionalidade);
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
    public void editarCpf(String cp)
    {
        this.setCpf(cp);
    }
    @Override
    public void editarTime(String time)
    {
        this.setTime(time);
    }
}