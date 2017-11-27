package principal;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class CadastrarColaborador extends javax.swing.JFrame {
    private final ColaboradorDAO daoColaborador;
    private Boolean fNovo = false;
    
    public CadastrarColaborador(ColaboradorDAO dao) throws Exception {
        this.daoColaborador = dao;
          
        //atualizarTabela();        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaColaborador = new javax.swing.JTable();
        txtCod = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Colaborador");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblNome.setText("Nome");

        lblEmail.setText("Email");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                "ID", "NOME", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaColaborador.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaColaboradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaColaborador);
        if (tabelaColaborador.getColumnModel().getColumnCount() > 0) {
            tabelaColaborador.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        lblCodigo.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(btnCancelar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEmail))))
                    .addComponent(lblCodigo)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //OnClick Botão Novo
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Integer IDincremento = 0;
        try {
            limpaCampos();
            fNovo = true;
            IDincremento = daoColaborador.retornaID();        
            txtCod.setEnabled(false);
            txtCod.setText(IDincremento + "");
            txtNome.grabFocus();
            
            btnNovo.setEnabled(false);
            btnExcluir.setEnabled(false);            
        } catch (Exception ex) {
            Logger.getLogger(CadastrarColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed
    
    //OnClick Botão Gravar
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {            
            if (fNovo == true){
                Colaborador c = new Colaborador();
                c.setID(Integer.parseInt(txtCod.getText()));
                c.setNOME(txtNome.getText());
                c.setEMAIL(txtEmail.getText());
                daoColaborador.criar(c);    
            }else{
                Colaborador c = new Colaborador();
                c.setID(Integer.parseInt(txtCod.getText()));
                c.setNOME(txtNome.getText());
                c.setEMAIL(txtEmail.getText());
                daoColaborador.alterar(c); 
            }
            
            System.out.println("Gravação efetuada com sucesso!");
            fNovo = false;
            btnNovo.setEnabled(true);
            btnExcluir.setEnabled(true);
            txtCod.setEnabled(true);
            limpaCampos();
            atualizaTabela();
                
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_btnGravarActionPerformed
    
    //OnClick Botão Excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (!"".equals(txtCod.getText())) {
                if (fNovo == false){                
                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "", JOptionPane.YES_NO_OPTION);

                    if (resposta == JOptionPane.YES_OPTION) {
                        Colaborador c = new Colaborador();
                        c.setID(Integer.parseInt(txtCod.getText()));
                        daoColaborador.excluir(c);
                        System.out.println("Exclusão efetuada com sucesso!");

                        btnNovo.setEnabled(true);
                        btnExcluir.setEnabled(true);
                        txtCod.setEnabled(true);
                        limpaCampos();
                        atualizaTabela();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um colaborador!!!", "Erro", JOptionPane.ERROR_MESSAGE);
                }    
            }                        
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    //OnClick na Grid    
    private void tabelaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaColaboradorMouseClicked
        if(evt.getClickCount() == 2){
            try {
                if (fNovo == false){
                    if (tabelaColaborador.getSelectedRowCount() == 0) {
                        return;
                    }
                    DefaultTableModel modelo = (DefaultTableModel) tabelaColaborador.getModel();
                    int linhaSelecionada = tabelaColaborador.getSelectedRow();
                    txtCod.setText(tabelaColaborador.getValueAt(linhaSelecionada, 0).toString());
                    txtNome.setText(tabelaColaborador.getValueAt(linhaSelecionada, 1).toString());
                    txtEmail.setText(tabelaColaborador.getValueAt(linhaSelecionada, 2).toString());
                    txtCod.setEnabled(false);    
                }
            } catch (Exception erro) {
                erro.printStackTrace();
            }        
        }
        
    }//GEN-LAST:event_tabelaColaboradorMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaTabela();
    }//GEN-LAST:event_formWindowActivated

    //OnClick no botão Cancelar
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        txtCod.setEnabled(true);
        fNovo = false;
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        atualizaTabela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void atualizaTabela() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaColaborador.getModel();
            //tabelaColaborador.clearSelection();
            model.setNumRows(0);           ///Limpando a tabela
            List<Colaborador> colaborador = daoColaborador.listaTodos();
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
    
    private void limpaCampos(){
        txtCod.setText("");
        txtNome.setText("");
        txtEmail.setText("");
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tabelaColaborador;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
