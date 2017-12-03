package principal;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() throws IOException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnColaborador = new javax.swing.JMenuItem();
        mnProjetos = new javax.swing.JMenuItem();
        mnTarefas = new javax.swing.JMenuItem();
        mnConsultas = new javax.swing.JMenu();
        mnConsTarefa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Projetos");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setName("frmPrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/fundo_principal.jpg"))); // NOI18N

        mnCadastro.setText("Cadastro");

        mnColaborador.setText("Cadastro de Colaborador");
        mnColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnColaboradorMouseClicked(evt);
            }
        });
        mnColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnColaboradorActionPerformed(evt);
            }
        });
        mnCadastro.add(mnColaborador);

        mnProjetos.setText("Cadastro de Projetos");
        mnProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProjetosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnProjetos);

        mnTarefas.setText("Cadastro de Tarefas");
        mnTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTarefasActionPerformed(evt);
            }
        });
        mnCadastro.add(mnTarefas);

        jMenuBar1.add(mnCadastro);

        mnConsultas.setText("Consultas");

        mnConsTarefa.setText("Tarefas");
        mnConsTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsTarefaActionPerformed(evt);
            }
        });
        mnConsultas.add(mnConsTarefa);

        jMenuBar1.add(mnConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated


    private void mnColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnColaboradorMouseClicked

    }//GEN-LAST:event_mnColaboradorMouseClicked

    //Abre Cadastro Colaborador
    private void mnColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnColaboradorActionPerformed
        try {
            ColaboradorDAO dao = new ColaboradorDAOJDBC();
            CadastrarColaborador cadColaborador = new CadastrarColaborador(dao);
            cadColaborador.getContentPane().setBackground(Color.white);
            cadColaborador.setLocationRelativeTo(null);
            cadColaborador.setVisible(true);
        } catch (Exception erro) {
            erro.printStackTrace();
        }

    }//GEN-LAST:event_mnColaboradorActionPerformed

    //Abre Cadastro Projetos
    private void mnProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProjetosActionPerformed
        try {
            ProjetoDAO dao = new ProjetoDAOJDBC();
            CadastrarProjeto cadProjeto = new CadastrarProjeto(dao);
            cadProjeto.getContentPane().setBackground(Color.white);
            cadProjeto.setLocationRelativeTo(null);
            cadProjeto.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mnProjetosActionPerformed

    private void mnTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTarefasActionPerformed
        try {
            TarefaDAO dao = new TarefaDAOJDBC();
            ProjetoDAO daoProj = new ProjetoDAOJDBC();
            CadastrarTarefa cadProjeto = new CadastrarTarefa(dao, daoProj);
            cadProjeto.getContentPane().setBackground(Color.white);
            cadProjeto.setLocationRelativeTo(null);
            cadProjeto.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnTarefasActionPerformed

    private void mnConsTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsTarefaActionPerformed
        try {
            TarefaDAO dao = new TarefaDAOJDBC();
            ConsultaTarefas consultaTarefas = new ConsultaTarefas(dao);
            consultaTarefas.getContentPane().setBackground(Color.white);
            consultaTarefas.setLocationRelativeTo(null);
            consultaTarefas.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnConsTarefaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnColaborador;
    private javax.swing.JMenuItem mnConsTarefa;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenuItem mnProjetos;
    private javax.swing.JMenuItem mnTarefas;
    // End of variables declaration//GEN-END:variables
}
