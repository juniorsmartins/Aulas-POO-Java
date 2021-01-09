package AulasLoianeGroner;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteContato 
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();        
 
        System.out.print("Sobrenome: ");
        String sobrenome = scan.nextLine();        
        
        System.out.print("CPF: ");
        String cpf = scan.nextLine();

        System.out.print("Data Nascimento: ");
        String data = scan.nextLine();

        System.out.print("Rua: ");
        String rua = scan.nextLine();

        System.out.print("Número: ");
        int numero = scan.nextInt();
        
        System.out.print("Bairro: ");
        String bairro = scan.nextLine();
        
        System.out.print("Cidade: ");
        String cidade = scan.nextLine();
        
        System.out.print("Estado: ");
        String estado = scan.nextLine();

        
        ProjetoContato pessoa1 = new ProjetoContato();
        pessoa1.setNomeContato(nome);  
        pessoa1.setSobrenomeContato(sobrenome);        
        pessoa1.setCpfContato(cpf);
        pessoa1.setSobrenomeContato(data);

        ProjetoEndereco endereco1 = new ProjetoEndereco();
        endereco1.setRuaEndereco(rua);
        endereco1.setNumeroEndereco(numero);
        endereco1.setBairroEndereco(bairro);
        endereco1.setCidadeEndereco(cidade);
        endereco1.setEstadoEndereco(estado);
        
        ProjetoTelefone telefone1 = new ProjetoTelefone();   


       

        
        
        pessoa1.statusContato();
        endereco1.statusEndereco();
        telefone1.statusTelefone();
    }
}
