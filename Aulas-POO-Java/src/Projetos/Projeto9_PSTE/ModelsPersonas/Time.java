package Projetos.Projeto9_PSTE.ModelsPersonas;

public final class Time extends Juridica implements InterfacePJ
{
    // Atributos de Classe
    public static int totalCadastrosTime;
    
    // Atributos de Instância
    
    // Métodos Construtores
    public Time()
    {
        //TODO - sobrecarga de time
    }
    public Time(String razao, String fantasia, String cnpj, String pais, String equipe)
    {
        this.gerarId();
        this.setDataCadastro();
        this.editarNome(razao);
        this.editarSobrenome(fantasia);
        this.editarDocumento(cnpj);
        this.editarPaisOrigem(pais);
        this.editarTime(equipe);
    }
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosTime()
    {
        return Time.totalCadastrosTime;
    }
    public static void setTotalCadastrosTime()
    {
        Time.totalCadastrosTime += 1;
    }

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
        return this.getRazaoSocial();
    }
    @Override
    public String verSobrenome()
    {
        return this.getNomeFantasia();
    }
    @Override
    public String verDocumento()
    {
        return this.getCnpj();
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
        System.out.println("Razão Social: " + this.verNome());
        System.out.println("Nome Fantasia: " + this.verSobrenome());
        System.out.println("CNPJ: " + this.verDocumento());
        System.out.println("País: " + this.verPaisOrigem());
        System.out.println("Time: " + this.verTime());
        return "";
    }

    @Override
    public void gerarId()
    {
        this.setId();
        Pessoa.setTotalCadastrosPessoa();
        Juridica.setTotalCadastrosJuridica();
        Time.setTotalCadastrosTime();
    }
    @Override
    public void editarPaisOrigem(String pais)
    {
        this.setPaisOrigem(pais);
    }
    @Override
    public void editarNome(String nome)
    {
        this.setRazaoSocial(nome);
    }
    @Override
    public void editarSobrenome(String sobre)
    {
        this.setNomeFantasia(sobre);
    }
    @Override
    public void editarDocumento(String doc)
    {
        this.setCnpj(doc);
    }
    @Override
    public void editarTime(String equipe)
    {
        this.setTime(equipe);
    }
}