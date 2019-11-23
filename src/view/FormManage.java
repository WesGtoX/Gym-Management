package view;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormManage extends javax.swing.JInternalFrame {
    
    public FormManage() {
        initComponents();
        configForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        lblManager = new javax.swing.JLabel();
        btnManagerClients = new javax.swing.JButton();
        btnManagerUsers = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(420, 350));
        setMinimumSize(new java.awt.Dimension(420, 350));
        setPreferredSize(new java.awt.Dimension(420, 350));

        jPanel.setMaximumSize(new java.awt.Dimension(400, 320));
        jPanel.setMinimumSize(new java.awt.Dimension(400, 320));
        jPanel.setPreferredSize(new java.awt.Dimension(400, 320));

        lblManager.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lblManager.setForeground(new java.awt.Color(0, 102, 255));
        lblManager.setText("GERENCIAR");

        btnManagerClients.setBackground(new java.awt.Color(0, 102, 255));
        btnManagerClients.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnManagerClients.setForeground(new java.awt.Color(255, 255, 255));
        btnManagerClients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_c_client.png"))); // NOI18N
        btnManagerClients.setText("CLIENTES");
        btnManagerClients.setMaximumSize(new java.awt.Dimension(230, 100));
        btnManagerClients.setMinimumSize(new java.awt.Dimension(230, 100));
        btnManagerClients.setPreferredSize(new java.awt.Dimension(230, 100));
        btnManagerClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerClientsActionPerformed(evt);
            }
        });

        btnManagerUsers.setBackground(new java.awt.Color(0, 102, 255));
        btnManagerUsers.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnManagerUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnManagerUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_c_user.png"))); // NOI18N
        btnManagerUsers.setText("USUÁRIOS");
        btnManagerUsers.setMaximumSize(new java.awt.Dimension(230, 100));
        btnManagerUsers.setMinimumSize(new java.awt.Dimension(230, 100));
        btnManagerUsers.setPreferredSize(new java.awt.Dimension(230, 100));
        btnManagerUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnManagerUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManagerClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManager))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManager)
                .addGap(18, 18, 18)
                .addComponent(btnManagerClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManagerUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagerClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagerClientsActionPerformed

    private void btnManagerUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagerUsersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManagerClients;
    private javax.swing.JButton btnManagerUsers;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblManager;
    // End of variables declaration//GEN-END:variables

    private void configForm(){
        this.setTitle("Gerenciar");
        this.setResizable(false);
    }
}
