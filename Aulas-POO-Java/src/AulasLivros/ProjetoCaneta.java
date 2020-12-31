package AulasLivros;

public class ProjetoCaneta {

    String modelo;
    float preco;
    boolean tampa;
    byte rabiscado;
    byte carga;

    void tampar()
    {
        this.tampa = true;
    }

    void destampar()
    {
        this.tampa = false;
    }
    
    void rabiscar()
    {
        if (this.carga > 0 && this.tampa == false)
        {
            --this.carga;
            System.out.println("Rabiscado!");
        }
        else
        {
            System.out.println("Não pode rabiscar!");
        }
    }

    void verificaCarga()
    {
        if (this.carga > 0)
        {
            System.out.println("Com carga de " + this.carga + "%.");
        }
        else
        {
            System.out.println("Sem carga! " + this.carga + "%.");
        }
    }
    
}
