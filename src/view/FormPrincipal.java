package view;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        Desktop1 = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        menuClient = new javax.swing.JMenu();
        ManClients = new javax.swing.JMenuItem();
        ManUser = new javax.swing.JMenuItem();
        Separator1 = new javax.swing.JPopupMenu.Separator();
        ManPayment = new javax.swing.JMenuItem();
        Separator2 = new javax.swing.JPopupMenu.Separator();
        submenuExit = new javax.swing.JMenuItem();
        menuSearch = new javax.swing.JMenu();
        SeaClients = new javax.swing.JMenuItem();
        SeaUser = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        RepClients = new javax.swing.JMenuItem();
        RepProfit = new javax.swing.JMenuItem();
        RepExpensives = new javax.swing.JMenuItem();
        RepTotalProfit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Management");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        Desktop.setBackground(new java.awt.Color(255, 255, 255));
        Desktop.setToolTipText("");
        Desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Desktop.setMinimumSize(new java.awt.Dimension(800, 600));
        Desktop.setName(""); // NOI18N
        Desktop.setPreferredSize(new java.awt.Dimension(800, 600));
        Desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        Desktop1.setBackground(new java.awt.Color(255, 255, 255));
        Desktop1.setToolTipText("");
        Desktop1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Desktop1.setMinimumSize(new java.awt.Dimension(800, 600));
        Desktop1.setName(""); // NOI18N
        Desktop1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout Desktop1Layout = new javax.swing.GroupLayout(Desktop1);
        Desktop1.setLayout(Desktop1Layout);
        Desktop1Layout.setHorizontalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        Desktop1Layout.setVerticalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        menuClient.setText("Gerenciar");

        ManClients.setText("Cliente");
        menuClient.add(ManClients);

        ManUser.setText("Usuário");
        menuClient.add(ManUser);
        menuClient.add(Separator1);

        ManPayment.setText("Pagamento");
        menuClient.add(ManPayment);
        menuClient.add(Separator2);

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

        menuAbout.setText("Sobre");
        Menu.add(menuAbout);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Desktop.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JDesktopPane Desktop1;
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
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuSearch;
    private javax.swing.JMenuItem submenuExit;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Gym Management");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void abrirFormulario(JInternalFrame f){
        if (Desktop.getAllFrames().length == 0) {
            Desktop.add(f);
            centralizarFormulario(f);
            f.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Você precisa fechar a janela atual antes de abrir outro formulário!");
        }
    }
        private void centralizarFormulario(JInternalFrame f){
        Dimension d = f.getDesktopPane().getSize();
        f.setLocation(
            (d.width-f.getSize().width)/2,
            (d.height-f.getSize().height)/2
        );
    }
}
