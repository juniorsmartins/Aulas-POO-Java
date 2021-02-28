package Projetos.Projeto08_Evo.Control;

import Projetos.Projeto08_Evo.Models.Torcedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TorcedorDAO 
{
    Connection conn;
    PreparedStatement pstm;
    public void cadastrarTorcedor(Torcedor objTorcedor)
    {
        String sql = "insert into torcedor(idTorcedor, documento, dataCadastro, nomenclatura1, nomenclatura2, dataOrigem, sexo, time) values (?, ?, ?, ?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        
        try
        {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objTorcedor.getIdTorcedor());
            pstm.setString(2, objTorcedor.getDocumento());
            pstm.setString(3, objTorcedor.getDataCadastro());
            pstm.setString(4, objTorcedor.getNomenclatura1());
            pstm.setString(5, objTorcedor.getNomenclatura2());
            pstm.setString(6, objTorcedor.getDataOrigem());
            pstm.setString(7, objTorcedor.getSexo());
            pstm.setString(8, objTorcedor.getTime());
            pstm.execute();
            pstm.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "TorcedorDAO" + err);
        }
        
    }
}