/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanascitas;


import ventanasclientes.JDialogBuscarClientes;
import controladores.ControladorCitas;
import controladores.ControladorClientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Cita;
import modelos.Cliente;



/**
 *
 * @author Danny_PC
 */
public class AgregarCitas extends javax.swing.JInternalFrame {
 
    private ArrayList<Cliente> clientes = new ArrayList();
    private Cliente cliente;
    private ControladorClientes ccliente;
    private Cita cita;
    private ControladorCitas ccita;
    private String hora;
    private String minutos;
    private String segundos;
    /**
     * Creates new form AgregarCitas
     */
    public AgregarCitas() {
        ccita = new ControladorCitas();
        ccliente = new ControladorClientes();
        cliente = null;
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
        jLabel2 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JCombreBoxMinutos = new javax.swing.JComboBox<>();
        JComboBoxHora = new javax.swing.JComboBox<>();
        JComboBoxSegundos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        BtnSeleccionarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Agregar Citas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Fecha:");
        jLabel2.setToolTipText("");

        BtnAgregar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Hora:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Minutos:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Segundos:");
        jLabel7.setToolTipText("");

        JCombreBoxMinutos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JCombreBoxMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige Minuto", "1\t", "2\t", "3\t", "4\t", "5\t", "6\t", "7\t", "8\t", "9\t", "10", "11\t", "12\t", "13\t", "14\t", "15\t", "16\t", "17\t", "18\t", "19\t", "20", "21\t", "22\t", "23\t", "24\t", "25\t", "26\t", "27\t", "28\t", "29\t", "30", "31\t", "32\t", "33\t", "34\t", "35\t", "36\t", "37\t", "38\t", "39\t", "40", "41\t", "42\t", "43\t", "44\t", "45\t", "46\t", "47\t", "48\t", "49\t", "50", "51\t", "52\t", "53\t", "54\t", "55\t", "56\t", "57\t", "58\t", "59", " " }));

        JComboBoxHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige Hora", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));
        JComboBoxHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxHoraItemStateChanged(evt);
            }
        });

        JComboBoxSegundos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JComboBoxSegundos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige Segundos", "1\t", "2\t", "3\t", "4\t", "5\t", "6\t", "7\t", "8\t", "9\t", "10", "11\t", "12\t", "13\t", "14\t", "15\t", "16\t", "17\t", "18\t", "19\t", "20", "21\t", "22\t", "23\t", "24\t", "25\t", "26\t", "27\t", "28\t", "29\t", "30", "31\t", "32\t", "33\t", "34\t", "35\t", "36\t", "37\t", "38\t", "39\t", "40", "41\t", "42\t", "43\t", "44\t", "45\t", "46\t", "47\t", "48\t", "49\t", "50", "51\t", "52\t", "53\t", "54\t", "55\t", "56\t", "57\t", "58\t", "59" }));

        BtnSeleccionarCliente.setText("Seleccionar Cliente");
        BtnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Cliente:");
        jLabel3.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Cliente:");

        TxtNombre.setEditable(false);
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Cedula:");

        TxtCedula.setEditable(false);
        TxtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCedulaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnSeleccionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(TxtCedula))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BtnSeleccionarCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JComboBoxSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JComboBoxHora, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JCombreBoxMinutos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAgregar)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JCombreBoxMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JComboBoxSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(BtnAgregar)
                .addGap(26, 26, 26))
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

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        

        cita= new Cita();
        
        cita.setFecha(this.jDateChooser1.getDate());
        
        if(this.JComboBoxHora.getSelectedIndex()>0 && this.JCombreBoxMinutos.getSelectedIndex()>0 && this.JComboBoxSegundos.getSelectedIndex()>0 )
        {
            
            hora = String.valueOf(this.JComboBoxHora.getSelectedItem());
            minutos = String.valueOf(this.JCombreBoxMinutos.getSelectedItem());
            segundos = String.valueOf(this.JComboBoxSegundos.getSelectedItem());
            cita.setHora( concatenarhora() );
            cita.setEstado("activado");
            
            
            if(cliente!=null){
                
                cita.setCliente(cliente);
            
            }else{JOptionPane.showMessageDialog(this, "Debe agregar un cliente");}
            
           
         
        
            if(cita.comprobar())
            {
            
                if(ccita.ValidarFK(cita))
                {
                    if(ccita.ValidarCantCitas(cita))
                    {
                        
                        if(ccita.validarPK(cita)){
                            
                            if( ccita.añadir(cita))
                            {
                                JOptionPane.showMessageDialog(this, "Cita agregada");
                                cita=null;
                                cliente=null;
                                Limpiar();
                            }else{JOptionPane.showMessageDialog(this, "surgio un problema al añadir");}
                    
                        }else{JOptionPane.showMessageDialog(this, "no puede tener 2 citas activas");}    
                            
                    }else{JOptionPane.showMessageDialog(this, "Ya no hay mas citas disponibles para hoy");}
                    
                }else{JOptionPane.showMessageDialog(this, "No se encuentra ese cliente");}
            
            }else{ JOptionPane.showMessageDialog(this, "Debe rellenar todos los campos"); }
        
        }else{JOptionPane.showMessageDialog(this, "Debe selecionar una hora, minuto y segundo");} 
        
        
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarClienteActionPerformed
        
        JDialogBuscarClientes jdiagbuscarclientes = new JDialogBuscarClientes(null,true);
        jdiagbuscarclientes.setVisible(true);
        
        if( (cliente = jdiagbuscarclientes.getClienteSeleccionado() )!=null )
        {
            
            this.TxtCedula.setEditable(true);
            this.TxtNombre.setEditable(true);
            this.TxtCedula.setText(String.valueOf( cliente.getCedula()));
            this.TxtNombre.setText(String.valueOf(cliente.getNombre()));
            this.TxtCedula.setEditable(false);
            this.TxtNombre.setEditable(false);
        }else
        {
            System.out.println("no selecciono un cliente");
        }
    }//GEN-LAST:event_BtnSeleccionarClienteActionPerformed

    private void JComboBoxHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxHoraItemStateChanged
   
    }//GEN-LAST:event_JComboBoxHoraItemStateChanged

    private void TxtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedulaKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
        
        if((this.TxtCedula.getText().length()==11)){
             evt.consume();
        }
    }//GEN-LAST:event_TxtCedulaKeyTyped

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreKeyTyped

      
    
    
    public String concatenarhora() {
        //una sola hora y eliminamos espacios
        return (this.hora+":"+this.minutos+":"+this.segundos+"").replaceAll("\\s",""); 
        
    }
    
    
    public void Limpiar() {
   
        this.jDateChooser1.setCalendar(null);
        this.TxtCedula.setText("");
        this.TxtNombre.setText("");
        this.JComboBoxHora.setSelectedIndex(0);
        this.JCombreBoxMinutos.setSelectedIndex(0);
        this.JComboBoxSegundos.setSelectedIndex(0);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnSeleccionarCliente;
    private javax.swing.JComboBox<String> JComboBoxHora;
    private javax.swing.JComboBox<String> JComboBoxSegundos;
    private javax.swing.JComboBox<String> JCombreBoxMinutos;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtNombre;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
