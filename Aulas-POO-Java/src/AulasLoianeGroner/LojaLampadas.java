
package AulasLoianeGroner;

public class LojaLampadas 
{

    public static void main(String[] args)
    {
        ProjetoLampada lamp01 = new ProjetoLampada();
        ProjetoLampada lamp02 = new ProjetoLampada();

        lamp02.ligarLampada();
        lamp02.setMarcaLampada("Eletrical");
        lamp02.setVoltagemLampada(4.5f);
        lamp02.setPrecoLampada(9.99f);
        lamp02.setTipoLampada("Fluorescente");
        
        
        lamp01.apresentaLampada();
        lamp02.apresentaLampada();
    }
    
}
