package AulasOutros;

import java.util.Vector;

public class FabricaCarros {

    public static void main(String[] args)
    {
        
     Vector carro = new Vector(10, 10);
     String marquinha = new String();
     int potencinha;
     int portinhas;
     int contador = 0;
     String continuar = new String();

     do 
     {         

         ProjetoCarro carro[contador] = new ProjetoCarro(marquinha, potencinha, portinhas);
         
        
     
     } while(!"S".equals(continuar));

     

        
    }
}
