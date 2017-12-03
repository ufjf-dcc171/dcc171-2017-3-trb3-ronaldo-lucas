package principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarProjeto extends javax.swing.JFrame {
    private final ProjetoDAO daoProjeto;
    private Boolean fNovo = false;
    
    public CadastrarProjeto(ProjetoDAO daoProjeto) {
        this.daoProjeto = daoProjeto;        
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescricao = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProjetos = new javax.swing.JTable();
        lblDtInicio = new javax.swing.JLabel();
        lblDtTermino = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataFim = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Projetos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblDescricao.setText("Descrição do projeto");

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

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        tabelaProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DESCRICAO", "DATA DE INICIO", "DATA DE FIM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProjetosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaProjetos);
        if (tabelaProjetos.getColumnModel().getColumnCount() > 0) {
            tabelaProjetos.getColumnModel().getColumn(0).setResizable(false);
        }

        lblDtInicio.setText("Data de início");

        lblDtTermino.setText("Data de término");

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código");

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDtInicio)
                                        .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDtTermino)
                                        .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1))
                            .addComponent(lblDescricao)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblDtInicio)
                    .addComponent(lblDtTermino))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Integer IDincremento = 1;
        try {
            limpaCampos();
            fNovo = true;
            IDincremento = daoProjeto.retornaID();        
            txtCod.setEnabled(false);
            txtCod.setText(IDincremento + "");
            txtDataInicio.grabFocus();
            
            btnNovo.setEnabled(false);
            btnExcluir.setEnabled(false);            
        } catch (Exception ex) {
            Logger.getLogger(CadastrarProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataInicio = formato.parse(txtDataInicio.getText());
            Date dataFim = formato.parse(txtDataFim.getText());
            
            if (fNovo == true){
                Projeto projeto = new Projeto();
                projeto.setID(Integer.parseInt(txtCod.getText()));
                projeto.setDESCRICAO(txtDescricao.getText());
                projeto.setDT_INICIO(dataInicio);
                projeto.setDT_FIM(dataFim);
                daoProjeto.criar(projeto);    
            }else{
                Projeto projeto = new Projeto();
                projeto.setID(Integer.parseInt(txtCod.getText()));
                projeto.setDESCRICAO(txtDescricao.getText());
                projeto.setDT_INICIO(dataInicio);
                projeto.setDT_FIM(dataFim);
                daoProjeto.alterar(projeto); 
            }
            
            JOptionPane.showMessageDialog(null, "Gravação efetuada com sucesso!", "Erro", JOptionPane.INFORMATION_MESSAGE);
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (!"".equals(txtCod.getText())) {
                if (fNovo == false){                
                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "", JOptionPane.YES_NO_OPTION);

                    if (resposta == JOptionPane.YES_OPTION) {
                        Projeto projeto = new Projeto();
                        projeto.setID(Integer.parseInt(txtCod.getText()));
                        daoProjeto.excluir(projeto);
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        fNovo = false;
        txtCod.grabFocus();
        txtCod.setEnabled(true); 
        btnNovo.setEnabled(true);
        btnGravar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tabelaProjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProjetosMouseClicked
        if(evt.getClickCount() == 2){
            try {
                if (fNovo == false){
                    if (tabelaProjetos.getSelectedRowCount() == 0) {
                        return;
                    }
                    //DefaultTableModel modelo = (DefaultTableModel) tabelaProjetos.getModel();
                    int linhaSelecionada = tabelaProjetos.getSelectedRow();
                    txtCod.setText(tabelaProjetos.getValueAt(linhaSelecionada, 0).toString());
                    txtDescricao.setText(tabelaProjetos.getValueAt(linhaSelecionada, 1).toString());
                    txtDataInicio.setText(tabelaProjetos.getValueAt(linhaSelecionada, 2).toString());
                    txtDataFim.setText(tabelaProjetos.getValueAt(linhaSelecionada, 3).toString());
                    txtCod.setEnabled(false);    
                }
            } catch (Exception erro) {
                erro.printStackTrace();
            }        
        }
    }//GEN-LAST:event_tabelaProjetosMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaTabela();
        limpaCampos();
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDtInicio;
    private javax.swing.JLabel lblDtTermino;
    private javax.swing.JTable tabelaProjetos;
    private javax.swing.JTextField txtCod;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        txtCod.setText("");
        txtDataFim.setText("");
        txtDataInicio.setText("");
        txtDescricao.setText("");    
    }

    private void atualizaTabela() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaProjetos.getModel();
            //tabelaColaborador.clearSelection();
            model.setNumRows(0);           ///Limpando a tabela
            List<Projeto> projetos = daoProjeto.listaTodos();
            for(int i = 0; i < projetos.size(); i++){
                Date dt1 = projetos.get(i).getDT_INICIO();
                Date dt2 = projetos.get(i).getDT_FIM();
                String dtInicio = new SimpleDateFormat("dd/MM/yyyy").format(dt1);
                String dtFim = new SimpleDateFormat("dd/MM/yyyy").format(dt2);
                
                model.addRow(new Object[]{
                    projetos.get(i).getID(),
                    projetos.get(i).getDESCRICAO(),
                    dtInicio,
                    dtFim
                });
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
}
