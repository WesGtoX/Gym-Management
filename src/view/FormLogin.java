package view;

import controller.UserDAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import model.User;
import static view.FormMain.Usr;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormLogin extends javax.swing.JInternalFrame {

    private JMenuBar menu;

    public FormLogin() {
        initComponents();
        configForm();
    }
    
    public FormLogin(JMenuBar menu){
        initComponents();
        configForm();
        this.menu=menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImgLogin = new javax.swing.JLabel();
        lblAcces = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        pswPass = new javax.swing.JPasswordField();
        btnSign = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setClosable(true);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(300, 225));
        setPreferredSize(new java.awt.Dimension(600, 450));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        lblImgLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/l_user.png"))); // NOI18N
        lblImgLogin.setToolTipText("");

        lblAcces.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAcces.setForeground(new java.awt.Color(255, 255, 255));
        lblAcces.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcces.setText("Área de Acesso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAcces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImgLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblImgLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAcces)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogin.setText("Login");

        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogin.setMinimumSize(new java.awt.Dimension(300, 30));
        txtLogin.setPreferredSize(new java.awt.Dimension(300, 30));

        lblPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPass.setText("Senha");

        pswPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pswPass.setMinimumSize(new java.awt.Dimension(300, 30));
        pswPass.setPreferredSize(new java.awt.Dimension(300, 30));

        btnSign.setBackground(new java.awt.Color(0, 102, 255));
        btnSign.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/l_login.png"))); // NOI18N
        btnSign.setText("Entrar");
        btnSign.setPreferredSize(new java.awt.Dimension(110, 35));
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/l_close.png"))); // NOI18N
        btnClose.setText("Fechar");
        btnClose.setPreferredSize(new java.awt.Dimension(110, 35));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPass)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLogin)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        login();
    }//GEN-LAST:event_btnSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAcces;
    private javax.swing.JLabel lblImgLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPass;
    private javax.swing.JPasswordField pswPass;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables

    private void configForm() {
        this.setTitle("Login");
        this.setResizable(false);
    }

    private void login(){
        List<User> load = new UserDAO().searchAll();
        String usr = txtLogin.getText();
        String pwd = new String(pswPass.getPassword()).toUpperCase();
        boolean login = false;
        MessageDigest m;
        
        try {
            m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(pwd.getBytes(), 0, pwd.length());
            BigInteger pwd1 = new BigInteger(1, m.digest());
            pwd = String.format("%1$032X", pwd1);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        for (User user : load) {
            if (usr.toUpperCase().equals(user.getName().toUpperCase()) && pwd.equals(user.getPassword())) {
                // Open form
                Usr = user;
                menu.getMenu(0).setEnabled(true);                       //Enable menu management
                menu.getMenu(0).getItem(3).setEnabled(                  //Enable submenu client
                        user.getPermissions() == 1 ? true : false
                );
                menu.getMenu(0).getItem(0).setEnabled(true);            //Enable submenu client
                menu.getMenu(0).getItem(1).setEnabled(true);            //Enable submenu client
                menu.getMenu(1).setEnabled(true);                       //Enable menu search
                menu.getMenu(2).setEnabled(true);                       //Enable menu report
                
                login = true;
                this.dispose();
            }
        }
        
        if (login == false) {
            JOptionPane.showMessageDialog(null,"Usuário ou senha inválido.",
                    "Login",JOptionPane.ERROR_MESSAGE);
            txtLogin.setText("");
            pswPass.setText("");
            txtLogin.requestFocusInWindow();
        }
    }
}
