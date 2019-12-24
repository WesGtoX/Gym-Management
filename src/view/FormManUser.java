package view;

import controller.UserDAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.User;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormManUser extends javax.swing.JInternalFrame {
    
    public static int flag;                     //flag of first login
    private int tab;                            //flag of tab on start
    
    public FormManUser() {
        initComponents();
        fillCbxUserfunction();
        fillcbxRestrictions();
        configForm();
        jtpUser.setSelectedIndex(tab);
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpUser = new javax.swing.JTabbedPane();
        jtpRegisterUser = new javax.swing.JPanel();
        lblUserpermissions = new javax.swing.JLabel();
        lblUserresponsible = new javax.swing.JLabel();
        txtUserresponsible = new javax.swing.JTextField();
        lblUserpassword = new javax.swing.JLabel();
        lblUserpassword2 = new javax.swing.JLabel();
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
        txtUserpassword = new javax.swing.JPasswordField();
        txtUserpassword2 = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        jtpSeachUser = new javax.swing.JPanel();
        txtInputData = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        rdbSrcId = new javax.swing.JRadioButton();
        rdbSrcName = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar Usuários");
        setMaximumSize(new java.awt.Dimension(750, 400));
        setMinimumSize(new java.awt.Dimension(300, 225));
        setPreferredSize(new java.awt.Dimension(750, 325));

        jtpUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtpUser.setMinimumSize(new java.awt.Dimension(300, 400));
        jtpUser.setPreferredSize(new java.awt.Dimension(734, 295));

        jtpRegisterUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtpRegisterUser.setMaximumSize(new java.awt.Dimension(800, 400));
        jtpRegisterUser.setMinimumSize(new java.awt.Dimension(750, 400));
        jtpRegisterUser.setPreferredSize(new java.awt.Dimension(400, 400));

        lblUserpermissions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserpermissions.setText("Permissões do usuário");

        lblUserresponsible.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserresponsible.setText("Responsável pelo cadastro");

        txtUserresponsible.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUserpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserpassword.setText("Senha do usuário");

        lblUserpassword2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserpassword2.setText("Confirmação de senha");

        lblUserdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserdate.setText("Data de cadastro");

        txtUseremail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUseremail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUseremail.setText("E-mail do usuário");

        lblUserid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUserid.setText("ID");

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

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
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

        btnExit.setBackground(new java.awt.Color(102, 102, 102));
        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtpRegisterUserLayout = new javax.swing.GroupLayout(jtpRegisterUser);
        jtpRegisterUser.setLayout(jtpRegisterUserLayout);
        jtpRegisterUserLayout.setHorizontalGroup(
            jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpRegisterUserLayout.createSequentialGroup()
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserpassword)
                            .addComponent(txtUserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserpassword2)
                            .addComponent(txtUserpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserresponsible)
                            .addComponent(txtUserresponsible)))
                    .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                                .addComponent(lblUseremail)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtUseremail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxUserOccupation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUserpermissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserid)
                            .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername)
                            .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserdate)
                            .addComponent(txtUserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jtpRegisterUserLayout.setVerticalGroup(
            jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                            .addComponent(lblUsername)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jtpRegisterUserLayout.createSequentialGroup()
                            .addComponent(lblUserid)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                        .addComponent(lblUserdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                        .addComponent(lblUserpassword)
                        .addGap(31, 31, 31))
                    .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                        .addComponent(lblUserpassword2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                        .addComponent(lblUserresponsible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserresponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                            .addComponent(lblUseremail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUseremail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                            .addComponent(lblUserpermissions)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpRegisterUserLayout.createSequentialGroup()
                            .addComponent(lblUserFunction)
                            .addGap(31, 31, 31))
                        .addGroup(jtpRegisterUserLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(cbxUserOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jtpUser.addTab("Usuários", jtpRegisterUser);

        jtpSeachUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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
        rdbSrcId.setText("ID");
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

        javax.swing.GroupLayout jtpSeachUserLayout = new javax.swing.GroupLayout(jtpSeachUser);
        jtpSeachUser.setLayout(jtpSeachUserLayout);
        jtpSeachUserLayout.setHorizontalGroup(
            jtpSeachUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpSeachUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpSeachUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(jtpSeachUserLayout.createSequentialGroup()
                        .addComponent(rdbSrcId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbSrcName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInputData)))
                .addContainerGap())
        );
        jtpSeachUserLayout.setVerticalGroup(
            jtpSeachUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpSeachUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpSeachUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSrcId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbSrcName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpUser.addTab("Pesquisar", jtpSeachUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpUser, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        setState(true);
        setData();
        cbxPermissions.setSelectedIndex(this.flag != 1 ? 0 : 1);
        cbxPermissions.setEnabled(this.flag != 1 ? true : false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        setState(true);
        btnDelete.setEnabled(true);
        btnModify.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setState(false);
        btnModify.setEnabled(this.flag != 1 ? true : false);
        btnDelete.setEnabled(this.flag == 1 ? false : true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        setState(true);
        btnModify.setEnabled(true);
        if(txtUserid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selecione um registro para excluir.","Atenção",JOptionPane.WARNING_MESSAGE);            
        }  
        
        if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,"Tem certeza de que deseja excluir o registro selecionado?","Atenção",JOptionPane.YES_NO_OPTION)){
            int id_removed = new UserDAO().delete(Integer.parseInt(txtUserid.getText()));
            JOptionPane.showMessageDialog(null,"Usuário "+txtUsername.getText()+" removido com sucesso!");
        }
        
        filltblUsers(new UserDAO().searchAll());
//        fillForm(0);
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
        
        String usr = txtUsername.getText();
        String psw = new String(txtUserpassword.getPassword()).toUpperCase();
        String psw2 = new String(txtUserpassword2.getPassword()).toUpperCase();
        
        if(psw.length() >100){
            JOptionPane.showMessageDialog(null,"A senha informada é muito longa!","Atenção",JOptionPane.WARNING_MESSAGE);            
            txtUserpassword.setText("");
            txtUserpassword2.setText("");
            txtUserpassword.requestFocus();
        }    
        
        if(usr.isEmpty() || psw.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Usuário e senha são campos obrigatórios!","Atenção",JOptionPane.WARNING_MESSAGE);            
            if(!usr.isEmpty()){
                txtUserpassword.requestFocus();
            }else{
                txtUsername.requestFocus();
            }
            
        }else if(!psw.equals(psw2)){
            
            JOptionPane.showMessageDialog(null,"As senhas não coincidem!","Atenção",JOptionPane.WARNING_MESSAGE); 
            txtUserpassword.requestFocus();
            
        }else{
            
            setState(false);
            Long id = (txtUserid.getText().isEmpty() ? null : Long.parseLong(txtUserid.getText()));
            btnModify.setEnabled(true);
            
            try {
                MessageDigest m = MessageDigest.getInstance("MD5");
                m.reset();
                m.update(psw.getBytes(), 0, psw.length());
                BigInteger pwd1 = new BigInteger(1, m.digest());
                psw = String.format("%1$032X", pwd1);
            }catch (Exception e) {
                System.out.println("Erro ao criptografar senha, erro: "+e.getMessage());
            }
            
            int id_new = new UserDAO().save(
                new User(
                    id,
                    txtUsername.getText(),
                    txtUserdate.getText(),
                    psw,
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
            setState(false);
            btnModify.setEnabled(this.flag != 1 ? true : false);
            btnDelete.setEnabled(this.flag == 1 ? false : true);
            filltblUsers(new UserDAO().searchAll());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        
        fillForm(tblUsers.getSelectedRow());
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
        
    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxPermissions;
    private javax.swing.JComboBox<String> cbxUserOccupation;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jtpRegisterUser;
    private javax.swing.JPanel jtpSeachUser;
    private javax.swing.JTabbedPane jtpUser;
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
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtInputData;
    private javax.swing.JFormattedTextField txtUserdate;
    private javax.swing.JTextField txtUseremail;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtUserpassword;
    private javax.swing.JPasswordField txtUserpassword2;
    private javax.swing.JTextField txtUserresponsible;
    // End of variables declaration//GEN-END:variables
    
    public void fillCbxUserfunction(){
        String functions[] = {"----------","Atendente","Gerente","Instrutor"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(functions);
        cbxUserOccupation.setModel(model);
    }
    
    public void fillcbxRestrictions(){
        String restrictions[] = {"----------","Administrador","Funcionário"};
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
        for(User u : list_user){
            users.addRow(new Object[]{
                u.getId(),u.getName(),
                cbxUserOccupation.getItemAt(u.getOccupation()),
                u.getDate()
            });
        }
        try{
            DefaultTableModel models = (DefaultTableModel) tblUsers.getModel();
            tblUsers.setRowSorter(new TableRowSorter(users));
        }
        catch (Exception ex) {
            System.out.println("Erro ao ordenar tabela");
        }
    }
    
    private void configForm() {
        this.setTitle("Gerenciar Usuários");
        this.setResizable(false);
        
//        setState(this.flag != 1 ? false : true);
        setState(false);
        setData();
        filltblUsers(new UserDAO().searchAll());
        rdbSrcName.setSelected(true);
        if(this.flag == 1){
            cbxPermissions.setSelectedIndex(this.flag != 1 ? 0 : 1);
            cbxPermissions.setEnabled(this.flag != 1 ? true : false);
        }
    }
    
    public void setState(boolean st){
        txtUserid.setEnabled(false);
        btnCancel.setEnabled(st);
        btnModify.setEnabled(flag != 1 ? st : false);
        btnDelete.setEnabled(flag != 1 ? st : false);
        cbxPermissions.setEnabled(st);
        btnNew.setEnabled(!st);
        btnSave.setEnabled(st);
        txtUsername.setEnabled(st);
        txtUserdate.setEnabled(st);
        txtUserpassword.setEnabled(st);
        txtUserpassword2.setEnabled(st);
        txtUserresponsible.setEnabled(st);
        txtUseremail.setEnabled(st);
        cbxUserOccupation.setEnabled(st);
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
    
    public void selectTab(int num_tab){
        jtpUser.setSelectedIndex(num_tab);
    }
    
}
