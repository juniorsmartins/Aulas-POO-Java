package AulasGustavoGuanabara;

public class ContaBancariaII 
{
    public static void main(String[] args) {
        
        String nome = "Pedro";
        int tipinho = 1;
        
        ProjetoContaBancariaII conta = new ProjetoContaBancariaII();
                
        System.out.println("Tipo: " + conta.getTipoConta());
        System.out.println("Status: " + conta.getStatusConta());
        System.out.println("Número: " + conta.getNumConta());
        System.out.println("Nome: " + conta.getDonoConta());
        System.out.println("Saldo: " + conta.getSaldoConta());
        System.out.println(" ");

        conta.abrirConta(nome, tipinho);

        System.out.println("Tipo: " + conta.getTipoConta());
        System.out.println("Status: " + conta.getStatusConta());
        System.out.println("Número: " + conta.getNumConta());
        System.out.println("Nome: " + conta.getDonoConta());
        System.out.println("Saldo: " + conta.getSaldoConta());
        System.out.println(" ");

        conta.depositarConta(25);
        conta.pagarTaxa();
        conta.sacarConta(3);

        System.out.println("Tipo: " + conta.getTipoConta());
        System.out.println("Status: " + conta.getStatusConta());
        System.out.println("Número: " + conta.getNumConta());
        System.out.println("Nome: " + conta.getDonoConta());
        System.out.println("Saldo: " + conta.getSaldoConta());
        System.out.println(" ");
    }
}
