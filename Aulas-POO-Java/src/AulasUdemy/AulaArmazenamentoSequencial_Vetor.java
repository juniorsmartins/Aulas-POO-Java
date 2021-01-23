package AulasUdemy;

import java.util.Arrays;

public class AulaArmazenamentoSequencial_Vetor 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    // Atributos de Instância
    private AulaArmazenamentoSequencial_Aluno[] alunos = new AulaArmazenamentoSequencial_Aluno[100];
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    // Métodos Abstratos
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    public void adiciona(AulaArmazenamentoSequencial_Aluno aluno)
    {
        for (int i = 0; i < alunos.length; i++)
        {
            if (alunos[i] == null) 
            {
                alunos[i] = aluno;
                break;
            }
        }
    }
    public AulaArmazenamentoSequencial_Aluno pegaPosicao (int posicao)
    {
        return this.alunos[posicao];
    }
    public void remove (int posicao)
    {
        this.alunos[posicao] = null;
    }
    public boolean contem (AulaArmazenamentoSequencial_Aluno aluno)
    {
        return false;
    }
    public int tamanho()
    {
        return 0;
    }

    // Métodos de Polimorfismo
    @Override
    public String toString()
    {
        return Arrays.toString(this.alunos); // Facilita a visualização do Array
    }
    
    // Métodos Getters e Setters
}