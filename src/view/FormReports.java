package view;

import controller.DBconnect;
import java.sql.Connection;
import java.util.HashMap;
import report.report;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormReports extends javax.swing.JInternalFrame {
    
    public static String ordination = "";
    public static String exp;
    public static String report;
        
    public FormReports() {        
        initComponents();
        configForm();
        rdbSrcName.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        lblReports = new javax.swing.JLabel();
        btnDisplayReport = new javax.swing.JButton();
        btnExportPDF = new javax.swing.JButton();
        btnExportXLSx = new javax.swing.JButton();
        rdbSrcName = new javax.swing.JRadioButton();
        rdbSrcId = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(346, 530));
        setMinimumSize(new java.awt.Dimension(346, 530));
        setPreferredSize(new java.awt.Dimension(346, 530));

        jPanel.setMaximumSize(new java.awt.Dimension(320, 500));
        jPanel.setMinimumSize(new java.awt.Dimension(320, 500));
        jPanel.setPreferredSize(new java.awt.Dimension(320, 500));

        lblReports.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lblReports.setForeground(new java.awt.Color(0, 102, 255));
        lblReports.setText("RELATÓRIOS");

        btnDisplayReport.setBackground(new java.awt.Color(0, 102, 255));
        btnDisplayReport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDisplayReport.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/r_show_report.png"))); // NOI18N
        btnDisplayReport.setText("Exibir relatório");
        btnDisplayReport.setMaximumSize(new java.awt.Dimension(230, 100));
        btnDisplayReport.setMinimumSize(new java.awt.Dimension(230, 100));
        btnDisplayReport.setPreferredSize(new java.awt.Dimension(300, 100));
        btnDisplayReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayReportActionPerformed(evt);
            }
        });

        btnExportPDF.setBackground(new java.awt.Color(0, 102, 255));
        btnExportPDF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExportPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnExportPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/r_export_pdf.png"))); // NOI18N
        btnExportPDF.setText("Exportar como PDF");
        btnExportPDF.setMaximumSize(new java.awt.Dimension(230, 100));
        btnExportPDF.setMinimumSize(new java.awt.Dimension(230, 100));
        btnExportPDF.setPreferredSize(new java.awt.Dimension(300, 100));
        btnExportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportPDFActionPerformed(evt);
            }
        });

        btnExportXLSx.setBackground(new java.awt.Color(0, 102, 255));
        btnExportXLSx.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExportXLSx.setForeground(new java.awt.Color(255, 255, 255));
        btnExportXLSx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/r_export_xlsx.png"))); // NOI18N
        btnExportXLSx.setText("Exportar como XLSx");
        btnExportXLSx.setMaximumSize(new java.awt.Dimension(230, 100));
        btnExportXLSx.setMinimumSize(new java.awt.Dimension(230, 100));
        btnExportXLSx.setPreferredSize(new java.awt.Dimension(300, 100));
        btnExportXLSx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportXLSxActionPerformed(evt);
            }
        });

        rdbSrcName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbSrcName.setText("Nome");
        rdbSrcName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSrcNameActionPerformed(evt);
            }
        });

        rdbSrcId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbSrcId.setText("ID");
        rdbSrcId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSrcIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Selecione a ordem dos dados");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblReports)
                    .addComponent(btnDisplayReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(rdbSrcId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbSrcName))
                    .addComponent(jLabel1)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnExportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExportXLSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReports)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSrcId)
                    .addComponent(rdbSrcName))
                .addGap(18, 18, 18)
                .addComponent(btnDisplayReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportXLSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportXLSxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportXLSxActionPerformed
        Connection con = DBconnect.Connect();
        HashMap<String,Object> map = new HashMap<>();
        map.put("TYPE_SORT",ordination);
        exp = "XLSx";
        new report().display(con,report,map);
        DBconnect.Disconnect(con);
    }//GEN-LAST:event_btnExportXLSxActionPerformed

    private void btnDisplayReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayReportActionPerformed
        HashMap<String,Object> map = new HashMap<>();
        map.put("TYPE_SORT",ordination);
        Connection con = DBconnect.Connect();
        new report().display(con,report,map);
        DBconnect.Disconnect(con);
    }//GEN-LAST:event_btnDisplayReportActionPerformed

    private void btnExportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportPDFActionPerformed
        Connection con = DBconnect.Connect();
        HashMap<String,Object> map = new HashMap<>();
        map.put("TYPE_SORT",ordination);
        exp = "PDF";
        new report().display(con,report,map);
        DBconnect.Disconnect(con);
    }//GEN-LAST:event_btnExportPDFActionPerformed

    private void rdbSrcNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSrcNameActionPerformed
        if(rdbSrcName.isSelected()){
            ordination = "name";
        }
        rdbSrcId.setSelected(false);
    }//GEN-LAST:event_rdbSrcNameActionPerformed

    private void rdbSrcIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSrcIdActionPerformed
        if(rdbSrcId.isSelected()){
            ordination = "id";
        }
        rdbSrcName.setSelected(false);
    }//GEN-LAST:event_rdbSrcIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayReport;
    private javax.swing.JButton btnExportPDF;
    private javax.swing.JButton btnExportXLSx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblReports;
    private javax.swing.JRadioButton rdbSrcId;
    private javax.swing.JRadioButton rdbSrcName;
    // End of variables declaration//GEN-END:variables

    private void configForm(){
        this.setTitle("Relatorio");
        this.setResizable(false);
    }
}
