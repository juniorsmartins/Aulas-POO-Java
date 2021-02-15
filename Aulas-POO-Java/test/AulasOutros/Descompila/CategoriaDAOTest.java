package AulasOutros.Descompila;

import org.junit.Test;

public class CategoriaDAOTest 
{
    public CategoriaDAOTest() 
    {
    
    }

    @Test
    public void inserir() 
    {
        Categoria cat = new Categoria("Roupas");
        CategoriaDAO dao = new CategoriaDAO();
        
        if(dao.save(cat))
        {
            System.out.println("Salvo com sucesso!");
        }
        else
        {
            fail("Erro ao salvar!");
        }
    }

    private void fail(String erro_ao_salvar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
