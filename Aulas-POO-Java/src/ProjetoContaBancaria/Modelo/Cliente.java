/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Junior Martins
 * @since 16/01/21 - 08h34
 */
public class Cliente 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int totalCliente;
    
    // Atributos de Instância
    private String dataCliente;
    private String idCliente;
    private String nomeCliente;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtor
    Cliente(String nome)
    {
        Cliente.setTotalCliente();
        this.setDataCliente();
        this.setIdCliente();
        this.nomeCliente = nome;
    }

    // Métodos Especiais de Classe
    public static int getTotalCliente()
    {
        return Cliente.totalCliente;
    }
    private static void setTotalCliente()
    {
        Cliente.totalCliente += 1;
    }

    // Métodos Especiais de Instância

    // Métodos Getters e Setters
    public String getDataCliente()
    {
        return this.dataCliente;
    }
    private void setDataCliente()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataCliente = formatar.format(data);
    }

    public String getIdCliente()
    {
        return this.idCliente;
    }
    private void setIdCliente()
    {
        this.idCliente = (this.getDataCliente() + "-" + Cliente.getTotalCliente());
    }

    public String getNomeCliente()
    {
        return this.nomeCliente;
    }
    public void setNomeCliente(String nome)
    {
        this.nomeCliente = nome;
    }
}