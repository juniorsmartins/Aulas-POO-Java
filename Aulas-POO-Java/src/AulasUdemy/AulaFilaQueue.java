package AulasUdemy;

import java.util.LinkedList;
import java.util.Queue;

public class AulaFilaQueue 
{
    public static void main(String[] args) 
    {
        Queue<String> fila = new LinkedList<String>();
        
        System.out.println("Fila: " + fila);
        
        fila.add("Angelina");
        fila.add("Marta");
        fila.add("Patricia");
        
        System.out.println("Fila: " + fila);
        
        String retira = fila.poll();
        System.out.println("Retirado: " + retira);
        
        System.out.println("Fila após retirado: " + fila);
        
        String retira2 = fila.poll();
        System.out.println("Retirado: " + retira2);
        
        System.out.println("Fila após retirado: " + fila);
    }
}