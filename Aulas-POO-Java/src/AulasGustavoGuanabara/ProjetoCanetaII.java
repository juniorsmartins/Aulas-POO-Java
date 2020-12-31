package AulasGustavoGuanabara;

public class ProjetoCanetaII {

    private String modelo;
    private String cor;
    private float preco;
    private boolean tampado;
    private byte carga;
    private byte rabiscar;

    public ProjetoCanetaII(String modelo, String cor, float preco) 
    {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.tampado = true;
        this.carga = 100;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getCor()
    {
        return this.cor;
    }
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    
    public float getPreco()
    {
        return this.preco;
    }
    public void setPreco(float preco)
    {
        this.preco = preco;
    }
    
    public boolean getTampado()
    {
        return this.tampado;
    }
    public void setTampado(boolean tampado)
    {
        this.tampado = tampado;
    }
    
    public byte getCarga()
    {
        return this.carga;
    }
    public void setCarga(byte carga)
    {
        this.carga = carga;
    }
    
    public byte rabiscar()
    {
        if (this.carga > 0 && this.tampado == false)
        {
            System.out.println("Rabiscando...");
            System.out.println(" ");
            this.carga -= 35;
        }
        else
        {
            System.out.println("Não pode rabiscar!");
            if (this.carga == 0)
            {
                System.out.println("Sem carga!");
            }
            if (this.tampado == true)
            {
                System.out.println("Caneta tampada!");
            }
        }
        return this.rabiscar;
    }
    
    public void status()
    {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Tampado: " + this.getTampado());
        System.out.println("Carga: " + this.getCarga() + "%.");
        System.out.println(" ");
    }
}
