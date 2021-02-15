package AulasOutros.Descompila;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaDAO 
{
    private Connection con = null;
    
    public CategoriaDAO()
    {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Categoria categoria)
    {
        String sql = "INSERT INTO categoria (descricao) VALUES (?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Erro: " + ex);
            return false;
        }
        finally
        {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}