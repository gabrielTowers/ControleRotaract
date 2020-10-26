package VIEW;

import DAO.CargoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class IncAltCargoVIEW extends javax.swing.JInternalFrame {

    public IncAltCargoVIEW() {
        initComponents();
    }
    //Variaveis Globais
    int pkcargo = 0;
    int operacao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        jLabel1.setText("Cargos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jtNome.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jbConfirmar.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbConfirmar)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jbConfirmar)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed

        //SWITCH PARA REALIZAR QUAL OPERAÇÃO SERÁ RELAIZADA INCLUSÃO ou ALTERAÇÃO
        switch (operacao) {

            // OPERAÇÃO DE INCLUSÃO
            case 1: {

                boolean bn = verificaNome();
                boolean ba = verificarCargo();

                if (bn) {

                    JOptionPane.showMessageDialog(null, "Preencha o campo de 'Nome' para efetuar a INCLUSÃO", "Preencha o NOME", 0);
                    break;
                } else {
                    if (ba) {
                        incluiCargo();
                        dispose();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "O 'NOME DO CARGO' já está cadastrado utilize um nome válido", "NOME JÁ EXISTE", 0);
                        break;
                    }

                }

            }

            // OPERAÇÃO DE ALTERAÇÃO
            case 2: {

                boolean bn = verificaNome();
                boolean ba = verificarCargo();

                if (bn) {
                    JOptionPane.showMessageDialog(null, "Preencha o campo de 'Nome' para efetuar a ALTERAÇÃO", "Preencha o NOME", 0);
                    break;
                } else {
                    if (ba) {
                        alterarCargo();
                        dispose();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "O 'NOME DO CARGO' já está cadastrado utilize um nome válido", "NOME JÁ EXISTE", 0);
                        break;
                    }

                }

            }
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

//FUNÇÕES
    //FUNÇÃO PARA DEFINIR QUAL O OPERAÇÃO SERÁ REALIZADA NESSE CASO 'INCLUIR'
    public void definirOperacaoInc() {
        operacao = 1;
    }

    //FUNÇÃO PARA DEFINIR QUAL O OPERAÇÃO SERÁ REALIZADA NESSE CASO 'ALTERAR'
    public void definirOperacaoAlt() {
        operacao = 2;
    }

    //FUNÇÃO PARA INCLUIR CARGO
    private void incluiCargo() {
        CargoDAO cdao = new CargoDAO();
        cdao.incluirCargo(pkcargo, jtNome.getText());
    }

    //FUNÇÃO PARA ALTERAR CARGO
    private void alterarCargo() {
        CargoDAO cdao = new CargoDAO();
        cdao.alterarCargo(pkcargo, jtNome.getText());
    }

    //FUNÇÃO PARA OBTER A PK DO PRÓXIMO CARGO PARA INCLUIR NO BANCO
    public void obterPkProxCargo() {
        CargoDAO pkdao = new CargoDAO();
        ResultSet rg = pkdao.obterUltimoCargo();

        try {
            while (rg.next()) {
                pkcargo = rg.getInt("pkcargo");
                System.out.println(pkcargo);

                if (pkcargo == 0) {
                    pkcargo = 1;
                    System.out.println(pkcargo);
                } else {
                    pkcargo++;
                    System.out.println(pkcargo);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //FUNÇÃO PARA VERIFICAR SE O ASSOCIADO JÁ EXITE NO BANCO
    private boolean verificarCargo() {
        CargoDAO ndao = new CargoDAO();
        ResultSet rn = ndao.verificarCargo(jtNome.getText());

        int pk = 0;

        try {
            while (rn.next()) {
                pk = rn.getInt("pkcargo");
            }
        } catch (SQLException ex) {
            System.out.println("ERRO" + ex.getMessage());
        }

        if (pk == pkcargo) {
            return true;
        }

        if (pk == 0) {
            return true;
        } else {
            return false;
        }

    }

    //FUNÇÃO PARA VERIFICAR SE O CAMPO DE NOME ESTÁ PREENCHIDO
    private boolean verificaNome() {

        String tn = jtNome.getText();
        if (tn.equals("")) {
            return true;
        } else {
            return false;
        }

    }

    //FUNÇÃO PARA PREANCHER O CAMPO DE NOME NA OPERAÇÃO DE ALTERAÇÃO
    public void altCargo(int pk, String nome) {
        pkcargo = pk;
        jtNome.setText(nome);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
