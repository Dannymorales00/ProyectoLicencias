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
    private ControladorClientes cc;
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
            System.out.println(cita.getHora()); 
           SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
         
           sentencias.execute("insert into citas values(null,'"+f.format(cita.getFecha())+"','"+cita.getHora()+"','"+cita.getCliente().getCedula()+"','"+cita.getEstado()+"')");
           return true;  
           
           
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
            System.out.println(ex);
        }
        return false;
    }
      
    public Cita buscar(int cedula){
        try {
            
            this.datos = this.sentencias.executeQuery("select * from citas where cedula_cliente="+cedula);
            
                if(datos.next())
                {
                    cliente.setCedula(datos.getInt(4));
                    //Cita cita = new Cita(datos.getInt(1),datos.getDate(2),datos.getTime(3),this.cc.buscar(cliente));
                   // return cita;
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
        
    public ArrayList<Cita> listar(int id){
        
        ArrayList<Cita> citas = new ArrayList();
            try {
                this.datos = this.sentencias.executeQuery("select * from citas where id='"+id+"'");
                
                while(datos.next()){
                    
                    cliente.setCedula(datos.getInt(4));
                    //citas.add(new Cita(datos.getInt(1),datos.getDate(2),datos.getTime(3), cc.buscar(cliente)) );
                                                                                             
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
      
}
