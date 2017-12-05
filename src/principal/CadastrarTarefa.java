package principal;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
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
        
        lblDiferencadeDias.setVisible(false);
        pgbProgresso.setMinimum(0);
        pgbProgresso.setMaximum(100);
        pgbProgresso.setValue(0);
        pgbProgresso.setVisible(false);
        
        comboBoxStatus.addItem("Pendente");
        comboBoxStatus.addItem("Iniciado");
        comboBoxStatus.addItem("Finalizada");
        
        tabelaTarefas.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaTarefas.getColumnModel().getColumn(1).setPreferredWidth(40); 
        tabelaTarefas.getColumnModel().getColumn(2).setPreferredWidth(250);
        tabelaTarefas.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabelaTarefas.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabelaTarefas.getColumnModel().getColumn(3).setPreferredWidth(80);
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
        lblDiferencadeDias = new javax.swing.JLabel();
        pgbProgresso = new javax.swing.JProgressBar();

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
                "ID", "ID PROJ", "DESCR", "DT INICIO", "DT FIM", "STATUS"
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
        tabelaTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTarefasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaTarefas);

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

        lblStatus.setText("Status da tarefa");

        comboBoxStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        btnCriaDependencia.setText("Criar Dependencia");
        btnCriaDependencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCriaDependencia.setEnabled(false);
        btnCriaDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriaDependenciaActionPerformed(evt);
            }
        });

        btnAtribuiColaborador.setText("Atribuir Colaborador");
        btnAtribuiColaborador.setEnabled(false);
        btnAtribuiColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtribuiColaboradorActionPerformed(evt);
            }
        });

        lblDiferencadeDias.setText("100%");

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblProjetos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataInicio1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataInicio)
                                    .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataFim)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDescricaoTarefa)
                                            .addGap(118, 118, 118))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCriaDependencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAtribuiColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pgbProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDiferencadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataInicio)
                            .addComponent(lblDataInicio1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescricaoTarefa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pgbProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProjetos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDiferencadeDias, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDataFim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCriaDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(btnAtribuiColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
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

    private void comboBoxProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProjetosActionPerformed
        atualizaTabelaProjeto();
    }//GEN-LAST:event_comboBoxProjetosActionPerformed

    private void btnCriaDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriaDependenciaActionPerformed
        try {
            if (fNovo == false){            
                List<Tarefa> tarefas = daoTarefa.listaUnico(txtCodigo.getText());
                
                Tarefa t = new Tarefa();
                t.setID(tarefas.get(0).getID());
                t.setID_PROJETO(tarefas.get(0).getID_PROJETO());                
                t.setDESCRICAO(tarefas.get(0).getDESCRICAO());
                t.setDT_INICIO(tarefas.get(0).getDT_INICIO());
                t.setDT_FIM( tarefas.get(0).getDT_FIM()); 

                comboBoxStatus.setSelectedItem(tarefas.get(0).getSTATUS());
                txtCodigo.setEnabled(false);    
                comboBoxProjetos.setEnabled(false);
                btnCriaDependencia.setEnabled(true);
                btnAtribuiColaborador.setEnabled(true);

                //Abre tela
                AtribuirDependencia janelaAtribuir = new AtribuirDependencia(t, comboBoxProjetos.getSelectedItem().toString(), daoTarefa);
                janelaAtribuir.getContentPane().setBackground(Color.white);
                janelaAtribuir.setLocationRelativeTo(null);
                janelaAtribuir.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastrarTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            btnCriaDependencia.setEnabled(false);
            btnAtribuiColaborador.setEnabled(false);
            comboBoxProjetos.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {
            if (VerificaDataProjeto()){
                String dtInicio = txtDtInicio.getText();
                String dtFim = txtDtFim.getText();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");


                if (fNovo == true){
                    Tarefa tarefa = new Tarefa();
                    tarefa.setID(Integer.parseInt(txtCodigo.getText()));
                    tarefa.setDT_INICIO(format.parse(dtInicio));
                    tarefa.setDT_FIM(format.parse(dtFim));
                    tarefa.setDESCRICAO(txtAreaDescricao.getText());
                    tarefa.setID_PROJETO(Integer.parseInt(comboBoxProjetos.getSelectedItem().toString()));
                    tarefa.setSTATUS(comboBoxStatus.getSelectedItem().toString());

                    daoTarefa.criar(tarefa);    
                }else{
                    Tarefa tarefa = new Tarefa();
                    tarefa.setID(Integer.parseInt(txtCodigo.getText()));
                    tarefa.setDT_INICIO(format.parse(dtInicio));
                    tarefa.setDT_FIM(format.parse(dtFim));
                    tarefa.setDESCRICAO(txtAreaDescricao.getText());
                    tarefa.setID_PROJETO(Integer.parseInt(comboBoxProjetos.getSelectedItem().toString()));
                    tarefa.setSTATUS(comboBoxStatus.getSelectedItem().toString());
                   
                    daoTarefa.alterar(tarefa);
                    if(tarefa.getSTATUS().equals("Finalizada")){
                        daoTarefa.excluirListaDependentes(tarefa);
                    }
                }

                JOptionPane.showMessageDialog(null, "Gravação efetuada com sucesso!", "SysProj", JOptionPane.INFORMATION_MESSAGE);
                fNovo = false;
                btnNovo.setEnabled(true);
                btnExcluir.setEnabled(true);
                txtCodigo.setEnabled(true);
                comboBoxProjetos.setEnabled(true);
                lblDiferencadeDias.setVisible(false);
                pgbProgresso.setValue(0);
                pgbProgresso.setVisible(false);
                limpaCampos();
                atualizaTabela();    
            }else{
                JOptionPane.showMessageDialog(null, "Data de inicio menor que do projeto, ou final maior que do projeto!", "SysProj", JOptionPane.INFORMATION_MESSAGE);
            }
             
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtribuiColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtribuiColaboradorActionPerformed
        if (txtCodigo.getText() != ""){
            AtribuiColaborador janelaAtribuirCola = new AtribuiColaborador(txtCodigo.getText(), daoTarefa);
            janelaAtribuirCola.getContentPane().setBackground(Color.white);
            janelaAtribuirCola.setLocationRelativeTo(null);
            janelaAtribuirCola.setVisible(true);    
        }else{
            JOptionPane.showMessageDialog(null, "Você deve selecionar uma tarefa para atribuir um colaborador!", "SysProj", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btnAtribuiColaboradorActionPerformed

    private void tabelaTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTarefasMouseClicked
        try {
            if(evt.getClickCount() == 2){
                if (fNovo == false){
                    if (tabelaTarefas.getSelectedRowCount() == 0) {
                        return;
                    }
                    int linhaSelecionada = tabelaTarefas.getSelectedRow();
                    List<Tarefa> tarefas = daoTarefa.listaUnico(tabelaTarefas.getValueAt(linhaSelecionada, 0).toString());
                    
                    Date dt1 = tarefas.get(0).getDT_INICIO();
                    Date dt2 = tarefas.get(0).getDT_FIM();
                    String dtInicio = new SimpleDateFormat("dd/MM/yyyy").format(dt1);
                    String dtFim = new SimpleDateFormat("dd/MM/yyyy").format(dt2);
                    
                    txtCodigo.setText(tarefas.get(0).getID() + "");
                    comboBoxProjetos.setSelectedItem(tarefas.get(0).getID_PROJETO());
                    txtAreaDescricao.setText(tarefas.get(0).getDESCRICAO());
                    txtDtInicio.setText(dtInicio);
                    txtDtFim.setText(dtFim);
                    comboBoxStatus.setSelectedItem(tarefas.get(0).getSTATUS());
                    txtCodigo.setEnabled(false);    
                    comboBoxProjetos.setEnabled(false);
                    btnCriaDependencia.setEnabled(true);
                    btnAtribuiColaborador.setEnabled(true);
                    CalculaDifDias();
                }
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_tabelaTarefasMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (!"".equals(txtCodigo.getText())) {
                if (fNovo == false){                
                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "", JOptionPane.YES_NO_OPTION);

                    if (resposta == JOptionPane.YES_OPTION) {
                        Tarefa t = new Tarefa();
                        t.setID(Integer.parseInt(txtCodigo.getText()));
                        daoTarefa.excluir(t);
                        JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!", "SysProj", JOptionPane.INFORMATION_MESSAGE);

                        btnNovo.setEnabled(true);
                        btnExcluir.setEnabled(true);
                        txtCodigo.setEnabled(true);
                        limpaCampos();
                        atualizaTabela();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma tarefa!!!", "Erro", JOptionPane.ERROR_MESSAGE);
                }    
            }                        
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        txtCodigo.setEnabled(true);
        pgbProgresso.setVisible(false);
        lblDiferencadeDias.setVisible(false);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnCriaDependencia.setEnabled(false);
        btnAtribuiColaborador.setEnabled(false);
        comboBoxStatus.setSelectedIndex(0);
        comboBoxProjetos.setEnabled(true);
        comboBoxProjetos.setSelectedIndex(0);
        fNovo = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    private void atualizaTabela() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaTarefas.getModel();
            //tabelaColaborador.clearSelection();
            model.setNumRows(0);           ///Limpando a tabela
            List<Tarefa> tarefas = daoTarefa.listaTodos();
            for(int i = 0; i < tarefas.size(); i++){
                Date dt1 = tarefas.get(i).getDT_INICIO();
                Date dt2 = tarefas.get(i).getDT_FIM();
                String dtInicio = new SimpleDateFormat("dd/MM/yyyy").format(dt1);
                String dtFim = new SimpleDateFormat("dd/MM/yyyy").format(dt2);
            
                model.addRow(new Object[]{
                    tarefas.get(i).getID(),
                    tarefas.get(i).getID_PROJETO(),                    
                    tarefas.get(i).getDESCRICAO(),
                    dtInicio,
                    dtFim,
                    tarefas.get(i).getSTATUS()
                    
                });
            }
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    private void atualizaTabelaProjeto() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaTarefas.getModel();
            //tabelaColaborador.clearSelection();
            model.setNumRows(0);           ///Limpando a tabela
            List<Tarefa> tarefas = daoTarefa.listaTodosProjeto((String) comboBoxProjetos.getSelectedItem());
            for(int i = 0; i < tarefas.size(); i++){
                Date dt1 = tarefas.get(i).getDT_INICIO();
                Date dt2 = tarefas.get(i).getDT_FIM();
                String dtInicio = new SimpleDateFormat("dd/MM/yyyy").format(dt1);
                String dtFim = new SimpleDateFormat("dd/MM/yyyy").format(dt2);
            
                model.addRow(new Object[]{
                    tarefas.get(i).getID(),
                    tarefas.get(i).getID_PROJETO(),                    
                    tarefas.get(i).getDESCRICAO(),
                    dtInicio,
                    dtFim,
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
    
    private void CalculaDifDias(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dtAtual = Calendar.getInstance();
        Calendar dtFim = Calendar.getInstance();
        Calendar dtInicio = Calendar.getInstance();
        Integer  x = 0;
        
        try {
            dtInicio.setTime(sdf.parse(txtDtInicio.getText()));
            dtAtual.setTime(new Date());
            dtFim.setTime(sdf.parse(txtDtFim.getText()));
        } catch (java.text.ParseException e ) 
        {}
        int diasTotal = dtFim.get(Calendar.DAY_OF_MONTH) - dtInicio.get(Calendar.DAY_OF_MONTH);
        int diasTermino = dtFim.get(Calendar.DAY_OF_MONTH) - dtAtual.get(Calendar.DAY_OF_MONTH);        
        
        x = 100 - (diasTermino * 100) / diasTotal;
        lblDiferencadeDias.setText(x +"%");
        pgbProgresso.setValue(x);
        
        if ((dtInicio.after(dtAtual) || dtInicio.equals(dtAtual))&&((dtFim.after(dtAtual))||dtFim.equals(dtAtual)) 
           && (comboBoxStatus.getSelectedItem() == "Iniciado")){
            pgbProgresso.setVisible(true);    
            lblDiferencadeDias.setVisible(true);
        }else{
            pgbProgresso.setVisible(false);    
            lblDiferencadeDias.setVisible(false);
        }
        
    }
    
    private Boolean VerificaDataProjeto() throws Exception{
        Boolean retorno = true;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = null;
        Date dt2 = null;
        List<Projeto> p = daoProjeto.listaTodos();
        for(int i = 0; i < p.size(); i++){
            if(p.get(i).getID() == Integer.parseInt(comboBoxProjetos.getSelectedItem().toString())){
                Projeto proj = new Projeto();
                proj.setDT_INICIO(p.get(i).getDT_INICIO());
                proj.setDT_FIM(p.get(i).getDT_FIM());
                
                dt1 = p.get(i).getDT_INICIO();
                dt2 = p.get(i).getDT_FIM();
            }
        }
        
        Calendar dtInicioTar = Calendar.getInstance();
        Calendar dtFimTar = Calendar.getInstance();        
        Calendar dtInicioProj = Calendar.getInstance();
        Calendar dtFimproj = Calendar.getInstance();
        
        String dtInicio = new SimpleDateFormat("dd/MM/yyyy").format(dt1);
        String dtFim = new SimpleDateFormat("dd/MM/yyyy").format(dt2);
                
        dtInicioTar.setTime(sdf.parse(txtDtInicio.getText()));
        dtFimTar.setTime(sdf.parse(txtDtFim.getText()));        
        dtInicioProj.setTime(sdf.parse(dtInicio));
        dtFimproj.setTime(sdf.parse(dtFim));
            
        if(dtInicioTar.before(dtInicioProj)){
            retorno = false;
        }
        if (dtFimTar.after(dtFimproj)){
            retorno = false;
        }
        return retorno;
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
    private javax.swing.JLabel lblDiferencadeDias;
    private javax.swing.JLabel lblProjetos;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JProgressBar pgbProgresso;
    private javax.swing.JTable tabelaTarefas;
    private javax.swing.JTextArea txtAreaDescricao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDtFim;
    private javax.swing.JFormattedTextField txtDtInicio;
    // End of variables declaration//GEN-END:variables

    
}
