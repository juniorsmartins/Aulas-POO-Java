package AulasGustavoGuanabara;

public class ProjetoCaneta 
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + (this.tampada == true ? "Sim! A caneta está tampada." : "Não! A caneta está destampada."));
    }
    
    void rabiscar()
    {
        if (this.tampada == true)
        {
            System.out.println("Não posso rabiscar com a caneta tampada!");
        } 
        else 
        {
            System.out.println("Posso rabiscar!");
        }
    }

    void tampar()
    {
        this.tampada = true;
    }

    void destampar()
    {
        this.tampada = false;
    }
}
