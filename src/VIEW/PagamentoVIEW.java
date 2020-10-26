package VIEW;

import DAO.AssociadoDAO;
import DAO.MensalidadeDAO;
import DAO.PagamentoDAO;
import static VIEW.Principal.jdpPrincipal;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class PagamentoVIEW extends javax.swing.JInternalFrame {

    public PagamentoVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcAssociados = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMensalidadeDev = new javax.swing.JTable();
        jbRelatorio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Pagamento/Relatório");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jcAssociados.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jcAssociados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcAssociados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcAssociadosItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jLabel1.setText("Selecione a Mensalidade a ser paga: ");

        jLabel2.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jLabel2.setText("Selecione o nome do associado: ");

        jbConfirmar.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbConfirmar.setText("Confirmar Pagamento");
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jtMensalidadeDev.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jtMensalidadeDev.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMensalidadeDev.setRowHeight(25);
        jtMensalidadeDev.setSelectionBackground(new java.awt.Color(255, 32, 189));
        jtMensalidadeDev.setShowVerticalLines(false);
        jtMensalidadeDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtMensalidadeDevMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtMensalidadeDev);

        jbRelatorio.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbRelatorio.setText("Gerar Relatório");
        jbRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jcAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jbConfirmar)
                .addGap(115, 115, 115)
                .addComponent(jbRelatorio)
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel2)
                    .addContainerGap(617, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jcAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirmar)
                    .addComponent(jbRelatorio))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel2)
                    .addContainerGap(514, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        jLabel3.setText("Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(374, 374, 374))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //VARIAVEIS GLOBAIS
    int pkassociado = 0;
    Date dtassociado;
    int pkmensalidade = 0;
    int pkpagamento = 0;
    
    //BOTÕES E TABELA
    private void jcAssociadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcAssociadosItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            restornaAssociado();
            attTabela();

            jbConfirmar.setEnabled(false);

        }

    }//GEN-LAST:event_jcAssociadosItemStateChanged

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que quer Confirmar o Pagamento?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            efetuarPagamento();
        }

    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jtMensalidadeDevMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMensalidadeDevMouseReleased

        jbConfirmar.setEnabled(true);
        
    }//GEN-LAST:event_jtMensalidadeDevMouseReleased

    private void jbRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioActionPerformed

        gerarRelatorio();

    }//GEN-LAST:event_jbRelatorioActionPerformed

//FUNÇÕES
    //FUNÇÃO PARA MOSTRAR A TELA "RelatóriaVIEWQ" CENTRALIZADA
    public void centralizarMostar(Component jif) {
        jdpPrincipal.add(jif);
        jif.setLocation((jdpPrincipal.getWidth() - jif.getWidth()) / 2, (jdpPrincipal.getHeight() - jif.getHeight()) / 2);
        jif.setVisible(true);
    }
    
    //FUNÇÃO PARA RETORNAR O 
    private void restornaAssociado() {

        AssociadoDAO adao = new AssociadoDAO();
        ResultSet rs = adao.pesquisaAssociadoPag(jcAssociados.getSelectedItem().toString());

        try {
            while (rs.next()) {
                pkassociado = rs.getInt("pkassociado");
                dtassociado = rs.getDate("dtentradaassociado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //FUNÇÃO PARA ATUALIZAR A TABELA
    private void attTabela() {

        MensalidadeDAO mdao = new MensalidadeDAO();
        ResultSet rs = mdao.selecionarMensalidadesNaoPagas(pkassociado, dtassociado);

        try {
            String colunas[] = {"id", "Mês e Ano", "Valor"};
            DefaultTableModel modelo = new DefaultTableModel(null, colunas);
            jtMensalidadeDev.setModel(modelo);
            while (rs.next()) {
                String linha[] = {rs.getString("pkmensalidade"), rs.getString("txnomemes"), rs.getString("vlmensalidade")};
                modelo.addRow(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao Carregar JTable");
            System.out.println(e.getMessage());
        }

        JTableHeader Theader = jtMensalidadeDev.getTableHeader();

        Theader.setBackground(Color.BLACK);
        Theader.setFont(new Font("HP Simplefied", 20, 20));
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

    }

    //FUNÇÃO PARA ATULAIZAR A LISTA DE ASSOCIADOS
    public void atualizaAssociado() {
        AssociadoDAO aDAO = new AssociadoDAO();
        ResultSet rb = aDAO.tabelaAssociados();

        try {
            jcAssociados.removeAllItems();
            while (rb.next()) {
                jcAssociados.addItem(rb.getString("txnomeassociado"));
            }
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
        }
    }
    
    //FUNÇÃO QUE RETORNA A PK DA MENSALIDADE SELECIONADA NA TABELA
    private void retornaPkMensalidade() {
        int ls = jtMensalidadeDev.getSelectedRow();
        pkmensalidade = Integer.parseInt(jtMensalidadeDev.getModel().getValueAt(ls, 0).toString());

    }

    //FUNÇÃO PARA OBTER A PK DO PRÓXIMO ASSOCIADO PARA INCLUIR NO BANCO
    public void obterPkProxPagamento() {
        PagamentoDAO pkdao = new PagamentoDAO();
        ResultSet rg = pkdao.obterUltimoPagamento();

        try {
            while (rg.next()) {
                pkpagamento = rg.getInt("pkmensalidadeassociado");

                if (pkpagamento == 0) {
                    pkpagamento = 1;
                    System.out.println(pkpagamento);
                } else {
                    pkpagamento++;
                    System.out.println(pkpagamento);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //FUNÇÃO PARA EFETUAR O PAGAMENTO 
    private void efetuarPagamento() {
        obterPkProxPagamento();
        retornaPkMensalidade();

        PagamentoDAO pdao = new PagamentoDAO();
        pdao.incluirPagamento(pkpagamento, pkassociado, pkmensalidade);

        attTabela();
    }
    
    //FUNÇÃO PARA GERAR O RELATÓRIO
    private void gerarRelatorio() {

        String mes = "";
        float vl = 0;
        MensalidadeDAO mdao = new MensalidadeDAO();
        ResultSet rs = mdao.selecionarMensalidadesNaoPagas(pkassociado, dtassociado);

        try {
            while (rs.next()) {
                mes = mes + rs.getString("txnomemes") + ", ";
                vl = vl + rs.getFloat("vlmensalidade");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        String rtx = " *Está é uma mensagem gerada automaticamente* "
                + "Bom Dia/Tarde/Noite companheiro(a) " + jcAssociados.getSelectedItem().toString()
                + ", venho por meio deste Zap, te informar os mês(es) e o valor da(s) mensalidade(s) que você está devendo, o(s) mês(es) de: " + mes
                + "contabilizando o valor de: R$ " + vl;

        RelatorioVIEW t1 = new RelatorioVIEW();
        t1.recebeRelatorio(rtx);
        centralizarMostar(t1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbRelatorio;
    private javax.swing.JComboBox<String> jcAssociados;
    private javax.swing.JTable jtMensalidadeDev;
    // End of variables declaration//GEN-END:variables

}
