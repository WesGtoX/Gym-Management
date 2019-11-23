package view;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormReports extends javax.swing.JInternalFrame {
    
    public FormReports() {
        initComponents();
        configForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        lblReports = new javax.swing.JLabel();
        btnReportsClients = new javax.swing.JButton();
        btnReportsTotalProfit = new javax.swing.JButton();
        btnReportsEarnings = new javax.swing.JButton();
        btnReportsEa = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(680, 350));
        setMinimumSize(new java.awt.Dimension(680, 350));
        setPreferredSize(new java.awt.Dimension(680, 350));

        jPanel.setMaximumSize(new java.awt.Dimension(664, 320));
        jPanel.setMinimumSize(new java.awt.Dimension(664, 320));
        jPanel.setPreferredSize(new java.awt.Dimension(664, 320));

        lblReports.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lblReports.setForeground(new java.awt.Color(0, 102, 255));
        lblReports.setText("RELATÓRIOS");

        btnReportsClients.setBackground(new java.awt.Color(0, 102, 255));
        btnReportsClients.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnReportsClients.setForeground(new java.awt.Color(255, 255, 255));
        btnReportsClients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_c_client.png"))); // NOI18N
        btnReportsClients.setText("CLIENTES");
        btnReportsClients.setMaximumSize(new java.awt.Dimension(230, 100));
        btnReportsClients.setMinimumSize(new java.awt.Dimension(230, 100));
        btnReportsClients.setPreferredSize(new java.awt.Dimension(300, 100));
        btnReportsClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsClientsActionPerformed(evt);
            }
        });

        btnReportsTotalProfit.setBackground(new java.awt.Color(0, 102, 255));
        btnReportsTotalProfit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnReportsTotalProfit.setForeground(new java.awt.Color(255, 255, 255));
        btnReportsTotalProfit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_r_total_profit.png"))); // NOI18N
        btnReportsTotalProfit.setText("LUCRO TOTAL");
        btnReportsTotalProfit.setMaximumSize(new java.awt.Dimension(230, 100));
        btnReportsTotalProfit.setMinimumSize(new java.awt.Dimension(230, 100));
        btnReportsTotalProfit.setPreferredSize(new java.awt.Dimension(300, 100));
        btnReportsTotalProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsTotalProfitActionPerformed(evt);
            }
        });

        btnReportsEarnings.setBackground(new java.awt.Color(0, 102, 255));
        btnReportsEarnings.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnReportsEarnings.setForeground(new java.awt.Color(255, 255, 255));
        btnReportsEarnings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_r_earnings.png"))); // NOI18N
        btnReportsEarnings.setText("GANHOS");
        btnReportsEarnings.setMaximumSize(new java.awt.Dimension(230, 100));
        btnReportsEarnings.setMinimumSize(new java.awt.Dimension(230, 100));
        btnReportsEarnings.setPreferredSize(new java.awt.Dimension(300, 100));
        btnReportsEarnings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsEarningsActionPerformed(evt);
            }
        });

        btnReportsEa.setBackground(new java.awt.Color(0, 102, 255));
        btnReportsEa.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnReportsEa.setForeground(new java.awt.Color(255, 255, 255));
        btnReportsEa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/m_r_spending.png"))); // NOI18N
        btnReportsEa.setText("GASTOS");
        btnReportsEa.setMaximumSize(new java.awt.Dimension(230, 100));
        btnReportsEa.setMinimumSize(new java.awt.Dimension(230, 100));
        btnReportsEa.setPreferredSize(new java.awt.Dimension(300, 100));
        btnReportsEa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsEaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnReportsTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportsClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnReportsEa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportsEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblReports)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReports)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnReportsClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportsTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnReportsEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportsEa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportsClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsClientsActionPerformed

    private void btnReportsEarningsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsEarningsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsEarningsActionPerformed

    private void btnReportsEaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsEaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsEaActionPerformed

    private void btnReportsTotalProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsTotalProfitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsTotalProfitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportsClients;
    private javax.swing.JButton btnReportsEa;
    private javax.swing.JButton btnReportsEarnings;
    private javax.swing.JButton btnReportsTotalProfit;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblReports;
    // End of variables declaration//GEN-END:variables

    private void configForm(){
        this.setTitle("Relatorio");
        this.setResizable(false);
    }
}
