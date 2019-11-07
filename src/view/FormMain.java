package view;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormMain extends javax.swing.JFrame {

    public FormMain() {
        initComponents();
        configurateForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        menuClient = new javax.swing.JMenu();
        ManClients = new javax.swing.JMenuItem();
        ManUser = new javax.swing.JMenuItem();
        Separator1 = new javax.swing.JPopupMenu.Separator();
        ManPayment = new javax.swing.JMenuItem();
        Separator2 = new javax.swing.JPopupMenu.Separator();
        ManAbout = new javax.swing.JMenuItem();
        submenuExit = new javax.swing.JMenuItem();
        menuSearch = new javax.swing.JMenu();
        SeaClients = new javax.swing.JMenuItem();
        SeaUser = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        RepClients = new javax.swing.JMenuItem();
        RepProfit = new javax.swing.JMenuItem();
        RepExpensives = new javax.swing.JMenuItem();
        RepTotalProfit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Management");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1588, 2404));
        setSize(new java.awt.Dimension(0, 0));

        Desktop.setBackground(new java.awt.Color(255, 255, 255));
        Desktop.setToolTipText("");
        Desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Desktop.setMinimumSize(new java.awt.Dimension(800, 586));
        Desktop.setName(""); // NOI18N
        Desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuClient.setText("Gerenciar");

        ManClients.setText("Cliente");
        ManClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManClientsActionPerformed(evt);
            }
        });
        menuClient.add(ManClients);

        ManUser.setText("Usuário");
        ManUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManUserActionPerformed(evt);
            }
        });
        menuClient.add(ManUser);
        menuClient.add(Separator1);

        ManPayment.setText("Pagamento");
        ManPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManPaymentActionPerformed(evt);
            }
        });
        menuClient.add(ManPayment);
        menuClient.add(Separator2);

        ManAbout.setText("Sobre");
        ManAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManAboutActionPerformed(evt);
            }
        });
        menuClient.add(ManAbout);

        submenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        submenuExit.setText("Sair");
        menuClient.add(submenuExit);

        Menu.add(menuClient);

        menuSearch.setText("Pesquisa");

        SeaClients.setText("Clientes");
        menuSearch.add(SeaClients);

        SeaUser.setText("Usuário");
        menuSearch.add(SeaUser);

        Menu.add(menuSearch);

        menuReport.setText("Relatorio");

        RepClients.setText("Cliente");
        menuReport.add(RepClients);

        RepProfit.setText("Ganhos");
        menuReport.add(RepProfit);

        RepExpensives.setText("Gastos");
        menuReport.add(RepExpensives);

        RepTotalProfit.setText("Lucro Total");
        menuReport.add(RepTotalProfit);

        Menu.add(menuReport);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 784, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManUserActionPerformed
        openForm(new FormManUser());
    }//GEN-LAST:event_ManUserActionPerformed

    private void ManPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManPaymentActionPerformed
        openForm(new FormManPay());
    }//GEN-LAST:event_ManPaymentActionPerformed

    private void ManClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManClientsActionPerformed
        openForm(new FormManClient());
    }//GEN-LAST:event_ManClientsActionPerformed

    private void ManAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManAboutActionPerformed
        openForm(new FormAbout());
    }//GEN-LAST:event_ManAboutActionPerformed

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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem ManAbout;
    private javax.swing.JMenuItem ManClients;
    private javax.swing.JMenuItem ManPayment;
    private javax.swing.JMenuItem ManUser;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem RepClients;
    private javax.swing.JMenuItem RepExpensives;
    private javax.swing.JMenuItem RepProfit;
    private javax.swing.JMenuItem RepTotalProfit;
    private javax.swing.JMenuItem SeaClients;
    private javax.swing.JMenuItem SeaUser;
    private javax.swing.JPopupMenu.Separator Separator1;
    private javax.swing.JPopupMenu.Separator Separator2;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuSearch;
    private javax.swing.JMenuItem submenuExit;
    // End of variables declaration//GEN-END:variables

    private void configurateForm() {
        this.setTitle("Gym Management");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void openForm(JInternalFrame f){
        if (Desktop.getAllFrames().length == 0) {
            Desktop.add(f);
            centerForm(f);
            f.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Você precisa fechar a janela atual antes de abrir outro formulário!");
        }
    }
    
    private void centerForm(JInternalFrame f){
        Dimension d = f.getDesktopPane().getSize();
        f.setLocation(
            (d.width-f.getSize().width)/2,
            (d.height-f.getSize().height)/2
        );
    }
}
