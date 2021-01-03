package AulasOutros;

public class ProjetoCarro extends ProjetoAutomovel {
    
    public static long totalCarros;
    private String marcaCarro = new String();
    private int potenciaMotorCarro;
    private int portasCarro;
    private boolean ligarCarro;
    
    public ProjetoCarro(String marca, int motor, int portas) // Método Construtor
    {
        ProjetoCarro.totalCarros += 1;
        this.setMarcaCarro(marca);
        this.setPotenciaMotorCarro(motor);
        this.setPortasCarro(portas);
        this.ligarCarro = false;
        
    }

    protected void setMarcaCarro(String marca) // Métodos Setters e Getters
    {
        this.marcaCarro = marca;
    }
    protected String getMarcaCarro()
    {
        return this.marcaCarro;
    }

    protected void setPotenciaMotorCarro(int motor)
    {
        this.potenciaMotorCarro = motor;
    }
    protected int getPotenciaMotorCarro()
    {
        return this.potenciaMotorCarro;
    }

    protected void setPortasCarro(int portas)
    {
        this.portasCarro = portas;
    }
    protected int getPortasCarro()
    {
        return this.portasCarro;
    }
    
    protected void setLigarCarro()
    {
        if (this.ligarCarro == false)
        {
            this.ligarCarro = true;            
        }
        else if (this.ligarCarro == true)
        {
            this.ligarCarro = false;
        }
    }
    protected boolean getLigarCarro()
    {
        return this.ligarCarro;
    }

    
    public void ligarCarro() // Métodos Personalizados
    {
        this.setLigarCarro();
    }
    
    public void statusCarro()
    {
        System.out.println("----------------------------");
        System.out.println("Origem: " + this.getOrigemAuto());
        System.out.println("Fábrica: " + this.getFabricaAuto());
        System.out.println("Ano: " + this.getAnoAuto());
        System.out.println("Marca: " + this.getMarcaCarro());
        System.out.println("Potência: " + this.getPotenciaMotorCarro());
        System.out.println("Portas: " + this.getPortasCarro());
        System.out.println("Ligado: " + this.getLigarCarro());
    }
    
}
