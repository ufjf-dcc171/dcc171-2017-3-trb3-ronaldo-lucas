
package principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ConsultaTarefas extends javax.swing.JFrame {
    private final TarefaDAO daoTarefa;
    public ConsultaTarefas(TarefaDAO dao) {
        this.daoTarefa = dao;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rdTodas = new javax.swing.JRadioButton();
        rdConcluidas = new javax.swing.JRadioButton();
        rdAFazer = new javax.swing.JRadioButton();
        rdIniciar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rdTodas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdTodas);
        rdTodas.setSelected(true);
        rdTodas.setText("Todas");

        rdConcluidas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdConcluidas);
        rdConcluidas.setText("Concluídas");

        rdAFazer.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdAFazer);
        rdAFazer.setText("A Fazer");

        rdIniciar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdIniciar);
        rdIniciar.setText("Possiveis de iniciar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Consulta tarefas");

        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Projeto", "Descricao", "DtInicio", "DtFim", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaConsulta);

        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdTodas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdConcluidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdAFazer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdIniciar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdTodas)
                    .addComponent(rdConcluidas)
                    .addComponent(rdAFazer)
                    .addComponent(rdIniciar))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(rdTodas.isSelected()){
            atualizaTabela();
        }
    }//GEN-LAST:event_formWindowActivated

    private void atualizaTabela() {
        try {
            DefaultTableModel model =(DefaultTableModel) tabelaConsulta.getModel();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdAFazer;
    private javax.swing.JRadioButton rdConcluidas;
    private javax.swing.JRadioButton rdIniciar;
    private javax.swing.JRadioButton rdTodas;
    private javax.swing.JTable tabelaConsulta;
    // End of variables declaration//GEN-END:variables
}
