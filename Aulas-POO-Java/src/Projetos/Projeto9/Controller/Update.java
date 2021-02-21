package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Uteis.*;
import static Projetos.Projeto9.Controller.Main.*;
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
        //TODO
        pulaLinha(1);
        System.out.println("Editar Colaborador");
        tecleEnter();
        menuUpdate();
    }
    
    public static void editarAtleta()
    {
        //TODO
        pulaLinha(1);
        System.out.println("Editar Atleta");
        tecleEnter();
        menuUpdate();
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

    public static void buscaPorCPF(List pessoaFisica)
    {
        pulaLinha(1);
        System.out.print("Busca por CPF: ");
        String buscaCPF = scan.nextLine();

        int indiceFisica = pessoaFisica.indexOf(buscaCPF);
        if(indiceFisica < 0)
        {
            naoEncontrado();
            tecleEnter();
        }
        else
        {
            encontradoNaLista();
            pulaLinha(1);

            editarBuscado(pessoaFisica, indiceFisica);
        }
    }
    
    public static void editarBuscado(List pessoaFisica, int indiceFisica)
    {
        // parai aqui - fazer a edição....
        pessoaFisica.get(indiceFisica).toString();
    }
}