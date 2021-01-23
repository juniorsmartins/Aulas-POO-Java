package AulasUdemy;

public class AulaArmazenamentoSequencial_Main 
{
    public static void main(String[] args) 
    {
        AulaArmazenamentoSequencial_Aluno aluno1 = new AulaArmazenamentoSequencial_Aluno("Angelina");
        AulaArmazenamentoSequencial_Aluno aluno2 = new AulaArmazenamentoSequencial_Aluno("Felicity");
        AulaArmazenamentoSequencial_Aluno aluno3 = new AulaArmazenamentoSequencial_Aluno("Marcelo");
        AulaArmazenamentoSequencial_Aluno aluno4 = new AulaArmazenamentoSequencial_Aluno("Isabele");

        AulaArmazenamentoSequencial_Vetor lista = new AulaArmazenamentoSequencial_Vetor();
        
        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        lista.adiciona(aluno3);
        lista.adiciona(aluno4);
        
        System.out.println(lista);
        System.out.println(lista.pegaPosicao(1));
        System.out.println(lista.contem(aluno3));
        try
        {
            System.out.println(lista.pegaPosicao(101));            
        } 
        catch (IllegalArgumentException e)
        {
            System.out.println("Essa posição não existe!");
            System.out.println("Motivo: " + e.getMessage());
        }
    }
}