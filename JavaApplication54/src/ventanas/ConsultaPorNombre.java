/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventanas;

import clases.principal.Productos;
import entidades.clases.EntidadesProductos;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Max
 */
public class ConsultaPorNombre extends javax.swing.JInternalFrame {
 EntidadesProductos entidadesProductos;
    DefaultTableModel modelo = new DefaultTableModel(){
     
     @Override
     public boolean isCellEditable(int f, int c){
         return false;
     }
 };
    /**
     * Creates new form ConsultaPorNombre
     * @param entidadesProductos
     */
    public ConsultaPorNombre(EntidadesProductos entidadesProductos) {
        initComponents();
        this.entidadesProductos = entidadesProductos;
        añadirCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtBrow = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabview = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel1.setText("Busqueda por nombre");

        TxtBrow.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TxtBrow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBrowKeyReleased(evt);
            }
        });

        Tabview.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(TxtBrow, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TxtBrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtBrowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBrowKeyReleased
    Erase();
        String prop = TxtBrow.getText();
     System.out.println(prop);
     TreeSet <Productos> propContain = new TreeSet<>();
  propContain = entidadesProductos.browByName(prop);
  update(propContain);
    }//GEN-LAST:event_TxtBrowKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabview;
    private javax.swing.JTextField TxtBrow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

public void añadirCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Marca");
    modelo.addColumn("Tipo");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    Tabview.setModel(modelo);
}

public void update(TreeSet<Productos> products){
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

public void Erase(){
    
    int filas = Tabview.getRowCount()-1;
    for(int f=filas;f>=0;f--){
        
        modelo.removeRow(f);
    }
}

        
}


