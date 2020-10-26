package VIEW;

import DAO.AssociadoDAO;
import DAO.CargoDAO;
import DAO.MensalidadeDAO;
//import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.ResultSet;
//import javax.swing.UIManager;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiAssociado = new javax.swing.JMenuItem();
        jmiMensalidade = new javax.swing.JMenuItem();
        jmiCargo = new javax.swing.JMenuItem();
        jmEfetuar = new javax.swing.JMenu();
        jmiPagamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROTARACT");
        setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jdpPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMAGES/rotaract-logo.png"))); // NOI18N

        jdpPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");
        jmCadastro.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jmiAssociado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiAssociado.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jmiAssociado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMAGES/do-utilizador.png"))); // NOI18N
        jmiAssociado.setText("Associado");
        jmiAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAssociadoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiAssociado);

        jmiMensalidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmiMensalidade.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jmiMensalidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMAGES/dinheiro.png"))); // NOI18N
        jmiMensalidade.setText("Mensalidade");
        jmiMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMensalidadeActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiMensalidade);

        jmiCargo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmiCargo.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jmiCargo.setText("Cargo");
        jmiCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCargoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCargo);

        jMenuBar1.add(jmCadastro);

        jmEfetuar.setText("Efetuar");
        jmEfetuar.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jmiPagamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmiPagamento.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jmiPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMAGES/economizar.png"))); // NOI18N
        jmiPagamento.setText("Pagamento/Relatório");
        jmiPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPagamentoActionPerformed(evt);
            }
        });
        jmEfetuar.add(jmiPagamento);

        jMenuBar1.add(jmEfetuar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //MENUS E ITENS DE MENU
    private void jmiAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAssociadoActionPerformed

        AssociadosVIEW t1 = new AssociadosVIEW();
        centralizarMostrar(t1);
        AssociadoDAO aDAO = new AssociadoDAO();
        ResultSet rs = aDAO.tabelaAssociados();
        t1.carregarDadosNaJTable(rs);

    }//GEN-LAST:event_jmiAssociadoActionPerformed

    private void jmiPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPagamentoActionPerformed

        PagamentoVIEW t3 = new PagamentoVIEW();
        centralizarMostrar(t3);
        t3.atualizaAssociado();

    }//GEN-LAST:event_jmiPagamentoActionPerformed

    private void jmiMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMensalidadeActionPerformed

        MensalidadesVIEW t2 = new MensalidadesVIEW();
        centralizarMostrar(t2);
        MensalidadeDAO mDAO = new MensalidadeDAO();
        ResultSet rs = mDAO.tabelaMensalidades();
        t2.carregarDadosNaJTable(rs);

    }//GEN-LAST:event_jmiMensalidadeActionPerformed

    private void jmiCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCargoActionPerformed

        CargosVIEW t4 = new CargosVIEW();
        centralizarMostrar(t4);
        CargoDAO cDAO = new CargoDAO();
        ResultSet rs = cDAO.tabelaCargos();
        t4.carregarDadosNaJTable(rs);

    }//GEN-LAST:event_jmiCargoActionPerformed

//FUNÇÕES
    //FUNÇÃO QUE CENTRALIZA A JANELA CRIADA
    public void centralizarMostrar(Component jif) {
        jdpPrincipal.add(jif);
        //modifyColors();
        jif.setLocation((jdpPrincipal.getWidth() - jif.getWidth()) / 2, (jdpPrincipal.getHeight() - jif.getHeight()) / 2);
        jif.setVisible(true);
    }

    /* ESSA FUNÇÃO SERIA PARA MUDAR A COR DA JANELA MAS NÃO CONSEGUI
    protected void modifyColors() {
        try {
            String name = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("InternalFrame.activeTitleBackground", Color.PINK);
            UIManager.put("InternalFrame.activeTitleForeground", Color.WHITE);
            UIManager.put("InternalFrame.inactiveTitleBackground", Color.WHITE);
            UIManager.put("InternalFrame.inactiveTitleForeground", Color.PINK);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmEfetuar;
    private javax.swing.JMenuItem jmiAssociado;
    private javax.swing.JMenuItem jmiCargo;
    private javax.swing.JMenuItem jmiMensalidade;
    private javax.swing.JMenuItem jmiPagamento;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/VIEW/IMAGES/logortc.png")));
    }
}
