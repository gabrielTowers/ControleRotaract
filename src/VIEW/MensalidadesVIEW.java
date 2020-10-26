package VIEW;

import DAO.MensalidadeDAO;
import static VIEW.Principal.jdpPrincipal;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class MensalidadesVIEW extends javax.swing.JInternalFrame {

    public MensalidadesVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpInclusao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMensalidade = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtxPesquisa = new javax.swing.JTextField();
        jbIncluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Mensalidade");
        setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 48)); // NOI18N
        jLabel1.setText("Mensalidades");

        jpInclusao.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtMensalidade.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jtMensalidade.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMensalidade.setRowHeight(25);
        jtMensalidade.setSelectionBackground(new java.awt.Color(255, 32, 189));
        jtMensalidade.setShowVerticalLines(false);
        jtMensalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtMensalidadeMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtMensalidade);

        jLabel2.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jLabel2.setText("Pesquisa por  Mês:");

        jtxPesquisa.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jtxPesquisa.setToolTipText("Digite aqui o Nome");
        jtxPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxPesquisaKeyReleased(evt);
            }
        });

        jbIncluir.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jbAlterar.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbAtualizar.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInclusaoLayout = new javax.swing.GroupLayout(jpInclusao);
        jpInclusao.setLayout(jpInclusaoLayout);
        jpInclusaoLayout.setHorizontalGroup(
            jpInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInclusaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInclusaoLayout.createSequentialGroup()
                        .addGap(0, 440, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jbAtualizar)
                        .addGap(42, 42, 42))))
            .addGroup(jpInclusaoLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jbIncluir)
                .addGap(87, 87, 87)
                .addComponent(jbAlterar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpInclusaoLayout.setVerticalGroup(
            jpInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInclusaoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAtualizar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIncluir)
                    .addComponent(jbAlterar))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jpInclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(647, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jpInclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTÕES E TABELA
    private void jtMensalidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMensalidadeMouseReleased

        jbAlterar.setEnabled(true);

    }//GEN-LAST:event_jtMensalidadeMouseReleased

    private void jtxPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxPesquisaKeyReleased

        jbAlterar.setEnabled(false);
        MensalidadeDAO cDAO = new MensalidadeDAO();
        ResultSet rs = cDAO.pesquisarPorMes(jtxPesquisa.getText());
        carregarDadosNaJTable(rs);

    }//GEN-LAST:event_jtxPesquisaKeyReleased

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed

        IncAltMensalidadeVIEW t2 = new IncAltMensalidadeVIEW();
        t2.obterPkProxMens();
        t2.definirOperacaoInc();
        centralizarMostar(t2);

    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        IncAltMensalidadeVIEW t2 = new IncAltMensalidadeVIEW();

        t2.definirOperacaoAlt();

        int ls = jtMensalidade.getSelectedRow();
        int pk = Integer.parseInt(jtMensalidade.getModel().getValueAt(ls, 0).toString());

        String vl = jtMensalidade.getModel().getValueAt(ls, 2).toString();

        t2.altMensalidade(pk, vl, obterData(pk));

        centralizarMostar(t2);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed

        atualizarJT();

    }//GEN-LAST:event_jbAtualizarActionPerformed

//FUNÇÕES
    //FUNÇÃO PARA MOSTRAR A TELA "IncAltMensalidade" CENTRALIZADA
    public void centralizarMostar(Component jif) {
        jdpPrincipal.add(jif);
        jif.setLocation((jdpPrincipal.getWidth() - jif.getWidth()) / 2, (jdpPrincipal.getHeight() - jif.getHeight()) / 2);
        jif.setVisible(true);
    }

    //FUNÇÃO PARA CARREGAR OS DADOS DA TABELA MENSALIDADE NA jTable
    public void carregarDadosNaJTable(ResultSet rs) {

        try {
            String colunas[] = {"id", "Mês e Ano", "Valor"};
            DefaultTableModel modelo = new DefaultTableModel(null, colunas);
            jtMensalidade.setModel(modelo);
            while (rs.next()) {
                String linha[] = {rs.getString("pkmensalidade"), rs.getString("txnomemes"), rs.getString("vlmensalidade")};
                modelo.addRow(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao Carregar JTable");
            System.out.println(e.getMessage());
        }

        JTableHeader Theader = jtMensalidade.getTableHeader();

        Theader.setBackground(Color.BLACK);
        Theader.setFont(new Font("HP Simplefied", 20, 20));
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

    }

    //FUNÇÃO PARA OBTER DATA PARA O PREENCHIMENTO DOS CAMPOR NA TELA IncAltMensalidade NA OPERAÇÃO ALTERAR
    private String obterData(int pk) {
        MensalidadeDAO mdao = new MensalidadeDAO();
        ResultSet rs = mdao.selecionarDataMensalidade(pk);
        String data = "";
        try {
            while (rs.next()) {
                data = rs.getString("dtmensalidade");
                System.out.println(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    //FUNÇÃO PARA ATUALIZAR A jTable
    public void atualizarJT() {
        MensalidadeDAO aDAO = new MensalidadeDAO();
        ResultSet rs = aDAO.tabelaMensalidades();
        carregarDadosNaJTable(rs);
        jbAlterar.setEnabled(false);

        jtxPesquisa.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JPanel jpInclusao;
    private javax.swing.JTable jtMensalidade;
    private javax.swing.JTextField jtxPesquisa;
    // End of variables declaration//GEN-END:variables
}
