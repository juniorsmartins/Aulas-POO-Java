package Projetos.Projeto9.ModelsPersonas;

public interface InterfacePJ 
{
    public int verId();
    public String verPaisOrigem();
    public String verDataCadastro();
    public String verNome();
    public String verSobrenome();
    public String verDocumento();
    public String verTime();
    public String toString();

    public void gerarId();
    public void editarPaisOrigem(String pais);
    public void editarNome(String nome);
    public void editarSobrenome(String sobre);
    public void editarDocumento(String doc);
    public void editarTime(String time);    
}