package Projetos.Projeto08_Evo.Control;

import Projetos.Projeto08_Evo.Models.Servico;

public class Main 
{
    public static void main(String[] args) 
    {
        Servico servico = new Servico(1, "Barba", 30.0f);
        System.out.println(servico.getDescricao());
    }
}