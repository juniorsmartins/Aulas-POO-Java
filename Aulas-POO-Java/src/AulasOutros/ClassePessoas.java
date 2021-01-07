package AulasOutros;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassePessoas 
{
    /* ----- ÁREA DE ATRIBUTOS ----- */
    // Atributos de Classe
    private static int totalPessoas;
    
    // Atributos de Instância
    private double id;
    private String dataCadastro;
    private String horaCadastro;
    private String paisOrigem;


    /* ----- ÁREA DE MÉTODOS ----- */    
    // Método Construtor
    public ClassePessoas()
    {
        setTotalPessoas();
        setID();
        setDataCadastro();
        setHoraCadastro();
    }
    
    // Métodos Especiais
    public void status()
    {
        System.out.println("Total Pessoas: " + getTotalPessoas());
        System.out.println("ID: " + this.getID());
        System.out.println("Data: " + this.getDataCadastro());
        System.out.println("Hora: " + this.getHoraCadastro());
    }

    // Métodos Setters e Getters
    private void setTotalPessoas()
    {
        ClassePessoas.totalPessoas += 1;
    }
    public int getTotalPessoas()
    {
        return ClassePessoas.totalPessoas;
    }

    private void setID()
    {
        this.id = (getTotalPessoas() + 1);
    }
    public double getID()
    {
        return this.id;
    }

    private void setDataCadastro()
    {
        Date data = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        this.dataCadastro = formatarData.format(data);
    }
    public String getDataCadastro()
    {
        return this.dataCadastro;
    }
    
    private void setHoraCadastro()
    {
        Date hora = new Date();
        SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");
        this.horaCadastro = formatarHora.format(hora);
    }
    public String getHoraCadastro()
    {
        return this.horaCadastro;
    }
    
    protected void setPaisOrigem(String pais)
    {
        this.paisOrigem = pais;
    }
    public String getPaisOrigem()
    {
        return this.paisOrigem;
    }
}
