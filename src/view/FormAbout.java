package view;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormAbout extends javax.swing.JInternalFrame {

    public FormAbout() {
        initComponents();
        configForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateBy = new javax.swing.JLabel();
        lblDeveloper1 = new javax.swing.JLabel();
        lblDeveloper2 = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        lblAbout = new javax.swing.JLabel();
        jpnPanelLogo = new javax.swing.JPanel();
        lblSysLogo = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(533, 400));
        setPreferredSize(new java.awt.Dimension(533, 400));

        lblCreateBy.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCreateBy.setText("Criado por:");

        lblDeveloper1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDeveloper1.setText("Wesley de Oliveira Mendes, 828.507");

        lblDeveloper2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDeveloper2.setText("Quemuel Alves Nassor, 828.461");

        lblCopyright.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblCopyright.setText("Copyright © 2019. All rights reserved.");

        lblAbout.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAbout.setText("Some text");
        lblAbout.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jpnPanelLogo.setBackground(new java.awt.Color(0, 102, 255));

        lblSysLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_gym_management1.png"))); // NOI18N

        javax.swing.GroupLayout jpnPanelLogoLayout = new javax.swing.GroupLayout(jpnPanelLogo);
        jpnPanelLogo.setLayout(jpnPanelLogoLayout);
        jpnPanelLogoLayout.setHorizontalGroup(
            jpnPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPanelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSysLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnPanelLogoLayout.setVerticalGroup(
            jpnPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPanelLogoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lblSysLogo)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreateBy)
                            .addComponent(lblDeveloper1)
                            .addComponent(lblDeveloper2)
                            .addComponent(lblCopyright))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jpnPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(94, 94, 94)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCreateBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeveloper1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeveloper2)
                .addGap(18, 18, 18)
                .addComponent(lblCopyright)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JPanel jpnPanelLogo;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblCreateBy;
    private javax.swing.JLabel lblDeveloper1;
    private javax.swing.JLabel lblDeveloper2;
    private javax.swing.JLabel lblSysLogo;
    // End of variables declaration//GEN-END:variables

    private void configForm(){
        this.setTitle("Sobre");
        this.setResizable(false);
    }
}
