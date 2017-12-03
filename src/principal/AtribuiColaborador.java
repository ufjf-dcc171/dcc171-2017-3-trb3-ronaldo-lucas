package principal;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AtribuiColaborador extends javax.swing.JFrame {
    private String idTarefa;
    private final TarefaDAO daoTarefa;
    
    public AtribuiColaborador(String idTarefa, TarefaDAO dao) { 
        this.idTarefa = idTarefa;
        this.daoTarefa = dao;
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaColaborador = new javax.swing.JTable();
        btnAtribuir = new javax.swing.JToggleButton();
        btnFechar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabelaColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaColaborador.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tabelaColaborador);
        if (tabelaColaborador.getColumnModel().getColumnCount() > 0) {
            tabelaColaborador.getColumnModel().getColumn(0).setResizable(false);
            tabelaColaborador.getColumnModel().getColumn(0).setPreferredWidth(9);
            tabelaColaborador.getColumnModel().getColumn(1).setResizable(false);
            tabelaColaborador.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        btnAtribuir.setText("Atribuir");
        btnAtribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtribuirActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtribuir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtribuir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaTabela();
    }//GEN-LAST:event_formWindowActivated

    private void btnAtribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtribuirActionPerformed
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaColaborador.getModel();
            int[] selecao = tabelaColaborador.getSelectedRows();
            Colaborador colab = new Colaborador();
            for (int i = 0; i < selecao.length; i++) {
                colab.setID(Integer.parseInt(tabelaColaborador.getValueAt(selecao[i], 0).toString()));
                colab.setNOME(tabelaColaborador.getValueAt(selecao[i], 1).toString());
                colab.setEMAIL(tabelaColaborador.getValueAt(selecao[i], 2).toString());
                daoTarefa.criarColaborador(colab, idTarefa);
            }   
            JOptionPane.showMessageDialog(null, "Atribuição efetuada com sucesso!", "SysProj", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_btnAtribuirActionPerformed
    
    private void atualizaTabela() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaColaborador.getModel();
            //tabelaColaborador.clearSelection();
            model.setNumRows(0);           ///Limpando a tabela
            List<Colaborador> colaborador = daoTarefa.listaColaboradores(idTarefa);
            for(int i = 0; i < colaborador.size(); i++){
                model.addRow(new Object[]{
                    colaborador.get(i).getID(),
                    colaborador.get(i).getNOME(),
                    colaborador.get(i).getEMAIL()
                });
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAtribuir;
    private javax.swing.JToggleButton btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaColaborador;
    // End of variables declaration//GEN-END:variables
}
