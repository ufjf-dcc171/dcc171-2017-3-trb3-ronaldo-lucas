package principal;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarTarefa extends javax.swing.JFrame {
    private final TarefaDAO daoTarefa;
    private final ProjetoDAO daoProjeto;
    private Boolean fNovo = false;
    
    public CadastrarTarefa(TarefaDAO daoTarefa, ProjetoDAO daoProjeto) {
        this.daoTarefa = daoTarefa; 
        this.daoProjeto = daoProjeto;        
        initComponents();
        
        comboBoxStatus.addItem("Pendente");
        comboBoxStatus.addItem("Iniciado");
        comboBoxStatus.addItem("Finalizado");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxProjetos = new javax.swing.JComboBox<>();
        lblProjetos = new javax.swing.JLabel();
        lblDescricaoTarefa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricao = new javax.swing.JTextArea();
        lblDataInicio = new javax.swing.JLabel();
        lblDataFim = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTarefas = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        comboBoxStatus = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        lblDataInicio1 = new javax.swing.JLabel();
        txtDtFim = new javax.swing.JFormattedTextField();
        txtDtInicio = new javax.swing.JFormattedTextField();
        btnCriaDependencia = new javax.swing.JButton();
        btnAtribuiColaborador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tarefas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        comboBoxProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProjetosActionPerformed(evt);
            }
        });

        lblProjetos.setText("Projetos");

        lblDescricaoTarefa.setText("Descrição da tarefa");

        txtAreaDescricao.setColumns(20);
        txtAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricao);

        lblDataInicio.setText("Data de início");

        lblDataFim.setText("Data de fim");

        tabelaTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID DO PROJETO", "ID DA TAREFA", "DESCRICAO", "DATA INICIO", "DATA FIM", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaTarefas);
        if (tabelaTarefas.getColumnModel().getColumnCount() > 0) {
            tabelaTarefas.getColumnModel().getColumn(0).setHeaderValue("ID DO PROJETO");
            tabelaTarefas.getColumnModel().getColumn(1).setHeaderValue("ID DA TAREFA");
            tabelaTarefas.getColumnModel().getColumn(2).setHeaderValue("DESCRICAO");
            tabelaTarefas.getColumnModel().getColumn(3).setHeaderValue("DATA INICIO");
            tabelaTarefas.getColumnModel().getColumn(4).setHeaderValue("DATA FIM");
            tabelaTarefas.getColumnModel().getColumn(5).setHeaderValue("STATUS");
        }

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

        btnCancelar.setText("Cancelar");

        lblStatus.setText("Status da tarefa");

        comboBoxStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatusActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblDataInicio1.setText("Código");

        try {
            txtDtFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtInicioActionPerformed(evt);
            }
        });

        btnCriaDependencia.setText("Criar Dependencia");
        btnCriaDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriaDependenciaActionPerformed(evt);
            }
        });

        btnAtribuiColaborador.setText("Atribuir Colaborador");
        btnAtribuiColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtribuiColaboradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnCancelar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataInicio1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataInicio)
                                    .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblProjetos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxProjetos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxStatus, 0, 107, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataFim)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDescricaoTarefa)
                                            .addGap(118, 118, 118))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAtribuiColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCriaDependencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDataFim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDataInicio)
                                    .addComponent(lblDataInicio1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProjetos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescricaoTarefa)
                            .addComponent(btnCriaDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnAtribuiColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxStatusActionPerformed

    private void comboBoxProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProjetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxProjetosActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtDtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtInicioActionPerformed

    private void btnCriaDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriaDependenciaActionPerformed
        int linhaSelecionada = tabelaTarefas.getSelectedRow();
        Tarefa t = new Tarefa();
        t.setID_PROJETO(Integer.parseInt(tabelaTarefas.getValueAt(linhaSelecionada, 0).toString()));
        t.setID(Integer.parseInt(tabelaTarefas.getValueAt(linhaSelecionada, 1).toString()));
        t.setDESCRICAO(tabelaTarefas.getValueAt(linhaSelecionada, 2).toString());
        t.setDT_INICIO( (Date) tabelaTarefas.getValueAt(linhaSelecionada, 3));
        t.setDT_FIM( (Date) tabelaTarefas.getValueAt(linhaSelecionada, 4));        
        
        AtribuirDependencia janelaAtribuir = new AtribuirDependencia(t, comboBoxProjetos.getSelectedItem().toString(), daoTarefa);
        janelaAtribuir.getContentPane().setBackground(Color.white);
        janelaAtribuir.setLocationRelativeTo(null);
        janelaAtribuir.setVisible(true);
    }//GEN-LAST:event_btnCriaDependenciaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaTabela();
        PreencheComboBox();
    }//GEN-LAST:event_formWindowActivated

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Integer IDincremento = 1;
        try {
            limpaCampos();
            fNovo = true;
            IDincremento = daoTarefa.retornaID();        
            txtCodigo.setEnabled(false);
            txtCodigo.setText(IDincremento + "");
            txtDtInicio.grabFocus();
            
            btnNovo.setEnabled(false);
            btnExcluir.setEnabled(false);            
        } catch (Exception ex) {
            Logger.getLogger(CadastrarProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {      
            if (daoTarefa.verificaColaboradores(Integer.parseInt(txtCodigo.getText()))){
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date dataInicio = formato.parse(txtDtInicio.getText());
                Date dataFim = formato.parse(txtDtFim.getText());

                if (fNovo == true){
                    Tarefa tarefa = new Tarefa();
                    tarefa.setID(Integer.parseInt(txtCodigo.getText()));
                    tarefa.setDT_INICIO(dataInicio);
                    tarefa.setDT_FIM(dataFim);
                    tarefa.setDESCRICAO(txtAreaDescricao.getText());
                    tarefa.setID_PROJETO(Integer.parseInt(comboBoxProjetos.getSelectedItem().toString()));
                    tarefa.setSTATUS(comboBoxStatus.getSelectedItem().toString());

                    daoTarefa.criar(tarefa);    
                }else{
                    Tarefa tarefa = new Tarefa();
                    tarefa.setID(Integer.parseInt(txtCodigo.getText()));
                    tarefa.setDT_INICIO(dataInicio);
                    tarefa.setDT_FIM(dataFim);
                    tarefa.setDESCRICAO(txtAreaDescricao.getText());
                    tarefa.setID_PROJETO(Integer.parseInt(comboBoxProjetos.getSelectedItem().toString()));
                    tarefa.setSTATUS(comboBoxStatus.getSelectedItem().toString());

                    daoTarefa.alterar(tarefa); 
                }

                JOptionPane.showMessageDialog(null, "Gravação efetuada com sucesso!", "SysProj", JOptionPane.INFORMATION_MESSAGE);
                fNovo = false;
                btnNovo.setEnabled(true);
                btnExcluir.setEnabled(true);
                txtCodigo.setEnabled(true);
                limpaCampos();
                atualizaTabela();    
           }else{
                JOptionPane.showMessageDialog(null, "Para gravação é necessário atribuir pelo menos 1 colaborador!", "SysProj", JOptionPane.INFORMATION_MESSAGE);
           }    
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtribuiColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtribuiColaboradorActionPerformed
       
        AtribuiColaborador janelaAtribuirCola = new AtribuiColaborador(txtCodigo.getText(), daoTarefa);
        janelaAtribuirCola.getContentPane().setBackground(Color.white);
        janelaAtribuirCola.setLocationRelativeTo(null);
        janelaAtribuirCola.setVisible(true);
    }//GEN-LAST:event_btnAtribuiColaboradorActionPerformed

    
    private void atualizaTabela() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaTarefas.getModel();
            //tabelaColaborador.clearSelection();
            model.setNumRows(0);           ///Limpando a tabela
            List<Tarefa> tarefas = daoTarefa.listaTodos();
            for(int i = 0; i < tarefas.size(); i++){
                model.addRow(new Object[]{
                    tarefas.get(i).getID_PROJETO(),
                    tarefas.get(i).getID(),
                    tarefas.get(i).getDESCRICAO(),
                    tarefas.get(i).getDT_INICIO(),
                    tarefas.get(i).getDT_FIM(),
                    tarefas.get(i).getSTATUS()
                    
                });
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    private void PreencheComboBox(){
        try {
            comboBoxProjetos.removeAllItems();
            List<Projeto> projetos = daoProjeto.listaTodos();
            for(int i = 0; i < projetos.size(); i++){
                comboBoxProjetos.addItem(projetos.get(i).getID() + "");
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    
    private void limpaCampos() {
        txtCodigo.setText("");
        txtDtInicio.setText("");
        txtDtFim.setText("");
        txtAreaDescricao.setText("");
        comboBoxStatus.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtribuiColaborador;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriaDependencia;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> comboBoxProjetos;
    private javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataFim;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblDataInicio1;
    private javax.swing.JLabel lblDescricaoTarefa;
    private javax.swing.JLabel lblProjetos;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tabelaTarefas;
    private javax.swing.JTextArea txtAreaDescricao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDtFim;
    private javax.swing.JFormattedTextField txtDtInicio;
    // End of variables declaration//GEN-END:variables

    
}
