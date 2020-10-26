package VIEW;

import DAO.AssociadoDAO;
import DAO.MensalidadeDAO;
import static VIEW.Principal.jdpPrincipal;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class AssociadosVIEW extends javax.swing.JInternalFrame {

    public AssociadosVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInclusao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAssociado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtxPesquisa = new javax.swing.JTextField();
        jbAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbIncluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Associados");

        jpInclusao.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtAssociado.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jtAssociado.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAssociado.setRowHeight(25);
        jtAssociado.setSelectionBackground(new java.awt.Color(255, 32, 189));
        jtAssociado.setShowVerticalLines(false);
        jtAssociado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtAssociadoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtAssociado);

        jLabel2.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jLabel2.setText("Pesquisa por Nome:");

        jtxPesquisa.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jtxPesquisa.setToolTipText("Digite aqui o Nome");
        jtxPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxPesquisaKeyReleased(evt);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInclusaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbAtualizar)
                .addGap(42, 42, 42))
        );
        jpInclusaoLayout.setVerticalGroup(
            jpInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInclusaoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAtualizar))
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 48)); // NOI18N
        jLabel1.setText("Associados");

        jbExcluir.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
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

        jbIncluir.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jbIncluir)
                .addGap(87, 87, 87)
                .addComponent(jbAlterar)
                .addGap(93, 93, 93)
                .addComponent(jbExcluir)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(333, 333, 333))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jpInclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 597, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbIncluir)
                        .addComponent(jbAlterar))
                    .addComponent(jbExcluir))
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jpInclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //VARIAVEIS GLOBAIS 
    int pkass = 0;
    int pkmens = 0;
    SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

    //BOTÕES E TABELA
    private void jtAssociadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAssociadoMouseReleased

        jbAlterar.setEnabled(true);
        jbExcluir.setEnabled(true);

    }//GEN-LAST:event_jtAssociadoMouseReleased

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed

        IncAltAssociadoVIEW t2 = new IncAltAssociadoVIEW();

        centralizarMostar(t2);
        t2.attCargos();
        t2.obterPkProxAssociado();
        t2.definirOperacaoInc();


    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        int ls = jtAssociado.getSelectedRow();
        int pk = Integer.parseInt(jtAssociado.getModel().getValueAt(ls, 0).toString());

        boolean v = verificarAssociado();

        if (v) {
            System.out.println(pkmens);
            JOptionPane.showMessageDialog(null, "NÃO foi possivel excluir, 'ASSOCIADO' ainda tem 'MENSALIDADES' não pagas,", "ATENÇÂO", 0);
        } else {
            System.out.println(pkmens);
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir esse Associado?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                AssociadoDAO aDAO = new AssociadoDAO();
                aDAO.excluirAssociado(pk);
                atualizarJT();
            }
        }

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed

        atualizarJT();

    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jtxPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxPesquisaKeyReleased

        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);
        AssociadoDAO cDAO = new AssociadoDAO();
        ResultSet rs = cDAO.pesquisarPorNome(jtxPesquisa.getText());
        carregarDadosNaJTable(rs);

    }//GEN-LAST:event_jtxPesquisaKeyReleased

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        IncAltAssociadoVIEW t2 = new IncAltAssociadoVIEW();

        t2.definirOperacaoAlt();

        int ls = jtAssociado.getSelectedRow();
        int pk = Integer.parseInt(jtAssociado.getModel().getValueAt(ls, 0).toString());
        String nome = jtAssociado.getModel().getValueAt(ls, 1).toString();
        String cargo = jtAssociado.getModel().getValueAt(ls, 2).toString();
        t2.attCargos();

        String data = obterData(pk);

        t2.altAssociado(pk, nome, cargo, data);

        centralizarMostar(t2);

    }//GEN-LAST:event_jbAlterarActionPerformed

//FUNÇÕES
    //FUNÇÃO PARA MOSTRAR A TELA "IncAltAssociados" CENTRALIZADA
    public void centralizarMostar(Component jif) {
        jdpPrincipal.add(jif);
        jif.setLocation((jdpPrincipal.getWidth() - jif.getWidth()) / 2, (jdpPrincipal.getHeight() - jif.getHeight()) / 2);

        jif.setVisible(true);
    }

    //FUNÇÃO PARA CARREGAR OS DADOS DA TABELA ASSOCIADOS NO jTable
    public void carregarDadosNaJTable(ResultSet rs) {

        try {
            String colunas[] = {"id", "Nome", "Cargo"};
            DefaultTableModel modelo = new DefaultTableModel(null, colunas);
            jtAssociado.setModel(modelo);
            while (rs.next()) {
                String linha[] = {rs.getString("pkassociado"), rs.getString("txnomeassociado"), rs.getString("txcargo")};
                modelo.addRow(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao Carregar JTable");
            System.out.println(e.getMessage());
        }

        JTableHeader Theader = jtAssociado.getTableHeader();

        Theader.setBackground(Color.BLACK);
        Theader.setFont(new Font("HP Simplefied", 20, 20));
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }

    //FUNÇÃO PARA ATUALIZAR a jTable
    public void atualizarJT() {
        AssociadoDAO aDAO = new AssociadoDAO();
        ResultSet rs = aDAO.tabelaAssociados();
        carregarDadosNaJTable(rs);
        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtxPesquisa.setText("");
    }

    //FUNÇÃO PARA OBTER A DATA PARA O PARA O PREENCHIMENTO DO CAMPO NA TELA "IncAltAssociado" NA OPERAÇÃO ALTERAÇÃO
    private String obterData(int pk) {
        AssociadoDAO adao = new AssociadoDAO();
        ResultSet rs = adao.selecionarDataAssociado(pk);
        String data = "";

        try {
            while (rs.next()) {
                data = rs.getString("dtentradaassociado");
                System.out.println(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    //FUNÇÃO PARA VERIFICAR SE O ASSOCIADO AINDA TEM MENSALIDADE NÃO PAGAS PARA A EXCLUSÃO
    private boolean verificarAssociado() {

        Date dataD = retornaData();

        MensalidadeDAO mdao = new MensalidadeDAO();
        ResultSet rs = mdao.selecionarMensalidadesNaoPagas(pkass, dataD);

        try {
            while (rs.next()) {
                pkmens = rs.getInt("pkmensalidade");
                System.out.println(pkmens);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(pkmens);

        if (pkmens == 0) {
            return false;
        } else {
            return true;
        }

    }

    //FUNÇÃO QUE RETORNA A DATA DA TABELA PARA A FUNÇÃO "verificarAssociado()"
    private Date retornaData() {
        //arrumando a data para colocar no banco  

        int ls = jtAssociado.getSelectedRow();
        pkass = Integer.parseInt(jtAssociado.getModel().getValueAt(ls, 0).toString());

        Date dataD = null;
        String dataS = obterData(pkass);

        try {
            dataD = (Date) form.parse(dataS);
        } catch (ParseException ex) {
            Logger.getLogger(IncAltMensalidadeVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.sql.Date dataDSql = new java.sql.Date(dataD.getTime());
        return dataDSql;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JPanel jpInclusao;
    private javax.swing.JTable jtAssociado;
    private javax.swing.JTextField jtxPesquisa;
    // End of variables declaration//GEN-END:variables

}
