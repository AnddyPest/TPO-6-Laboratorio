package ventanas;

import clases.principal.Productos;
import entidades.clases.EntidadesProductos;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {
    private EntidadesProductos entidadesProductos;
    Productos prod1 = new Productos(1, "Aceite", "Patito", "Comestible", 100.25, 12);
    
   

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
        entidadesProductos = new EntidadesProductos();
        entidadesProductos.addProducts(prod1);
        setExtendedState(Principal.MAXIMIZED_BOTH);
        //Productos product1 = new Productos("Fideito", "Marolio", "Comestible", 1200, 1);
      //entidadProducto.addProducts(product1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("../Images/background-image.jpg"));
        Image image = icon.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCrear = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuConsultaPorNombre = new javax.swing.JMenuItem();
        MenuConsultaPorPrecio = new javax.swing.JMenuItem();
        MenuConsultaPorRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        MenuCrear.setText("Crear");
        MenuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCrearActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCrear);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        MenuConsultaPorNombre.setText("Consulta por Nombre");
        jMenu2.add(MenuConsultaPorNombre);

        MenuConsultaPorPrecio.setText("Consulta por Precio");
        jMenu2.add(MenuConsultaPorPrecio);

        MenuConsultaPorRubro.setText("Consulta por Rubro");
        MenuConsultaPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaPorRubroActionPerformed(evt);
            }
        });
        jMenu2.add(MenuConsultaPorRubro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuConsultaPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaPorRubroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsultaPorRubro vistaRubro = new ConsultaPorRubro(entidadesProductos);
        vistaRubro.setVisible(true);
        Escritorio.add(vistaRubro);
        Escritorio.moveToFront(vistaRubro);
        
    }//GEN-LAST:event_MenuConsultaPorRubroActionPerformed

    private void MenuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCrearActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        GestionDeProductos vistaGestionDeProductos = new GestionDeProductos(entidadesProductos);
        vistaGestionDeProductos.setVisible(true);
        Escritorio.add(vistaGestionDeProductos);
        Escritorio.moveToFront(vistaGestionDeProductos);
    }//GEN-LAST:event_MenuCrearActionPerformed

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
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MenuConsultaPorNombre;
    private javax.swing.JMenuItem MenuConsultaPorPrecio;
    private javax.swing.JMenuItem MenuConsultaPorRubro;
    private javax.swing.JMenuItem MenuCrear;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
    
}
