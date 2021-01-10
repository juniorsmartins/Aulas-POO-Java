package AulasLoianeGroner;

public enum EnumPosicaoJogaAtleta 
{
    QB("Quarterback"),
    C("Center"),
    LG("Left-Guard"),
    RG("Right-Guard"),
    LT("Left-Tackle"),
    RT("Right-Tackle"),
    TE("Tight-End"),
    HB("Halfback"),
    FB("Fullback"),
    WR("Wide Receiver"),
    DT("Defensive-Tackle"),
    DE("Defensive-End"),
    MLB("Middle Linebacker"),
    OLB("Outside Linebacker"),
    CB("Cornerback"),
    SS("Strong Safety"),
    FS("Free Safety");
    
    private String descricao;
    
    EnumPosicaoJogaAtleta(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getPosicaoJogaAtleta() { return this.descricao; }
}
