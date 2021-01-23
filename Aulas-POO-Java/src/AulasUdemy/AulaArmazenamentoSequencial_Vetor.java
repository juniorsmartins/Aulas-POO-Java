package AulasUdemy;

import java.util.Arrays;

public class AulaArmazenamentoSequencial_Vetor 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int tamanhoTotal = 0;

    // Atributos de Instância
    @SuppressWarnings("FieldMayBeFinal")
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
        if (!posicaoOcupada(posicao))
        {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        return this.alunos[posicao];
    }

    public void remove (int posicao)
    {
        this.alunos[posicao] = null;
    }

    public boolean contem (AulaArmazenamentoSequencial_Aluno aluno)
    {
        for (int i = 0; i < this.getTamanho(); i++)
        {
            if (aluno.equals(alunos[i]))
            {
                return true;
            }
        }
        return false;
    }
    
    private boolean posicaoOcupada (int posicao)
    {
        this.getTamanho();
        return (posicao >= 0 && posicao < tamanhoTotal);
    }
    
    // Métodos de Polimorfismo
    @Override
    public String toString()
    {
        return Arrays.toString(this.alunos); // Facilita a visualização do Array
    }
    
    // Métodos Getters e Setters
    public int getTamanho()
    {
        for (AulaArmazenamentoSequencial_Aluno i: alunos)
        {
            if (i != null)
            {
                AulaArmazenamentoSequencial_Vetor.tamanhoTotal += 1;
            }
        }
        return AulaArmazenamentoSequencial_Vetor.tamanhoTotal;
    }
}