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
    
    // Métodos de Polimorfismo
    @Override
    public String toString()
    {
        System.out.println("\n\n*****   INFORMAÇÕES PESSOAIS   *****");
        System.out.println("ID: " + this.getIdTorcedor());
        System.out.println("Data Cadastro: " + this.getDataCadastro());
        System.out.println("Nome: " + this.getNomenclatura1());
        System.out.println("Sobrenome: " + this.getNomenclatura2());
        System.out.println("CPF: " + this.getDocumento());
        System.out.println("Data de Nascimento: " + this.getDataOrigem());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Torcedor do: " + this.getTime());

        System.out.println("\n*****   INFORMAÇÕES DE ENDEREÇO   *****");
        System.out.println("ID: " + this.getEndereco().getIdEndereco());
        System.out.println("Rua: " + this.getEndereco().getRua());
        System.out.println("Número: " + this.getEndereco().getNumero());
        System.out.println("Bairro: " + this.getEndereco().getBairro());
        System.out.println("Cidade: " + this.getEndereco().getCidade());
        System.out.println("Estado: " + this.getEndereco().getEstado());
        System.out.println("Pais: " + this.getEndereco().getPais());
        System.out.println("CEP: " + this.getEndereco().getCep());

        System.out.println("\n*****   INFORMAÇÕES DE CONTATO   *****");
        System.out.println("ID: " + this.getContato().getIdContato());
        System.out.println("Telefone: " + this.getContato().getTelefone());
        System.out.println("Email: " + this.getContato().getEmail());
        return "";
    }
}