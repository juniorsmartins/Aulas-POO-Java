package Projetos.Projeto08_Evo.Models;
    
public class Contato 
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static long totalContato;
    
    // Atributos de Instância
    private long idContato;
    private int telefone;
    private String email;
    
    // ***** ÁREA DE CONSTRUTORES *****
    public Contato(int fone, String mail)
    {
        Contato.setTotalContato();
        this.setIdContato();
        this.setTelefone(fone);
        this.setEmail(mail);
    }
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static long getTotalContato()
    {
        return Contato.totalContato;
    }
    public static void setTotalContato()
    {
        Contato.totalContato += 1;
    }
    
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
        this.idContato = Contato.getTotalContato();
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