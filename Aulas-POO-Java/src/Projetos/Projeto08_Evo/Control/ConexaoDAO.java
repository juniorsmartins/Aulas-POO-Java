package Projetos.Projeto08_Evo.Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO 
{
    public Connection conectaBD()
    {
        Connection conexao = null;
        
        try
        {
            String url = "jdbc:mysql://localhost:3306/evo?user=root&password=!Jrs957895";
            conexao = DriverManager.getConnection(url);
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "ConexaoDAO: " + erro.getMessage());
        }
        return conexao;
    }
}