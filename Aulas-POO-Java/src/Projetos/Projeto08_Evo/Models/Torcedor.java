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
    public Torcedor(String nome, String sobre, String doc, String origem, String sexo, String time)
    {
        Cliente.setTotalCliente();
        PessoaFisica.setTotalPessoaFisica();
        Torcedor.setTotalTorcedor();
        this.setIdTorcedor(); // Fundamentado no total de clientes
        this.setDataCadastro();
        this.setNomenclatura1(nome);
        this.setNomenclatura2(sobre);
        this.setDocumento(doc);
        this.setDataOrigem(origem);
        this.setSexo(sexo);
        this.setTime(time);
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
        this.idTorcedor = Cliente.getTotalCliente();
    }
    public void setTime(String time)
    {
        this.time = time;
    }
}