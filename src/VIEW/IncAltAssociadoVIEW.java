package VIEW;

import DAO.AssociadoDAO;
import DAO.CargoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class IncAltAssociadoVIEW extends javax.swing.JInternalFrame {

    public IncAltAssociadoVIEW() {
        initComponents();
    }

    //VARIAVEIS GLOBAIS
    int pkassociado = 0;
    int operacao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jcbCargo = new javax.swing.JComboBox<>();
        jbConfirmar = new javax.swing.JButton();
        jlMes = new javax.swing.JLabel();
        jcAno = new com.toedter.calendar.JYearChooser();
        jcMes = new com.toedter.calendar.JMonthChooser();
        jlAno = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Associado");

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        jLabel1.setText("Associado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel3.setText("Cargo:");

        jtNome.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jcbCargo.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbConfirmar.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jlMes.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jlMes.setText("Mês em que tomou posse:");

        jcAno.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jcMes.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jlAno.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jlAno.setText("Ano em que tomou posse:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbConfirmar)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcAno, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jtNome)
                    .addComponent(jlAno)
                    .addComponent(jlMes)
                    .addComponent(jcbCargo, 0, 227, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jlAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcAno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jbConfirmar)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed

        //SWITCH PARA REALIZAR QUAL OPERAÇÃO SERÁ RELAIZADA INCLUSÃO ou ALTERAÇÃOf
        switch (operacao) {

            // OPERAÇÃO DE INCLUSÃO
            case 1: {

                boolean bn = verificaNome();
                boolean ba = verificaAssociado();

                if (bn) {

                    JOptionPane.showMessageDialog(null, "Preencha o campo de 'Nome' para efetuar o Cadastro", "Preencha o NOME", 0);
                    break;
                } else {
                    if (ba) {
                        incluiAssoicado();
                        dispose();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "O 'NOME DO ASSICIADO' já está cadastrado utilize um nome válido", "NOME JÁ EXISTE", 0);
                        break;
                    }

                }

            }

            // OPERAÇÃO DE ALTERAÇÃO
            case 2: {

                boolean bn = verificaNome();
                boolean ba = verificaAssociado();

                if (bn) {
                    JOptionPane.showMessageDialog(null, "Preencha o campo de 'Nome' para efetuar a ALTERAÇÃO", "Preencha o NOME", 0);
                    break;
                } else {
                    if (ba) {
                        alterarAssociado();
                        dispose();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "O 'NOME DO ASSICIADO' já está cadastrado utilize um nome válido", "NOME JÁ EXISTE", 0);
                        break;
                    }

                }

            }
        }

    }//GEN-LAST:event_jbConfirmarActionPerformed

//FUNÇÕES
    //FUNÇÃO PARA INCLUIR ASSOCIADO
    private void incluiAssoicado() {
        int cargo = retornaCargo();

        Date data = retornaData();

        AssociadoDAO adao = new AssociadoDAO();
        adao.incluirAssociado(pkassociado, jtNome.getText(), cargo, data);
    }

    //FUNÇÃO PARA ALTERAR ASSOCIADO
    private void alterarAssociado() {
        int cargo = retornaCargo();

        AssociadoDAO adao = new AssociadoDAO();
        adao.alterarAssociado(pkassociado, jtNome.getText(), cargo);
    }

    //FUNÇÃO PARA VERIFICAR SE O ASSOCIADO JÁ EXITE NO BANCO
    private boolean verificaAssociado() {
        AssociadoDAO ndao = new AssociadoDAO();
        ResultSet rn = ndao.verificaAssociado(jtNome.getText());

        int pk = 0;

        try {
            while (rn.next()) {
                pk = rn.getInt("pkassociado");
            }
        } catch (SQLException ex) {
            System.out.println("ERRO" + ex.getMessage());
        }

        if (pk == pkassociado) {
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

    //FUNÇÃO PARA ATUALIZAR A COMBO BOX COM OS CARGOS DO BANCO DE DADOS
    public void attCargos() {
        CargoDAO cDAO = new CargoDAO();
        ResultSet rb = cDAO.obterCargoParaCB();

        try {
            jcbCargo.removeAllItems();
            while (rb.next()) {
                jcbCargo.addItem(rb.getString("txcargo"));
            }
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
        }
    }

    //FUNÇÃO PARA OBTER A PK DO PRÓXIMO ASSOCIADO PARA INCLUIR NO BANCO
    public void obterPkProxAssociado() {
        AssociadoDAO pkdao = new AssociadoDAO();
        ResultSet rg = pkdao.obterUltimoAssociado();

        try {
            while (rg.next()) {
                pkassociado = rg.getInt("pkassociado");

                if (pkassociado == 0) {
                    pkassociado = 1;
                    System.out.println(pkassociado);
                } else {
                    pkassociado++;
                    System.out.println(pkassociado);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //FUNÇÃO PARA PREENCHER OS CAMPOS PARA ALTERAÇÃO DE ASSOCIADO
    public void altAssociado(int pk, String nome, String cargo, String data) {
        jtNome.setText(nome);
        jcbCargo.setSelectedItem(cargo);
        pkassociado = pk;

        //Defeinindo as JCalendar com as datas do banco
        String a = data.substring(0, 4);
        String m = data.substring(5, 7);
        int ai = Integer.parseInt(a);
        int mi = Integer.parseInt(m);
        mi--;
        jcAno.setYear(ai);
        jcMes.setMonth(mi);
    }

    //FUNÇÃO PARA DEFINIR QUAL O OPERAÇÃO SERÁ REALIZADA NESSE CASO 'INCLUIR'
    public void definirOperacaoInc() {
        operacao = 1;
    }

    //FUNÇÃO PARA DEFINIR QUAL O OPERAÇÃO SERÁ REALIZADA NESSE CASO 'ALTERAR'
    public void definirOperacaoAlt() {
        operacao = 2;
        jcAno.setEnabled(false);
        jcMes.setEnabled(false);
    }

    //FUNÇÃO QUE ROTONA A DATA DE INGREÇÃO DO ASSOCIADO
    private Date retornaData() {
        //arrumando a data para colocar no banco  

        //colocando a numeração correta do mês
        int mes = Integer.parseInt(String.valueOf(jcMes.getMonth()));
        mes++;
        Integer.toString(mes);

        //fazendo a string para  a converção
        Date dataD = null;
        String dataS = String.valueOf(jcAno.getYear()) + "-" + mes + "-" + 01;

        try {
            dataD = (Date) form.parse(dataS);
        } catch (ParseException ex) {
            Logger.getLogger(IncAltMensalidadeVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.sql.Date dataDSql = new java.sql.Date(dataD.getTime());
        return dataDSql;
    }

    //FUNÇÃO QUE BUSCA QUAL A 'PK' DO CARGO SELECIONADO NO COMBOBOX
    private int retornaCargo() {

        int cargo = 0;
        CargoDAO ddao = new CargoDAO();
        ResultSet rd = ddao.selecionarCargo(jcbCargo.getSelectedItem().toString());

        try {
            while (rd.next()) {
                cargo = rd.getInt("pkcargo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbConfirmar;
    private com.toedter.calendar.JYearChooser jcAno;
    private com.toedter.calendar.JMonthChooser jcMes;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlMes;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
