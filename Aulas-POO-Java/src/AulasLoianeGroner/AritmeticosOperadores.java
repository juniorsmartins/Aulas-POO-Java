package AulasLoianeGroner;

public class AritmeticosOperadores {

    public static void main(String[] args)
    {
        // Tipos Primitivos (sem e com typecast)
        // Inteiros
        byte filhos1 = 2;
        byte filhos2 = (byte) 12;
        short dedos1 = 20;
        short dedos2 = (short) 10;
        int idade1 = 20;
        int idade2 = (int) 2;
        long maos1 = 2;
        long maos2 = 2l;
        long maos3 = (long) 2;
        // Ponto Flutuante
        float preco1 = 4.5f;
        float preco2 = (float) 5.2;
        double valor1 = 10.3;
        double valor2 = (double) 9.6;
        // Caracter
        char letra1 = 'A';
        char letra2 = (char) 'B';
        // Boolean
        boolean verdadeiro1 = true;
        boolean verdadeiro2 = (boolean) true;
        boolean falso1 = false;
        boolean falso2 = (boolean) false;
        
        byte soma1 = (byte) (filhos1 + filhos2);
        short subtracao1 = (short) (dedos1 - dedos2);
        int divisao1 = idade1 / idade2;
        int soma2 = (int) (idade1 + idade2);
        long multiplica1 = maos1 * maos2;
        long multiplica2 = (long) (maos1 * maos2);
        float soma3 = preco1 + preco2;
        float subtracao2 = (float) (preco1 - 2);
        double divisao2 = valor1 / 3;
        double divisao3 = (double) (valor2 / 2);
        
    }
}
