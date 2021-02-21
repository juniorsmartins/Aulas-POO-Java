package Projetos.Projeto9.ModelsPersonas;

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Pessoa 
{
    // Atributos de Classe
    public static int totalCadastrosPessoa;
    
    // Atributos de Instância
    private int id;
    private String paisOrigem;
    private String dataCadastro;
    private String time;
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosPessoa()
    {
        return Pessoa.totalCadastrosPessoa;
    }
    protected static void setTotalCadastrosPessoa()
    {
        Pessoa.totalCadastrosPessoa += 1;
    }
    
    // Métodos Getters de Instância
    protected int getId()
    {
        return this.id;
    }
    protected String getPaisOrigem()
    {
        return this.paisOrigem;
    }
    protected String getDataCadastro()
    {
        return this.dataCadastro;
    }
    protected String getTime()
    {
        return this.time;
    }

    // Métodos Setters de Instância
    protected void setId()
    {
        this.id = Pessoa.getTotalCadastrosPessoa() + 1;
    }
    public void updateId(int id)
    {
        this.id = id;
    }
    protected void setPaisOrigem(String pais)
    {
        this.paisOrigem = pais;
    }
    protected void setDataCadastro()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        this.dataCadastro = formatar.format(data);
    }
    protected void setTime(String time)
    {
        this.time = time;
    }
}