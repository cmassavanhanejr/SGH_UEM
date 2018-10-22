/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Customer
 */
public class ForumTabelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    public ForumTabelaFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TelaNome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PainelHora = new javax.swing.JPanel();
        lbnDataFuncionario = new javax.swing.JLabel();
        lbnHoraFuncionario = new javax.swing.JLabel();
        jPanelTela = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnTabela = new javax.swing.JTable();
        btnVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        TelaNome.setBackground(new java.awt.Color(0, 153, 153));
        TelaNome.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                Funcionário");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-back-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout TelaNomeLayout = new javax.swing.GroupLayout(TelaNome);
        TelaNome.setLayout(TelaNomeLayout);
        TelaNomeLayout.setHorizontalGroup(
            TelaNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );
        TelaNomeLayout.setVerticalGroup(
            TelaNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaNomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelaNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaNomeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaNomeLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jPanel1.add(TelaNome, java.awt.BorderLayout.PAGE_START);

        PainelHora.setBackground(new java.awt.Color(0, 153, 153));

        lbnDataFuncionario.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        lbnDataFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lbnDataFuncionario.setText("Data");

        lbnHoraFuncionario.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        lbnHoraFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lbnHoraFuncionario.setText("Hora");

        javax.swing.GroupLayout PainelHoraLayout = new javax.swing.GroupLayout(PainelHora);
        PainelHora.setLayout(PainelHoraLayout);
        PainelHoraLayout.setHorizontalGroup(
            PainelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelHoraLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbnDataFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(lbnHoraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        PainelHoraLayout.setVerticalGroup(
            PainelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelHoraLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PainelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnDataFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbnHoraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(PainelHora, java.awt.BorderLayout.PAGE_END);

        jPanelTela.setBackground(new java.awt.Color(255, 255, 255));

        btnPesquisa.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnPesquisa.setText("Pesquisar");

        btnTabela.setForeground(new java.awt.Color(0, 153, 153));
        btnTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                 Nº", "                Nome"
            }
        ));
        jScrollPane1.setViewportView(btnTabela);

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/keyboard-left-arrow-button.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTelaLayout = new javax.swing.GroupLayout(jPanelTela);
        jPanelTela.setLayout(jPanelTelaLayout);
        jPanelTelaLayout.setHorizontalGroup(
            jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelTelaLayout.createSequentialGroup()
                .addGroup(jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
                    .addGroup(jPanelTelaLayout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelTelaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanelTelaLayout.setVerticalGroup(
            jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnVoltar)
                .addGap(11, 11, 11)
                .addComponent(btnPesquisa)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelTela, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForumTabelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForumTabelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForumTabelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForumTabelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForumTabelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelHora;
    private javax.swing.JPanel TelaNome;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JTable btnTabela;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbnDataFuncionario;
    private javax.swing.JLabel lbnHoraFuncionario;
    // End of variables declaration//GEN-END:variables
}
