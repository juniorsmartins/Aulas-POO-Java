package AulasGustavoGuanabara;

public class ObjetosCanetaII {

    public static void main(String[] args) 
    {

        ProjetoCanetaII canetaA = new ProjetoCanetaII("Nic", "Azul", 9.5f);        
        ProjetoCanetaII canetaB = new ProjetoCanetaII("Bic", "Preta", 8.75f);
        
        canetaA.status();

        canetaB.status();
        canetaB.setTampado(false);
        canetaB.rabiscar();
        canetaB.rabiscar();
        canetaB.rabiscar();
        
        canetaB.status();
    }



    
}
