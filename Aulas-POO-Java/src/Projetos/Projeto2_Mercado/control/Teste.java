package Projetos.Projeto2_Mercado.control;

import static Projetos.Projeto2_Mercado.control.Utils.*;
import Projetos.Projeto2_Mercado.model.Produto;

public class Teste 
{
    public static void main(String[] args) 
    {
        Produto ps4 = new Produto("Playstation 4", 1789.44);
        Produto xbox = new Produto("Xbox 360", 1699.0);
        
        System.out.println(ps4);
        pulaLinha();
        System.out.println(xbox);
    }
}