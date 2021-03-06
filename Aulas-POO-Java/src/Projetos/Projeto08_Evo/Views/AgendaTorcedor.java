package Projetos.Projeto08_Evo.Views;

import Projetos.Projeto08_Evo.Control.TorcedorDAO;
import Projetos.Projeto08_Evo.Models.Contato;
import Projetos.Projeto08_Evo.Models.Endereco;
import Projetos.Projeto08_Evo.Models.Torcedor;

public class AgendaTorcedor extends javax.swing.JFrame {

    public AgendaTorcedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonGravarTorcedor = new javax.swing.JButton();
        campoPais = new javax.swing.JTextField();
        jLabelPais = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        campoComplemento = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        campoCep = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        campoNum = new javax.swing.JTextField();
        jLabelNum = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        jLabelRua = new javax.swing.JLabel();
        campoSexo = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        campoTime = new javax.swing.JTextField();
        jLabelTime = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        campoSobrenome = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelAreaCadastro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemAtleta = new javax.swing.JMenuItem();
        jMenuItemColaborador = new javax.swing.JMenuItem();
        jMenuItemTorcedor = new javax.swing.JMenuItem();
        jMenuOperar = new javax.swing.JMenu();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuItemAtualizar = new javax.swing.JMenuItem();
        jMenuItemDeletar = new javax.swing.JMenuItem();
        jMenuServir = new javax.swing.JMenu();
        jMenuItemContratar = new javax.swing.JMenuItem();
        jMenuItemDescontratar = new javax.swing.JMenuItem();
        jMenuItemRenovar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(963, 544));
        setResizable(false);
        setSize(new java.awt.Dimension(963, 544));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome", "CPF", "E-mail", "Telefone", "Data Nasc", "Sexo", "Rua", "Número", "Bairro", "Cidade", "Estado", "Cep"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 511, 1220, 200));

        jButtonGravarTorcedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonGravarTorcedor.setText("Gravar");
        jButtonGravarTorcedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarTorcedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravarTorcedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 100, 40));

        campoPais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPaisActionPerformed(evt);
            }
        });
        getContentPane().add(campoPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 120, -1));

        jLabelPais.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelPais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPais.setText("Pais:");
        getContentPane().add(jLabelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, -1));

        campoEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(campoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 100, -1));

        jLabelEstado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstado.setText("Estado:");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        campoCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(campoCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 310, -1));

        jLabelCidade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCidade.setText("Cidade:");
        getContentPane().add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        campoComplemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(campoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 240, -1));

        jLabelComplemento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelComplemento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComplemento.setText("Complemento:");
        getContentPane().add(jLabelComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        campoCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCepActionPerformed(evt);
            }
        });
        getContentPane().add(campoCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 130, -1));

        jLabelCep.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCep.setText("Cep:");
        getContentPane().add(jLabelCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        campoBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairroActionPerformed(evt);
            }
        });
        getContentPane().add(campoBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 310, -1));

        jLabelBairro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBairro.setText("Bairro:");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        campoNum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumActionPerformed(evt);
            }
        });
        getContentPane().add(campoNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 80, -1));

        jLabelNum.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNum.setText("Número:");
        getContentPane().add(jLabelNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        campoRua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRuaActionPerformed(evt);
            }
        });
        getContentPane().add(campoRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 310, -1));

        jLabelRua.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelRua.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRua.setText("Rua/Av.:");
        getContentPane().add(jLabelRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        campoSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSexoActionPerformed(evt);
            }
        });
        getContentPane().add(campoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 90, -1));

        jLabelSexo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSexo.setText("Sexo:");
        getContentPane().add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        campoDataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 100, -1));

        jLabelDataNascimento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataNascimento.setText("Data Nasc.:");
        getContentPane().add(jLabelDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        campoTime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTimeActionPerformed(evt);
            }
        });
        getContentPane().add(campoTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 90, -1));

        jLabelTime.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTime.setText("Time:");
        getContentPane().add(jLabelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        campoTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 120, -1));

        jLabelTelefone.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone:");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        campoEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 300, -1));

        jLabelEmail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail:");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        campoCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });
        getContentPane().add(campoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 300, -1));

        jLabelCpf.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCpf.setText("CPF:");
        getContentPane().add(jLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        campoSobrenome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 270, -1));

        jLabelSobrenome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSobrenome.setText("Sobrenome:");
        getContentPane().add(jLabelSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        campoNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 300, -1));

        jLabelNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabelAreaCadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelAreaCadastro.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelAreaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1240, 580));

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("www.cuiabaarsenal.com.br");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 1260, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Programa Sócio Torcedor Evolution");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1260, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EVO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1260, 80));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 730));

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemAtleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeJogador.png"))); // NOI18N
        jMenuItemAtleta.setText("Atleta");
        jMenuCadastrar.add(jMenuItemAtleta);

        jMenuItemColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeArbitro.png"))); // NOI18N
        jMenuItemColaborador.setText("Colaborador");
        jMenuCadastrar.add(jMenuItemColaborador);

        jMenuItemTorcedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeBola.png"))); // NOI18N
        jMenuItemTorcedor.setText("Torcedor");
        jMenuCadastrar.add(jMenuItemTorcedor);

        jMenuBar1.add(jMenuCadastrar);

        jMenuOperar.setText("Operações");

        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeConsultar.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuOperar.add(jMenuItemConsultar);

        jMenuItemAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeAtualizar.png"))); // NOI18N
        jMenuItemAtualizar.setText("Atualizar");
        jMenuOperar.add(jMenuItemAtualizar);

        jMenuItemDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeDeletar.png"))); // NOI18N
        jMenuItemDeletar.setText("Deletar");
        jMenuOperar.add(jMenuItemDeletar);

        jMenuBar1.add(jMenuOperar);

        jMenuServir.setText("Serviços");

        jMenuItemContratar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeContratar2.png"))); // NOI18N
        jMenuItemContratar.setText("Contratar");
        jMenuServir.add(jMenuItemContratar);

        jMenuItemDescontratar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeDescontratar2.png"))); // NOI18N
        jMenuItemDescontratar.setText("Descontratar");
        jMenuServir.add(jMenuItemDescontratar);

        jMenuItemRenovar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projetos/Projeto08_Evo/Views/Imagens/iconeRenovar2.png"))); // NOI18N
        jMenuItemRenovar.setText("Renovar");
        jMenuServir.add(jMenuItemRenovar);

        jMenuBar1.add(jMenuServir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSobrenomeActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumActionPerformed

    private void campoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairroActionPerformed

    private void campoCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCepActionPerformed

    private void campoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidadeActionPerformed

    private void campoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadoActionPerformed

    private void campoComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoComplementoActionPerformed

    private void campoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPaisActionPerformed

    private void campoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRuaActionPerformed

    private void campoDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataNascimentoActionPerformed

    private void jButtonGravarTorcedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarTorcedorActionPerformed

        String nome = campoNome.getText();
        String sobrenome = campoSobrenome.getText();
        String cpf = campoCpf.getText();
        String dataOrigem = campoDataNascimento.getText();
        String sexo = campoSexo.getText();
        String time = campoTime.getText();
        String rua = campoRua.getText();
        int numero = Integer.parseInt(campoNum.getText());
        long cep = Long.parseLong(campoCep.getText());
        String bairro = campoBairro.getText();
        String complemento = campoComplemento.getText();
        String cidade = campoCidade.getText();
        String estado = campoEstado.getText();
        String pais = campoPais.getText();
        String mail = campoEmail.getText();
        long telefone = Long.parseLong(campoTelefone.getText());

        Contato contato = new Contato(telefone, mail);
        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, pais, cep);
        endereco.setComplemento(complemento);
        Torcedor torcedor = new Torcedor(nome, sobrenome, cpf, dataOrigem, sexo, time);
        torcedor.setEndereco(endereco);
        torcedor.setContato(contato);
        
        TorcedorDAO torcedorDAO = new TorcedorDAO();
        torcedorDAO.cadastrarTorcedor(torcedor);
    }//GEN-LAST:event_jButtonGravarTorcedorActionPerformed

    private void campoTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTimeActionPerformed

    private void campoSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSexoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendaTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* CrejMenuOperacaod display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaTorcedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNum;
    private javax.swing.JTextField campoPais;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoSexo;
    private javax.swing.JTextField campoSobrenome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoTime;
    private javax.swing.JButton jButtonGravarTorcedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAreaCadastro;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemAtleta;
    private javax.swing.JMenuItem jMenuItemAtualizar;
    private javax.swing.JMenuItem jMenuItemColaborador;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemContratar;
    private javax.swing.JMenuItem jMenuItemDeletar;
    private javax.swing.JMenuItem jMenuItemDescontratar;
    private javax.swing.JMenuItem jMenuItemRenovar;
    private javax.swing.JMenuItem jMenuItemTorcedor;
    private javax.swing.JMenu jMenuOperar;
    private javax.swing.JMenu jMenuServir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
