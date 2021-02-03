package Projetos.Projeto3_Game.Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main 
{
    public static void main(String[] args) 
    {
        // string de conexão e dados de acesso ao servidor
        String servidor = "jdbc:sqlserver://localhost:3306;databaseName=jogadores";
        String usuario = "root";
        String senha = "!Jrs957895";
        
        // conexão
        Connection conexao;
        // instrução SQL
        Statement instrucaoSQL;
        // resultados
        ResultSet resultados;
        
        try
        {
            // conectando o banco de dados
            conexao = DriverManager.getConnection(servidor, usuario, senha);
            
            // criando a instrução SQL
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultados = instrucaoSQL.executeQuery("SELECT * FROM pessoa");
            System.out.println("Deu certo!");
        }
        catch (SQLException erro)
        {
            System.out.println(erro.getMessage());
        }
        finally
        {
            System.out.println("Ixi");
        }
    }
}