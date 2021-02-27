package Projetos.Projeto08_Evo.Models;
    
public class Contato 
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    
    // Atributos de Instância
    private long idContato;
    private int telefone;
    private String email;
    
    // ***** ÁREA DE CONSTRUTORES *****
    public Contato(int fone, String mail)
    {
        this.setIdContato();
        this.setTelefone(fone);
        this.setEmail(mail);
    }
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    
    // Métodos Getters de Instância
    public long getIdContato()
    {
        return this.idContato;
    }
    public int getTelefone()
    {
        return this.telefone;
    }
    public String getEmail()
    {
        return this.email;
    }

    // Métodos Setters de Instância
    public void setIdContato()
    {
        this.idContato = Cliente.getTotalCliente();
    }
    public void setTelefone(int tel)
    {
        this.telefone = tel;
    }
    public void setEmail(String mail)
    {
        this.email = mail;
    }
}