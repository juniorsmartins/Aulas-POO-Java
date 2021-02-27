package Projetos.Projeto08_Evo.Control;

import Projetos.Projeto07_PSTE.ModelsPersonas.Torcedor;
import Projetos.Projeto08_Evo.Models.Contato;
import Projetos.Projeto08_Evo.Models.Endereco;
import java.util.Scanner;

public class Main 
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // Informações para criar o torcedor
        System.out.print("\nNome: ");
        String nome = scan.nextLine();
        System.out.print("\nSobrenome: ");
        String sobre = scan.nextLine();
        System.out.print("\nDocumento: ");
        String doc = scan.nextLine();
        System.out.print("\nData de Nascimento (dd/mm/yyyy): ");
        String origem = scan.nextLine();
        System.out.print("\nSexo: ");
        String sexo = scan.nextLine();
        System.out.print("\nTime: ");
        String time = scan.nextLine();
        
        Torcedor torcedor = Torcedor(nome, sobre, doc, origem, sexo, time);

        // Informações para criar o endereço
        System.out.print("\nRua/Av: ");
        String rua = scan.nextLine();
        System.out.print("\nNúmero: ");
        int numero = Integer.parseInt(scan.nextLine());
        System.out.print("\nBairro: ");
        String bairro = scan.nextLine();
        System.out.print("\nComplemento: ");
        String complemento = scan.nextLine();
        System.out.print("\nCidade: ");
        String cidade = scan.nextLine(); 
        System.out.print("\nEstado: ");
        String estado = scan.nextLine();        
        System.out.print("\nPais: ");
        String pais = scan.nextLine();
        System.out.print("\nCep: ");
        int cep = Integer.parseInt(scan.nextLine());

        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, pais, cep);
        endereco.setComplemento(complemento);

        // Informações para criar contato
        System.out.print("\nTelefone: ");
        int fone = Integer.parseInt(scan.nextLine());
        System.out.print("\nE-mail: ");
        String mail = scan.nextLine();

        Contato contato = new Contato(fone, mail);
    }
}