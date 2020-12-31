package AulasGustavoGuanabara;

public class SaidaDeDados 
{

    public static void saida(String[] args) 
    {
        String nome = "Junior";
        float nota = (float) 8.5;

        System.out.print("Sua nota é " + nota);
        pularLinha();
        System.out.println("Sua nota é " + nota);
        System.out.printf("Sua nota é %.2f", nota);
        pularLinha();
        System.out.print("Sua nota é " + nota + "\n");
        pularLinha();
        System.out.printf("A nota de %s é %.1f", nome, nota);
        pularLinha();
        System.out.format("A nota de %s é %.3f \n", nome, nota);
        
    }
    
    public static void pularLinha()
    {
        System.out.print("\n \n");
    }
}
