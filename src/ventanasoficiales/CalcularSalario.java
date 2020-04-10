/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasoficiales;



import ventanasclientes.JDialogBuscarClientes;
import controladores.ControladorCitas;
import controladores.ControladorClientes;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Cita;
import modelos.Cliente;
import modelos.Oficial;



/**
 *
 * @author Danny_PC
 */
public class CalcularSalario extends javax.swing.JInternalFrame {
 
    private ArrayList<Cita> citas = new ArrayList();
    private Oficial oficial;
    private ControladorClientes ccliente;
    private Cita cita;
    private ControladorCitas ccita;
    private String hora;
    private String minutos;
    private String segundos;
    /**
     * Creates new form AgregarCitas
     */
    public CalcularSalario() {
        ccita = new ControladorCitas();
        ccliente = new ControladorClientes();
        oficial = null;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnSeleccionarOficial = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtSalario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BtnCalcularSalario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtEnfermedadyMaternidad = new javax.swing.JTextField();
        TxtInvalidezyMuerte = new javax.swing.JTextField();
        TxtAporteAsociacionSolidarista = new javax.swing.JTextField();
        TxtAporteDelTrabajador = new javax.swing.JTextField();
        TxtImpuestoRenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LblPorcentajeRenta = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtSalarioNeto = new javax.swing.JTextField();
        TxtTotalDeducciones = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Calcular Salario");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnSeleccionarOficial.setText("Seleccionar Oficial");
        BtnSeleccionarOficial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarOficialActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Oficial:");
        jLabel3.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Oficial:");

        TxtNombre.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Cedula:");

        TxtCedula.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setText("Salario:");

        TxtSalario.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtSalario)
                        .addGap(77, 77, 77))
                    .addComponent(TxtNombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnSeleccionarOficial, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(TxtCedula))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BtnSeleccionarOficial))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BtnCalcularSalario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnCalcularSalario.setText("Calcular");
        BtnCalcularSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularSalarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Enfermedad y maternidad:");

        jLabel5.setText("Invalidez y muerte:");

        jLabel6.setText("Aporte del trabajador:");

        jLabel7.setText("Aporte a la asociacion solidarista:");

        jLabel8.setText("Impuestos sobre la renta:");

        TxtEnfermedadyMaternidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEnfermedadyMaternidadActionPerformed(evt);
            }
        });

        jLabel9.setText("5.5%");

        jLabel10.setText("3.84%");

        jLabel11.setText("1%");

        jLabel12.setText("3.3%");

        LblPorcentajeRenta.setText("variable");

        jLabel15.setText("Total deducciones:");

        jLabel16.setText("Salario neto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(TxtAporteAsociacionSolidarista)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(TxtAporteDelTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel11))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(TxtEnfermedadyMaternidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(TxtInvalidezyMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtTotalDeducciones, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtImpuestoRenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addComponent(LblPorcentajeRenta)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TxtSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCalcularSalario)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtEnfermedadyMaternidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtInvalidezyMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtAporteDelTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtAporteAsociacionSolidarista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtImpuestoRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPorcentajeRenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TxtTotalDeducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCalcularSalario)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TxtSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcularSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularSalarioActionPerformed
        
        if(oficial!=null)
        {
            //limita los decimales y convierte en string
            DecimalFormat df = new DecimalFormat("#.00");
            double EyM = Double.valueOf(  df.format(oficial.getSalario()*0.055) );
            double IyM = Double.valueOf( df.format(oficial.getSalario()*0.0384) );
            double AT  = Double.valueOf( df.format(oficial.getSalario()*0.01) );
            double AAS = Double.valueOf( df.format(oficial.getSalario()*0.033) );
            double ISR = Double.valueOf(  df.format(CalcularImpuestoRenta()) );
            double TotalDeducciones = EyM+IyM+AT+AAS+ISR;
            double SalarioNeto = oficial.getSalario()-TotalDeducciones;
            
    
            
            
            
            
            this.TxtEnfermedadyMaternidad.setText(String.valueOf(EyM));
            this.TxtInvalidezyMuerte.setText(String.valueOf(IyM));
            this.TxtAporteDelTrabajador.setText(String.valueOf(AT));
            this.TxtAporteAsociacionSolidarista.setText(String.valueOf(AAS));
            this.TxtImpuestoRenta.setText(String.valueOf(ISR));
            this.TxtTotalDeducciones.setText(String.valueOf(TotalDeducciones));
            this.TxtSalarioNeto.setText(String.valueOf(SalarioNeto));
           
            
            
            
            
            
        
        }else
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un oficial");
        }

       
        
        
    }//GEN-LAST:event_BtnCalcularSalarioActionPerformed

    private void BtnSeleccionarOficialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarOficialActionPerformed
        
        JDialogBuscarOficiales jdiagbuscarOficiales = new JDialogBuscarOficiales(null,true);
        jdiagbuscarOficiales.setVisible(true);
        
        if( jdiagbuscarOficiales.getOficial()!=null )
        {
            
            oficial = jdiagbuscarOficiales.getOficial();
            this.TxtCedula.setEditable(true);
            this.TxtNombre.setEditable(true);
            this.TxtSalario.setEditable(true);
            this.TxtCedula.setText(String.valueOf(oficial.getCedula()));
            this.TxtNombre.setText(String.valueOf(oficial.getNombre()));
            this.TxtSalario.setText(String.valueOf(oficial.getSalario()));
            this.TxtCedula.setEditable(false);
            this.TxtNombre.setEditable(false);
            this.TxtSalario.setEditable(false);
            
        }else
        {
            System.out.println("no selecciono un Oficial");
        }
    }//GEN-LAST:event_BtnSeleccionarOficialActionPerformed

    private void TxtEnfermedadyMaternidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEnfermedadyMaternidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEnfermedadyMaternidadActionPerformed

      
    public double CalcularImpuestoRenta() {
            
        
        if(oficial.getSalario()>0 && oficial.getSalario()<=817000)
        {
            this.LblPorcentajeRenta.setText("0%");
            return   0;
        
        }else if(oficial.getSalario()>817000 && oficial.getSalario()<=122600){
                
            this.LblPorcentajeRenta.setText("10%");
            return  oficial.getSalario()*0.10;
              
        }else{
            
            this.LblPorcentajeRenta.setText("15%");    
            return  oficial.getSalario()*0.15;
        
        }
    
        
        
        
    }
    

    
    
    public void Limpiar() {
   
        this.TxtCedula.setText("");
        this.TxtNombre.setText("");
    
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcularSalario;
    private javax.swing.JButton BtnSeleccionarOficial;
    private javax.swing.JLabel LblPorcentajeRenta;
    private javax.swing.JTextField TxtAporteAsociacionSolidarista;
    private javax.swing.JTextField TxtAporteDelTrabajador;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtEnfermedadyMaternidad;
    private javax.swing.JTextField TxtImpuestoRenta;
    private javax.swing.JTextField TxtInvalidezyMuerte;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtSalario;
    private javax.swing.JTextField TxtSalarioNeto;
    private javax.swing.JTextField TxtTotalDeducciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    // End of variables declaration//GEN-END:variables
}
