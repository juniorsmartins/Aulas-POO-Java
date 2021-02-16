package BootcampInterJavaDIO;

public class AulaParadigma_Funcional_Recursividade_TailCall 
{
    public static void main(String[] args) 
    {
        System.out.println(fatorialA(5));
    }
    
    public static double fatorialA(double valor)
    {
        return fatorialComTailCall(valor, 1);
    }
    
    public static double fatorialComTailCall(double valor, double numero)
    {
        if(valor == 0)
        {
            return numero;
        }
        return fatorialComTailCall(valor - 1, numero * valor);
    }
}