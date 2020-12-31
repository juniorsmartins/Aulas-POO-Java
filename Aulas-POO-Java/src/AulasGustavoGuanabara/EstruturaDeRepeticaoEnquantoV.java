package AulasGustavoGuanabara;

import javax.swing.JOptionPane;

public class EstruturaDeRepeticaoEnquantoV {

    public static void main(String[] args) {
        
        byte contador = 0;
        int valor, somatoria = 0, parimpar, pares = 0, impares = 0, acima = 0, media = 0;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe valor: <br><em>[valor 0 interrompe]</em></html>"));
            if (valor != 0) {
                contador++; // números digitados
                somatoria += valor; // somatória
                parimpar = valor % 2;
                if (parimpar == 0) {
                    pares++;
                } else {
                    impares++;
                }
                if (valor > 100) {
                    acima++;
                }                
            }
        } while (valor != 0);
        media = somatoria / contador;
        JOptionPane.showMessageDialog(null, "<html><strong>RESULTADO FINAL</strong><hr>" + 
                "<br>Quantia de num digitados: " + contador + 
                "<br>Total de num pares: " + pares +
                "<br>Total de num ímpares: " + impares +
                "<br> Acima de 100 nums: " + acima +
                "<br>Somatório de nums: " + somatoria + 
                "<br>Média de nums: " + media +
                "</html>");        
    }  
}
