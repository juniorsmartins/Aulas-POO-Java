package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProjetoContato {

    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static long totalContatos;
    
    // Atributos de Instância
    private String dataContato;
    private String idContato;
    private String nomeContato;
    private String sobrenomeContato;
    private String cpfContato;
    private String dataNascimentoContato;
    private String enderecoContato;
    private String telefoneContato;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public ProjetoContato()
    {
        ProjetoContato.setTotalContatos();
        this.setDataContato();
        this.setIdContato();
        this.setNomeContato(" ");
        this.setSobrenomeContato(" ");
        this.setCpfContato(" ");
        this.setDataNascimentoContato(" ");
    }

    // Métodos de Classe
    protected static void setTotalContatos()
    {
        ProjetoContato.totalContatos += 1;
    }
    public static long getTotalContatos()
    {
        return ProjetoContato.totalContatos;
    }
    
    // Métodos Especiais de Instância
    public void statusContato()
    {
        System.out.println("----------- Ficha -----------");
        System.out.println("Total: " + ProjetoContato.getTotalContatos());
        System.out.println("Data: " + this.getDataContato());
        System.out.println("ID: " + this.getIdContato());
        System.out.println("Nome: " + this.getNomeContato() + " " + this.getSobrenomeContato());
        System.out.println("CPF: " + this.getCpfContato());
        System.out.println("Data de Nascimento: " + this.getDataNascimentoContato());
        System.out.println("---------- Contato ----------");
        System.out.println("Telefone fixo: ");
        System.out.println("Telefone Celular: ");
        System.out.println("E-mail: ");
    }

    // Métodos Setters e Getters
    protected void setDataContato()
    {
        Date data = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("ddMMyyyy");
        this.dataContato = formatarData.format(data);
        this.setIdContato();
    }
    public String getDataContato()
    {
        return this.dataContato;
    }
    
    protected void setIdContato()
    {
        this.idContato = (this.getDataContato() + "-" + ProjetoContato.getTotalContatos());
    }
    public String getIdContato()
    {
        return this.idContato;
    }
    
    protected void setNomeContato(String nome)
    {
        this.nomeContato = nome;
    }
    public String getNomeContato()
    {
        return this.nomeContato;
    }
    
    protected void setSobrenomeContato(String sobrenome)
    {
        this.sobrenomeContato = sobrenome;
    }
    public String getSobrenomeContato()
    {
        return sobrenomeContato;
    }

    protected void setCpfContato(String cpf)
    {
        this.cpfContato = cpf;
    }
    public String getCpfContato()
    {
        return this.cpfContato;
    }

    protected void setDataNascimentoContato(String dataNascimento)
    {
        this.dataNascimentoContato = dataNascimento;
    }
    public String getDataNascimentoContato()
    {
        return this.dataNascimentoContato;
    }
}
