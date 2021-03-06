package Projetos.Projeto07_PSTE.Controller;

import static Projetos.Projeto07_PSTE.Controller.Main.*;
import static Projetos.Projeto07_PSTE.Controller.Uteis.*;
import Projetos.Projeto07_PSTE.ModelsPersonas.Torcedor;
import Projetos.Projeto07_PSTE.ModelsPersonas.Colaborador;
import Projetos.Projeto07_PSTE.ModelsPersonas.Atleta;
import Projetos.Projeto07_PSTE.ModelsPersonas.Time;
import Projetos.Projeto07_PSTE.ModelsPersonas.Entidade;
import Projetos.Projeto07_PSTE.ModelsPersonas.Empresa;

public class Create 
{
    public static void menuCreate()
    {
        pulaLinha(2);
        System.out.println("****************************");
        System.out.println("******  MENU CREATE  *******");
        System.out.println("****************************");
        System.out.println("*****   Torcedor - 1   *****");
        System.out.println("***** Colaborador - 2  *****");
        System.out.println("*****    Atleta - 3    *****");
        System.out.println("*****     Time - 4     *****");
        System.out.println("*****   Entidade - 5   *****");
        System.out.println("****     Empresa - 6   *****");
        System.out.println("****     Voltar - 0    *****");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoSubMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
            case 2:
            case 3:
                createFisica(opcaoSubMenu);
                break;
            case 4:
            case 5:
            case 6:
                createJuridica(opcaoSubMenu);
                break;
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
        }

        tecleEnter();
        menuCreate();
    }
    
    public static void createFisica(int opcaoSubMenu)
    {
        String nome, sobrenome, cpf, pais, time;
        
        System.out.print("\nNome: ");
        nome = scan.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.print("CPF: ");
        cpf = scan.nextLine();
        System.out.print("País de Nascimento: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        time = scan.nextLine();
        
        switch(opcaoSubMenu)
        {
            case 1:
                Torcedor torcedor = new Torcedor(nome, sobrenome, cpf, pais, time);
                listaTorcedor.add(torcedor);
                break;
            case 2:
                Colaborador colaborador = new Colaborador(nome, sobrenome, cpf, pais, time);
                listaColaborador.add(colaborador);
                break;
            case 3:
                Atleta atleta = new Atleta(nome, sobrenome, cpf, pais, time);
                listaAtleta.add(atleta);
                break;
        }
        
        createOK();
    }

    public static void createJuridica(int opcaoSubMenu)
    {
        String razaoSocial, nomeFantasia, cnpj, pais, equipe;
        
        System.out.print("\nRazão Social: ");
        razaoSocial = scan.nextLine();
        System.out.print("Nome Fantasia: ");
        nomeFantasia = scan.nextLine();
        System.out.print("CNPJ: ");
        cnpj = scan.nextLine();
        System.out.print("Pais de Fundação: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        equipe = scan.nextLine();
        
        switch(opcaoSubMenu)
        {
            case 4:
                Time time = new Time(razaoSocial, nomeFantasia, cnpj, pais, equipe);
                listaTime.add(time);
                break;
            case 5:
                Entidade entidade = new Entidade(razaoSocial, nomeFantasia, cnpj, pais, equipe);
                listaEntidade.add(entidade);
                break;
            case 6:
                Empresa empresa = new Empresa(razaoSocial, nomeFantasia, cnpj, pais, equipe);
                listaEmpresa.add(empresa);
                break;
        }
        
        createOK();
    }
}