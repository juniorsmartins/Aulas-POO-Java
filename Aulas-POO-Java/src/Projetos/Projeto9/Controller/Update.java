package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Uteis.*;
import static Projetos.Projeto9.Controller.Main.listaTorcedor;
import static Projetos.Projeto9.Controller.Main.listaColaborador;
import static Projetos.Projeto9.Controller.Main.listaAtleta;
import static Projetos.Projeto9.Controller.Main.listaTime;
import static Projetos.Projeto9.Controller.Main.listaEntidade;
import static Projetos.Projeto9.Controller.Main.listaEmpresa;
import static Projetos.Projeto9.Controller.Main.*;
import Projetos.Projeto9.ModelsPersonas.*;

import java.util.List;

public class Update 
{
    public static void menuUpdate()
    {
        pulaLinha(2);
        System.out.println("****************************");
        System.out.println("******   MENU UPDATE   *****");
        System.out.println("****************************");
        System.out.println("***  Editar Torcedor - 1  **");
        System.out.println("** Editar Colaborador - 2 **");
        System.out.println("***   Editar Atleta - 3   **");
        System.out.println("****   Editar Time - 4   ***");
        System.out.println("**** Editar Entidade - 5 ***");
        System.out.println("***  Editar Empresa - 6  ***");
        System.out.println("****     Voltar - 0     ****");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoSubMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
                editarPF(listaTorcedor);
                break;
            case 2:
                editarPF(listaColaborador);
                break;
            case 3:
                editarPF(listaAtleta);
                break;
            case 4:
                editarPJ(listaTime);
                break;
            case 5:
                editarPJ(listaEntidade);
                break;
            case 6:
                editarPJ(listaEmpresa);
                break;
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuUpdate();
        }
    }
    
    public static void editarPF(List listaPF)
    {
        buscarPorCPF(listaPF);
    }
    
    public static void editarPJ(List listaPJ)
    {
        buscarPorCNPJ(listaPJ);
    }
    
    public static void buscarPorCPF(List lista)
    {
        boolean vaziaOuNao = lista.isEmpty();
        if(vaziaOuNao == true)
        {
            listaVazia();
            tecleEnter();
            menuUpdate();
        }
        else
        {
            System.out.print("\nBusca por CPF: ");
            String buscaCPF = scan.nextLine();
            for(int i = 0; i < lista.size(); i++)
            {

            }

            int posicaoBuscada = lista.indexOf(buscaCPF);
            if(posicaoBuscada < 0)
            {
                naoEncontrado();
                tecleEnter();
                menuUpdate();
            }
            else
            {
                
            }
            
        }
    }
    
    public static void buscarPorCNPJ(List lista)
    {
        
    }
    
    
    
