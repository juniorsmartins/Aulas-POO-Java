/*
 * Exercício para aprendizagem de Java
 */
package Projetos.Projeto06_BancoII.Modelo;

/**
 * @author Junior Martins
 * @since 16/01/21 - 09h27
 */
public abstract class Conta 
{
    public abstract void abreConta();
    public abstract void depositarConta(double valor);
    public abstract void sacarConta(double valor);
    public abstract void fimConta();
}