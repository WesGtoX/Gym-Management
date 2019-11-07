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
public class FormManPay extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormManUser2
     */
    public FormManPay() {
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
        tabManPay = new javax.swing.JPanel();
        txtPaydate = new javax.swing.JFormattedTextField();
        lblPaydate = new javax.swing.JLabel();
        lblPayid = new javax.swing.JLabel();
        txtPayrid = new javax.swing.JTextField();
        txtClientname = new javax.swing.JTextField();
        lblClientname = new javax.swing.JLabel();
        txtPayfull = new javax.swing.JFormattedTextField();
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
        tabSrcPay = new javax.swing.JPanel();
        txtInputData = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistoric1 = new javax.swing.JTable();
        rdbSrcCode = new javax.swing.JRadioButton();
        rdbSrcName = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gerenciar Pagamento");
        setMinimumSize(new java.awt.Dimension(300, 225));
        setPreferredSize(new java.awt.Dimension(800, 600));

        tabMain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tabManPay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPaydate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("##/##/####"))));
        txtPaydate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPaydate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPaydate.setText("Data de vencimento");

        lblPayid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPayid.setText("Código");

        txtPayrid.setEditable(false);
        txtPayrid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtClientname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblClientname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblClientname.setText("Nome do Cliente");

        txtPayfull.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("##/##/####"))));
        txtPayfull.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPayfull.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPayfull.setText("Total");

        txtPaydiscount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("##/##/####"))));
        txtPaydiscount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPaydiscount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPaydiscount.setText("Desconto");

        cbxPaymode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxPaymode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPaymode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPaymode.setText("Forma de pagamento");

        txtPayrate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("##/##/####"))));
        txtPayrate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPayrate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPayrate.setText("Juros");

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
        jScrollPane1.setViewportView(tblHistoric);

        javax.swing.GroupLayout tabManPayLayout = new javax.swing.GroupLayout(tabManPay);
        tabManPay.setLayout(tabManPayLayout);
        tabManPayLayout.setHorizontalGroup(
            tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManPayLayout.createSequentialGroup()
                .addContainerGap(636, Short.MAX_VALUE)
                .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPayfull, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPayfull))
                .addContainerGap())
            .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabManPayLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabManPayLayout.createSequentialGroup()
                            .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblClientname)
                                .addComponent(txtClientname, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPayid)
                                .addComponent(txtPayrid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(170, 170, 170)
                            .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPaydate)
                                .addComponent(txtPaydiscount)
                                .addGroup(tabManPayLayout.createSequentialGroup()
                                    .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPaydate)
                                        .addComponent(lblPaydiscount))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabManPayLayout.createSequentialGroup()
                            .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPayrate)
                                .addComponent(lblPaymode, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxPaymode, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPayrate, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        tabManPayLayout.setVerticalGroup(
            tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManPayLayout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabManPayLayout.createSequentialGroup()
                        .addComponent(lblPayfull)
                        .addGap(29, 29, 29))
                    .addComponent(txtPayfull, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabManPayLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabManPayLayout.createSequentialGroup()
                            .addComponent(lblPayid)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPayrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabManPayLayout.createSequentialGroup()
                                .addComponent(lblPaydate)
                                .addGap(29, 29, 29))
                            .addComponent(txtPaydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(44, 44, 44)
                    .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabManPayLayout.createSequentialGroup()
                            .addComponent(lblClientname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tabManPayLayout.createSequentialGroup()
                            .addComponent(lblPaydiscount)
                            .addGap(29, 29, 29))
                        .addComponent(txtPaydiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabManPayLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(tabManPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(tabManPayLayout.createSequentialGroup()
                                    .addComponent(lblPayrate)
                                    .addGap(29, 29, 29))
                                .addComponent(txtPayrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addComponent(lblPaymode)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxPaymode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManPayLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65)))
        );

        tabMain.addTab("Pagamentos", tabManPay);

        tabSrcPay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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
        tblHistoric1.setPreferredSize(new java.awt.Dimension(300, 225));
        jScrollPane2.setViewportView(tblHistoric1);

        rdbSrcCode.setText("Código");

        rdbSrcName.setText("Nome");

        javax.swing.GroupLayout tabSrcPayLayout = new javax.swing.GroupLayout(tabSrcPay);
        tabSrcPay.setLayout(tabSrcPayLayout);
        tabSrcPayLayout.setHorizontalGroup(
            tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcPayLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabSrcPayLayout.createSequentialGroup()
                        .addComponent(rdbSrcCode)
                        .addGap(27, 27, 27)
                        .addComponent(rdbSrcName)
                        .addGap(18, 18, 18)
                        .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        tabSrcPayLayout.setVerticalGroup(
            tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSrcPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSrcPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSrcCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbSrcName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        tabMain.addTab("Pesquisar", tabSrcPay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxPaymode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblClientname;
    private javax.swing.JLabel lblPaydate;
    private javax.swing.JLabel lblPaydiscount;
    private javax.swing.JLabel lblPayfull;
    private javax.swing.JLabel lblPayid;
    private javax.swing.JLabel lblPaymode;
    private javax.swing.JLabel lblPayrate;
    private javax.swing.JRadioButton rdbSrcCode;
    private javax.swing.JRadioButton rdbSrcName;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JPanel tabManPay;
    private javax.swing.JPanel tabSrcPay;
    private javax.swing.JTable tblHistoric;
    private javax.swing.JTable tblHistoric1;
    private javax.swing.JTextField txtClientname;
    private javax.swing.JTextField txtInputData;
    private javax.swing.JFormattedTextField txtPaydate;
    private javax.swing.JFormattedTextField txtPaydiscount;
    private javax.swing.JFormattedTextField txtPayfull;
    private javax.swing.JFormattedTextField txtPayrate;
    private javax.swing.JTextField txtPayrid;
    // End of variables declaration//GEN-END:variables
}