//    
//    public static void editarTorcedor()
//    {
//        boolean checarLista = listaTorcedor.isEmpty();
//        if(checarLista == true)
//        {
//            listaVazia();
//        }
//        else
//        {
//            int tipo = 1;
//            buscaPorCPF(tipo);
//        }
//    }
//    
//    public static void editarColaborador()
//    {
//        boolean checarLista = listaColaborador.isEmpty();
//        if(checarLista == true)
//        {
//            listaVazia();
//        }
//        else
//        {
//            int tipo = 2;
//            buscaPorCPF(tipo);
//        }
//    }
//    
//    public static void editarAtleta()
//    {
//        boolean checarLista = listaAtleta.isEmpty();
//        if(checarLista == true)
//        {
//            listaVazia();
//        }
//        else
//        {
//            int tipo = 3;
//            buscaPorCPF(tipo);
//        }
//    }
//    
//    public static void editarTime()
//    {
//        //TODO
//        pulaLinha(1);
//        System.out.println("Editar Time");
//        tecleEnter();
//        menuUpdate();
//    }
//    
//    public static void editarEntidade()
//    {
//        //TODO
//        pulaLinha(1);
//        System.out.println("Editar Entidade");
//        tecleEnter();
//        menuUpdate();
//    }
//    
//    public static void editarEmpresa()
//    {
//        //TODO
//        pulaLinha(1);
//        System.out.println("Editar Empresa");
//        tecleEnter();
//        menuUpdate();
//    }
//
//    public static void buscaPorCPF(int tipo)
//    {
//        pulaLinha(1);
//        System.out.print("Busca por CPF: ");
//        String buscaCPF = scan.nextLine();
//
//        switch(tipo)
//        {
//            case 1:
//            case 2:
//            case 3:
//        }
//        if(tipo == 1)
//        {
//            //TORCEDOR
//        }
//        else if(tipo == 2)
//        {
//            //COLABORADOR
//        }
//        else if(tipo == 3)
//        {
//            //ATLETA
//        }
//
//        int indiceFisica = listaFisica.indexOf(buscaCPF);
//        if(indiceFisica < 0)
//        {
//            naoEncontrado();
//            tecleEnter();
//            menuUpdate();
//        }
//        else
//        {
//            encontradoNaLista();
//            editarBuscado(tipo, indiceFisica);
//        }
//    }
//    
//    public static void editarBuscado(List listaFisica, int indiceFisica)
//    {
//        pulaLinha(1);
//        listaFisica.get(indiceFisica).toString();
//
//        String nome, sobrenome, cpf, pais, time;
//        
//        System.out.print("\nNome: ");
//        nome = scan.nextLine();
//        System.out.print("Sobrenome: ");
//        sobrenome = scan.nextLine();
//        System.out.print("CPF: ");
//        cpf = scan.nextLine();
//        System.out.print("País de Origem: ");
//        pais = scan.nextLine();
//        System.out.print("Time de FA: ");
//        time = scan.nextLine();
//        
//        if(listaFisica.get(indiceFisica) instanceof Torcedor)
//        {
//            Torcedor pessoa = (Torcedor)listaFisica.get(indiceFisica);
//            int copiaID = pessoa.verId();
//            Torcedor torcedor = new Torcedor();
//            torcedor.updateId(copiaID);
//            torcedor.editarNome(nome);
//            torcedor.editarSobrenome(sobrenome);
//            torcedor.editarDocumento(cpf);
//            torcedor.editarPaisOrigem(pais);
//            torcedor.editarTime(time);
//            
//            listaTorcedor.add(indiceFisica, torcedor);
//            System.out.println("*****  Update realizado com sucesso!  *****");
//            listaTorcedor.get(indiceFisica).toString();
//        }
//        else if(listaFisica.get(indiceFisica) instanceof Colaborador)
//        {
//            Colaborador pessoa = (Colaborador)listaFisica.get(indiceFisica);
//            int copiaID = pessoa.verId();
//            Colaborador colaborador = new Colaborador();
//            colaborador.updateId(copiaID);
//            colaborador.editarNome(nome);
//            colaborador.editarSobrenome(sobrenome);
//            colaborador.editarDocumento(cpf);
//            colaborador.editarPaisOrigem(pais);
//            colaborador.editarTime(time);
//            
//            listaColaborador.add(indiceFisica, colaborador);
//            System.out.println("*****  Update realizado com sucesso!  *****");
//            listaColaborador.get(indiceFisica).toString();
//        }
//        else if(listaFisica.get(indiceFisica) instanceof Atleta)
//        {
//            Atleta pessoa = (Atleta)listaFisica.get(indiceFisica);
//            int copiaID = pessoa.verId();
//            Atleta atleta = new Atleta();
//            atleta.updateId(copiaID);
//            atleta.editarNome(nome);
//            atleta.editarSobrenome(sobrenome);
//            atleta.editarDocumento(cpf);
//            atleta.editarPaisOrigem(pais);
//            atleta.editarTime(time);
//            
//            listaAtleta.add(indiceFisica, atleta);
//            System.out.println("*****  Update realizado com sucesso!  *****");
//            listaAtleta.get(indiceFisica).toString();
//        }
//        
//        tecleEnter();
//        menuUpdate();
//    }
}