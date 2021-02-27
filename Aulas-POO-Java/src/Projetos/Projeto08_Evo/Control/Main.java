package Projetos.Projeto08_Evo.Control;

import Projetos.Projeto08_Evo.Models.Contato;
import Projetos.Projeto08_Evo.Models.Endereco;
import Projetos.Projeto08_Evo.Models.Torcedor;
import java.util.Scanner;

public class Main 
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // Informações para criar o torcedor
        System.out.print("\nNome: ");
        String nome = scan.nextLine();
        System.out.print("Sobrenome: ");
        String sobre = scan.nextLine();
        System.out.print("Documento: ");
        String doc = scan.nextLine();
        System.out.print("Data de Nascimento (dd/mm/yyyy): ");
        String origem = scan.nextLine();
        System.out.print("Sexo: ");
        String sexo = scan.nextLine();
        System.out.print("Time: ");
        String time = scan.nextLine();
        
        Torcedor torcedor = new Torcedor(nome, sobre, doc, origem, sexo, time);

        // Informações para criar o endereço
        System.out.print("\nRua/Av: ");
        String rua = scan.nextLine();
        System.out.print("Número: ");
        int numero = Integer.parseInt(scan.nextLine());
        System.out.print("Bairro: ");
        String bairro = scan.nextLine();
        System.out.print("Complemento: ");
        String complemento = scan.nextLine();
        System.out.print("Cidade: ");
        String cidade = scan.nextLine(); 
        System.out.print("Estado: ");
        String estado = scan.nextLine();        
        System.out.print("Pais: ");
        String pais = scan.nextLine();
        System.out.print("Cep: ");
        long cep = Long.parseLong(scan.nextLine());

        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, pais, cep);
        endereco.setComplemento(complemento);
        torcedor.setEndereco(endereco);

        // Informações para criar contato
        System.out.print("\nTelefone: ");
        long fone = Long.parseLong(scan.nextLine());
        System.out.print("E-mail: ");
        String mail = scan.nextLine();

        Contato contato = new Contato(fone, mail);
        torcedor.setContato(contato);
        
        System.out.println(torcedor);
    }
}