package Projetos.Projeto3_Banco.view;

import Projetos.Projeto5.Modelo.Cliente;

public class Conta 
{
    private static int codigo = 1001;
    
    private int numero;
    private Cliente cliente;
    private Double saldo = 0.0;
    private Double limite = 0.0;
    
    
    // Métodos Getters
    public Cliente getCliente()
    {
        return this.cliente;
    }
    
    // Métodos Setters
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
}