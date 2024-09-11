
package ventanas;

import clases.principal.Productos;
import entidades.clases.EntidadesProductos;
import javax.swing.table.DefaultTableModel;


public class GestionDeProductos extends javax.swing.JInternalFrame {
    EntidadesProductos entidadesProductos;
    private final DefaultTableModel modelo = new DefaultTableModel();
    
  
    public GestionDeProductos(EntidadesProductos entidadesProductos) {
        initComponents();
        armarCabecera();
        this.entidadesProductos = entidadesProductos;
        
        for(Productos productos: entidadesProductos.getProducts()){
                cargarTabla(productos);
            }
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbSelectorCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        cmbRubroIn = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        spnStock = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnActual = new javax.swing.JButton();
        btnErase = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setTitle("Gestion de Productos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Filtrar por Categoría:");

        cmbSelectorCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Rubro", "Comestible", "Limpieza", "Perfumeria" }));
        cmbSelectorCategorias.setToolTipText("");

        tabProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Marca", "Rubro", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabProductos);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Rubro:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Precio:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Stock:");

        txtCode.setEditable(false);
        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtBrand.setEditable(false);
        txtBrand.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBrandKeyReleased(evt);
            }
        });

        cmbRubroIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese Rubro", "Comestible", "Limpieza", "Perfumeria" }));
        cmbRubroIn.setEnabled(false);
        cmbRubroIn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRubroInItemStateChanged(evt);
            }
        });

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        spnStock.setModel(new javax.swing.SpinnerNumberModel(-1, null, null, 1));
        spnStock.setEnabled(false);
        spnStock.setValue(-1);
        spnStock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnStockStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCode)
                    .addComponent(txtName)
                    .addComponent(txtBrand)
                    .addComponent(cmbRubroIn, 0, 264, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(spnStock))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbRubroIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoLupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("Guardar");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnActual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActual.setText("Actualizar");
        btnActual.setEnabled(false);

        btnErase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnErase.setText("Eliminar");
        btnErase.setEnabled(false);

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSelectorCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnErase, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSelectorCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnErase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtCode.setEditable(true);
        txtCode.requestFocus();
        txtName.setEditable(true);
        txtBrand.setEditable(true);
        cmbRubroIn.setEnabled(true);
        txtPrice.setEditable(true);
        spnStock.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodeKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 46;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyReleased
        habilitarSave();
    }//GEN-LAST:event_txtCodeKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        habilitarSave();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtBrandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandKeyReleased
        habilitarSave();
    }//GEN-LAST:event_txtBrandKeyReleased

    private void cmbRubroInItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRubroInItemStateChanged
        habilitarSave();
    }//GEN-LAST:event_cmbRubroInItemStateChanged

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        habilitarSave();
    }//GEN-LAST:event_txtPriceKeyReleased

    private void spnStockStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnStockStateChanged
        habilitarSave();
    }//GEN-LAST:event_spnStockStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int newCode = Integer.parseInt(txtCode.getText());
        String newName = txtName.getText();
        String newBrand = txtBrand.getText();
        String newType = (String) cmbRubroIn.getSelectedItem();
        double newPrice = Double.parseDouble(txtPrice.getText());
        int newStock = (int) spnStock.getValue();
        
        Productos newProduct = new Productos(newCode,newName, newBrand, newType, newPrice, newStock);
        entidadesProductos.addProducts(newProduct);
        modelo.setRowCount(0);
            for(Productos productos: entidadesProductos.getProducts()){
                cargarTabla(productos);
            }
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActual;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnErase;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbRubroIn;
    private javax.swing.JComboBox<String> cmbSelectorCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTable tabProductos;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

private void armarCabecera() {
    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Marca");
    modelo.addColumn("Rubro");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    tabProductos.setModel(modelo);
}

private void cargarTabla(Productos producto) {
    modelo.addRow(new Object[]{
        producto.getCode(),
        producto.getName(),
        producto.getBrand(),
        producto.getType(),
        producto.getPrice(),
        producto.getStock()
        
    });
}

private void habilitarSave() {
    int indexComboIn = cmbRubroIn.getSelectedIndex();
    int spnValue = (int)spnStock.getValue();
    if  (!txtCode.getText().isEmpty() && !txtName.getText().isEmpty() &&
        !txtBrand.getText().isEmpty() && indexComboIn!=0 && !txtPrice.getText().isEmpty()
        && spnValue>=0){
        btnSave.setEnabled(true);
    }else{
        btnSave.setEnabled(false);
    }
}



}
