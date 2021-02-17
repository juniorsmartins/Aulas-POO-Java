package Projetos.Projeto9.ModelsPersonas;

public class Torcedor extends Fisica
{
    private String time;
    
    public Torcedor(String nome, String sobrenome, String cpf, String nacionalidade, String time)
    {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setCpf(cpf);
        this.setNacionalidade(nacionalidade);
        this.setTime(time);
        
    }
    
    public String getTime()
    {
        return this.time;
    }
    
    public void setTime(String time)
    {
        this.time = time;
    }
}