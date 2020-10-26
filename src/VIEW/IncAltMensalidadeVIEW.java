package VIEW;

import DAO.MensalidadeDAO;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class IncAltMensalidadeVIEW extends javax.swing.JInternalFrame {

    public IncAltMensalidadeVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();
        jcMes = new com.toedter.calendar.JMonthChooser();
        jcAno = new com.toedter.calendar.JYearChooser();
        jLabel4 = new javax.swing.JLabel();
        jtValor = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Mensalidade");

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 36)); // NOI18N
        jLabel1.setText("Mensalidade");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel2.setText("Mês:");

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel3.setText("Ano:");

        jbConfirmar.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jcMes.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel4.setText("Valor:");

        jtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jtValor.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbConfirmar)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jcAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(jtValor, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jcAno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jbConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //VARIAVEIS GLOBAIS
    int operacao;
    int pkmensalidade = 0;
    SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");


    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed

        //SWITCH PARA REALIZAR QUAL OPERAÇÃO SERÁ RELAIZADA INCLUSÃO ou ALTERAÇÃO
        switch (operacao) {

            //OPERAÇÃO DE INCLUSÃO
            case 1: {
                boolean mb = verificaMensalidade();
                boolean vb = verificarValor();

                if (vb) {
                    JOptionPane.showMessageDialog(null, "Preencha o compo 'VALOR' para edetuar esta operação", "Preenchao VALOR", 0);
                    break;
                }
                if (mb) {
                    incluirMensalidade();
                    dispose();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "A 'DATA' selecionada já possui mensalidade", "DATA JÁ CADASTRADA", 0);
                    break;
                }

            }

            //OPERAÇÃO DE ALTERAÇÃO
            case 2: {
                boolean mb = verificaMensalidade();
                boolean vb = verificarValor();

                if (vb) {
                    JOptionPane.showMessageDialog(null, "Preencha o compo 'VALOR' para edetuar esta operação", "Preenchao VALOR", 0);
                    break;
                }
                if (mb) {
                    alterarMensalidade();
                    dispose();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "A 'DATA' selecionada já possui mensalidade", "DATA JÁ CADASTRADA", 0);
                    break;
                }

            }
        }

    }//GEN-LAST:event_jbConfirmarActionPerformed

//FUNÇÕES
    //FUNÇÃO PARA INCLUIR O REGISTRO DE MENSALIDADE
    private void incluirMensalidade() {
        Date data = retornaData();
        String mes = retornaMes();

        MensalidadeDAO adao = new MensalidadeDAO();;
        adao.incluirMensalidade(pkmensalidade, mes, Float.valueOf(jtValor.getText()), data);
    }

    //FUNÇÃO PARA ALTERAR O REGISTRO DE MENSALIDADE
    private void alterarMensalidade() {
        Date data = retornaData();
        String mes = retornaMes();

        MensalidadeDAO adao = new MensalidadeDAO();;
        adao.alterarMensalidade(pkmensalidade, mes, Float.valueOf(jtValor.getText()), data);
    }

    //FUNÇÃO PARA DEFINIR QUAL O OPERAÇÃO SERÁ REALIZADA NESSE CASO 'INCLUIR'
    public void definirOperacaoInc() {
        operacao = 1;
    }

    //FUNÇÃO PARA DEFINIR QUAL O OPERAÇÃO SERÁ REALIZADA NESSE CASO 'ALTERAR'
    public void definirOperacaoAlt() {
        operacao = 2;
    }

    //FUNÇÃO PARA OBTER A PROXIMA PK PARA INCLUSÃO NO BANCO DE DADOS
    public void obterPkProxMens() {
        MensalidadeDAO pkdao = new MensalidadeDAO();
        ResultSet rg = pkdao.obterUltimaMensalidade();

        try {
            while (rg.next()) {

                pkmensalidade = rg.getInt("pkmensalidade");

                if (pkmensalidade == 0) {
                    pkmensalidade = 1;
                    System.out.println(pkmensalidade);
                } else {
                    pkmensalidade++;
                    System.out.println(pkmensalidade);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(IncAltAssociadoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //FUNÇÃO PARA PREENCHER OS CAMPOS PARA ALTERAÇÃO DAS MENSALIDADES
    public void altMensalidade(int pk, String valor, String data) {

        jtValor.setText(valor);
        pkmensalidade = pk;

        //Defeinindo as JCalendar com as datas do banco
        String a = data.substring(0, 4);
        String m = data.substring(5, 7);
        int ai = Integer.parseInt(a);
        int mi = Integer.parseInt(m);
        mi--;
        jcAno.setYear(ai);
        jcMes.setMonth(mi);
    }

    //FUNÇÃO PARA RETORNAR A DATA PARA INCLUSÃO NO BANCO
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

    //FUNÇÃO PARA QUE RETONA O NOME DO MÊS MAS O ANO PARA INCLUSÃO NO BANCO
    private String retornaMes() {

        int mes = Integer.parseInt(String.valueOf(jcMes.getMonth()));
        mes++;
        String txmes = null;
        String ano = String.valueOf(jcAno.getYear());
        switch (mes) {

            case 1: {
                txmes = "Janeiro " + ano;
                break;
            }
            case 2: {
                txmes = "Fevereiro " + ano;
                break;
            }
            case 3: {
                txmes = "Março " + ano;
                break;
            }
            case 4: {
                txmes = "Abril " + ano;
                break;
            }
            case 5: {
                txmes = "Maio " + ano;
                break;
            }
            case 6: {
                txmes = "Junho " + ano;
                break;
            }
            case 7: {
                txmes = "Julho " + ano;
                break;
            }
            case 8: {
                txmes = "Agosto " + ano;
                break;
            }
            case 9: {
                txmes = "Setembro " + ano;
                break;
            }
            case 10: {
                txmes = "Outubro " + ano;
                break;
            }
            case 11: {
                txmes = "Novembro " + ano;
                break;
            }
            case 12: {
                txmes = "Dezembro " + ano;
                break;
            }

        }

        return txmes;
    }

    //FUNÇÃO PARA VERIFICAR A DATA DA MENSALIDADE NA HORA DA INCLUSÃO OU ALTERAÇÃO JÁ ESTÁ NO BANCO
    private boolean verificaMensalidade() {
        MensalidadeDAO ndao = new MensalidadeDAO();
        Date data = retornaData();
        ResultSet rn = ndao.verificaMensalidade(data);

        int pk = 0;

        try {
            while (rn.next()) {
                pk = rn.getInt("pkmensalidade");
            }
        } catch (SQLException ex) {
            System.out.println("ERRO" + ex.getMessage());
        }

        if (pk == pkmensalidade) {
            return true;
        }

        if (pk == 0) {
            return true;
        } else {
            return false;
        }
    }

    //FUNÇÃO PARA VERIFICAR SE O CAMPO 'VALOR' FOI PREENCHIDO
    private boolean verificarValor() {
        String vl = jtValor.getText().toString();

        if (vl.equals("")) {
            return true;
        } else {
            return false;
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbConfirmar;
    private com.toedter.calendar.JYearChooser jcAno;
    private com.toedter.calendar.JMonthChooser jcMes;
    private javax.swing.JFormattedTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
