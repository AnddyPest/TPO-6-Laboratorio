
package ventanas;

import clases.principal.Productos;
import entidades.clases.EntidadesProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class GestionDeProductos extends javax.swing.JInternalFrame {
    EntidadesProductos entidadesProductos;
    private final DefaultTableModel modelo = new DefaultTableModel();
    
    
  
    public GestionDeProductos(EntidadesProductos entidadesProductos) {
        initComponents();
        armarCabecera();
        this.entidadesProductos = entidadesProductos;
        tabProductos.setEnabled(false);
        
        for(Productos productos: entidadesProductos.getProducts()){
                cargarTabla(productos);
            }
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrProductos = new javax.swing.JScrollPane();
        tabProductos = new javax.swing.JTable();
        pnlRotulos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        tgbEdit = new javax.swing.JToggleButton();

        setTitle("Gestion de Productos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Productos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        tabProductos.setEnabled(false);
        tabProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProductosMouseClicked(evt);
            }
        });
        scrProductos.setViewportView(tabProductos);

        pnlRotulos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        cmbRubroIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Rubro", "Comestible", "Limpieza", "Perfumeria" }));
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

        javax.swing.GroupLayout pnlRotulosLayout = new javax.swing.GroupLayout(pnlRotulos);
        pnlRotulos.setLayout(pnlRotulosLayout);
        pnlRotulosLayout.setHorizontalGroup(
            pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRotulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtBrand)
                    .addComponent(cmbRubroIn, 0, 264, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(spnStock))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        pnlRotulosLayout.setVerticalGroup(
            pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRotulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbRubroIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlRotulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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

        tgbEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tgbEdit.setText("Edit Mode");
        tgbEdit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tgbEditStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrProductos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tgbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnErase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pnlRotulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnClose))
                    .addComponent(pnlRotulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnErase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
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
        
        if(btnNew.getText().equalsIgnoreCase("Cancelar")){
            txtName.setEditable(false);
            txtName.setText("");
            txtBrand.setEditable(false);
            txtBrand.setText("");
            cmbRubroIn.setEnabled(false);
            cmbRubroIn.setSelectedIndex(0);
            txtPrice.setEditable(false);
            txtPrice.setText("");
            spnStock.setEnabled(false);
            spnStock.setValue(-1);
            btnSave.setEnabled(false);
            tgbEdit.setEnabled(true);
            btnNew.setText("Nuevo");
        }else{
            btnNew.setText("Cancelar");
            txtName.setEditable(true);
            txtName.requestFocus();
            txtBrand.setEditable(true);
            cmbRubroIn.setEnabled(true);
            txtPrice.setEditable(true);
            spnStock.setEnabled(true);
            tgbEdit.setEnabled(false);
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 46;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

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
        
        String newName = txtName.getText();
        String newBrand = txtBrand.getText();
        String newType = (String) cmbRubroIn.getSelectedItem();
        double newPrice = Double.parseDouble(txtPrice.getText());
        int newStock = (int) spnStock.getValue();
        
        Productos newProduct = new Productos(newName, newBrand, newType, newPrice, newStock);
        entidadesProductos.addProducts(newProduct);
        modelo.setRowCount(0);
            for(Productos productos: entidadesProductos.getProducts()){
                cargarTabla(productos);
            }
        
        txtName.setEditable(false);
        txtName.setText("");
        txtBrand.setEditable(false);
        txtBrand.setText("");
        cmbRubroIn.setEnabled(false);
        cmbRubroIn.setSelectedIndex(0);
        txtPrice.setEditable(false);
        txtPrice.setText("");
        spnStock.setEnabled(false);
        spnStock.setValue(-1);
        btnSave.setEnabled(false);
        tgbEdit.setEnabled(true);
        btnNew.setText("Nuevo");
            
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tgbEditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tgbEditStateChanged
        if(tgbEdit.isSelected()) {
            btnNew.setEnabled(false);
            tabProductos.setEnabled(true);
            
                
        }
        if(!tgbEdit.isSelected()){
            btnNew.setEnabled(true);
            tabProductos.setEnabled(true);
        }
    
    }//GEN-LAST:event_tgbEditStateChanged

    private void tabProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductosMouseClicked
        if(tgbEdit.isSelected()){
            int fila = tabProductos.getSelectedRow();
            if(fila!=-1) {

                int codProductoEdit = (int)(tabProductos.getValueAt(fila, 0));
                Productos productoEdit = entidadesProductos.browseByCode(codProductoEdit);

                txtName.setText(productoEdit.getName());
                txtBrand.setText(productoEdit.getBrand());
                int indexBox = 0;
                if(productoEdit.getType().equalsIgnoreCase("limpieza")){
                    indexBox = 2;
                }else if(productoEdit.getType().equalsIgnoreCase("comestible")){
                    indexBox = 1;
                }else{
                    indexBox = 3;
                }
                cmbRubroIn.setSelectedIndex(indexBox);
                txtPrice.setText(String.valueOf(productoEdit.getPrice()));
                spnStock.setValue(productoEdit.getStock());
                btnSave.setEnabled(false);
                txtName.setEditable(true);
                txtBrand.setEditable(true);
                cmbRubroIn.setEnabled(true);
                txtPrice.setEditable(true);
                spnStock.setEnabled(true);
                tgbEdit.setEnabled(false);


                btnActual.setEnabled(true);
                btnErase.setEnabled(true);

                for (ActionListener evitarAcumulacion : btnActual.getActionListeners()) {
                    btnActual.removeActionListener(evitarAcumulacion);
                }
                for (ActionListener evitarAcumulacion : btnErase.getActionListeners()) {
                    btnErase.removeActionListener(evitarAcumulacion);
                }
                btnActual.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        productoEdit.setName(txtName.getText());
                        productoEdit.setBrand(txtBrand.getText());
                        productoEdit.setType((String) cmbRubroIn.getSelectedItem());
                        productoEdit.setPrice(Double.parseDouble(txtPrice.getText()));
                        productoEdit.setStock((int) spnStock.getValue());
                        modelo.setRowCount(0);
                            for(Productos productos: entidadesProductos.getProducts()){
                                cargarTabla(productos);
                            }
                        txtName.setEditable(false);
                        txtName.setText("");
                        txtBrand.setEditable(false);
                        txtBrand.setText("");
                        cmbRubroIn.setEnabled(false);
                        cmbRubroIn.setSelectedIndex(0);
                        txtPrice.setEditable(false);
                        txtPrice.setText("");
                        spnStock.setEnabled(false);
                        spnStock.setValue(-1);
                        btnSave.setEnabled(false);
                        btnActual.setEnabled(false);
                        btnErase.setEnabled(false);
                        tgbEdit.setEnabled(true);
                        tgbEdit.setSelected(false);
                        btnNew.setEnabled(true);

                    }

                });
                btnErase.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        entidadesProductos.removeProducts(productoEdit);
                        modelo.setRowCount(0);
                            for(Productos productos: entidadesProductos.getProducts()){
                                cargarTabla(productos);
                            }
                        txtName.setEditable(false);
                        txtName.setText("");
                        txtBrand.setEditable(false);
                        txtBrand.setText("");
                        cmbRubroIn.setEnabled(false);
                        cmbRubroIn.setSelectedIndex(0);
                        txtPrice.setEditable(false);
                        txtPrice.setText("");
                        spnStock.setEnabled(false);
                        spnStock.setValue(-1);
                        btnSave.setEnabled(false);
                        btnActual.setEnabled(false);
                        btnErase.setEnabled(false);
                        tgbEdit.setEnabled(true);
                        tgbEdit.setSelected(false);
                        btnNew.setEnabled(true);

                    } 
                });

            }
        }
        
    }//GEN-LAST:event_tabProductosMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActual;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnErase;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbRubroIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlRotulos;
    private javax.swing.JScrollPane scrProductos;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTable tabProductos;
    private javax.swing.JToggleButton tgbEdit;
    private javax.swing.JTextField txtBrand;
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
    if  (!btnActual.isEnabled() &&!txtName.getText().isEmpty() &&
        !txtBrand.getText().isEmpty() && indexComboIn!=0 && !txtPrice.getText().isEmpty()
        && spnValue>=0){
        btnSave.setEnabled(true);
    }else{
        btnSave.setEnabled(false);
    }
}



}
