package AulasUdemy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AulaDefaultMethodsMain2 
{
    public static void main(String[] args) 
    {
        List<String> palavras = new ArrayList<String>();
        
        Consumer<String> consumidor = new ImprimeNaLinhaForEachNovo();
        
        palavras.add("Roberta");
        palavras.add("Marcia");
        palavras.add("Isabele");
        palavras.add("Jennifer");
        
        palavras.forEach(consumidor);
    }
}