package Projetos.Projeto9_PSTE.ModelsPersonas;

public final class Torcedor extends Fisica implements InterfacePF, Comparable<Torcedor>
{
    // Atributos de Classe
    public static int totalCadastrosTorcedor;
    
    // Atributos de Instância
    
    // Métodos Construtores
    public Torcedor()
    {
        //TODO - sobrecarga de construtor
    }
    public Torcedor(String nome, String sobrenome, String cpf, String pais, String time)
    {
        this.gerarId();
        this.setDataCadastro();
        this.editarNome(nome);
        this.editarSobrenome(sobrenome);
        this.editarDocumento(cpf);
        this.editarPaisOrigem(pais);
        this.editarTime(time);
    }
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosTorcedor()
    {
        return Torcedor.totalCadastrosTorcedor;
    }
    protected static void setTotalCadastrosTorcedor()
    {
        Torcedor.totalCadastrosTorcedor += 1;
    }
    
    // Métodos Getters de Instância
        
    // Métodos Setters de Instância

    // Implementações da Interface Pessoa
    @Override
    public int verId()
    {
        return this.getId();
    }
    @Override
    public String verPaisOrigem()
    {
        return this.getPaisOrigem();
    }
    @Override
    public String verDataCadastro()
    {
        return this.getDataCadastro();
    }
    @Override
    public String verNome()
    {
        return this.getNome();
    }
    @Override
    public String verSobrenome()
    {
        return this.getSobrenome();
    }
    @Override
    public String verDocumento()
    {
        return this.getCpf();
    }
    @Override
    public String verTime()
    {
        return this.getTime();
    }
    @Override
    public String toString()
    {
        System.out.println("\nID: " + this.verId());
        System.out.println("Nome: " + this.verNome());
        System.out.println("Sobrenome: " + this.verSobrenome());
        System.out.println("CPF: " + this.verDocumento());
        System.out.println("País: " + this.verPaisOrigem());
        System.out.println("Time: " + this.verTime());
        return "";
    }
    
    @Override
    public void gerarId()
    {
        this.setId();
        Pessoa.setTotalCadastrosPessoa();
        Fisica.setTotalCadastrosFisica();
        Torcedor.setTotalCadastrosTorcedor();
    }
    @Override
    public void editarPaisOrigem(String pais)
    {
        this.setPaisOrigem(pais);
    }
    @Override
    public void editarNome(String nome)
    {
        this.setNome(nome);
    }
    @Override
    public void editarSobrenome(String sobre)
    {
        this.setSobrenome(sobre);
    }
    @Override
    public void editarDocumento(String cp)
    {
        this.setCpf(cp);
    }
    @Override
    public void editarTime(String time)
    {
        this.setTime(time);
    }
    
    // Implementações da classe Comparable
    @Override
    public int compareTo(Torcedor outroObjeto) 
    {
        if(this.getId() == outroObjeto.getId())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}