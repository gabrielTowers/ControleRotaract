package VIEW;

import DAO.CargoDAO;
import static VIEW.Principal.jdpPrincipal;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class CargosVIEW extends javax.swing.JInternalFrame {

    public CargosVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCargo = new javax.swing.JTable();
        jbAtualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cargos");

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        jLabel1.setText("Cargos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbExcluir.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbIncluir.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jtCargo.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jtCargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCargo.setSelectionBackground(new java.awt.Color(255, 32, 189));
        jtCargo.setSurrendersFocusOnKeystroke(true);
        jtCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtCargoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtCargo);

        jbAtualizar.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbAtualizar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jbIncluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbExcluir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIncluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTÕES E TABELA
    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed

        IncAltCargoVIEW t2 = new IncAltCargoVIEW();
        t2.obterPkProxCargo();
        t2.definirOperacaoInc();
        centralizarMostar(t2);

    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jtCargoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCargoMouseReleased

        jbAlterar.setEnabled(true);
        jbExcluir.setEnabled(true);

    }//GEN-LAST:event_jtCargoMouseReleased

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed

        IncAltCargoVIEW t2 = new IncAltCargoVIEW();

        t2.definirOperacaoAlt();

        int ls = jtCargo.getSelectedRow();
        int pk = Integer.parseInt(jtCargo.getModel().getValueAt(ls, 0).toString());
        String nome = jtCargo.getModel().getValueAt(ls, 1).toString();

        t2.altCargo(pk, nome);

        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);

        centralizarMostar(t2);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        int ls = jtCargo.getSelectedRow();
        int pk = Integer.parseInt(jtCargo.getModel().getValueAt(ls, 0).toString());

        CargoDAO cDAO = new CargoDAO();
        cDAO.excluirCargo(pk);
        atualizarJT();

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        atualizarJT();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    //FUNÇÕES
    //FUNÇÃO PARA ATUALIZAR A jTable
    public void atualizarJT() {
        CargoDAO aDAO = new CargoDAO();
        ResultSet rs = aDAO.tabelaCargos();
        carregarDadosNaJTable(rs);
        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }

    //FUNÇÃO PARA MOSTRAR A TELA "IncAltCargo" CENTRALIZADA
    public void centralizarMostar(Component jif) {
        jdpPrincipal.add(jif);
        jif.setLocation((jdpPrincipal.getWidth() - jif.getWidth()) / 2, (jdpPrincipal.getHeight() - jif.getHeight()) / 2);

        jif.setVisible(true);
    }

    //FUNÇÃO PARA CARREGAR OS DADO NA jTable
    public void carregarDadosNaJTable(ResultSet rs) {

        try {
            String colunas[] = {"id", "Nome"};
            DefaultTableModel modelo = new DefaultTableModel(null, colunas);
            jtCargo.setModel(modelo);
            while (rs.next()) {
                String linha[] = {rs.getString("pkcargo"), rs.getString("txcargo")};
                modelo.addRow(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao Carregar JTable");
            System.out.println(e.getMessage());
        }

        JTableHeader Theader = jtCargo.getTableHeader();

        Theader.setBackground(Color.BLACK);
        Theader.setFont(new Font("HP Simplefied", 20, 20));
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JTable jtCargo;
    // End of variables declaration//GEN-END:variables
}
