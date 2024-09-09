package ventanas;

import entidades.clases.EntidadesProductos;

public class Principal extends javax.swing.JFrame {
    EntidadesProductos entidadesProductos = new EntidadesProductos();
    /*nombres para los campos:
    txtName para textfields
    btnName para botones
    cmbName para combos
    scrName para scroll menues
    tabName para tablas
    spnName para spinners
    todos los elementos con cammel case, ejemplo: precioProducto
    ------------------------------------------------------------------------
    recordar la configuracion de los txt para que solo puedan cargar numeros:
    EN TIPO DE EVENTO "KEY TYPED": INGRESAR
    int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    Esta linea de codigo evita que se ingresen caracteres que no sean numericos; aplicar en precio
    (Ver el ASCII para el punto o coma decimal) y codigo de producto.
    ------------------------------------------------------------------------
    PARA CREAR UNA TABLA:
    private final DefaultTableModel modelo = new DefaultTableModel();
    ->
    PARA CREAR LA CABECERA DE LA TABLA: Recordar cambiar el tipo de dato al correspondiente
    desde el menu de paramentros de la tabla en vista diseño(Sera int para Code y double para Price.
    private void cabeceraTabla() {
        modelo.addColumn("Titulo 1");
        modelo.addColumn("Titulo 2");
        modelo.addColumn("Titulo 3");
        modelo.addColumn("Titulo 4");
        nombreDeLaTabla.setModel(modelo);
    }

    private void cargaTabla(ACA SE COLOCAN LOS OBJETOS O ELEMENTOS CON LOS QUE SE LLENA
    EN NUESTRO CASO Productos productos) {

        modelo.addRow(new Object[]{
            productos.getCode,
            cliente.getName(),
            cliente.getBrand(),
            cliente.getType(),
            cliente.getPrice(),
            cliente.getStock()
        });

    }
    --------------------------------------------------------------------------
    Comando para borrar tabla:
    modelo.setRowCount(0);
    */
    public Principal() {
        initComponents();
        setExtendedState(Principal.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jMenuItem1.setText("Crear");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem2.setText("Consulta por Nombre");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Consulta por Precio");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Consulta por Rubro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

}
