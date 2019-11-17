package view;

import controller.UserDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;

/**
 *
 * @author Quemuel
 */
public class FormManUser extends javax.swing.JInternalFrame {
    
    public int permissions;
    private JMenuItem aba;
    
    public FormManUser(int permissions, int tab) {
        this.aba = aba;
        this.permissions = permissions;
        initComponents();
        fillCbxUserfunction();
        fillcbxRestrictions();
        configurateForm();
        tabMain.setSelectedIndex(tab);
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
        cbxPermissions = new javax.swing.JComboBox<>();
        txtUserdate = new javax.swing.JFormattedTextField();
        cbxUserOccupation = new javax.swing.JComboBox<>();
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
        tblUsers = new javax.swing.JTable();
        rdbSrcId = new javax.swing.JRadioButton();
        rdbSrcName = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar Usuários");
        setMinimumSize(new java.awt.Dimension(300, 225));
        setPreferredSize(new java.awt.Dimension(578, 327));

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

        txtUserid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsername.setText("Nome do usuário");

        cbxPermissions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxPermissions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            txtUserdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUserdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cbxUserOccupation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxUserOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUserFunction.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserFunction.setText("Cargo");

        btnSave.setBackground(new java.awt.Color(0, 102, 255));
        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 102, 255));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(0, 102, 255));
        btnModify.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Alterar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 102, 255));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(0, 102, 255));
        btnNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabManUserLayout = new javax.swing.GroupLayout(tabManUser);
        tabManUser.setLayout(tabManUserLayout);
        tabManUserLayout.setHorizontalGroup(
            tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabManUserLayout.createSequentialGroup()
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabManUserLayout.createSequentialGroup()
                                        .addComponent(lblUseremail)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtUseremail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxUserOccupation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUserFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUserpermissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(tabManUserLayout.createSequentialGroup()
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserid)
                                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserdate)
                                    .addComponent(txtUserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(tabManUserLayout.createSequentialGroup()
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserpassword)
                                    .addGroup(tabManUserLayout.createSequentialGroup()
                                        .addComponent(lblUserpassword)
                                        .addGap(63, 63, 63)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserpassword2)
                                    .addGroup(tabManUserLayout.createSequentialGroup()
                                        .addComponent(lblUserpassword2)
                                        .addGap(32, 32, 32)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserresponsible)
                                    .addComponent(txtUserresponsible)))
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tabManUserLayout.setVerticalGroup(
            tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManUserLayout.createSequentialGroup()
                .addContainerGap()
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
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUserpassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUserpassword2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUserresponsible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserresponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabManUserLayout.createSequentialGroup()
                                .addComponent(lblUseremail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUseremail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManUserLayout.createSequentialGroup()
                                .addComponent(lblUserFunction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUserOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabManUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(tabManUserLayout.createSequentialGroup()
                        .addComponent(lblUserpermissions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabMain.addTab("Usuários", tabManUser);

        tabSrcUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtInputData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtInputData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputDataKeyReleased(evt);
            }
        });

        tblUsers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.setPreferredSize(new java.awt.Dimension(600, 341));
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsers);

        rdbSrcId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbSrcId.setText("Id");
        rdbSrcId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSrcIdActionPerformed(evt);
            }
        });

        rdbSrcName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbSrcName.setText("Nome");
        rdbSrcName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSrcNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabSrcUserLayout = new javax.swing.GroupLayout(tabSrcUser);
        tabSrcUser.setLayout(tabSrcUserLayout);
        tabSrcUserLayout.setHorizontalGroup(
            tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(tabSrcUserLayout.createSequentialGroup()
                        .addComponent(rdbSrcId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbSrcName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInputData)))
                .addContainerGap())
        );
        tabSrcUserLayout.setVerticalGroup(
            tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSrcId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbSrcName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMain.addTab("Pesquisar", tabSrcUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        setState(false);
        setData();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        setState(false);
        btnDelete.setEnabled((this.permissions != 0) ? true : false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setState(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        setState(true);
        btnModify.setEnabled((this.permissions != 0) ? true : false);
        if(txtUserid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selecione um registro para excluir.","Atenção",JOptionPane.WARNING_MESSAGE);            
        }  
        
        if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,"Tem certeza de que deseja excluir o registro selecionado?","Atenção",JOptionPane.YES_NO_OPTION)){
            int id_removed = new UserDAO().delete(Integer.parseInt(txtUserid.getText()));
            JOptionPane.showMessageDialog(null,"Usuário "+txtUsername.getText()+" removido com sucesso!");
        }
        
        filltblUsers(new UserDAO().searchAll());
        fillForm(0);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void rdbSrcNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSrcNameActionPerformed
        rdbSrcId.setSelected(false);
    }//GEN-LAST:event_rdbSrcNameActionPerformed

    private void rdbSrcIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSrcIdActionPerformed
        rdbSrcName.setSelected(false);
    }//GEN-LAST:event_rdbSrcIdActionPerformed

    private void txtInputDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputDataKeyReleased
        if(rdbSrcId.isSelected() && !txtInputData.getText().isEmpty()){
            filltblUsers(new UserDAO().searchId(Integer.parseInt(txtInputData.getText())));
        }else if(rdbSrcName.isSelected() && !txtInputData.getText().isEmpty()){
            filltblUsers(new UserDAO().searchName(txtInputData.getText()));
        }else{
            filltblUsers(new UserDAO().searchAll());
        }
    }//GEN-LAST:event_txtInputDataKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        setState(false);
        Long id = (txtUserid.getText().isEmpty() ? null : Long.parseLong(txtUserid.getText()));
        btnModify.setEnabled((this.permissions != 0) ? true : false);
        int id_new = new UserDAO().save(
            new User(
                id,
                txtUsername.getText(),
                txtUserdate.getText(),
                txtUserpassword.getText(),
                txtUseremail.getText(),
                txtUserresponsible.getText(),
                cbxUserOccupation.getSelectedIndex(),
                cbxPermissions.getSelectedIndex()
            )
        );
        if(id_new == -1){
            JOptionPane.showMessageDialog(null,"Não foi possível cadastrar o novo usuário");
        };
        txtUserid.setText(String.valueOf(id_new));
        setState(true);
        filltblUsers(new UserDAO().searchAll());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        
        fillForm(tblUsers.getSelectedRow());
        
        //select tab ManUser
        tabMain.setSelectedIndex(0);
    }//GEN-LAST:event_tblUsersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxPermissions;
    private javax.swing.JComboBox<String> cbxUserOccupation;
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
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtInputData;
    private javax.swing.JFormattedTextField txtUserdate;
    private javax.swing.JTextField txtUseremail;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUserpassword;
    private javax.swing.JTextField txtUserpassword2;
    private javax.swing.JTextField txtUserresponsible;
    // End of variables declaration//GEN-END:variables
    
    public void fillCbxUserfunction(){
        String functions[] = {"Atendente","Instrutor","Gerente"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(functions);
        cbxUserOccupation.setModel(model);
    }
    
    public void fillcbxRestrictions(){
        String restrictions[] = {"Funcionário","Administrador"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(restrictions);
        cbxPermissions.setModel(model);
    }
    
    public void filltblUsers(List<User> list_user){
        DefaultTableModel users = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            } 
        };
        users.addColumn("Id");
        users.addColumn("Nome");
        users.addColumn("Cargo");
        users.addColumn("Data de cadastro");
        tblUsers.setModel(users);
        String occupation = "";
        for(User u : list_user){
            
            users.addRow(new Object[]{
                u.getId(),u.getName(),
                cbxUserOccupation.getItemAt(u.getOccupation()),
                u.getDate()
            });
        }
    }
    
    private void configurateForm(){
        setState(true);
        filltblUsers(new UserDAO().searchAll());
        rdbSrcId.setSelected(true);
        fillForm(0);
    }
    
    public void setState(boolean st){
        txtUserid.setEnabled(false);
        if(this.permissions != 0){
            btnModify.setEnabled(st);
            btnDelete.setEnabled(st);
            cbxPermissions.setEnabled(!st);
            btnNew.setEnabled(st);
        }else{
            btnModify.setEnabled(false);
            btnDelete.setEnabled(false);
            cbxPermissions.setEnabled(false);
            btnNew.setEnabled(false);
        }
        btnSave.setEnabled(!st);
        txtUsername.setEnabled(!st);
        txtUserdate.setEnabled(!st);
        txtUserpassword.setEnabled(!st);
        txtUserpassword2.setEnabled(!st);
        txtUserresponsible.setEnabled(!st);
        txtUseremail.setEnabled(!st);
        cbxUserOccupation.setEnabled(!st);
    }
    
    public void setData(){
        txtUserid.setText("");
        txtUsername.setText("");
        txtUserdate.setText("");
        txtUserpassword.setText("");
        txtUserpassword2.setText("");
        txtUseremail.setText("");
        txtUserresponsible.setText("");
        cbxUserOccupation.setSelectedIndex(0);
        cbxPermissions.setSelectedIndex(0);
    }
    
    private void fillForm(int line){
        //search Id from row selected in table
        Long id = (Long) tblUsers.getValueAt(line,0);
        List<User> form = new UserDAO().searchId(id.intValue());
        
        //insert selected object into form
        for(User u : form){
            txtUserid.setText(u.getId().toString());
            txtUsername.setText(u.getName());
            txtUserdate.setText(u.getDate());
            txtUseremail.setText(u.getEmail());
            cbxUserOccupation.setSelectedIndex(u.getOccupation());
            txtUserpassword.setText(u.getPassword());
            cbxPermissions.setSelectedIndex(u.getPermissions());
            txtUserresponsible.setText(u.getResponsible()); 
        }
    }
}
