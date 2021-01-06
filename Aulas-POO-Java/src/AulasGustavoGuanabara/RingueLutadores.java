package AulasGustavoGuanabara;


public class RingueLutadores {
    
    public static void main(String[] args)
    {
        ClasseLutador lutadores[] = new ClasseLutador[6];
        
        lutadores[0] = new ClasseLutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        lutadores[1] = new ClasseLutador("Putscript", "Brasil", 29, (float) 1.68, (float) 57.8, 14, 2, 3);
        
        lutadores[2] = new ClasseLutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        lutadores[3] = new ClasseLutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        lutadores[4] = new ClasseLutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        lutadores[5] = new ClasseLutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        for (byte contador = 0; contador < 6; contador++)
        {
            lutadores[contador].apresentarLutador();
            lutadores[contador].statusLutador();
        }

        
        
    }
    
}
