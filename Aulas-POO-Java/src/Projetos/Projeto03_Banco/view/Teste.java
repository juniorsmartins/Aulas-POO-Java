package Projetos.Projeto03_Banco.view;

public class Teste 
{
    public static void main(String[] args) 
    {
        Cliente felicity = new Cliente("Felicity Jones", "felicity@gmail.com", "123.456.789.01", Utils.stringParaData("17/05/1981"));
        
        Cliente angelina = new Cliente("Angelina Jolie", "angelina@gmail.com", "133.656.777.61", Utils.stringParaData("23/02/1978"));
        
//        System.out.println(felicity);
//        System.out.println("");
//        System.out.println(angelina);
        
        Conta c101 = new Conta(felicity);
        Conta c102 = new Conta(angelina);
        
        // Teste de depósito
        c101.depositar(501.00);
        c102.depositar(502.00);
        
        // Teste de depósitos zerado e negativo
        c101.depositar(00.00);
        c102.depositar(-100.00);
        
        // Teste de saque no saldo suficiente
        c101.sacar(300.00);
        c102.sacar(100.00);
        
        // Teste de saque superior ao saldo e zerado
        c101.sacar(600.00);
        c102.sacar(00.00);
        
        // Acrescentando limite nas contas
        c101.setLimite(200.00); 
        c102.setLimite(300.00); 
        
        // Saque com uso do limite e sem uso do limite
        c101.sacar(350.00);
        c102.sacar(50.00);
        
        // Teste de transferência
        c102.transferir(c101, 300.00);
        
        System.out.println(c101);
        System.out.println("");
        System.out.println(c102);
    }
}