package AulasLoianeGroner;

import java.util.Scanner;

public class TesteContato 
{

    public static void main(String[] args)
    {
        ProjetoContato pessoa1 = new ProjetoContato();
        ProjetoEndereco endereco1 = new ProjetoEndereco();
        ProjetoTelefone telefone1 = new ProjetoTelefone();

        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        pessoa1.setNomeContato(nome);
        
        System.out.print("Sobrenome: ");
        String sobrenome = scan.nextLine();
        pessoa1.setSobrenomeContato(sobrenome);
        
        System.out.print("CPF: ");
        String cpf = scan.nextLine();
        pessoa1.setCpfContato(cpf);
        
        System.out.print("Data Nascimento: ");
        String data = scan.nextLine();
        pessoa1.setSobrenomeContato(data);
        
        System.out.print("Rua: ");
        String rua = scan.nextLine();
        
        
        System.out.print("Número: ");

        
        System.out.print("Bairro: ");

        
        System.out.print("Cidade: ");

        
        System.out.print("Estado: ");
        
        
        pessoa1.statusContato();
        endereco1.statusEndereco();
        telefone1.statusTelefone();
        
    }
}
