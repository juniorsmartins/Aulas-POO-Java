package AulasUdemy;

import Projetos.Projeto06_BancoII.Modelo.ContaCorrente;
import Projetos.Projeto06_BancoII.Modelo.PessoaFisica;
import java.util.HashMap;
import java.util.Map;

public class AulaConjuntos2 
{
    /**
     * Conjunto Map
     * @param args
     */
    public static void main(String[] args) 
    {
        Map<String, ContaCorrente> contas = new HashMap<>();
        
        PessoaFisica cliente1 = new PessoaFisica("Maria", "95546680050", "Cuiabá");
        PessoaFisica cliente2 = new PessoaFisica("Pedro", "55444460078", "Porto Alegre");
        ContaCorrente conta1 = new ContaCorrente(cliente1, 200);
        ContaCorrente conta2 = new ContaCorrente(cliente2, 350);
        
        contas.put("Pessoa Fisica", conta1);
        contas.put("Pessoa Juridica", conta2);
        contas.put("Pessoa física", conta2); 
        
        System.out.println(contas.size());
        
    }
}
