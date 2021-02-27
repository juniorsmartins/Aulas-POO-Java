package Projetos.Projeto08_Evo.Control;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class ConexaoDAO 
{
    public Connection conectaBD()
    {
        Connection conexao = null;
        
        try
        {
            String url = "jdbc:mysql://localhost:3306/"
        }
        catch(Exception erro)
        {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return conexao;
    }
}