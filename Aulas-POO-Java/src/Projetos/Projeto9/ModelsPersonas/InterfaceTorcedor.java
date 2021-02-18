package Projetos.Projeto9.ModelsPersonas;

public interface InterfaceTorcedor 
{
    public int verId();
    public String verNacionalidade();
    public String verNome();
    public String verSobrenome();
    public String verCpf();
    public String verTime();

    public void gerarId();
    public void editarNacionalidade(String nacionalidade);
    public void editarNome(String nome);
    public void editarSobrenome(String sobre);
    public void editarCpf(String cp);
    public void editarTime(String time);
}