package AulasLoianeGroner;

public class TesteAnimais 
{

    public static void main(String[] args) 
    {
        Cavalo cavalo = new Cavalo();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Papagaio papagaio = new Papagaio();
        
        cavalo.alimentar();
        gato.alimentar();
        cachorro.amamentar();
        papagaio.emitirSom();
        cachorro.brincar();
        
    }
    
}
