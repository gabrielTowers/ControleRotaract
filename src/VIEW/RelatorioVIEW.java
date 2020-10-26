package VIEW;

/**
 *
 * @author Gabriel de Moraes Torres
 *
 */
public class RelatorioVIEW extends javax.swing.JInternalFrame {

    public RelatorioVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtaRelatorio = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Ralatório");

        jtaRelatorio.setColumns(20);
        jtaRelatorio.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jtaRelatorio.setLineWrap(true);
        jtaRelatorio.setRows(5);
        jtaRelatorio.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtaRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//FUNÇÕES
    //FUNÇÃO QUE COLOCA O RELATÓRIO NA CAIXA DE TEXTO
    public void recebeRelatorio(String relatorio) {

        jtaRelatorio.setText(relatorio);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaRelatorio;
    // End of variables declaration//GEN-END:variables
}
