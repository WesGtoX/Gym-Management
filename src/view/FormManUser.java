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

        tabMain = new javax.swing.JTabbedPane();
        tabManUser = new javax.swing.JPanel();
        lblUserpermissions = new javax.swing.JLabel();
        lblUserresponsible = new javax.swing.JLabel();
        txtUserresponsible = new javax.swing.JTextField();
        txtUserpassword = new javax.swing.JTextField();
        lblUserpassword = new javax.swing.JLabel();
        lblUserpassword2 = new javax.swing.JLabel();
        txtUserpassword2 = new javax.swing.JTextField();
        lblUserdate = new javax.swing.JLabel();
        txtUseremail = new javax.swing.JTextField();
        lblUseremail = new javax.swing.JLabel();
        lblUserid = new javax.swing.JLabel();
        txtUserid = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        cbxRestrictions = new javax.swing.JComboBox<>();
        txtUserdate = new javax.swing.JFormattedTextField();
        cbxUserFunction = new javax.swing.JComboBox<>();
        lblUserFunction = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tabSrcUser = new javax.swing.JPanel();
        txtInputData = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistoric1 = new javax.swing.JTable();
        rdbSrcId = new javax.swing.JRadioButton();
        rdbSrcName = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar Usuários");
        setMinimumSize(new java.awt.Dimension(300, 225));
        setPreferredSize(new java.awt.Dimension(636, 470));

        tabMain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tabManUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabManUser.setPreferredSize(new java.awt.Dimension(793, 600));

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

        try {
            txtUserdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUserdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cbxUserFunction.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxUserFunction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUserFunction.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserFunction.setText("Cargo");

        btnSave.setBackground(new java.awt.Color(0, 102, 255));
        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Salvar");

        btnCancel.setBackground(new java.awt.Color(0, 102, 255));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");

        btnModify.setBackground(new java.awt.Color(0, 102, 255));
        btnModify.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Alterar");

        btnDelete.setBackground(new java.awt.Color(0, 102, 255));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Excluir");

        btnNew.setBackground(new java.awt.Color(0, 102, 255));
        btnNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("Novo");

        javax.swing.GroupLayout tabManUserLayout = new javax.swing.GroupLayout(tabManUser);
        tabManUser.setLayout(tabManUserLayout);
        tabManUserLayout.setHorizontalGroup(
            tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManUserLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManUserLayout.createSequentialGroup()
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserid)
                            .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserdate)
                            .addComponent(txtUserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManUserLayout.createSequentialGroup()
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserresponsible)
                            .addComponent(txtUserresponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUseremail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUseremail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabManUserLayout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUserpassword2)
                                .addComponent(txtUserpassword)
                                .addGroup(tabManUserLayout.createSequentialGroup()
                                    .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUserpassword2)
                                        .addComponent(lblUserpassword))
                                    .addGap(32, 32, 32))))
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabManUserLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxUserFunction, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUserFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUserpermissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxRestrictions, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(tabManUserLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel)
                                .addGap(29, 29, 29)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        tabManUserLayout.setVerticalGroup(
            tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManUserLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabManUserLayout.createSequentialGroup()
                            .addComponent(lblUsername)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabManUserLayout.createSequentialGroup()
                            .addComponent(lblUserid)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUserdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUserresponsible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserresponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUseremail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUseremail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUserpassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabManUserLayout.createSequentialGroup()
                            .addComponent(lblUserpermissions)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxRestrictions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tabManUserLayout.createSequentialGroup()
                            .addComponent(lblUserFunction)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxUserFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblUserpassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        tabMain.addTab("Usuários", tabManUser);

        tabSrcUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtInputData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tblHistoric1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblHistoric1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHistoric1.setPreferredSize(new java.awt.Dimension(600, 341));
        jScrollPane2.setViewportView(tblHistoric1);

        rdbSrcId.setText("Id");

        rdbSrcName.setText("Nome");

        javax.swing.GroupLayout tabSrcUserLayout = new javax.swing.GroupLayout(tabSrcUser);
        tabSrcUser.setLayout(tabSrcUserLayout);
        tabSrcUserLayout.setHorizontalGroup(
            tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbSrcId)
                .addGap(18, 18, 18)
                .addComponent(rdbSrcName)
                .addGap(18, 18, 18)
                .addComponent(txtInputData))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        tabSrcUserLayout.setVerticalGroup(
            tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSrcId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbSrcName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMain.addTab("Pesquisar", tabSrcUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxRestrictions;
    private javax.swing.JComboBox<String> cbxUserFunction;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUserFunction;
    private javax.swing.JLabel lblUserdate;
    private javax.swing.JLabel lblUseremail;
    private javax.swing.JLabel lblUserid;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUserpassword;
    private javax.swing.JLabel lblUserpassword2;
    private javax.swing.JLabel lblUserpermissions;
    private javax.swing.JLabel lblUserresponsible;
    private javax.swing.JRadioButton rdbSrcId;
    private javax.swing.JRadioButton rdbSrcName;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JPanel tabManUser;
    private javax.swing.JPanel tabSrcUser;
    private javax.swing.JTable tblHistoric1;
    private javax.swing.JTextField txtInputData;
    private javax.swing.JFormattedTextField txtUserdate;
    private javax.swing.JTextField txtUseremail;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUserpassword;
    private javax.swing.JTextField txtUserpassword2;
    private javax.swing.JTextField txtUserresponsible;
    // End of variables declaration//GEN-END:variables
}
