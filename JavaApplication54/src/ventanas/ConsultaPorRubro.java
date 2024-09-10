package ventanas;

import clases.principal.Productos;
import entidades.clases.EntidadesProductos;
import java.awt.Color;
import java.awt.Graphics;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Max
 */
public class ConsultaPorRubro extends javax.swing.JInternalFrame {

    EntidadesProductos entidadProducto;
    DefaultTableModel modelo = new DefaultTableModel();
    public ConsultaPorRubro(EntidadesProductos entidadProducto) {
        initComponents();
        
        
        armarCabecera();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPanePrincipalRubro = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jLabel2 = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRubro = new javax.swing.JTable();
        ComboBoxRubro = new javax.swing.JComboBox<>();
        PanelLogo = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.darkGray);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jLabel1 = new javax.swing.JLabel();
        labelConsultaPorRubro = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Rubro:");

        PanelTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        PanelTabla.setForeground(new java.awt.Color(60, 63, 65));

        tablaRubro.setForeground(new java.awt.Color(51, 51, 51));
        tablaRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Rubro", "Precio", "Stock"
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
        tablaRubro.setGridColor(java.awt.Color.white);
        jScrollPane1.setViewportView(tablaRubro);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        ComboBoxRubro.setBackground(java.awt.Color.darkGray);
        ComboBoxRubro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ComboBoxRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Rubro", "Comestible", "Limpieza", "Perfumeria" }));
        ComboBoxRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRubroActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoLupa.png"))); // NOI18N

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        labelConsultaPorRubro.setBackground(java.awt.Color.black);
        labelConsultaPorRubro.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        labelConsultaPorRubro.setText("Consulta por Rubro");

        DesktopPanePrincipalRubro.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanePrincipalRubro.setLayer(PanelTabla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanePrincipalRubro.setLayer(ComboBoxRubro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanePrincipalRubro.setLayer(PanelLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanePrincipalRubro.setLayer(labelConsultaPorRubro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPanePrincipalRubroLayout = new javax.swing.GroupLayout(DesktopPanePrincipalRubro);
        DesktopPanePrincipalRubro.setLayout(DesktopPanePrincipalRubroLayout);
        DesktopPanePrincipalRubroLayout.setHorizontalGroup(
            DesktopPanePrincipalRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanePrincipalRubroLayout.createSequentialGroup()
                .addGroup(DesktopPanePrincipalRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanePrincipalRubroLayout.createSequentialGroup()
                        .addGroup(DesktopPanePrincipalRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopPanePrincipalRubroLayout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(ComboBoxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPanePrincipalRubroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelConsultaPorRubro)
                                .addGap(95, 95, 95)))
                        .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopPanePrincipalRubroLayout.setVerticalGroup(
            DesktopPanePrincipalRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanePrincipalRubroLayout.createSequentialGroup()
                .addGroup(DesktopPanePrincipalRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DesktopPanePrincipalRubroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelConsultaPorRubro)))
                .addGap(18, 18, 18)
                .addGroup(DesktopPanePrincipalRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxRubro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPanePrincipalRubro)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanePrincipalRubro)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxRubroActionPerformed
        String optionSelectedInBox = ComboBoxRubro.getSelectedItem().toString();  //Se obtiene el nombre de la opcion seleccionada en el combo box
        System.out.println(optionSelectedInBox);
        TreeSet<Productos>  searchingItemSelectedInTreeSet = new TreeSet<Productos>(); // se crea un treeSet para almacenar los valores que va a devolver la entidadProducto
        searchingItemSelectedInTreeSet = entidadProducto.getProductsByCategory(optionSelectedInBox);
        upgradeTable(searchingItemSelectedInTreeSet);   //Se actualiza la tabla, borrando los valores viejos y agregando los nuevos
        
    }//GEN-LAST:event_ComboBoxRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxRubro;
    private javax.swing.JDesktopPane DesktopPanePrincipalRubro;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConsultaPorRubro;
    private javax.swing.JTable tablaRubro;
    // End of variables declaration//GEN-END:variables
     private void armarCabecera(){
       modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Marca");
        modelo.addColumn("Rubro");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        tablaRubro.setModel(modelo);
        
    }
    public void upgradeTable(TreeSet<Productos> products){
        clearTable();
        for(Productos product : products){
            modelo.addRow(new Object[]{
                product.getCode(),
                product.getName(),
                product.getBrand(),
                product.getType(),
                product.getPrice(),
                product.getStock()                               
            });
        }
    }
    public void clearTable(){
        int quantityRaws = modelo.getRowCount() -1;
        for(int i = quantityRaws; i>= 0; i--){
            modelo.removeRow(i);
        }
    }
}
