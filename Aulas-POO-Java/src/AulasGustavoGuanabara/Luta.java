package AulasGustavoGuanabara;

import java.util.Random;

public class Luta {
    
    // Atributos de Instância
    private ClasseLutador desafiado;
    private ClasseLutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Método Construtor
    public Luta()
    {
        
    }
    
    // Métodos Personalizados
    public void marcarLuta(ClasseLutador lutador1, ClasseLutador lutador2)
    {
        if (lutador1.getCategoriaLutador().equals(lutador2.getCategoriaLutador()) && lutador1 != lutador2)
        {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }
        else
        {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar()
    {
     if (this.aprovada)
     {
         System.out.println("----------------------");
         System.out.println("Desafiado");
         desafiado.apresentarLutador();
         desafiado.statusLutador();
         System.out.println("----------------------");         
         System.out.println("Desafiante");
         desafiante.apresentarLutador();
         desafiante.statusLutador();
         Random aleatorio = new Random();
         int vencedor = aleatorio.nextInt(3);
         switch(vencedor)
         {
             case 0:
                 System.out.println("\n\nEmpate!");
                 this.desafiado.empatarLuta();
                 this.desafiante.empatarLuta();
                 break;
             case 1:
                 System.out.println("\n\nO desafiado: " + this.desafiado.getNomeLutador() + " venceu!");
                 this.desafiado.ganharLuta();
                 this.desafiante.perderLuta();
                 break;
             case 2:
                 System.out.println("\n\nO desafiante: " + this.desafiante.getNomeLutador() + " venceu!");
                 this.desafiante.ganharLuta();
                 this.desafiado.perderLuta();
                 break;
         }
     }
     else
     {
         System.out.println("Luta desaprovada!");
     }
    }
    
    // Métodos Setters e Getters
    protected void setDesafiado(ClasseLutador fiado)
    {
        this.desafiado = fiado;
    }
    protected ClasseLutador getDesafiado()
    {
        return this.desafiado;
    }
    
    protected void setDesafiante(ClasseLutador fiante)
    {
        this.desafiante = fiante;
    }
    protected ClasseLutador getDesafiante()
    {
        return this.desafiante;
    }
    
    protected void setRounds(int roun)
    {
        this.rounds = roun;
    }
    protected int getRounds()
    {
        return this.rounds;
    }
    
    protected void setAprovada(boolean aprov)
    {
        this.aprovada = aprov;
    }
    protected boolean getAprovada()
    {
        return this.aprovada;
    }
}
