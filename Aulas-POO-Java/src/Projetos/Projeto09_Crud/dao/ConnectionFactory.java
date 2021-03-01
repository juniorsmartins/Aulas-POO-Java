package Projetos.Projeto09_Crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
    public Connection getConexao()
    {
        try
        {
            return DriverManager.getConnection("jdbc:mysql://localhost/mercado", "root", "!Jrs957895");
        }
        catch (SQLException erro)
        {
            throw new RuntimeException("Erro 1: " + erro);
        }
    }
}