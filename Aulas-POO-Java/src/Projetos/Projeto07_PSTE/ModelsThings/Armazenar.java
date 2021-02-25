package Projetos.Projeto07_PSTE.ModelsThings;

import Projetos.Projeto07_PSTE.ModelsPersonas.Torcedor;

public class Armazenar 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static int totalTorcedor = 0;
    
    // Atributos de Instância
    Torcedor[] lista = new Torcedor[100];

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    // Métodos Abstratos
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    public void adicionar(Torcedor torcedor)
    {
        lista[totalTorcedor] = torcedor;
        Armazenar.totalTorcedor += 1;
    }

    // Métodos de Polimorfismo
    // Métodos Getters e Setters
}