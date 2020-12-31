package AulasLivros;

import java.util.Scanner;

public class Pessoa {
    String nome;
    float notaEstatistica;
    float notaAlgoritmo;
    float notaProgramacao;
    float mediaGeral;
    boolean provas;
    boolean formado;
    
    void fezProvas()
    {
        if (this.notaEstatistica == 0 | this.notaAlgoritmo == 0 | this.notaProgramacao == 0)
        {
            this.provas = false;
            System.out.println("Não fez todas as provas!");
        }
        else
        {
            this.provas = true;            
            System.out.println("Fez todas as provas!");
        }
    }
    
    void calculaMedia()
    {
        if (this.provas == true)
        {
            this.mediaGeral = (this.notaEstatistica + this.notaAlgoritmo + this.notaProgramacao) / 3;         
        }
        else
        {
            this.mediaGeral = 0;
        }
    }
    
    void aprovadoOuNao()
    {
        this.calculaMedia();
        if (this.provas == true && this.mediaGeral != 0)
        {
            this.formado = this.mediaGeral >= 7 && this.mediaGeral <= 10;
            System.out.println("Aprovado! Com média: " + this.mediaGeral + ".");
        }
        else
        {
            System.out.println("Pendente!");
        }
    }    
}
