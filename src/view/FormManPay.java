package view;

import controller.ClientDAO;
import controller.PayDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.Payment;

/**
 *
 * @author Wesley, Quemuel
 */
public class FormManPay extends javax.swing.JInternalFrame {
    
//    public int permissions;
    
    public FormManPay() {
        initComponents();
        fillCbxPaymode();
        configForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMain = new javax.swing.JTabbedPane();
        tabManPay = new javax.swing.JPanel();
        lblExpireddate = new javax.swing.JLabel();
        lblPayid = new javax.swing.JLabel();
        txtPayrid = new javax.swing.JTextField();
        txtClientname = new javax.swing.JTextField();
        lblClientname = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();
        lblPayfull = new javax.swing.JLabel();
        txtPaydiscount = new javax.swing.JFormattedTextField();
        lblPaydiscount = new javax.swing.JLabel();
        cbxPaymode = new javax.swing.JComboBox<>();
        lblPaymode = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPayrate = new javax.swing.JFormattedTextField();
        lblPayrate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistoric = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtExpireddate = new javax.swing.JFormattedTextField();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblClientname1 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        txtMonthly = new javax.swing.JFormattedTextField();
        lblMonthly = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        tabSrcPay = new javax.swing.JPanel();
        txtInputData = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPay = new javax.swing.JTable();
        rdbSrcCode = new javax.swing.JRadioButton();
        rdbSrcName = new javax.swing.JRadioButton();
        tabSrcUser = new javax.swing.JPanel();
        rdbCliCod = new javax.swing.JRadioButton();
        rdbCliName = new javax.swing.JRadioButton();
        txtInputData1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar Pagamento");
        setMaximumSize(new java.awt.Dimension(815, 600));
        setMinimumSize(new java.awt.Dimension(815, 600));
        setPreferredSize(new java.awt.Dimension(815, 600));

        tabMain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabMain.setMaximumSize(new java.awt.Dimension(799, 559));
        tabMain.setMinimumSize(new java.awt.Dimension(799, 559));
        tabMain.setPreferredSize(new java.awt.Dimension(799, 559));
        tabMain.setRequestFocusEnabled(false);

        tabManPay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabManPay.setPreferredSize(new java.awt.Dimension(565, 331));

        lblExpireddate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblExpireddate.setText("Vencimento");

        lblPayid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPayid.setText("Código");

        txtPayrid.setEditable(false);
        txtPayrid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtClientname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClientname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtClientnameMouseClicked(evt);
            }
        });
        txtClientname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClientnameKeyReleased(evt);
            }
        });

        lblClientname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblClientname.setText("Nome do Cliente");

        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPayfull.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPayfull.setText("Total a pagar");

        txtPaydiscount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtPaydiscount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPaydiscount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPaydiscount.setText("Desconto");

        cbxPaymode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxPaymode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPaymode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPaymode.setText("Forma de pagamento");

        txtPayrate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtPayrate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPayrate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPayrate.setText("Taxa de juros");

        tblHistoric.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblHistoric.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHistoric.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblHistoric);

        btnModify.setBackground(new java.awt.Color(0, 102, 255));
        btnModify.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Alterar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
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

        try {
            txtExpireddate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtExpireddate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnDelete.setBackground(new java.awt.Color(0, 102, 255));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 102, 255));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Novo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblClientname1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblClientname1.setText("Histórico");

        btnPay.setBackground(new java.awt.Color(0, 153, 0));
        btnPay.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setText("Pagar");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnCalculate.setBackground(new java.awt.Color(0, 102, 255));
        btnCalculate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calcular");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        txtMonthly.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtMonthly.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblMonthly.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMonthly.setText("Mensalidade");

        btnExit.setBackground(new java.awt.Color(102, 102, 102));
        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabManPayLayout = new javax.swing.GroupLayout(tabManPay);
        tabManPay.setLayout(tabManPayLayout);
        tabManPayLayout.setHorizontalGroup(
            tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManPayLayout.createSequentialGroup()
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaymode)
                            .addComponent(cbxPaymode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPayrate)
                            .addComponent(txtPayrate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaydiscount)
                            .addGroup(tabManPayLayout.createSequentialGroup()
                                .addComponent(txtPaydiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(100, 100, 100)
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPayfull)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabManPayLayout.createSequentialGroup()
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPayid)
                            .addComponent(txtPayrid, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClientname)
                            .addComponent(txtClientname, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExpireddate)
                            .addComponent(txtExpireddate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMonthly)
                            .addComponent(txtMonthly, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabManPayLayout.createSequentialGroup()
                        .addComponent(lblClientname1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabManPayLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabManPayLayout.setVerticalGroup(
            tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabManPayLayout.createSequentialGroup()
                                .addComponent(lblExpireddate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExpireddate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtClientname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tabManPayLayout.createSequentialGroup()
                            .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPayid)
                                .addComponent(lblClientname))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPayrid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMonthly, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabManPayLayout.createSequentialGroup()
                        .addComponent(lblMonthly)
                        .addGap(29, 29, 29)))
                .addGap(18, 18, 18)
                .addComponent(lblClientname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManPayLayout.createSequentialGroup()
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaymode)
                            .addComponent(lblPayrate)
                            .addComponent(lblPaydiscount)
                            .addComponent(lblPayfull))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPaymode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPayrate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPaydiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabMain.addTab("Pagamentos", tabManPay);

        tabSrcPay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtInputData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtInputData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputDataKeyReleased(evt);
            }
        });

        tblPay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblPay.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPay.setPreferredSize(new java.awt.Dimension(600, 341));
        tblPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPay);

        rdbSrcCode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbSrcCode.setText("Código");
        rdbSrcCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSrcCodeActionPerformed(evt);
            }
        });

        rdbSrcName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbSrcName.setText("Nome");
        rdbSrcName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSrcNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabSrcPayLayout = new javax.swing.GroupLayout(tabSrcPay);
        tabSrcPay.setLayout(tabSrcPayLayout);
        tabSrcPayLayout.setHorizontalGroup(
            tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                    .addGroup(tabSrcPayLayout.createSequentialGroup()
                        .addComponent(rdbSrcCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbSrcName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInputData)))
                .addContainerGap())
        );
        tabSrcPayLayout.setVerticalGroup(
            tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSrcCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbSrcName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMain.addTab("Pesquisar pagamentos", tabSrcPay);

        rdbCliCod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbCliCod.setText("Código");
        rdbCliCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCliCodActionPerformed(evt);
            }
        });

        rdbCliName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbCliName.setText("Nome");
        rdbCliName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCliNameActionPerformed(evt);
            }
        });

        txtInputData1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtInputData1.setPreferredSize(new java.awt.Dimension(59, 30));
        txtInputData1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputData1KeyReleased(evt);
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
        tblClient.setPreferredSize(new java.awt.Dimension(600, 341));
        tblClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblClient);

        javax.swing.GroupLayout tabSrcUserLayout = new javax.swing.GroupLayout(tabSrcUser);
        tabSrcUser.setLayout(tabSrcUserLayout);
        tabSrcUserLayout.setHorizontalGroup(
            tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                    .addGroup(tabSrcUserLayout.createSequentialGroup()
                        .addComponent(rdbCliCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbCliName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInputData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabSrcUserLayout.setVerticalGroup(
            tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCliCod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbCliName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMain.addTab("Pesquisar clientes", tabSrcUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputDataKeyReleased
        if(rdbSrcCode.isSelected() && !txtInputData.getText().isEmpty()){
            filltblPay(new PayDAO().searchId(Integer.parseInt(txtInputData.getText())));
        }else if(rdbSrcName.isSelected() && !txtInputData.getText().isEmpty()){
            filltblPay(new PayDAO().searchName(txtInputData.getText()));
        }else{
            filltblPay(new PayDAO().searchAll());
        }
    }//GEN-LAST:event_txtInputDataKeyReleased

    private void rdbSrcNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSrcNameActionPerformed
        rdbSrcCode.setSelected(false);
    }//GEN-LAST:event_rdbSrcNameActionPerformed

    private void rdbSrcCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSrcCodeActionPerformed
        rdbSrcName.setSelected(false);
    }//GEN-LAST:event_rdbSrcCodeActionPerformed

    private void tblPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPayMouseClicked
        fillForm(tblPay.getSelectedRow());
    }//GEN-LAST:event_tblPayMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setData();
        setState(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setState(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        setState(false);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        setState(true);
        btnModify.setEnabled(true);
        if(txtPayrid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selecione um registro para excluir.","Atenção",JOptionPane.WARNING_MESSAGE);            
        }  
        
        if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,"Tem certeza de que deseja excluir o registro selecionado?","Atenção",JOptionPane.YES_NO_OPTION)){
            int id_removed = new PayDAO().delete(Integer.parseInt(txtPayrid.getText()));
            JOptionPane.showMessageDialog(null,"Pagamento "+txtPayrid.getText()+" removido com sucesso!");
        }
        
        filltblPay(new PayDAO().searchAll());
//        filltblHistoric();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        setState(false);
        btnModify.setEnabled(true);
        
        Long id = (txtPayrid.getText().isEmpty() ? null : Long.parseLong(txtPayrid.getText()));
        Payment pay = new Payment();
        
        pay.setClient(getClient(tblClient.getSelectedRow()));
        pay.setDiscount(txtPaydiscount.getText());
        pay.setExpiry(txtExpireddate.getText());
        pay.setId(id);
        pay.setPaydate("  /  /    ");
        pay.setPaymode(cbxPaymode.getSelectedIndex());
        pay.setPayrate(txtPayrate.getText());
        pay.setStatus(false);
        pay.setMonthly(txtTotal.getText());
        
        int id_new = new PayDAO().save(pay);
        
        if(id_new == -1){
            JOptionPane.showMessageDialog(null,"Não foi registrar a entrada de dados");
        };
        txtPayrid.setText(String.valueOf(id_new));
        setState(true);
        filltblPay(new PayDAO().searchAll());
//        filltblHistoric();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtInputData1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputData1KeyReleased

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
    }//GEN-LAST:event_txtInputData1KeyReleased

    private void tblClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientMouseClicked

        btnDelete.setEnabled(true);
        txtClientname.setText(getClient(tblClient.getSelectedRow()).getName());
