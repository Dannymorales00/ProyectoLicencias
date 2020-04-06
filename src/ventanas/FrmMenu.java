/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import ventanascitas.AgregarCitas;
import ventanasclientes.ModificarClientes;
import ventanasclientes.AgregarClientes;
import ventanasclientes.EliminarClientes;
import ventanasusuarios.AgregarUsuarios;
import ventanasusuarios.ModificarUsuarios;
import ventanasusuarios.EliminarUsuarios;
import ventanasoficiales.AgregarOficiales;
import conexion.Conexion;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author LeanPC
 */
public class FrmMenu extends javax.swing.JFrame {

    private AgregarUsuarios agregarUsuarios;
    private ModificarUsuarios modificarUsuarios;
    private AgregarOficiales agregarOficiales;
    private static Conexion conexion = new Conexion();
    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
  
        conexion.Conectar();
        
        if(conexion.getConn()==null)
        {
          
            Frame f = JOptionPane.getFrameForComponent(null);
            JDialogConfiguracion jdconfig = new JDialogConfiguracion(f,true);
            jdconfig.setVisible(true);
            
            if(jdconfig.getConn()==null)
            {
                System.exit(0);
            }
            
            
        }
        
    
    }

    public static Conexion getConexion() {
        return conexion;
    }


    
    public void VerificarConexion() {
        //sino se logro conectar abre la ventana para configurar
        //si en la ventana de configurar no se logra conectar se cierra toda la aplicacion
        
        if(conexion.getConn()==null)
        {
          
            Frame f = JOptionPane.getFrameForComponent(null);
            JDialogConfiguracion jdconfig = new JDialogConfiguracion(f,true);
            jdconfig.setVisible(true);
            
            if(jdconfig.getConn()==null)
            {
                System.out.println("no se conecto jdiag conn");
                System.exit(0);
            }else
            {
                // si en la ventana configuracion se conecto, volvemos a realizar la conexion aquí 
                conexion.Conectar();
            
            }
            
            
        }
        
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuRegistar = new javax.swing.JMenu();
        jMenuItemAgregarUsuarios = new javax.swing.JMenuItem();
        jMenuItemModificarUsuarios = new javax.swing.JMenuItem();
        jMenuItemEliminarUsuarios = new javax.swing.JMenuItem();
        jMenuOficial = new javax.swing.JMenu();
        jMenuItemConfig = new javax.swing.JMenuItem();
        jMenuItemConfig1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAgregarClientes = new javax.swing.JMenuItem();
        jMenuItemModificarClientes = new javax.swing.JMenuItem();
        jMenuItemEliminarClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAgregarCita = new javax.swing.JMenuItem();
        jmenu = new javax.swing.JMenu();
        jMenuItemAbrirConfiguracion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jMenuRegistar.setText("Usuarios");

        jMenuItemAgregarUsuarios.setText("Agregar");
        jMenuItemAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarUsuariosActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemAgregarUsuarios);

        jMenuItemModificarUsuarios.setText("Modificar");
        jMenuItemModificarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarUsuariosActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemModificarUsuarios);

        jMenuItemEliminarUsuarios.setText("Eliminar");
        jMenuItemEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarUsuariosActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemEliminarUsuarios);

        jMenuBar2.add(jMenuRegistar);

        jMenuOficial.setText("Oficiales");

        jMenuItemConfig.setText("Agregar");
        jMenuItemConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigActionPerformed(evt);
            }
        });
        jMenuOficial.add(jMenuItemConfig);

        jMenuItemConfig1.setText("Calcular salario");
        jMenuItemConfig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfig1ActionPerformed(evt);
            }
        });
        jMenuOficial.add(jMenuItemConfig1);

        jMenuBar2.add(jMenuOficial);

        jMenu1.setText("Clientes");

        jMenuItemAgregarClientes.setText("Agregar");
        jMenuItemAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAgregarClientes);

        jMenuItemModificarClientes.setText("Modificar");
        jMenuItemModificarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemModificarClientes);

        jMenuItemEliminarClientes.setText("Eliminar");
        jMenuItemEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEliminarClientes);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Pruebas");

        jMenuItem2.setText("Agregar");
        jMenu2.add(jMenuItem2);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Citas");

        jMenuItemAgregarCita.setText("Agregar");
        jMenuItemAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarCitaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAgregarCita);

        jMenuBar2.add(jMenu3);

        jmenu.setText("Configuracion");
        jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuActionPerformed(evt);
            }
        });

        jMenuItemAbrirConfiguracion.setText("Abrir");
        jMenuItemAbrirConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirConfiguracionActionPerformed(evt);
            }
        });
        jmenu.add(jMenuItemAbrirConfiguracion);

        jMenuBar2.add(jmenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigActionPerformed
        
        this.agregarOficiales = new AgregarOficiales();
        this.jDesktopPane1.add(this.agregarOficiales);
        agregarOficiales.setVisible(true);
  
        
    }//GEN-LAST:event_jMenuItemConfigActionPerformed

    private void jMenuItemAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarUsuariosActionPerformed
        this.agregarUsuarios = new AgregarUsuarios();
        this.jDesktopPane1.add(this.agregarUsuarios);
        this.agregarUsuarios.setVisible(true);
            
    }//GEN-LAST:event_jMenuItemAgregarUsuariosActionPerformed

    private void jMenuItemModificarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarUsuariosActionPerformed
        this.modificarUsuarios = new ModificarUsuarios();
        this.jDesktopPane1.add(this.modificarUsuarios);
        this.modificarUsuarios.setVisible(true);
            
        
        
        
        
    }//GEN-LAST:event_jMenuItemModificarUsuariosActionPerformed

    private void jMenuItemEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarUsuariosActionPerformed
        EliminarUsuarios eliminarUsuarios = new EliminarUsuarios();
        this.jDesktopPane1.add(eliminarUsuarios);
        eliminarUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemEliminarUsuariosActionPerformed

    private void jMenuItemConfig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfig1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemConfig1ActionPerformed

    private void jmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_jmenuActionPerformed

    private void jMenuItemAbrirConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirConfiguracionActionPerformed
        Frame f = JOptionPane.getFrameForComponent(null);
        JDialogConfiguracion jdconfig = new JDialogConfiguracion(f,true);
        jdconfig.setVisible(true);
    }//GEN-LAST:event_jMenuItemAbrirConfiguracionActionPerformed

    private void jMenuItemAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarClientesActionPerformed
        AgregarClientes agregarClientes = new AgregarClientes();
        this.jDesktopPane1.add(agregarClientes);
        agregarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarClientesActionPerformed

    private void jMenuItemEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarClientesActionPerformed
        EliminarClientes eliminarClientes =  new EliminarClientes();
        this.jDesktopPane1.add(eliminarClientes);
        eliminarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemEliminarClientesActionPerformed

    private void jMenuItemModificarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarClientesActionPerformed
        ModificarClientes modificarClientes = new ModificarClientes();
        this.jDesktopPane1.add(modificarClientes);
        modificarClientes.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemModificarClientesActionPerformed

    private void jMenuItemAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarCitaActionPerformed
        AgregarCitas agregarCitas= new AgregarCitas();
        this.jDesktopPane1.add(agregarCitas);
        agregarCitas.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarCitaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbrirConfiguracion;
    private javax.swing.JMenuItem jMenuItemAgregarCita;
    private javax.swing.JMenuItem jMenuItemAgregarClientes;
    private javax.swing.JMenuItem jMenuItemAgregarUsuarios;
    private javax.swing.JMenuItem jMenuItemConfig;
    private javax.swing.JMenuItem jMenuItemConfig1;
    private javax.swing.JMenuItem jMenuItemEliminarClientes;
    private javax.swing.JMenuItem jMenuItemEliminarUsuarios;
    private javax.swing.JMenuItem jMenuItemModificarClientes;
    private javax.swing.JMenuItem jMenuItemModificarUsuarios;
    private javax.swing.JMenu jMenuOficial;
    private javax.swing.JMenu jMenuRegistar;
    private javax.swing.JMenu jmenu;
    // End of variables declaration//GEN-END:variables
}
