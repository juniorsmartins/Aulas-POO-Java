package Projetos.Projeto06_BancoII.Modelo;

public class Banco 
{
    private ContaCorrente[] contaCc; // Declaração de objeto contaCc
    private ContaPoupanca[] contaCP; // Declaração de objeto contaCp
    private int posicaoLivre;
    
    public Banco()
    {
        contaCc = new ContaCorrente[100]; // Instanciação de objeto contaCC
        posicaoLivre = 0;
    }
    
    public void adicionarContaCc(ContaCorrente nova)
    {
        this.contaCc[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }
}