package AulasLivros;

public class CriarObjeto {

    public static void main(String[] args) 
    {
        ProjetoTV televisao = new ProjetoTV();
        televisao.ligarTV();
        televisao.aumentarVolume();
        
        System.out.println("Esta televisão é da marca " + televisao.fabricante + ". A televisão está " + (televisao.ligado == true ? "ligada!":"desligada!"));
        System.out.println("O volume da televisão é " + televisao.volume + ".");
        
    }

}
