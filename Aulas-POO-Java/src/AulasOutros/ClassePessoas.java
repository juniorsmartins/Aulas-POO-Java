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

    


    /* ----- ÁREA DE MÉTODOS ----- */    
    // Método Construtor
    public ClassePessoas()
    {
        setTotalPessoas();
        setID();
        setDataCadastro();
        // Data pega pelo construtor
        
    }

    // Métodos Especiais

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
        SimpleDateFormat formatar = new SimpleDateFormat("d/M/y");
        String dataFormatada = formatar.format(data);
        this.dataCadastro = dataFormatada;
    }
    public String getDataCadastro()
    {
        return this.dataCadastro;
    }    

}
