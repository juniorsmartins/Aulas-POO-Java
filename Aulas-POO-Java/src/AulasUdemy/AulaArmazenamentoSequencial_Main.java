package AulasUdemy;

public class AulaArmazenamentoSequencial_Main 
{
    public static void main(String[] args) 
    {
        AulaArmazenamentoSequencial_Aluno aluno1 = new AulaArmazenamentoSequencial_Aluno("Angelina");
        AulaArmazenamentoSequencial_Aluno aluno2 = new AulaArmazenamentoSequencial_Aluno("Felicity");
        AulaArmazenamentoSequencial_Vetor lista = new AulaArmazenamentoSequencial_Vetor();
        
        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        
        System.out.println(lista);
    }
}