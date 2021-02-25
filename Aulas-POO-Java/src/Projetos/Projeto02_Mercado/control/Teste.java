package Projetos.Projeto02_Mercado.control;

import static Projetos.Projeto02_Mercado.control.Utils.*;
import Projetos.Projeto02_Mercado.model.Produto;

public class Teste 
{
    public static void main(String[] args) 
    {
        Produto ps4 = new Produto("Playstation 4", 1789.44);
        Produto xbox = new Produto("Xbox 360", 1699.0);
        
        System.out.println(ps4);
        pulaLinha(1);
        System.out.println(xbox);
    }
}