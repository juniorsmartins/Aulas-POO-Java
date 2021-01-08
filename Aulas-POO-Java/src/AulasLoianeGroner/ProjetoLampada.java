package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProjetoLampada {
    
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static long totalLampadas;
    // Atributos de Instância
    private String anoLampada;
    private String idLampada;
    private String marcaLampada;
    private float voltagemLampada;
    private String tipoLampada;
    private float precoLampada;
    private boolean statusLampada;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public ProjetoLampada()
    {
        ProjetoLampada.setTotalLampadas();
        this.setAnoLampada();
        this.setIdLampada();
        this.setMarcaLampada(" ");
        this.setTipoLampada(" ");
        this.desligarLampada();
    }
    // Métodos Especiais
    public void statusLampada()
    {
        System.out.println("\n--------- STATUS ---------");
        System.out.println("Total: " + getTotalLampadas());
        System.out.println("Ano: " + this.getAnoLampada());
        System.out.println("ID: " + this.getIdLampada());
        System.out.println("Marca: " + this.getMarcaLampada());
        System.out.println("Voltagem: " + this.getVoltagemLampada());
        System.out.println("Tipo: " + this.getTipoLampada());
        System.out.println("Preço: " + this.getPrecoLampada());
        if (this.getStatusLampada())
        {
            System.out.println("Lampada Ligada!");            
        }
        else 
        {
            System.out.println("Lampada Desligada!");
        }

    }
    public void ligarLampada()
    {
        this.setStatusLampada(true);
    }
    public void desligarLampada()
    {
        this.setStatusLampada(false);
    }

    // Métodos de Classe
    private static void setTotalLampadas()
    {
        ProjetoLampada.totalLampadas += 1;
    }
    public static long getTotalLampadas()
    {
        return ProjetoLampada.totalLampadas;
    }

    // Métodoso Setters e Getters
    private void setAnoLampada()
    {
        Date data = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("yyyy");
        this.anoLampada = formatarData.format(data);        
    }
    public String getAnoLampada()
    {
        return this.anoLampada;
    }
    
    private void setIdLampada()
    {
        this.idLampada = (this.getAnoLampada() + "-" + ProjetoLampada.totalLampadas);
    }
    public String getIdLampada()
    {
        return this.idLampada;
    }

    protected void setMarcaLampada(String marca)
    {
        this.marcaLampada = marca;
    }
    public String getMarcaLampada()
    {
        return this.marcaLampada;
    }

    protected void setVoltagemLampada(float voltagem)
    {
        this.voltagemLampada = voltagem;
    }
    public float getVoltagemLampada()
    {
        return this.voltagemLampada;
    }

    protected void setTipoLampada(String tipo)
    {
        this.tipoLampada = tipo;
    }
    public String getTipoLampada()
    {
        return this.tipoLampada;
    }
    
    protected void setPrecoLampada(float preco)
    {
        this.precoLampada = preco;
    }
    public float getPrecoLampada()
    {
        return this.precoLampada;
    }
    
    private void setStatusLampada(boolean status)
    {
        this.statusLampada = status;
    }
    public boolean getStatusLampada()
    {
        return this.statusLampada;
    }
}
