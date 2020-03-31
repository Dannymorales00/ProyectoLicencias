/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conexion.Conexion;

/**
 *
 * @author LeanPC
 */
public class FrmMenu extends javax.swing.JFrame {
    private FrmConfiguracion frmconfig;

    private static Conexion conexion = new Conexion();
    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        frmconfig = new FrmConfiguracion();
        conexion.Conectar();
        
    
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuRegistar = new javax.swing.JMenu();
        jMenuItemVehiculos = new javax.swing.JMenuItem();
        jMenuItemEntrada = new javax.swing.JMenuItem();
        jMenuItemSalida = new javax.swing.JMenuItem();
        jMenuConfig = new javax.swing.JMenu();
        jMenuItemConfig = new javax.swing.JMenuItem();

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

        jMenuRegistar.setText("Registrar");

        jMenuItemVehiculos.setText("Vehículos");
        jMenuItemVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVehiculosActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemVehiculos);

        jMenuItemEntrada.setText("Llegadas");
        jMenuItemEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntradaActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemEntrada);

        jMenuItemSalida.setText("Salidas");
        jMenuItemSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalidaActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemSalida);

        jMenuBar2.add(jMenuRegistar);

        jMenuConfig.setText("Configuración");

        jMenuItemConfig.setText("Configurar conexión");
        jMenuItemConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItemConfig);

        jMenuBar2.add(jMenuConfig);

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
        this.frmconfig.setVisible(true);
    }//GEN-LAST:event_jMenuItemConfigActionPerformed

    private void jMenuItemVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVehiculosActionPerformed

    }//GEN-LAST:event_jMenuItemVehiculosActionPerformed

    private void jMenuItemEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntradaActionPerformed
 
    }//GEN-LAST:event_jMenuItemEntradaActionPerformed

    private void jMenuItemSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalidaActionPerformed

    }//GEN-LAST:event_jMenuItemSalidaActionPerformed

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
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuConfig;
    private javax.swing.JMenuItem jMenuItemConfig;
    private javax.swing.JMenuItem jMenuItemEntrada;
    private javax.swing.JMenuItem jMenuItemSalida;
    private javax.swing.JMenuItem jMenuItemVehiculos;
    private javax.swing.JMenu jMenuRegistar;
    // End of variables declaration//GEN-END:variables
}
