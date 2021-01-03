/*
 * Exercício para aprendizagem de linguagem de programação Java
 * Testar Encapsulamento, Herança e Polimorfismo
 */
package AulasOutros;

/**
 * @author Junior Martins
 */
public class ProjetoAutomovel {

    public static long totalAutomovel;
    private String origemAuto = new String();
    private String fabricaAuto = new String();
    private int anoAuto;

    
    public ProjetoAutomovel() // Método Construtor
    {
        ProjetoAutomovel.totalAutomovel += 1;
        this.origemAuto = "Made In Brazil";
        this.fabricaAuto = "Volkswagen";
        this.anoAuto = 2021;
    }

    protected void setOrigemAuto(String origem) // Métodos Setters e Getters
    {
        this.origemAuto = origem;
    }
    protected String getOrigemAuto()
    {
        return this.origemAuto;
    }

    protected void setFabricaAuto(String fabrica)
    {
        this.fabricaAuto = fabrica;
    }
    protected String getFabricaAuto()
    {
        return this.fabricaAuto;
    }
    
    protected void setAnoAuto(int ano)
    {
        this.anoAuto = ano;
    }
    protected int getAnoAuto()
    {
        return this.anoAuto;
    }
}
