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
import java.time.LocalTime;
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
    
    public ControladorCitas() {
       
       conn = FrmMenu.getConexion();
       this.sentencias= conn.getSentencias();
       this.datos=conn.getDatos();
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
            
            this.datos = this.sentencias.executeQuery("select * from citas where id="+ cita.getId());
            
                if(datos.next())
                {
//                    Cita cita2 = new Cita();
//                    cita2.setId(datos.getInt(1));
//                    cita2.setFecha(datos.getDate(2));
//                    cita2.setHora(String.valueOf( datos.getTime(3)));
                    cliente = new Cliente();
                    cliente.setCedula(datos.getInt(4));
//                    cita2.setCliente(ccliente.buscar(cliente));
//                    cita2.setEstado(datos.getString(5));
//                    
                    Cita cita2 = new Cita(datos.getInt(1),datos.getDate(2),String.valueOf(datos.getTime(3)),ccliente.buscar(cliente),datos.getString(5));
                    ComprobarEstadoCita(cita2);
                    return cita2;
                } 
                
        }catch (SQLException ex) {
                System.out.println("Error al buscar");
            }
        return null;

    }
        
    public boolean eliminar(Cita cita){
        try {
            this.sentencias.executeUpdate("delete from citas where id="+cita.getId());
            
            
        } catch (SQLException ex) {
                
            System.out.println("Error al borrar");
        }
            return false;
    }
    
    public boolean actualizar(Cita cita){
        
        try {  
              
            this.sentencias.executeUpdate("UPDATE citas SET fecha_cita='"+cita.getFecha()+"' WHERE cedula ='"+cita.getCliente().getCedula()+"';");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    }    
        
    public ArrayList<Cita> listar(Cita cita){
        
        ArrayList<Cita> citas = new ArrayList();
            try {
                this.datos = this.sentencias.executeQuery("select * from citas where fecha ='"+cita.getFecha()+"';");
                
                while(datos.next()){
                    
                    cliente.setCedula(datos.getInt(4));
                    citas.add(new Cita(datos.getDate(2),datos.getTime(3).toString(), cc.buscar(cliente)));
                                                                                             
                }
                return citas;
            } catch (SQLException ex) {
                System.out.println("Error al listar");
            }
        return null; 
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
    
    
    public void ComprobarEstadoCita(Cita cita ) {
        Date fechaActual = new Date();
        SimpleDateFormat ffecha = new SimpleDateFormat("yyyy-MM-dd");
        
        
    if ( cita.getFecha().compareTo(fechaActual)<0 ){
        System.out.println("La Fecha 1 es menor ");
    }else{
     if (   cita.getFecha().compareTo(fechaActual)>0 ){
            System.out.println("La Fecha 1 es mayor");
     }else{
        System.out.println("son iguales");
     }
        
    }
    
      
    }
    
}
