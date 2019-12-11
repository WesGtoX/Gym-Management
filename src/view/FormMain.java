package view;

import controller.UserDAO;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import java.util.List;
import javax.swing.ImageIcon;
import model.User;
import static view.FormReports.report;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormMain extends javax.swing.JFrame {
    
    public static User Usr;
    
    public FormMain() {
        initComponents();
        configurateForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/image/background.jpg"));
        Image image = icon.getImage();
        Desktop = new javax.swing.JDesktopPane() {

            public void paintComponent(Graphics g) {
                g.drawImage(image,0,0,getWidth(),getHeight(), this);
            }
        };
        lblLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Desktop.setToolTipText("");
        Desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Desktop.setMinimumSize(null);
        Desktop.setName(""); // NOI18N
        Desktop.setRequestFocusEnabled(false);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_gymm2.png"))); // NOI18N
        lblLogo.setAlignmentY(0.0F);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 90));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 90));

        btnLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_login.png"))); // NOI18N
        btnLogin.setMaximumSize(new java.awt.Dimension(90, 90));
        btnLogin.setMinimumSize(new java.awt.Dimension(90, 90));
        btnLogin.setPreferredSize(new java.awt.Dimension(90, 90));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_logout.png"))); // NOI18N
        btnLogout.setMaximumSize(new java.awt.Dimension(90, 90));
        btnLogout.setMinimumSize(new java.awt.Dimension(90, 90));
        btnLogout.setPreferredSize(new java.awt.Dimension(90, 90));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnManage.setBackground(new java.awt.Color(51, 51, 51));
        btnManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_manage.png"))); // NOI18N
        btnManage.setMaximumSize(new java.awt.Dimension(90, 90));
        btnManage.setMinimumSize(new java.awt.Dimension(90, 90));
        btnManage.setPreferredSize(new java.awt.Dimension(90, 90));
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(51, 51, 51));
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_payment.png"))); // NOI18N
        btnPayment.setMaximumSize(new java.awt.Dimension(90, 90));
        btnPayment.setMinimumSize(new java.awt.Dimension(90, 90));
        btnPayment.setPreferredSize(new java.awt.Dimension(90, 90));
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 51, 51));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_search.png"))); // NOI18N
        btnSearch.setMaximumSize(new java.awt.Dimension(90, 90));
        btnSearch.setMinimumSize(new java.awt.Dimension(90, 90));
        btnSearch.setPreferredSize(new java.awt.Dimension(90, 90));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReports.setBackground(new java.awt.Color(51, 51, 51));
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_reports.png"))); // NOI18N
        btnReports.setMaximumSize(new java.awt.Dimension(90, 90));
        btnReports.setMinimumSize(new java.awt.Dimension(90, 90));
        btnReports.setPreferredSize(new java.awt.Dimension(90, 90));
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(51, 51, 51));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_about.png"))); // NOI18N
        btnAbout.setMaximumSize(new java.awt.Dimension(90, 90));
        btnAbout.setMinimumSize(new java.awt.Dimension(90, 90));
        btnAbout.setPreferredSize(new java.awt.Dimension(90, 90));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/p_exit.png"))); // NOI18N
        btnExit.setMaximumSize(new java.awt.Dimension(90, 90));
        btnExit.setMinimumSize(new java.awt.Dimension(90, 90));
        btnExit.setPreferredSize(new java.awt.Dimension(90, 90));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Desktop.setLayer(lblLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addContainerGap(127, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        Menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Menu.setPreferredSize(new java.awt.Dimension(235, 30));

        menuClient.setText("Gerenciar");
        menuClient.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        ManClients.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ManClients.setText("Cliente");
        ManClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManClientsActionPerformed(evt);
            }
        });
        menuClient.add(ManClients);

        ManUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ManUser.setText("Usuário");
        ManUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManUserActionPerformed(evt);
            }
        });
        menuClient.add(ManUser);
        menuClient.add(Separator1);

        ManPayment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ManPayment.setText("Pagamento");
        ManPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManPaymentActionPerformed(evt);
            }
        });
        menuClient.add(ManPayment);
        menuClient.add(Separator2);

        ManAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        ManAbout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ManAbout.setText("Sobre");
        ManAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManAboutActionPerformed(evt);
            }
        });
        menuClient.add(ManAbout);

        submenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        submenuExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submenuExit.setText("Sair");
        submenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuExitActionPerformed(evt);
            }
        });
        menuClient.add(submenuExit);

        Menu.add(menuClient);

        menuSearch.setText("Pesquisar");
        menuSearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        SeaClients.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SeaClients.setText("Clientes");
        SeaClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeaClientsActionPerformed(evt);
            }
        });
        menuSearch.add(SeaClients);

        SeaUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SeaUser.setText("Usuário");
        SeaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeaUserActionPerformed(evt);
            }
        });
        menuSearch.add(SeaUser);

        Menu.add(menuSearch);

        menuReport.setText("Relatório");
        menuReport.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        RepClients.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RepClients.setText("Clientes");
        RepClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepClientsActionPerformed(evt);
            }
        });
        menuReport.add(RepClients);

        RepProfit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RepProfit.setText("Ganhos");
        RepProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepProfitActionPerformed(evt);
            }
        });
        menuReport.add(RepProfit);

        RepExpensives.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RepExpensives.setText("Gastos");
        RepExpensives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepExpensivesActionPerformed(evt);
            }
        });
        menuReport.add(RepExpensives);

        RepTotalProfit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RepTotalProfit.setText("Lucro Total");
        RepTotalProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepTotalProfitActionPerformed(evt);
            }
        });
        menuReport.add(RepTotalProfit);

        Menu.add(menuReport);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManUserActionPerformed
        FormManUser manUser = new FormManUser();
        manUser.selectTab(0);    //Select tab main
        manUser.flag = 0;        //Set flag first login with 1
        openForm(manUser);       //Open form with selected predefinitions
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        List<User> users = new UserDAO().searchAll();       //Search users in database
        int count = 1;
        if(users.size() != 0){
            for(User u : users){
                count--;
                if(u.getPermissions() == 1){                //checking for users with administrator permission
//                    openForm(new FormLogin(Menu));        //Launch login form
                    break;
                }else{
                    count++;
                }
            }     
        }
        if(users.size() == 0 || count > 0){
            FormManUser newUser = new FormManUser();
            newUser.selectTab(0);                           //Select tab search
            newUser.flag = 1;                               //Set flag first login with 1
            openForm(newUser);                              //Open form with selected predefinitions
        }
    }//GEN-LAST:event_formWindowOpened

    private void SeaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeaUserActionPerformed
        FormManUser srcUser = new FormManUser();
        srcUser.selectTab(0);                               //Select tab search
        srcUser.flag = 1;                                   //Set flag first login with 1
        openForm(srcUser);                                  //Open form with selected predefinitions
    }//GEN-LAST:event_SeaUserActionPerformed

    private void SeaClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeaClientsActionPerformed
