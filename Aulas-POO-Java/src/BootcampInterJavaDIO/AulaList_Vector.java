package BootcampInterJavaDIO;

import java.util.List;
import java.util.Vector;

public class AulaList_Vector 
{

    public static void main(String[] args) 
    {
        List<String> esportes = new Vector<>();

        // Adiciona esportes no vector
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tênis");
        esportes.add("Futebol Americano");
        esportes.add("Xadrez");
        esportes.add("Handebol");
        esportes.add("Judô");
        esportes.add("Futsal");
        esportes.add("Vôlei");
        esportes.add("Rugby");
        esportes.add("Golfe");
        
        System.out.println(esportes); // imprime a lista

        // Altera o valor da posição e do vector
        esportes.set(7, "Ping Pong");
        
        // Remove o esporte da posição dois
        esportes.remove(2);
        
        // Remove o esporte Handebol do vector
        esportes.remove("Handebol");
        
        // Retorna o primeiro item do vector
        System.out.println(esportes.get(2));
        
        // Navega nos esportes
        for(String esporteItem: esportes)
        {
            System.out.print(esporteItem + " ");
        }
    }
}