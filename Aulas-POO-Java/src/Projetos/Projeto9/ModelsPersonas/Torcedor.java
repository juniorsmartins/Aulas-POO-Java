package Projetos.Projeto9.ModelsPersonas;

import java.util.Date;

public class Torcedor 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static int totalTorcedor = 1;
    
    // Atributos de Instância
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private Date dataNascimento;
    private int telefone;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public Torcedor(String nome, String cpf, String email, Date data, int tel)
    {
        this.setId();
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setDataNascimento(data);
        this.setTelefone(tel);
        Torcedor.setTotalTorcedor();
    }
    
    // Métodos Abstratos
    // Métodos Especiais de Classe
    public static int getTotalTorcedor()
    {
        return Torcedor.totalTorcedor;
    }
    private static void setTotalTorcedor()
    {
        Torcedor.totalTorcedor += 1;
    }
    
    // Métodos Especiais de Instância
    public void alterarNome(String nome)
    {
        this.setNome(nome);
    }
    public void alterarCpf(String cpf)
    {
        this.setCpf(cpf);
    }
    public void alterarEmail(String email)
    {
        this.setEmail(email);
    }
    public void alterarDataNascimento(Date data)
    {
        this.setDataNascimento(data);
    }
    public void alterarTelefone(int tel)
    {
        this.setTelefone(tel);
    }
    
    
    // Métodos Getters
    public int getId()
    {
        return this.id;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getCpf()
    {
        return this.cpf;
    }
    public String email()
    {
        return this.email;
    }
    public Date getDataNascimento()
    {
        return this.dataNascimento;
    }
    public int getTelefone()
    {
        return this.telefone;
    }
    
    // Métodos Setters
    private void setId()
    {
        this.id = Torcedor.getTotalTorcedor();
    }
    private void setNome(String nome)
    {
        this.nome = nome;
    }
    private void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    private void setEmail(String mail)
    {
        this.email = mail;
    }
    private void setDataNascimento(Date data)
    {
        this.dataNascimento = data;
    }
    private void setTelefone(int tel)
    {
        this.telefone = tel;
    }
}