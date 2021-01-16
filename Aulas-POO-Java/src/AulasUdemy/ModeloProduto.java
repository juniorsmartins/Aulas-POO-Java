package AulasUdemy;

public class ModeloProduto 
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // Atributos de Classe
    // Atributos de Instância
    String nome;
    float preco;
    float desconto;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    ModeloProduto()
    {
        this.nome = " ";
        this.preco = 0;
        this.desconto = 3;
    }
    ModeloProduto(String nome, float preco, float desconto)
    {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public float getDesconto() {
        return desconto;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}