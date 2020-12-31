package AulasGustavoGuanabara;

public class ObjetosCaneta 
{
    
    public static void main(String[] args) 
    {
        ProjetoCaneta caneta = new ProjetoCaneta();
        caneta.modelo = "Bic";
        caneta.cor = "Azul";
        caneta.ponta = (float) 0.5;
        caneta.tampada = false;
         
        caneta.destampar();
        caneta.status();
        caneta.rabiscar();
        
    }
}
