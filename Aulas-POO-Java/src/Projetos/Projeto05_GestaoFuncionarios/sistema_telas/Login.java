package Projetos.Projeto05_GestaoFuncionarios.sistema_telas;

import Projetos.Projeto05_GestaoFuncionarios.sistema.Navegador;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel
{
    JLabel labelUsuario;
    JTextField campoUsuario;
    JLabel labelSenha;
    JPasswordField campoSenha;
    JButton botaoEntrar;
    
    public Login()
    {
        criarComponentes();
        criarEventos();
    }
    
    private void criarComponentes()
    {
        setLayout(null); // definido que não será usado nenhum gerenciador de Layout
        
        /*
         * Nas linhas abaixo, estamos instanciando os componentes da tela:
         * - Os componentes JLabel estão sendo inicializados com textos e alinhamento específicos
         * - Já o componente JButton está sendo inicializado somente com texto de exibição
        */
        JLabel labelTitulo = new JLabel("Seja bem-vindo ao sistema da Company SA", JLabel.CENTER); 
        labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 18));
        
        labelUsuario = new JLabel("Usuário", JLabel.LEFT);
        campoUsuario = new JTextField();
        labelSenha = new JLabel("Senha", JLabel.LEFT);
        campoSenha = new JPasswordField();
        botaoEntrar = new JButton("Entrar");

        /*
         * Nas linha abaixo, definimos o posicionamento e o tamanho dos componentes na tela 
        */
        labelTitulo.setBounds(20, 100, 660, 40);
        labelUsuario.setBounds(250, 220, 200, 20);
        campoUsuario.setBounds(250, 240, 200, 40);
        labelSenha.setBounds(250, 280, 200, 20);
        campoSenha.setBounds(250, 300, 200, 40);
        botaoEntrar.setBounds(250, 350, 200, 40);
        
        /*
         * Nas linhas abaixo, adicionamos os componentes à tela
        */
        add(labelTitulo);
        add(labelUsuario);
        add(campoUsuario);
        add(labelSenha);
        add(campoSenha);
        add(botaoEntrar);
        
        setVisible(true); // Torna a tela visível
    }
    
    private void criarEventos()
    {
        botaoEntrar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // validando as credenciais de login e senha
                if(campoUsuario.getText().equals("admin") && new String(campoSenha.getPassword()).equals("admin"))
                {
                    Navegador.inicio();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Acesso não permitido!");
                }
                
            }
        });
    }
}