//        filltblHistoric();
        
    }//GEN-LAST:event_tblClientMouseClicked

    private void rdbCliNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCliNameActionPerformed
        rdbCliCod.setSelected(false);
    }//GEN-LAST:event_rdbCliNameActionPerformed

    private void rdbCliCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCliCodActionPerformed
        rdbCliName.setSelected(false);
    }//GEN-LAST:event_rdbCliCodActionPerformed

    private void txtClientnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientnameKeyReleased
        tabMain.setSelectedIndex(2);
    }//GEN-LAST:event_txtClientnameKeyReleased

    private void txtClientnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClientnameMouseClicked
        tabMain.setSelectedIndex(2);
    }//GEN-LAST:event_txtClientnameMouseClicked

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        
        Payment pay = new Payment();
        for(Payment p : new PayDAO().searchId(Integer.parseInt(txtPayrid.getText()))){
            p.setPaydate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            p.setStatus(true);
            pay = p;
        }
        
        new PayDAO().save(pay);
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        
        txtPayrate.setText("R$ "+String.valueOf(Double.parseDouble(txtMonthly.getText())*0.02));
        txtTotal.setText("R$ "+String.valueOf(Double.parseDouble(txtMonthly.getText())-Double.parseDouble(txtPaydiscount.getText())+(Double.parseDouble(txtMonthly.getText())*0.02)));
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxPaymode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblClientname;
    private javax.swing.JLabel lblClientname1;
    private javax.swing.JLabel lblExpireddate;
    private javax.swing.JLabel lblMonthly;
    private javax.swing.JLabel lblPaydiscount;
    private javax.swing.JLabel lblPayfull;
    private javax.swing.JLabel lblPayid;
    private javax.swing.JLabel lblPaymode;
    private javax.swing.JLabel lblPayrate;
    private javax.swing.JRadioButton rdbCliCod;
    private javax.swing.JRadioButton rdbCliName;
    private javax.swing.JRadioButton rdbSrcCode;
    private javax.swing.JRadioButton rdbSrcName;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JPanel tabManPay;
    private javax.swing.JPanel tabSrcPay;
    private javax.swing.JPanel tabSrcUser;
    private javax.swing.JTable tblClient;
    private javax.swing.JTable tblHistoric;
    private javax.swing.JTable tblPay;
    private javax.swing.JTextField txtClientname;
    private javax.swing.JFormattedTextField txtExpireddate;
    private javax.swing.JTextField txtInputData;
    private javax.swing.JTextField txtInputData1;
    private javax.swing.JFormattedTextField txtMonthly;
    private javax.swing.JFormattedTextField txtPaydiscount;
    private javax.swing.JFormattedTextField txtPayrate;
    private javax.swing.JTextField txtPayrid;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    
    public void fillCbxPaymode(){
        String paymode[] = {"Dinheiro","Cartão","Cheque"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(paymode);
        cbxPaymode.setModel(model);
    }
    
    public void filltblPay(List<Payment> pay){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            } 
        };
        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("Valor");
        model.addColumn("Vencimento");
        tblPay.setModel(model);
        for(Payment p : pay){
            model.addRow(
                new Object[]{
                    p.getId(),
                    p.getClient().getName(),
                    p.getMonthly(),
                    p.getExpiry()
                }
            );
        }
    }
    
    public void filltblHistoric(/*List<Payment> pay*/){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            } 
        };
        
        List<Payment> pay = null;
        
        for(Payment p : new PayDAO().searchId(Integer.parseInt(txtPayrid.getText()))){
            if(p.getId() == Integer.parseInt(txtPayrid.getText())){
                System.out.println("\nLocalizado pagamento id:"+p.getId());
                for(Payment u : p.getClient().getHistoric()){
//                for(Client u : new ClientDAO().searchById(p.getClient().getId().intValue())){
//                    if(p.getClient().getId() == u.getId()){
//                        System.out.println("\nLocalizado cliente do pagamento:"+u.getId());
//                        pay = u.getHistoric();
//                        for(Payment t : u.getHistoric()){
                            System.out.println("\nhistorico do cliente: "+u+"\n");
//                        }
//                }
//                System.out.println("historico do cliente:"+new PayDAO().searchHistoric(p.getId().intValue()));
//                System.out.println("historico do cliente:"+new PayDAO().searchHistoric(15));
//                    System.out.println("historico do cliente:"+payment);
                }
            }
        }
        
        model.addColumn("Status");
        model.addColumn("Valor");
        model.addColumn("Pagamento");
        model.addColumn("Vencimento");
        tblHistoric.setModel(model);
