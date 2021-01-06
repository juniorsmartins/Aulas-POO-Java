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
    public ClasseLutador
        (String nom, String nacional, int idad, float altur, float pes, int vit, int derr, int empat)
    {
        ClasseLutador.totalLutadores += 1;
        ClasseLutador.totalLutas += 1;
        this.setNomeLutador(nom);
        this.setNacionalidadeLutador(nacional);
        this.setIdadeLutador(idad);
        this.setAlturaLutador(altur);
        this.setPesoLutador(pes);
        this.setVitoriasLutador(vit);
        this.setDerrotasLutador(derr);
        this.setEmpatesLutador(empat);
    }
    
    // Métodos Personalizados
    public void apresentarLutador()
    {
        System.out.println("----------------------");
        System.out.println("---- Apresentação ----");
        System.out.println("----------------------");        
        System.out.println("nacionalidade: " + this.getNacionalidadeLutador());
        System.out.println("Nome: " + this.getNomeLutador());
        System.out.println("Idade: " + this.getIdadeLutador());
        System.out.println("Altura: " + this.getAlturaLutador());
        System.out.println("Peso: " + this.getPesoLutador());
        System.out.println("Categoria: " + this.getCategoriaLutador());
    }
    public void statusLutador()
    {
        System.out.println("------- Status -------");
        System.out.println("Vitórias: " + this.getVitoriasLutador());
        System.out.println("Derrotas: " + this.getDerrotasLutador());
        System.out.println("Empates: " + this.getEmpatesLutador());        
    }
    public void ganharLuta()
    {
        this.setVitoriasLutador(this.getVitoriasLutador() + 1);
    }
    public void perderLuta()
    {
        this.setDerrotasLutador(this.getDerrotasLutador() + 1);
    }
    public void empatarLuta()
    {
        this.setEmpatesLutador(this.getEmpatesLutador() + 1);
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
        this.setCategoriaLutador();
    }
    protected float getPesoLutador()
    {
        return this.pesoLutador;
    }
    
    protected void setCategoriaLutador()
    {
        if (this.getPesoLutador() < 52.2)
        {
            this.categoriaLutador = "Inválido!";
        }
        else if (this.getPesoLutador() <= 70.3)
        {
            this.categoriaLutador = "Leve";
        }
        else if (this.getPesoLutador() <= 83.9)
        {
            this.categoriaLutador = "Médio";
        }
        else if (this.getPesoLutador() <= 120.2)
        {
            this.categoriaLutador = "Pesado";
        }
        else
        {
            this.categoriaLutador = "Inválido!";
        }
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

