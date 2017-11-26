package principal;

import java.awt.Color;
import java.io.IOException;

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
        mnMovimento = new javax.swing.JMenu();
        mnIniciaFinalizaTarefa = new javax.swing.JMenuItem();

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

        mnMovimento.setText("Movimento");

        mnIniciaFinalizaTarefa.setText("Iniciar/Finalizar Tarefa");
        mnMovimento.add(mnIniciaFinalizaTarefa);

        jMenuBar1.add(mnMovimento);

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
        CadastrarColaborador cadColaborador = new CadastrarColaborador();
        cadColaborador.getContentPane().setBackground(Color.white);
        cadColaborador.setLocationRelativeTo(null);
        cadColaborador.setVisible(true);
    }//GEN-LAST:event_mnColaboradorActionPerformed

    //Abre Cadastro Projetos
    private void mnProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProjetosActionPerformed
        CadastrarProjeto cadProjeto = new CadastrarProjeto();
        cadProjeto.getContentPane().setBackground(Color.white);
        cadProjeto.setLocationRelativeTo(null);
        cadProjeto.setVisible(true);
    }//GEN-LAST:event_mnProjetosActionPerformed

    private void mnTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTarefasActionPerformed
        CadastrarTarefa cadTarefa = new CadastrarTarefa();
        cadTarefa.getContentPane().setBackground(Color.white);
        cadTarefa.setLocationRelativeTo(null);
        cadTarefa.setVisible(true);
    }//GEN-LAST:event_mnTarefasActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnColaborador;
    private javax.swing.JMenuItem mnIniciaFinalizaTarefa;
    private javax.swing.JMenu mnMovimento;
    private javax.swing.JMenuItem mnProjetos;
    private javax.swing.JMenuItem mnTarefas;
    // End of variables declaration//GEN-END:variables
}
