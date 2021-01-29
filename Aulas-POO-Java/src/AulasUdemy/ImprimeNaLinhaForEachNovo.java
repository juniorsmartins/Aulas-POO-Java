package AulasUdemy;

import java.util.function.Consumer;

public class ImprimeNaLinhaForEachNovo implements Consumer<String>
{

    @Override
    public void accept(String s) 
    {
        System.out.println(s);
    }
}