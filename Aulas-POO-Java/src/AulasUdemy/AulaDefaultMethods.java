/*
 * Aula sobre Default Methods (implementada a partir da versão 8 do Java)
 */
package AulasUdemy;

public class AulaDefaultMethods implements InterfaceDefaultMethods 
{
    @Override
    public String mensagem() 
    {
        System.out.println("\n");
        return "Ola, Mundo!";
    }
}