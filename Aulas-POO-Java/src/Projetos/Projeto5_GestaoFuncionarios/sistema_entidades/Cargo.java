package Projetos.Projeto5_GestaoFuncionarios.sistema_entidades;

public class Cargo 
{
    private int id;
    private String nome;
    private String cargo;
 //TODO   


    public int getId()
    {
        return this.id;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getCargo()
    {
        return this.cargo;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }
}