package AulasOutros;

public class ProjetoControleRemoto 
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
    
    // Métodos Personalizados
    public void ligar()
    {
        this.setLigadoCR(true);
    }
    public void desligar()
    {
        this.setLigadoCR(false);
    }
    
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

    public void play()
    {
        
    }
    public void pause()
    {
        
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
}
