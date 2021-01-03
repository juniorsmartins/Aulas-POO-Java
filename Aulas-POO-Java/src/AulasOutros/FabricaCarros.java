package AulasOutros;

public class FabricaCarros {

    public static void main(String[] args)
    {
        
        ProjetoCarro carro = new ProjetoCarro("Saveiro", 2, 2);
        
        carro.statusCarro();

        carro.setLigarCarro();
        
        carro.statusCarro();

        
    }
}
