/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaspruebas;

import controladores.ControladorClientes;
import controladores.ControladorOficiales;
import controladores.ControladorPruebas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Oficial;
import modelos.Prueba;

/**
 *
 * @author LeanPC
 */
public class JDialogBuscarPruebasPorCedula extends javax.swing.JDialog {

    private ArrayList<Prueba> pruebas;
    private ControladorPruebas conPrueba;
    private ResultSet datos;
    private ControladorOficiales conOficial;
    private ControladorClientes conCliente;
    private Cliente cliente;
    private Oficial oficial;
    private boolean seleccionado;

    /**
     * Creates new form JDialogBuscarPruebas
     */
    public JDialogBuscarPruebasPorCedula(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        datos = null;
        conPrueba = new ControladorPruebas();
        conOficial = new ControladorOficiales();
        conCliente = new ControladorClientes();
        seleccionado = false;
    }

    public void exportarDatos(File file) throws IOException, SQLException {
        FileWriter fl = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fl);
        datos = conPrueba.listarCedula(cedulaTxt.getText());
        boolean b = true;

        while (datos.next()) {
            if (b) {
                bw.write("<pruebas>");
                bw.newLine();
                bw.write("  <cliente>");
                bw.newLine();
                bw.write("      <id>" + datos.getString(16) + "</id>");
                bw.newLine();
                bw.write("      <cedula>" + datos.getString(17) + "</cedula>");
                bw.newLine();
                bw.write("      <nombre>" + datos.getString(18) + "</nombre>");
                bw.newLine();
                bw.write("      <fecha_nacimiento>" + datos.getString(19) + "</fecha_nacimiento>");
                bw.newLine();
                bw.write("      <telefono>" + datos.getString(20) + "</telefono>");
                bw.newLine();
                bw.write("      <correo>" + datos.getString(21) + "</correo>");
                bw.newLine();
                bw.write("  </cliente>");
                bw.newLine();
                b = false;
            }

            bw.write("  <prueba>");
            bw.newLine();
            bw.write("      <id>" + datos.getString(1) + "</id>");
            bw.newLine();
            bw.write("      <fecha>" + datos.getString(2) + "</fecha>");
            bw.newLine();
            bw.write("      <hora>" + datos.getString(3) + "</hora>");
            bw.newLine();
            bw.write("      <observaciones>" + datos.getString(6) + "</observaciones>");
            bw.newLine();
            bw.write("      <nota>" + datos.getString(7) + "</nota>");
            bw.newLine();
            bw.write("      <estado>" + datos.getString(8) + "</estado>");
            bw.newLine();
            bw.write("      <oficial>");
            bw.newLine();
            bw.write("          <id>" + datos.getString(9) + "</id>");
            bw.newLine();
            bw.write("          <cedula>" + datos.getString(10) + "</cedula>");
            bw.newLine();
            bw.write("          <nombre>" + datos.getString(11) + "</nombre>");
            bw.newLine();
            bw.write("          <fecha_nacimiento>" + datos.getString(12) + "</fecha_nacimiento>");
            bw.newLine();
            bw.write("          <telefono>" + datos.getString(13) + "</telefono>");
            bw.newLine();
            bw.write("          <correo>" + datos.getString(14) + "</correo>");
            bw.newLine();
            bw.write("          <salario>" + datos.getString(15) + "</salario>");
            bw.newLine();
            bw.write("      </oficial>");
            bw.newLine();

            bw.write("  </prueba>");
            bw.newLine();
        }
        bw.write("</pruebas>");
        bw.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        cedulaTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Pruebas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBuscar.setText("Expotar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cedulaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaTxtKeyTyped(evt);
            }
        });

        jLabel2.setText("Cedula:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Prueba prueba = new Prueba();
        prueba.setCliente(new Cliente());
        if (!cedulaTxt.getText().equals("")) {
            prueba.getCliente().setCedula(Integer.parseInt(cedulaTxt.getText()));
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese una cedula porfavor");
        }

        if (conPrueba.ValidarFKCliente(prueba)) {

            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {

                String ruta = fileChooser.getSelectedFile().getAbsolutePath();
                File file = new File(ruta + ".xml");
                try {
                    exportarDatos(file);
                } catch (IOException ex) {
                    Logger.getLogger(JDialogBuscarPruebasPorCedula.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(JDialogBuscarPruebasPorCedula.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Se ha exportado con exito");
                this.dispose();
            }

        }else{
            JOptionPane.showMessageDialog(this, "No se ha encontrado ningún cliente");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cedulaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaTxtKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
        
        if((this.cedulaTxt.getText().length()==11)){
             evt.consume();
        }
    }//GEN-LAST:event_cedulaTxtKeyTyped

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
            java.util.logging.Logger.getLogger(JDialogBuscarPruebasPorCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarPruebasPorCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarPruebasPorCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarPruebasPorCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogBuscarPruebasPorCedula dialog = new JDialogBuscarPruebasPorCedula(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}