package AulasUdemy;

public class AulaArmazenamentoSequencial_Aluno 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    private String nome;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public AulaArmazenamentoSequencial_Aluno(String nome)
    {
        this.setNome(nome);
    }
    // Métodos Abstratos
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância

    // Métodos de Polimorfismo
    @Override
    public boolean equals(Object obj)
    {
        AulaArmazenamentoSequencial_Aluno outro = (AulaArmazenamentoSequencial_Aluno) obj;
        return outro.getNome().equals(this.nome);
    }
//    @Override 
//    public String toString()
//    {
//        return this.nome;
//    }

    // Métodos Getters e Setters
    public String getNome()
    {
        return this.nome;
    }
    private void setNome(String nome)
    {
        this.nome = nome;
    }
}