//        Payment cmp = new PayDAO().searchId(Integer.parseInt(txtPayrid.getText()));
        for(Payment p : pay){
//            for(Payment cmp : new PayDAO().searchId(Integer.parseInt(txtPayrid.getText()))){
//                if(p.getClient().getId() == cmp.getClient().getId()){
            model.addRow(
                new Object[]{
                    p.isStatus() == true ? "pago":"inadimplente",
                    p.getMonthly(),
                    p.getPaydate(),
                    p.getExpiry()
                }
            );
//                }
//            }
        }
    }
    
    public void configForm(){
        this.setTitle("Gerenciar Pagamentos");
        this.setResizable(false);
        
        filltblPay(new PayDAO().searchAll());
//        fillForm(0);
        
//        for(Payment p : new PayDAO().searchId(Integer.parseInt(txtPayrid.getText()))){
//            if(p.getId() == Integer.parseInt(txtPayrid.getText())){
//                for(Client u : new ClientDAO().searchById(p.getClient().getId().intValue())){
//                    if(p.getClient().getId() == u.getId()){
//                        filltblHistoric(u.getHistoric());
//                    }
//                }
//            }
//        }
//        filltblHistoric(new ClientDAO().searchById());
//        filltblHistoric();
        rdbSrcCode.setSelected(true);
        rdbCliCod.setSelected(true);
        setState(true);
        setData();
        fillClientTable(new ClientDAO().list());
    }

    private void fillForm(int line) {
         //search Id from row selected in table
        Long id = (Long) tblPay.getValueAt(line,0);
        List<Payment> form = new PayDAO().searchId(id.intValue());
        
        //insert selected object into form
        for(Payment p : form){
            txtPayrid.setText(p.getId().toString());
            txtClientname.setText(p.getClient().getName());
            txtExpireddate.setText(p.getExpiry());
            txtPaydiscount.setText(p.getDiscount());
            cbxPaymode.setSelectedIndex(p.getPaymode());
            txtPayrate.setText(p.getPayrate());
            txtTotal.setText(p.getMonthly()); 
        }
//        filltblHistoric();
    }
    
    public void fillClientTable(List<Client> list){
        DefaultTableModel clients = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            } 
        };
        clients.addColumn("Id");
        clients.addColumn("Nome");
        clients.addColumn("Data de nascimento");
        clients.addColumn("Sexo");
        clients.addColumn("CEP");
        clients.addColumn("Telefone");
        clients.addColumn("Celular");
        tblClient.setModel(clients);
        for(Client c : list){
            clients.addRow(new Object[] {
                c.getId(),
                c.getName(),
                c.getBirth_date(),
                c.getSex(),
                c.getCep(),
                c.getPhone(),
                c.getCel_phone(),
                c.getCpf(),
                c.getAddress(),
                c.getNumber(),
                c.getComplement(),
                c.getNeighborhood(),
                c.getCity(),
                c.getUf(),
                c.getEmail(),
            });
        }
    }
    
    public void setState(boolean st){
        txtPayrid.setEnabled(false);
        btnModify.setEnabled(st);
        btnDelete.setEnabled(st);
        btnAdd.setEnabled(st);
        btnSave.setEnabled(!st);
        txtClientname.setEnabled(!st);
        txtInputData.setEnabled(!st);
        txtExpireddate.setEnabled(!st);
        txtPaydiscount.setEnabled(!st);
        txtPayrate.setEnabled(false);
        txtTotal.setEnabled(false);
        cbxPaymode.setEnabled(!st);
        txtMonthly.setEnabled(!st);
    }
    
    public void setData(){
        txtPayrid.setText("");
        txtClientname.setText("");
        txtInputData.setText("");
        txtExpireddate.setText("");
        txtPaydiscount.setText("");
        txtPayrate.setText("R$ 0,00");
        txtTotal.setText("R$ 0,00");
    }
    
    public Client getClient(int line){
        Long c = (Long) tblClient.getValueAt(line,0);
        Client result = new Client();
        List<Client> users = new ClientDAO().searchById(c.intValue());
        for(Client cli : users){
            result = cli;
        }
        txtClientname.transferFocus();
        return result;
    }
}
