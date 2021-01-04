package AulasGustavoGuanabara;


public class ClasseLutador {

    // Atributos de Classe
    public static int totalLutadores;
    public static int totalLutas;
    // Atributos de Instância
    private String nomeLutador;
    private String nacionalidadeLutador;
    private int idadeLutador;
    private float alturaLutador;
    private float pesoLutador;
    private String categoriaLutador;
    private int vitoriasLutador;
    private int derrotasLutador;
    private int empatesLutador;
    
    // Método Construtor
    public ClasseLutador(String nom, String nacional, int idad, int altur, int pes, String categor)
    {
        ClasseLutador.totalLutadores += 1;
        ClasseLutador.totalLutas += 1;
        this.setNomeLutador(nom);
        this.setNacionalidadeLutador(nacional);
        this.setIdadeLutador(idad);
        this.setAlturaLutador(altur);
        this.setPesoLutador(pes);
        this.setCategoriaLutador(categor);
        this.setVitoriasLutador(0);
        this.setDerrotasLutador(0);
        this.setEmpatesLutador(0);
    }
    
    // Métodos Setters e Getters dos Atributos de Classe
    protected void setTotalLutadores(int lutadores)
    {
        ClasseLutador.totalLutadores = lutadores;
    }
    protected int getTotalLutadores()
    {
        return ClasseLutador.totalLutadores;
    }
    protected void setTotalLutas(int lutas)
    {
        ClasseLutador.totalLutas = lutas;
    }
    protected int getTotalLutas()
    {
        return ClasseLutador.totalLutas;
    }
    
    // Médotos Setters e Getters dos Atributos de Instância
    protected void setNomeLutador(String nome)
    {
        this.nomeLutador = nome;
    }
    protected String getNomeLutador()
    {
        return this.nomeLutador;
    }
    protected void setNacionalidadeLutador(String nacionalidade)
    {
        this.nacionalidadeLutador = nacionalidade;
    }
    protected String getNacionalidadeLutador()
    {
        return this.nacionalidadeLutador;
    }
    protected void setIdadeLutador(int idade)
    {
        this.idadeLutador = idade;
    }
    protected int getIdadeLutador()
    {
        return this.idadeLutador;
    }
    protected void setAlturaLutador(float altura)
    {
        this.alturaLutador = altura;
    }
    protected float getAlturaLutador()
    {
        return this.alturaLutador;        
    }
    protected void setPesoLutador(float peso)
    {
        this.pesoLutador = peso;
    }
    protected float getPesoLutador()
    {
        return this.pesoLutador;
    }
    protected void setCategoriaLutador(String categoria)
    {
        this.categoriaLutador = categoria;
    }
    protected String getCategoriaLutador()
    {
        return this.categoriaLutador;
    }
    protected void setVitoriasLutador(int vitorias)
    {
        this.vitoriasLutador = vitorias;
    }
    protected int getVitoriasLutador()
    {
        return this.vitoriasLutador;
    }
    protected void setDerrotasLutador(int derrotas)
    {
        this.derrotasLutador = derrotas;
    }
    protected int getDerrotasLutador()
    {
        return this.derrotasLutador;
    }
    protected void setEmpatesLutador(int empates)
    {
        this.empatesLutador = empates;
    }
    protected int getEmpatesLutador()
    {
        return this.empatesLutador;
    }
    
}

