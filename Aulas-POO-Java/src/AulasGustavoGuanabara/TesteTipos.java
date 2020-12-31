package AulasGustavoGuanabara;

public class TesteTipos {
    
    public static void main(String[] args) {
        
        // converter  inteiro para string
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println("Idade: " + valor);

        // converter string para inteiro
        String valorado = "40";
        int experiencia = Integer.parseInt(valorado);
        System.out.format("Experiencia: %d \n", experiencia);
 
        // converter string para float
        String novoValor = "30.8";
        float novaIdade = Float.parseFloat(novoValor);
        System.out.format("Nova Idade: %.2f \n", novaIdade);
    }
    
}
