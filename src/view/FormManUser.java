/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author quemu
 */
public class FormManUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormManUser2
     */
    public FormManUser() {
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

        PnlInternalbox = new javax.swing.JPanel();
        lblUserpermissions = new javax.swing.JLabel();
        lblUserresponsible = new javax.swing.JLabel();
        txtUserresponsible = new javax.swing.JTextField();
        txtUserpassword = new javax.swing.JTextField();
        lblUserpassword = new javax.swing.JLabel();
        lblUserpassword2 = new javax.swing.JLabel();
        txtUserdate = new javax.swing.JFormattedTextField();
        txtUserpassword2 = new javax.swing.JTextField();
        lblUserdate = new javax.swing.JLabel();
        txtUseremail = new javax.swing.JTextField();
        lblUseremail = new javax.swing.JLabel();
        lblUserid = new javax.swing.JLabel();
        txtUserid = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        cbxRestrictions = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gerenciar Usuários");
        setMinimumSize(new java.awt.Dimension(300, 225));

        PnlInternalbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUserpermissions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserpermissions.setText("Permissões do usuário");

        lblUserresponsible.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserresponsible.setText("Responsável pelo cadastro");

        txtUserresponsible.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtUserpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUserpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserpassword.setText("Senha do usuário");

        lblUserpassword2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserpassword2.setText("Confirmação de senha");

        txtUserdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("##/##/####"))));
        txtUserdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtUserpassword2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUserdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserdate.setText("Data de cadastro");

        txtUseremail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUseremail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUseremail.setText("E-mail do usuário");

        lblUserid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserid.setText("Id");

        txtUserid.setEditable(false);
        txtUserid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsername.setText("Nome do usuário");

        cbxRestrictions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxRestrictions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PnlInternalboxLayout = new javax.swing.GroupLayout(PnlInternalbox);
        PnlInternalbox.setLayout(PnlInternalboxLayout);
        PnlInternalboxLayout.setHorizontalGroup(
            PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlInternalboxLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserresponsible)
                    .addComponent(txtUserresponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserid)
                            .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUseremail)
                            .addComponent(txtUseremail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserpassword)
                            .addComponent(txtUserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserpassword2)
                            .addComponent(txtUserpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserdate)))
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUserpermissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxRestrictions, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        PnlInternalboxLayout.setVerticalGroup(
            PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInternalboxLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblUserid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addComponent(lblUseremail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUseremail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 49, Short.MAX_VALUE)
                .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addComponent(lblUserdate)
                        .addGap(29, 29, 29))
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addComponent(lblUserpassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlInternalboxLayout.createSequentialGroup()
                        .addComponent(lblUserpassword2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlInternalboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblUserresponsible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserresponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUserpermissions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxRestrictions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(PnlInternalbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(PnlInternalbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlInternalbox;
    private javax.swing.JComboBox<String> cbxRestrictions;
    private javax.swing.JLabel lblUserdate;
    private javax.swing.JLabel lblUseremail;
    private javax.swing.JLabel lblUserid;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUserpassword;
    private javax.swing.JLabel lblUserpassword2;
    private javax.swing.JLabel lblUserpermissions;
    private javax.swing.JLabel lblUserresponsible;
    private javax.swing.JFormattedTextField txtUserdate;
    private javax.swing.JTextField txtUseremail;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUserpassword;
    private javax.swing.JTextField txtUserpassword2;
    private javax.swing.JTextField txtUserresponsible;
    // End of variables declaration//GEN-END:variables
}
