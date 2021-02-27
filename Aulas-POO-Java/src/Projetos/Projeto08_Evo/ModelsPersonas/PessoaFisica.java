package Projetos.Projeto08_Evo.ModelsPersonas;

public class PessoaFisica extends Cliente
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    
    // Atributos de Instância
    private String sexo;
    
    // ***** ÁREA DE CONSTRUTORES *****

    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe

    // Métodos Getters de Instância
    public String getSexo()
    {
        return this.sexo;
    }
    
    // Métodos Setters de Instância
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
}