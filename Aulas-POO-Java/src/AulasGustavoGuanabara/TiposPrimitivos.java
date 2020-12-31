package AulasGustavoGuanabara;

public class TiposPrimitivos {

    
    // Três formas de declarar uma variável 
    int idade = 3; // Forma 1
    int dia = (int) 10; // Forma 2: com Typecast - O int dentro do parenteses antes do número inteiro
    Integer valor = new Integer(3); // Forma 3: o new cria o objeto valor da classe Integer - Wrapper Class
    
    float salario = 1825.54f; // A letra f após o número real é usada para números de ponto flutuante (dá erro se não colocar)
    float salar = (float) 1825.54;
    Float sal = new Float(1825.54);

    char letra = 'G';
    char letr = (char) 'G';
    Character le = new Character('G');
    
    boolean casado = false;
    boolean casad = (boolean) false;
    Boolean casa = new Boolean(false);

/*
    Família                Tipo Primitivo                Classe Invólucro                        Tamanho                Exemplo
    Lógico                   boolean                               Boolean                                  1 bit                           true
    Literais                  char                                     Character                               1 byte                        'A'
    Literais                   -                                          String                                       1 byte/cada             "Java"
    Inteiros                   byte                                     Byte                                          1 byte                         até 127
    Inteiros                   short                                    Short                                        2 bytes                       até 32767
    Inteiros                   int                                         Integer                                    4 bytes                        até 2147483     
    Inteiros                   long                                      Long                                        8 bytes                        até 2 elevado a 63
    Reais                      float                                      Float                                        4 bytes                        3.4e+38
    Reais                      double                                 Double                                    8 bytes                       1.8e+308
*/


    
}
