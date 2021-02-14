package BootcampInterJavaDIO.AulaComparators;

public class Estudante implements Comparable<Estudante>
{
    private final String NOME;
    private final Integer IDADE;
    
    public Estudante(String nome, Integer idade)
    {
        this.NOME = nome;
        this.IDADE = idade;
    }
    
    public String getNome()
    {
        return NOME;
    }
    
    public Integer getIdade()
    {
        return IDADE;
    }
    
    @Override
    public String toString()
    {
        return NOME + " - " + IDADE;
    }
    
    @Override
    public int compareTo(Estudante o)
    {
        return this.getIdade() - o.getIdade();
    }
    
}