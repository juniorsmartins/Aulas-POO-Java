package AulasUdemy;

public class AulaListaLigada_ProgramaMain 
{
    public static void main(String[] args) 
    {
        AulaListaLigada_Lista lista = new AulaListaLigada_Lista();
        System.out.println(lista);

        lista.adicionaNoComeco("Maria");
        System.out.println(lista);

        lista.adicionaNoComeco("Angelina");
        System.out.println(lista);

        lista.adicionaNoComeco("Felicity");
        System.out.println(lista);
        
        String nome = "Pedro";
        lista.adicionaNoComeco(nome);
        System.out.println(lista);
        
        int numero = 52;
        lista.adicionaNoComeco(numero);
        System.out.println(lista);
        
        lista.adiciona("Angela");
        System.out.println(lista);
        
        lista.adiciona("Marcus");
        System.out.println(lista);
        
        lista.adiciona(3, "Xuxa");
        System.out.println(lista);
        
        Object ret = lista.pega(1);
        System.out.println(ret);
        
        System.out.println(lista.tamanho());
        
        lista.removeDoComeco();
        System.out.println(lista);

        System.out.println(lista.tamanho());
    }
}