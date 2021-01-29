package AulasUdemy;


/*
 * Aula sobre Default Methods
 * A partir do Java 8, Interfaces podem contar, além de constantes e métodos abstratos, também com default methods
*/
public interface InterfaceDefaultMethods 
{
    int VALOR = 9;
    
    public String mensagem();
    
    default void meu_metodo()
    {
        System.out.println("Default Methods!");
    }
    /*
     * Interfaces podem ter constantes, métodos abstratos e default methods
    */
}