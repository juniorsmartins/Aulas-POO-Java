package Projetos.Projeto5_GestaoFuncionarios.sistema_telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import Projetos.Projeto5_GestaoFuncionarios.sistema.Navegador;
import Projetos.Projeto5_GestaoFuncionarios.sistema.BancoDeDados;

public class RelatoriosCargos extends JPanel
{
    JLabel labelTitulo, labelDescricao;
    
    public RelatoriosCargos()
    {
        criarComponentes();
        criarEventos();
        Navegador.habilitaMenu();
    }
    
    private void criarComponentes()
    {
        setLayout(null); // Não será usado gerenciador de layout
        
        /*
         * Componentes de tela instanciados
        */
        labelTitulo = new JLabel("Relatórios", JLabel.CENTER);
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
        labelDescricao = new JLabel("Esse gráfico representa a quantidade de funcionários por cargo", JLabel.CENTER);
        
        /*
         * Instanciado o gráfico em formato pizza, utilizando a biblioteca JFreeChart
        */
        DefaultPieDataset dadosGrafico = this.criarDadosGrafico();
        JFreeChart someChart = ChartFactory.createPieChart3D("", dadosGrafico, false, true, false);
        PiePlot plot = (PiePlot) someChart.getPlot();
        plot.setLabelBackgroundPaint(Color.WHITE);
        plot.setBackgroundPaint(null);
        plot.setOutlinePaint(null);
        someChart.setBackgroundPaint(null);
        
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator("{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        
        ChartPanel chartPanel = new ChartPanel(someChart)
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(660, 340);
            }
        };
        /*
         * Definido o posicionamento e o tamanho dos componentes
        */
        labelTitulo.setBounds(20, 20, 660, 40);
        labelDescricao.setBounds(20, 50, 660, 40);
        chartPanel.setBounds(20, 100, 660, 340);
        
        /*
         * Componentes adicionados à tela
        */
        add(labelTitulo);
        add(labelDescricao);
        add(chartPanel);
        
        // Tela tornada visível
        setVisible(true);
    }
    
    private void criarEventos()
    {
        
    }
    
    /*
     * O método criarDadosGrafico realiza a conexão com o Banco de Dados para obter os valores que serão apresentados no gráfico
    */
    private DefaultPieDataset criarDadosGrafico()
    {
        DefaultPieDataset dados = new DefaultPieDataset();
        
        // Conexão
        Connection conexao;
        // Instrução SQL
        Statement instrucaoSQL;
        // Resultados
        ResultSet resultados;
        
        try
        {
            // Conectando ao banco de dados
            conexao = DriverManager.getConnection(BancoDeDados.stringDeConexao, BancoDeDados.usuario, BancoDeDados.senha);
            
            // Criando a instrução SQL
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT cargos.nome, count(*) as quantidade FROM cargos, funcionarios";
            query = query + "WHERE cargos.id = funcionarios.cargo group by cargos.nome order by nome ASC";
            resultados = instrucaoSQL.executeQuery(query);
            
            while(resultados.next())
            {
                dados.setValue(resultados.getString("nome"), resultados.getInt("quantidade"));
            }
            
            return dados;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar o relatório. \n\n" + ex.getMessage());
            Navegador.inicio();
        }
        
        return null;
    }
}