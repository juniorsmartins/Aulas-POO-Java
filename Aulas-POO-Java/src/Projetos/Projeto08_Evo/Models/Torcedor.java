package Projetos.Projeto08_Evo.Models;

public class Torcedor extends PessoaFisica
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static long totalTorcedor;
    
    // Atributos de Instância
    private long idTorcedor;
    private String time;
    
    // ***** ÁREA DE CONSTRUTORES *****
    public Torcedor()
    {
        Cliente.setTotalCliente();
        PessoaFisica.setTotalPessoaFisica();
        Torcedor.setTotalTorcedor();
        this.setIdTorcedor();

//    private String dataCadastro;
//    private String nomenclatura1;
//    private String nomenclatura2;
//    private String documento;
//    private String dataOrigem;
//    private Endereco endereco;
//    private Contato contato;
    }
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static long getTotalTorcedor()
    {
        return Torcedor.totalTorcedor;
    }
    public static void setTotalTorcedor()
    {
        Torcedor.totalTorcedor += 1;
    }

    // Métodos Getters de Instância
    public long getIdTorcedor()
    {
        return this.idTorcedor;
    }
    public String getTime()
    {
        return this.time;
    }

    // Métodos Setters de Instância
    public void setIdTorcedor()
    {
        this.idTorcedor = Torcedor.getTotalTorcedor();
    }
    public void setTime(String time)
    {
        this.time = time;
    }
}