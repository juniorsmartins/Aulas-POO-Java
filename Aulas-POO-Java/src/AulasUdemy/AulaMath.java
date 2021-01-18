package AulasUdemy;

public class AulaMath 
{
    public static void main(String[] args) 
    {
        System.out.println("Math de E: " + Math.E);
        
        System.out.format("%s%f%n", "Math de PI: ", Math.PI);
        
        System.out.printf("%s%f%n", "Math de Sin (seno) de 45: ", Math.sin(45)); // calcula seno
        
        System.out.print("Math de Cos (coseno) de 45: " + Math.cos(45) + "\n"); // calcula coseno
        
        System.out.format("%s%f%n", "Math de tan (tangente) de 45: ", Math.tan(45)); // calcula tangente

        System.out.format("%s%d%n", "Math de arredondar e retornar inteiro: ", Math.round(54.566)); // arredonda pra baixo e retorna inteiro
        
        System.out.println("Math de arredondar pra cima e retornar inteiro: " + Math.ceil(54.443)); // arredonda pra cima
        
        System.out.println("Math de arredondar pra baixo e retornar real: " + Math.floor(54.786));
        
        System.out.format("%s%f%n", "Math para elevar número a potência: ", Math.pow(5, 3));
        
        System.out.println("Math de raíz quadrada: " + Math.sqrt(9));
        
        System.out.println("");
    }
}