package AulasUdemy;

import java.util.LinkedList;
import java.util.List;

public class ClassConjunto 
{
    private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();
    
    public ClassConjunto()
    {
        for (int i = 0; i < 26; i++)
        {
            tabela.add(new LinkedList<String>());
        }
    }
    
    private int calculaIndice(String nome)
    {
        return nome.toLowerCase().charAt(0) % 26;
    }
    
    public void adiciona(String nome)
    {
        // Passo 1 - Calcula o índice do nome
        int indice = calculaIndice(nome);
        // Passo 2 - Pega a lista de acordo com o índice
        List<String> lista = tabela.get(indice);
        // Passo 3 - Adiciona o nome na lista correta (conforme ordem alfabética)
        lista.add(nome);
    }
    
    private boolean contem(String nome)
    {
        // Passo 1 - Calcula o índice do nome
        int indice = calculaIndice(nome);
        // Passo 2 - Busca o nome na tabela específica do índice
        return tabela.get(indice).contains(nome);
    }
}