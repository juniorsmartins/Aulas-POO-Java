package AulasUdemy;

public class AulaStrings 
{
    public static void main(String[] args) 
    {
        String curso = "Programação em Java: Essencial";
        
        // Troca a palavra Java pela segunda Python e armazena
        curso = curso.replace("Java", "Python");
        System.out.println(curso);

        // Troca toda letra "a" por letra "o"
        curso = curso.replace("a", "o");
        System.out.println("Trocar a por o: " + curso);
        
        // Converte para letras minúsculas
        curso = curso.toLowerCase();
        System.out.println("Tornar minúsculas: " + curso);
        
        // Converte para maiúsculo
        curso = curso.toUpperCase();
        System.out.println("Tornar maiúsculo: " + curso);
        
        // Verifica o tamanho da string
        int tamanho = curso.length();
        System.out.println("Quantia de caracteres na frase: " + tamanho);
        System.out.print("Invertido: ");
        // Imprime um por um ao contrário
        for (int i = (curso.length() - 1); i >= 0; i--) 
        {
            System.out.print(curso.charAt(i));
        }
        System.out.println(" ");
    }
}