package Projetos.Projeto08_Evo.Models;

public final class Usuario extends PessoaFisica
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    protected static long totalUsuario;
    
    // Atributos de Instância
    protected long idUsuario;
    protected String login;
    protected String senha;
    protected String nivelAcesso;
    
    // ***** ÁREA DE CONSTRUTORES *****
    public Usuario(String nome, String sobre, String login, String senha)
    {
        Cliente.setTotalCliente();
        PessoaFisica.setTotalCliente();
        Usuario.setTotalUsuario();
        this.setDataCadastro();
        this.setIdUsuario();
        this.setNomenclatura1(nome);
        this.setNomenclatura2(sobre);
        this.setLogin(login);
        this.senha = senha;
    }
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static long getTotalUsuario()
    {
        return Usuario.totalUsuario;
    }
    public static void setTotalUsuario()
    {
        Usuario.totalUsuario += 1;
    }
    
    // Métodos Getters de Instância
    public long getIdUsuario()
    {
        return this.idUsuario;
    }
    public String getLogin()
    {
        return this.login;
    }
    public String getSenha()
    {
        return this.senha;
    }
    public String getNivelAcesso()
    {
        return this.nivelAcesso;
    }
    
    // Métodos Setters de Instância  
    public void setIdUsuario()
    {
        this.idUsuario = Usuario.getTotalUsuario();
    }
    public void setLogin(String login)
    {
        this.login = login;
    }
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    public void setNivelAcesso(String acesso)
    {
        this.nivelAcesso = acesso;
    }
}