package AulasUdemy;

/*
 * Todo elemento entra no final da fila
 * O primeiro elemento a entrar é também o primeiro a sair
 * <- [0] [1] [2] [3] [4] [5] [6]
 * 
*/
public class AulaFila 
{
    public static void main(String[] args) 
    {
        ClassFila fila = new ClassFila();
        
        System.out.println(fila);
        
        fila.adiciona("Angelina");
        fila.adiciona("Felicity");
        fila.adiciona("Maria");
        
        System.out.println(fila);
        
        String removido = fila.remove();
        System.out.println("O removido foi: " + removido);

        System.out.println("Fila: " + fila);
        
        System.out.println("Fila vazia: " + fila.vazia());
        
        fila.remove();
        fila.remove();
        fila.remove();
        
        System.out.println("Fila vazia: " + fila.vazia());
        System.out.println("Fila: " + fila);
    }
}