package view;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormSearch extends javax.swing.JInternalFrame {
    
    public FormSearch() {
        initComponents();
        configForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        btnSearchClients = new javax.swing.JButton();
        btnSearchUsers = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(420, 350));
        setMinimumSize(new java.awt.Dimension(420, 350));
        setPreferredSize(new java.awt.Dimension(420, 350));

        jPanel.setMaximumSize(new java.awt.Dimension(400, 320));
        jPanel.setMinimumSize(new java.awt.Dimension(400, 320));
        jPanel.setPreferredSize(new java.awt.Dimension(400, 320));

        lblSearch.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(0, 102, 255));
        lblSearch.setText("PESQUISAR");

        btnSearchClients.setBackground(new java.awt.Color(0, 102, 255));
        btnSearchClients.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSearchClients.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchClients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_c_client.png"))); // NOI18N
        btnSearchClients.setText("CLIENTES");
        btnSearchClients.setMaximumSize(new java.awt.Dimension(230, 100));
        btnSearchClients.setMinimumSize(new java.awt.Dimension(230, 100));
        btnSearchClients.setPreferredSize(new java.awt.Dimension(230, 100));
        btnSearchClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientsActionPerformed(evt);
            }
        });

        btnSearchUsers.setBackground(new java.awt.Color(0, 102, 255));
        btnSearchUsers.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSearchUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_c_user.png"))); // NOI18N
        btnSearchUsers.setText("USUÁRIOS");
        btnSearchUsers.setMaximumSize(new java.awt.Dimension(230, 100));
        btnSearchUsers.setMinimumSize(new java.awt.Dimension(230, 100));
        btnSearchUsers.setPreferredSize(new java.awt.Dimension(230, 100));
        btnSearchUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearch)
                .addGap(18, 18, 18)
                .addComponent(btnSearchClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSearchClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchClientsActionPerformed

    private void btnSearchUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchUsersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchClients;
    private javax.swing.JButton btnSearchUsers;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblSearch;
    // End of variables declaration//GEN-END:variables

    private void configForm(){
        this.setTitle("Pesquisar");
        this.setResizable(false);
    }
}