//        openForm(new FormManClient().jPanel2.setSelectedIndex(1));
    }//GEN-LAST:event_SeaClientsActionPerformed

    private void submenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_submenuExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        openForm(new FormLogin(Menu));
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        FormMain f = new FormMain();
        f.setVisible(true);
        Usr = null;
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        openForm(new FormManage());
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        openForm(new FormManPay());
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        openForm(new FormSearch());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        openForm(new FormReports());
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        openForm(new FormAbout());
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void RepClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepClientsActionPerformed
        report =  "report_client.jrxml";
        openForm(new FormReports());
    }//GEN-LAST:event_RepClientsActionPerformed

    private void RepProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepProfitActionPerformed
        report =  "report_profit.jrxml";
        openForm(new FormReports());
    }//GEN-LAST:event_RepProfitActionPerformed

    private void RepExpensivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepExpensivesActionPerformed
        report =  "report_expensives.jrxml";
        openForm(new FormReports());
    }//GEN-LAST:event_RepExpensivesActionPerformed

    private void RepTotalProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepTotalProfitActionPerformed
        report =  "report_total_profit.jrxml";
        openForm(new FormReports());
    }//GEN-LAST:event_RepTotalProfitActionPerformed

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
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuSearch;
    private javax.swing.JMenuItem submenuExit;
    // End of variables declaration//GEN-END:variables

    private void configurateForm() {
        this.setTitle("Gym Management");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        enableButtons(false);
//        menuClient.setEnabled(true);
//        ManClients.setEnabled(false);
//        ManUser.setEnabled(false);
//        ManPayment.setEnabled(false);
    }

    public void FormOpen() {
        openForm(new FormManClient());
    }
    
    public void openForm(JInternalFrame f){
        if (Desktop.getAllFrames().length == 0) {
            Desktop.add(f);
            centerForm(f);
            f.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                rootPane,
                "Você precisa fechar a janela atual antes de abrir outro formulário!");
        }
    }
    
    public static void centerForm(JInternalFrame f){
        Dimension d = f.getDesktopPane().getSize();
        f.setLocation(
            (d.width-f.getSize().width)/2,
            (d.height-f.getSize().height)/2
        );
    }
    
    public void enableButtons(boolean e){
        menuClient.setEnabled(e);
        menuSearch.setEnabled(e);
        menuReport.setEnabled(e);
    }
        
}
