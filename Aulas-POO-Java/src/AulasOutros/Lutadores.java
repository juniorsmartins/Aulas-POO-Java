package AulasOutros;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Lutadores{

    /* ----- ÁREA DE ATRIBUTOS ----- */
    // Atributos de Classe
    private static double totalLutadores;
    
    // Atributos de Instância
    private String dataCadastroLutador;
    private String horaCadastroLutador;
    private double idLutador;
    private String paisOrigem;
    private String nomeLutador;
    private float alturaLutador;
    private float pesoLutador;
    private String categoriaLutador;
    private int vitoriasLutador;
    private int empatesLutador;
    private int derrotasLutador;
    
    /* ----- ÁREA DE MÉTODOS ----- */
    // Método Construtor
    public Lutadores(String pais, String nome, float altura, float peso, int vitorias, int empates, int derrotas)
    {
        Lutadores.setTotalLutadores();
        this.setDataCadastroLutador();
        this.setHoraCadastroLutador();
        this.setIdLutador();
        this.setPaisOrigem(pais);
        this.setNomeLutador(nome);
        this.setAlturaLutador(altura);
        this.setPesoLutador(peso);
        this.setVitoriasLutador(vitorias);
        this.setEmpatesLutador(empates);
        this.setDerrotasLutador(derrotas);
    }
    
    // Métodos de Classe
    private static void setTotalLutadores()
    {
        Lutadores.totalLutadores += 1;
    }
    public static double getTotalLutadores()
    {
        return Lutadores.totalLutadores;
    }

    // Métodos de Instância - Comportamentais
    public void comer(float comeu)
    {
        this.setPesoLutador(this.getPesoLutador() + comeu);
    }
    
    // Métodos de Instância - Setters e Getters
    private void setDataCadastroLutador()
    {
        Date data = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        this.dataCadastroLutador = formatarData.format(data);
    }
    public String getDataCadastroLutador()
    {
        return this.dataCadastroLutador;
    }

    private void setHoraCadastroLutador()
    {
        Date hora = new Date();
        SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");
        this.horaCadastroLutador = formatarHora.format(hora);
    }
    public String getHoraCadastroLutador()
    {
        return this.horaCadastroLutador;
    }
    
    private void setIdLutador()
    {
        this.idLutador = Lutadores.getTotalLutadores() + 1; 
    }
    public double getIdLutador()
    {
        return this.idLutador;
    }
    
    protected void setPaisOrigem(String pais)
    {
        this.paisOrigem = pais;
    }
    public String getPaisOrigem()
    {
        return this.paisOrigem;
    }
    
    protected void setNomeLutador(String nome)
    {
        this.nomeLutador = nome;
    }
    public String getNomeLutador()
    {
        return this.nomeLutador;
    }
    
    protected void setAlturaLutador(float altura)
    {
        this.alturaLutador = altura;
    }
    public float getAlturaLutador()
    {
        return this.alturaLutador;
    }
    
    protected void setPesoLutador(float peso)
    {
        this.pesoLutador = peso;
        this.setCategoriaLutador(peso);
    }
    public float getPesoLutador()
    {
        return this.pesoLutador;
    }
    
    private void setCategoriaLutador(float peso)
    {
        if (peso >= 51 && peso <= 70)
        {
            this.categoriaLutador = "Leve";
        }
        else if (peso >= 71 && peso <= 90)
        {
            this.categoriaLutador = "Médio";
        }
        else if (peso >= 91 && peso <= 110)
        {
            this.categoriaLutador = "Pesado";
        }
        else
        {
            this.categoriaLutador = "Inválida";
        }
    }
    public String getCategoriaLutador()
    {
        return this.categoriaLutador;
    }
    
    protected void setVitoriasLutador(int vitorias)
    {
        this.vitoriasLutador = vitorias;
    }
    public int getVitoriasLutador()
    {
        return this.vitoriasLutador;
    }
    
    protected void setEmpatesLutador(int empates)
    {
        this.empatesLutador = empates;
    }
    public int getEmpatesLutador()
    {
        return this.empatesLutador;
    }
    
    protected void setDerrotasLutador(int derrotas)
    {
        this.derrotasLutador = derrotas;
    }
    public int getDerrotasLutador()
    {
        return this.derrotasLutador;
    }
}
