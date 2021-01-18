/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

/**
 * @author Junior Martins
 * @since 16/01/21 - 09h27
 */
public abstract class Conta 
{
    public abstract void depositarConta(double valor);
    public abstract void sacarConta(double valor);
}