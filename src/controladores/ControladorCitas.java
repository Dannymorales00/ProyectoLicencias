/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelos.Cita;
import modelos.Cliente;
import ventanas.FrmMenu;

/**
 *
 * @author Danny_PC
 */
public class ControladorCitas {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    private ControladorClientes ccliente = new ControladorClientes();
    private Cliente cliente; 
    private Statement sentencias2;
    
    public ControladorCitas() {
       
       conn = FrmMenu.getConexion();
        try {
            this.sentencias2 = FrmMenu.getConexion().getConn().createStatement();
        } catch (SQLException ex) {
            System.out.println("Erros al crear otra sentencia");
        }
       this.sentencias = conn.getSentencias();
       this.datos = conn.getDatos();
    }

    public ControladorCitas(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencias();
        this.datos=conn.getDatos();
    }
    
    public boolean añadir(Cita cita){
        try {
            
           SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
         
           sentencias.execute("insert into citas values(null,'"+f.format(cita.getFecha())+"','"+cita.getHora()+"','"+cita.getCliente().getCedula()+"','"+cita.getEstado()+"')");
           return true;  
           
           
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
            System.out.println(ex);
        }
        return false;
    }
    
        
        
        
      
    public Cita buscar(Cita cita){
        try {
           
            this.datos = this.sentencias2.executeQuery("select * from citas where id="+ cita.getId());
           
                if(datos.next())
                {
                    
                    
                    cliente = new Cliente();
                    cliente.setCedula(datos.getInt(4));
                    cliente =  ccliente.buscar(cliente);
                    Cita cita2 = new Cita(datos.getInt(1),datos.getDate(2),String.valueOf(datos.getTime(3)),cliente,datos.getString(5));
                    
                    if( CambiarEstadoCita(cita2) )
                    {
                        actualizar(cita);
                    }
                    
                    return cita2;
                } 
                
        }catch (SQLException ex) {
                System.out.println("Error al buscar");
                System.out.println(ex);
            }
        return null;

    }
        
    public boolean eliminar(Cita cita){
        try {
            this.sentencias.executeUpdate("delete from citas where id="+cita.getId());
            return true;
            
        } catch (SQLException ex) {
                
            System.out.println("Error al borrar");
        }
            return false;
    }
    
    public boolean actualizar(Cita cita){
        
        try {  
              
            this.sentencias.executeUpdate("UPDATE citas SET fecha='"+cita.getFecha()+"', hora='"+cita.getHora()+"', estado='"+cita.getEstado()+"'  WHERE id ='"+cita.getId()+"';");
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    }    
        
    public ArrayList<Cita> listar(Cita cita){
        
        ArrayList<Cita> citas = new ArrayList();
            try {
                
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println("la fecha de la cita es: "+f.format(cita.getFecha()));
                this.datos = this.sentencias2.executeQuery("select * from citas where fecha ='"+f.format(cita.getFecha())+"';");
                
                while(datos.next())
                {
                    cliente = new Cliente();
                    cliente.setCedula(datos.getInt(4));
                    citas.add(new Cita(datos.getDate(2),String.valueOf(datos.getTime(3)), ccliente.buscar(cliente)));
                                                                                            
                }
                return citas;
                
            } catch (SQLException ex) {
                System.out.println("Error al listar");
                System.out.println(ex);
            }
        return null; 
    }
    
    
    public boolean validarPK(Cita cita) {
        
        
        try 
        {

            this.datos = this.sentencias.executeQuery("select * from citas where cedula_cliente = '"+cita.getCliente().getCedula()+"' AND estado = 'activado' ");
           
            if (datos.next()) 
            {
              
                return false;
            }
                
        } catch (SQLException ex){
            System.out.println("Error al validarPK");
            
        }
         
        return true;
       
        
        
        
        
    }
    
    
    
    
    
    //valida que exista un cliente para poder agregar una cita
    public boolean ValidarFK(Cita cita){

        try 
        {
            this.datos = this.sentencias.executeQuery("select * from clientes where cedula="+cita.getCliente().getCedula());
                
            if (datos.next()) 
            {
                return true;
            }
                
        } catch (SQLException ex){
            System.out.println("Error al validarFK");
            
        }
         
        return false;
       
    }
    
    
     
    
    
    private boolean CambiarEstadoCita(Cita cita ) {
        Date fechaActual = new Date();
        SimpleDateFormat ffecha = new SimpleDateFormat("yyyy-MM-dd");
        
        
        if ( cita.getFecha().compareTo(fechaActual)<0 )
        {
            cita.setEstado("desactivado");
            System.out.println("La Fecha es menor ");
            return true;
        
      
        
        }else{
        
            if (   cita.getFecha().compareTo(fechaActual)>0 )
            {
                System.out.println("La Fecha es mayor");
                return false;
        
            
            }else{
                //System.out.println("son iguales");
                cita.setEstado("desactivado");
                return true;
          
            }
        
        }
    
      
    }
    
}
