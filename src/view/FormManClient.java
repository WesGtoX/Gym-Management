package view;

import controller.ClientDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormManClient extends javax.swing.JInternalFrame {
    
    public FormManClient() {
        initComponents();
        configForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpClient = new javax.swing.JTabbedPane();
        jpnRegisterClient = new javax.swing.JPanel();
        lblCliCode = new javax.swing.JLabel();
        txtCliCode = new javax.swing.JTextField();
        lblCliName = new javax.swing.JLabel();
        txtCliName = new javax.swing.JTextField();
        lblCliCPF = new javax.swing.JLabel();
        fmtCliCpf = new javax.swing.JFormattedTextField();
        lblCliDate = new javax.swing.JLabel();
        fmtCliDate = new javax.swing.JFormattedTextField();
        lblCliSex = new javax.swing.JLabel();
        cbxCliSex = new javax.swing.JComboBox<>();
        lblCliAddress = new javax.swing.JLabel();
        txtCliAddress = new javax.swing.JTextField();
        lblCliNumber = new javax.swing.JLabel();
        txtCliNumber = new javax.swing.JTextField();
        lblCliComplement = new javax.swing.JLabel();
        txtCliComplement = new javax.swing.JTextField();
        lblCliNeighborhood = new javax.swing.JLabel();
        txtCliNeighborhood = new javax.swing.JTextField();
        lblCliCity = new javax.swing.JLabel();
        txtCliCity = new javax.swing.JTextField();
        lblCliUF = new javax.swing.JLabel();
        txtCliUF = new javax.swing.JTextField();
        lblCliCEP = new javax.swing.JLabel();
        fmtCliCEP = new javax.swing.JFormattedTextField();
        lblCliHomePhone = new javax.swing.JLabel();
        fmtCliHomePhone = new javax.swing.JFormattedTextField();
        lblCliCelPhone = new javax.swing.JLabel();
        fmtCliCelPhone = new javax.swing.JFormattedTextField();
        lblCliEmail = new javax.swing.JLabel();
        txtCliEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnNew = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jpnSearchClient = new javax.swing.JPanel();
        rdbCliCod = new javax.swing.JRadioButton();
        rdbCliName = new javax.swing.JRadioButton();
        txtInputData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(750, 400));
        setMinimumSize(new java.awt.Dimension(750, 400));
        setPreferredSize(new java.awt.Dimension(750, 400));

        jtpClient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCliCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliCode.setText("Código");

        txtCliCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliCode.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliName.setText("Nome");

        txtCliName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliName.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliCPF.setText("CPF");

        try {
            fmtCliCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCliDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliDate.setText("Data de Nascimento");

        try {
            fmtCliDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCliSex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliSex.setText("Sexo");

        cbxCliSex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxCliSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3" }));
        cbxCliSex.setPreferredSize(new java.awt.Dimension(56, 25));

        lblCliAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliAddress.setText("Endereço");

        txtCliAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliAddress.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliNumber.setText("Número");

        txtCliNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliNumber.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliComplement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliComplement.setText("Complemento");

        txtCliComplement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliComplement.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliNeighborhood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliNeighborhood.setText("Bairro");

        txtCliNeighborhood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliNeighborhood.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliCity.setText("Município");

        txtCliCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliCity.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliUF.setText("UF");

        txtCliUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliUF.setPreferredSize(new java.awt.Dimension(59, 25));

        lblCliCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliCEP.setText("CEP");

        try {
            fmtCliCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCliHomePhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliHomePhone.setText("Tel. Residêncial");

        try {
            fmtCliHomePhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCliCelPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliCelPhone.setText("Celular");

        try {
            fmtCliCelPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCliEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliEmail.setText("E-mail");

        txtCliEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliEmail.setPreferredSize(new java.awt.Dimension(59, 25));

        btnNew.setBackground(new java.awt.Color(0, 102, 255));
        btnNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(0, 102, 255));
        btnChange.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Alterar");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
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

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 102, 255));
        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        javax.swing.GroupLayout jpnRegisterClientLayout = new javax.swing.GroupLayout(jpnRegisterClient);
        jpnRegisterClient.setLayout(jpnRegisterClientLayout);
        jpnRegisterClientLayout.setHorizontalGroup(
            jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliCode)
                            .addComponent(txtCliCode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliName)
                            .addComponent(txtCliName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                                .addComponent(lblCliCPF)
                                .addGap(106, 106, 106))
                            .addComponent(fmtCliCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblCliDate))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRegisterClientLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fmtCliDate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCliSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                                .addComponent(lblCliSex)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliAddress)
                            .addComponent(txtCliAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliNumber)
                            .addComponent(txtCliNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                                .addComponent(lblCliComplement)
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addComponent(txtCliComplement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliHomePhone)
                            .addComponent(fmtCliHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliCelPhone)
                            .addComponent(fmtCliCelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                                .addComponent(lblCliEmail)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCliEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliNeighborhood)
                            .addComponent(txtCliNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliCity)
                            .addComponent(txtCliCity, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliUF)
                            .addComponent(txtCliUF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliCEP)
                            .addComponent(fmtCliCEP))))
                .addContainerGap())
        );
        jpnRegisterClientLayout.setVerticalGroup(
            jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRegisterClientLayout.createSequentialGroup()
                                .addComponent(lblCliName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRegisterClientLayout.createSequentialGroup()
                                .addComponent(lblCliCPF)
                                .addGap(4, 4, 4)))
                        .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCliSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fmtCliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fmtCliDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCliSex)
                        .addComponent(lblCliDate))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                            .addComponent(lblCliComplement)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCliComplement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                            .addComponent(lblCliNumber)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCliNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliNeighborhood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtCliCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliHomePhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtCliHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliCelPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtCliCelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRegisterClientLayout.createSequentialGroup()
                        .addComponent(lblCliEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnRegisterClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jtpClient.addTab("Dados Cadastrais", jpnRegisterClient);

        rdbCliCod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbCliCod.setText("Código");

        rdbCliName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbCliName.setText("Nome");

        txtInputData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtInputData.setPreferredSize(new java.awt.Dimension(59, 30));
        txtInputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputDataActionPerformed(evt);
            }
        });
        txtInputData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputDataKeyReleased(evt);
            }
        });

        tblClient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblClient.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClient);

        javax.swing.GroupLayout jpnSearchClientLayout = new javax.swing.GroupLayout(jpnSearchClient);
        jpnSearchClient.setLayout(jpnSearchClientLayout);
        jpnSearchClientLayout.setHorizontalGroup(
            jpnSearchClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSearchClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnSearchClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(jpnSearchClientLayout.createSequentialGroup()
                        .addComponent(rdbCliCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbCliName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnSearchClientLayout.setVerticalGroup(
            jpnSearchClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSearchClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnSearchClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCliCod)
                    .addComponent(rdbCliName)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpClient.addTab("Pesquisa", jpnSearchClient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpClient)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpClient)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        setState(true);
        
        // Limpar campos
        cleanFields();
        
        txtCliName.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (txtCliCode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para edição.");
            setState(false);
        } else {
            setState(true);
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
      if (txtCliCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir.");
            setState(false);
        }else{
            int resp = JOptionPane.showConfirmDialog(null, 
                "Tem certeza que deseja excluir o registro?",
                "Controle de Produtos", JOptionPane.YES_NO_OPTION);
            
            if (resp == JOptionPane.YES_OPTION){
                // Deletar o REGISTRO tabela
                int id = Integer.parseInt(txtCliCode.getText());
                new ClientDAO().delete(id);
                
                // Preencher tabela com dados do banco
                fillClientTable(new ClientDAO().list());

                // Limpar campos
                cleanFields();
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!!");
            }
            setState(false);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setState(false);
        cleanFields();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        setState(false);
        
        int sex = cbxCliSex.getSelectedIndex();
        
        // Criar um objeto para parametrizar a operação
        Client c = new Client();
        
        // Recuperar o NOME do produto
        c.setName(txtCliName.getText());
        c.setCpf(fmtCliCpf.getText());
        c.setBirth_date(fmtCliDate.getText());
        c.setSex(cbxCliSex.getSelectedIndex());
        
//        if (sex == 1) {
//            c.setSex("Feminino");
//        } else if (sex == 2) {
//            c.setSex("Masculino");
//        } else if (sex == 3) {
//            c.setSex("Outro");
//        } else {
//            c.setSex(null);
//        }
        
        c.setAddress(txtCliAddress.getText());
        c.setNumber(txtCliNumber.getText());
        c.setComplement(txtCliComplement.getText());
        c.setNeighborhood(txtCliNeighborhood.getText());
        c.setCity(txtCliCity.getText());
        c.setUf(txtCliUF.getText());
        c.setCep(fmtCliCEP.getText());
        c.setPhone(fmtCliHomePhone.getText());
        c.setCel_phone(fmtCliCelPhone.getText());
        c.setEmail(txtCliEmail.getText());
        
        if (txtCliCode.getText().isEmpty()) {
            c.setId(null);
        } else {
            c.setId(Long.parseLong(txtCliCode.getText()));
        }
        int id = new ClientDAO().save(c);
        if (id != -1) {
            txtCliCode.setText(Integer.toString(id));
            fillClientTable(new ClientDAO().list());
            
            // Clean fields
            cleanFields();
            
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
        } else {
            cleanFields();
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação!!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientMouseClicked
        
        btnChange.setEnabled(true);
        btnDelete.setEnabled(true);
        fillForm(tblClient.getSelectedRow());
        
    }//GEN-LAST:event_tblClientMouseClicked

    private void txtInputDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputDataKeyReleased
        
        // Search by NAME and CODE
        String key = txtInputData.getText();
        List<Client> resultado = null;
        
        if (key.isEmpty()) {
            resultado = new ClientDAO().list();
        } else {
            if (rdbCliName.isSelected()) {     // Search by NAME
                resultado = new ClientDAO().searchByName(key);
            } else if (rdbCliCod.isSelected()) {    // Search by CODE
                resultado = new ClientDAO().searchById(Integer.parseInt(key));
            }
        }
        
        if (resultado != null) {
            fillClientTable(resultado);
        }
    }//GEN-LAST:event_txtInputDataKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtInputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxCliSex;
    private javax.swing.JFormattedTextField fmtCliCEP;
    private javax.swing.JFormattedTextField fmtCliCelPhone;
    private javax.swing.JFormattedTextField fmtCliCpf;
    private javax.swing.JFormattedTextField fmtCliDate;
    private javax.swing.JFormattedTextField fmtCliHomePhone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpnRegisterClient;
    private javax.swing.JPanel jpnSearchClient;
    private javax.swing.JTabbedPane jtpClient;
    private javax.swing.JLabel lblCliAddress;
    private javax.swing.JLabel lblCliCEP;
    private javax.swing.JLabel lblCliCPF;
    private javax.swing.JLabel lblCliCelPhone;
    private javax.swing.JLabel lblCliCity;
    private javax.swing.JLabel lblCliCode;
    private javax.swing.JLabel lblCliComplement;
    private javax.swing.JLabel lblCliDate;
    private javax.swing.JLabel lblCliEmail;
    private javax.swing.JLabel lblCliHomePhone;
    private javax.swing.JLabel lblCliName;
    private javax.swing.JLabel lblCliNeighborhood;
    private javax.swing.JLabel lblCliNumber;
    private javax.swing.JLabel lblCliSex;
    private javax.swing.JLabel lblCliUF;
    private javax.swing.JRadioButton rdbCliCod;
    private javax.swing.JRadioButton rdbCliName;
    private javax.swing.JTable tblClient;
    private javax.swing.JTextField txtCliAddress;
    private javax.swing.JTextField txtCliCity;
    private javax.swing.JTextField txtCliCode;
    private javax.swing.JTextField txtCliComplement;
    private javax.swing.JTextField txtCliEmail;
    private javax.swing.JTextField txtCliName;
    private javax.swing.JTextField txtCliNeighborhood;
    private javax.swing.JTextField txtCliNumber;
    private javax.swing.JTextField txtCliUF;
    private javax.swing.JTextField txtInputData;
    // End of variables declaration//GEN-END:variables

    private void configForm(){
        this.setTitle("Gerenciar Clientes");
        this.setResizable(false);
        txtCliCode.setEnabled(false);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbCliCod);
        bg.add(rdbCliName);
        rdbCliName.setSelected(true);
        
        // functions init
        setState(false);
        fillCbxClient();
        fillClientTable(new ClientDAO().list());
    }
    
    public void fillCbxClient() {
        String functions[] = {
            "----------", "Feminino", "Masculino", "Outro"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(functions);
        cbxCliSex.setModel(model);
    }
    
    public void fillClientTable(List<Client> list_client){
        DefaultTableModel clients = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            } 
        };
        clients.addColumn("Id");
        clients.addColumn("Nome");
        clients.addColumn("Telefone");
        clients.addColumn("Celular");
        tblClient.setModel(clients);
        for(Client c : list_client){
            clients.addRow(new Object[] {
                c.getId(),
                c.getName(),
                c.getPhone(),
                c.getCel_phone(),
            });
        }
    }
    
    private void fillForm(int row){
        //search Id from row selected in table
        Long id = (Long) tblClient.getValueAt(row,0);
        List<Client> form = new ClientDAO().searchById(id.intValue());
        
        //insert selected object into form
        for(Client cli : form){
            txtCliCode.setText(cli.getId().toString());
            txtCliName.setText(cli.getName());
            fmtCliCpf.setText(cli.getCpf());
            fmtCliDate.setText(cli.getBirth_date());
            cbxCliSex.setSelectedIndex(cli.getSex());
            txtCliAddress.setText(cli.getAddress());
            txtCliNumber.setText(cli.getNumber());
            txtCliComplement.setText(cli.getComplement());
            txtCliNeighborhood.setText(cli.getNeighborhood());
            txtCliCity.setText(cli.getCity());
            txtCliUF.setText(cli.getUf());
            fmtCliCEP.setText(cli.getCep());
            fmtCliHomePhone.setText(cli.getPhone());
            fmtCliCelPhone.setText(cli.getCel_phone());
            txtCliEmail.setText(cli.getEmail());
        }
    }
    
    public void setState(boolean st){
        btnChange.setEnabled(st);
        btnDelete.setEnabled(st);
        btnCancel.setEnabled(st);
        btnSave.setEnabled(st);
        
        txtCliName.setEnabled(st);
        fmtCliCpf.setEnabled(st);
        fmtCliDate.setEnabled(st);
        cbxCliSex.setEnabled(st);

        txtCliAddress.setEnabled(st);
        txtCliNumber.setEnabled(st);
        txtCliComplement.setEnabled(st);

        txtCliNeighborhood.setEnabled(st);
        txtCliCity.setEnabled(st);
        txtCliUF.setEnabled(st);
        fmtCliCEP.setEnabled(st);
        
        fmtCliHomePhone.setEnabled(st);
        fmtCliCelPhone.setEnabled(st);
        txtCliEmail.setEnabled(st);
        
//        txtInputData.setEnabled(st);
    }
    
    public void cleanFields() {
        txtCliCode.setText("");
        txtCliName.setText("");
        fmtCliCpf.setText("");
        fmtCliDate.setText("");
        cbxCliSex.setSelectedIndex(0);
        txtCliAddress.setText("");
        txtCliNumber.setText("");
        txtCliComplement.setText("");
        txtCliNeighborhood.setText("");
        txtCliCity.setText("");
        txtCliUF.setText("");
        fmtCliCEP.setText("");
        fmtCliHomePhone.setText("");
        fmtCliCelPhone.setText("");
        txtCliEmail.setText("");
    }
}
