package AulasOutros;

public class ProjetoControleRemoto implements InterfaceControleRemoto
{

    // Atributo de Classe
    public static String marcaCR = new String();
    // Atributos de Instância
    private int volumeCR;
    private boolean ligadoCR;
    private boolean tocandoCR;
    
    // Método Construtor
    public ProjetoControleRemoto()
    {
        ProjetoControleRemoto.marcaCR = "Panasonic";
        this.volumeCR = 50;
        this.ligadoCR = false;
        this.tocandoCR = false;
    }
    
    // Métodos Abstratos
    @Override
    public void ligar()
    {
        this.setLigadoCR(true);
    }
    @Override
    public void desligar()
    {
        this.setLigadoCR(false);
    }
    
    @Override
    public void maisVolume()
    {
        if (this.getLigadoCR() == true)
        {
            if (this.getVolumeCR() < 100)
            {
                this.setVolumeCR(this.getVolumeCR() + 1);
            }
        }
    }
    @Override
    public void menosVolume()
    {
        if (this.getLigadoCR() == true)
        {
            if (this.getVolumeCR() > 0)
            {
                this.setVolumeCR(this.getVolumeCR() - 1);
            }
        }
    }

    @Override
    public void play()
    {
        if (this.getLigadoCR() == true)
        {
            this.setTocandoCR(true);
        }
    }
    @Override
    public void pause()
    {
        if (this.getLigadoCR() == true)
        {
            this.setTocandoCR(false);
        }
    }
    
    // Método Personalizado
    public void statusCR()
    {
        System.out.println("----------------------");
        System.out.println("Marca: " + getMarcaCR());
        System.out.println("Ligado: " + this.getLigadoCR());
        System.out.print("Volume: " + this.getVolumeCR() + " ");
        for (byte contador = 0; contador <= this.getVolumeCR(); contador++)
        {
            System.out.print("|");
        }
        System.out.println("\nTocando: " + this.getTocandoCR());
    }

    // Métodos Setters e Getters
    protected void setVolumeCR(int volume)
    {
        this.volumeCR = volume;
    }
    protected int getVolumeCR()
    {
        return this.volumeCR;
    }
    
    protected void setLigadoCR(boolean ligado)
    {
        this.ligadoCR = ligado;
    }
    protected boolean getLigadoCR()
    {
        return this.ligadoCR;
    }
    
    protected void setTocandoCR(boolean tocando)
    {
        this.tocandoCR = tocando;
    }
    protected boolean getTocandoCR()
    {
        return this.tocandoCR;
    }
    
    protected String getMarcaCR()
    {
        return ProjetoControleRemoto.marcaCR;
    }
}
