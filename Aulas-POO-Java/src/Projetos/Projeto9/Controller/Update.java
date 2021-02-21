package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Uteis.*;
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
                editarTorcedor();
            case 2:
                editarColaborador();
            case 3:
                editarAtleta();
            case 4:
                editarTime();
            case 5:
                editarEntidade();
            case 6:
                editarEmpresa();
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuUpdate();
        }
    }
    
    public static void editarTorcedor()
    {
        boolean checarLista = listaTorcedor.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            buscaPorCPF(listaTorcedor);
        }
    }
    
    public static void editarColaborador()
    {
        boolean checarLista = listaColaborador.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            buscaPorCPF(listaColaborador);
        }
    }
    
    public static void editarAtleta()
    {
        boolean checarLista = listaAtleta.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            buscaPorCPF(listaAtleta);
        }
    }
    
    public static void editarTime()
    {
        //TODO
        pulaLinha(1);
        System.out.println("Editar Time");
        tecleEnter();
        menuUpdate();
    }
    
    public static void editarEntidade()
    {
        //TODO
        pulaLinha(1);
        System.out.println("Editar Entidade");
        tecleEnter();
        menuUpdate();
    }
    
    public static void editarEmpresa()
    {
        //TODO
        pulaLinha(1);
        System.out.println("Editar Empresa");
        tecleEnter();
        menuUpdate();
    }

    public static void buscaPorCPF(List listaFisica)
    {
        pulaLinha(1);
        System.out.print("Busca por CPF: ");
        String buscaCPF = scan.nextLine();

        int indiceFisica = listaFisica.indexOf(buscaCPF);
        if(indiceFisica < 0)
        {
            naoEncontrado();
            tecleEnter();
            menuUpdate();
        }
        else
        {
            encontradoNaLista();
            editarBuscado(listaFisica, indiceFisica);
        }
    }
    
    public static void editarBuscado(List listaFisica, int indiceFisica)
    {
        pulaLinha(1);
        listaFisica.get(indiceFisica).toString();

        String nome, sobrenome, cpf, pais, time;
        
        System.out.print("\nNome: ");
        nome = scan.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.print("CPF: ");
        cpf = scan.nextLine();
        System.out.print("País de Origem: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        time = scan.nextLine();
        
        if(listaFisica.get(indiceFisica) instanceof Torcedor)
        {
            Torcedor pessoa = (Torcedor)listaFisica.get(indiceFisica);
            int copiaID = pessoa.verId();
            Torcedor torcedor = new Torcedor();
            torcedor.updateId(copiaID);
            torcedor.editarNome(nome);
            torcedor.editarSobrenome(sobrenome);
            torcedor.editarDocumento(cpf);
            torcedor.editarPaisOrigem(pais);
            torcedor.editarTime(time);
            
            listaTorcedor.add(indiceFisica, torcedor);
            System.out.println("*****  Update realizado com sucesso!  *****");
            listaTorcedor.get(indiceFisica).toString();
        }
        else if(listaFisica.get(indiceFisica) instanceof Colaborador)
        {
            Colaborador colaborador = new Colaborador(nome, sobrenome, cpf, pais, time);
            listaColaborador.add(indiceFisica, colaborador);
            System.out.println("*****  Update realizado com sucesso!  *****");
            listaColaborador.get(indiceFisica).toString();
        }
        else if(listaFisica.get(indiceFisica) instanceof Atleta)
        {
            Atleta atleta = new Atleta(nome, sobrenome, cpf, pais, time);
            listaAtleta.add(indiceFisica, atleta);
            System.out.println("*****  Update realizado com sucesso!  *****");
            listaAtleta.get(indiceFisica).toString();
        }
        
        tecleEnter();
        menuUpdate();
    }
}