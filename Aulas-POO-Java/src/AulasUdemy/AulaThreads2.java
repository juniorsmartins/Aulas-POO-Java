package AulasUdemy;

public class AulaThreads2 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Cliente cliente = new Cliente("Roberta Zanini");
        Conta conta1 = new Conta(100);
        
        FazDeposito acao = new FazDeposito(conta1);
        Thread th1 = new Thread(acao);
        Thread th2 = new Thread(acao);
        
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println(conta1.getSaldoConta());
    }
}