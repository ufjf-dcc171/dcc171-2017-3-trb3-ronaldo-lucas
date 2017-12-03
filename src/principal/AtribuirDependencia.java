package principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AtribuirDependencia extends javax.swing.JFrame {
    private String projeto;
    private Tarefa tarefa;
    private TarefaDAO daoTarefa;
    
    public AtribuirDependencia(Tarefa tarefa, String projeto, TarefaDAO dao) {
        this.projeto = projeto;
        this.tarefa = tarefa;
        this.daoTarefa = dao;
        
        initComponents();  
        
        tabelaTarefas.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaTarefas.getColumnModel().getColumn(1).setPreferredWidth(250); 
        tabelaTarefas.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabelaTarefas.getColumnModel().getColumn(3).setPreferredWidth(80);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTarefas = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        btnAtribuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabelaTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Descricao", "DataInicio", "DataFim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTarefas.setToolTipText("");
        tabelaTarefas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaTarefas.setInheritsPopupMenu(true);
        tabelaTarefas.setName(""); // NOI18N
        tabelaTarefas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tabelaTarefas);
        if (tabelaTarefas.getColumnModel().getColumnCount() > 0) {
            tabelaTarefas.getColumnModel().getColumn(0).setResizable(false);
            tabelaTarefas.getColumnModel().getColumn(1).setResizable(false);
            tabelaTarefas.getColumnModel().getColumn(2).setResizable(false);
        }

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAtribuit.setText("Atribuir");
        btnAtribuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtribuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtribuit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAtribuit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaTabela();
    }//GEN-LAST:event_formWindowActivated

    private void btnAtribuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtribuitActionPerformed
        try {
            int[] selecao = tabelaTarefas.getSelectedRows();            
            for (int i = 0; i < selecao.length; i++) {
                Tarefa t = new Tarefa();
                String dtInicio = tabelaTarefas.getValueAt(selecao[i], 2).toString();
                String dtFim = tabelaTarefas.getValueAt(selecao[i], 2).toString();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    
                t.setID(Integer.parseInt(tabelaTarefas.getValueAt(selecao[i], 0).toString()));
                t.setDESCRICAO(tabelaTarefas.getValueAt(selecao[i], 1).toString());
                //t.setDT_INICIO(format.parse(dtInicio));
                //t.setDT_FIM(format.parse(dtFim));
                
                daoTarefa.atribuirDependencia(tarefa, t);
            }   
            JOptionPane.showMessageDialog(null, "Atribuição efetuada com sucesso!", "SysProj", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_btnAtribuitActionPerformed

    private void atualizaTabela() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaTarefas.getModel();
            //tabelaColaborador.clearSelection();
            model.setNumRows(0);           ///Limpando a tabela
            List<Tarefa> tarefas = daoTarefa.listaTodosAtribuicao(tarefa.getID(), tarefa.getID_PROJETO());
            for(int i = 0; i < tarefas.size(); i++){
                model.addRow(new Object[]{
                    tarefas.get(i).getID(),
                    tarefas.get(i).getDESCRICAO(),
                    tarefas.get(i).getDT_INICIO(),
                    tarefas.get(i).getDT_FIM()
                    
                });
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtribuit;
    private javax.swing.JButton btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTarefas;
    // End of variables declaration//GEN-END:variables
}
