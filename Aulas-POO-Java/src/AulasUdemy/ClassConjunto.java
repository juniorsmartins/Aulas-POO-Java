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
        // Calcula o índice por meio do valor ASCII da primeira letra do nome
        return nome.toLowerCase().charAt(0) % 26;
    }
    
    public void adiciona(String nome)
    {
        // Passo 1 - Verifica se o nome não existe na lista (para evitar duplicação)
        if (!contem(nome))
        {
            // Passo 2 - Calcula o índice do nome
            int indice = calculaIndice(nome);
            // Passo 3 - Pega a lista de acordo com o índice
            List<String> lista = tabela.get(indice);
            // Passo 4 - Adiciona o nome na lista correta (conforme ordem alfabética)
            lista.add(nome);
        }
    }
    
    private boolean contem(String nome)
    {
        // Passo 1 - Calcula o índice do nome
        int indice = calculaIndice(nome);
        // Passo 2 - Busca o nome na tabela específica do índice
        return tabela.get(indice).contains(nome);
    }
    
    public void remove(String nome)
    {
        // Passo 1 - Verificamos se o nome existe em alguma lista
        if(contem(nome))
        {
            // Passo 2 - Calculamos o índice do nome
            int indice = calculaIndice(nome);
            // Passo 3 - Pegamos a lista específica do nome
            List<String> lista = tabela.get(indice);
            // Passo 4 - Removemos o nome da lista
            lista.remove(nome);
        }
    }
    
    @Override
    public String toString()
    {
        return tabela.toString();
    }
}