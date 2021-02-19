package Projetos.Projeto9.ModelsPersonas;

public final class Empresa extends Juridica implements InterfacePessoa
{
    // Atributos de Classe
    public static int totalCadastrosEmpresa;
    
    // Atributos de Instância
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosEmpresa()
    {
        return Empresa.totalCadastrosEmpresa;
    }
    protected static void setTotalCadastrosEmpresa()
    {
        Empresa.totalCadastrosEmpresa += 1; 
    }
    
    // Métodos Getters de Instância
    // Métodos Setters de Instância

    // Implementações da Interface Pessoa
    
}