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
import java.util.ArrayList;
import modelos.Cita;

/**
 *
 * @author Danny_PC
 */
public class ControladorCitas {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    
    
    public ControladorCitas() {
       
       //conn = FrmMenu.getConexion();
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
           return sentencias.execute("insert into citas values(null,'"+cita.getFecha()+"','"+cita.getHora()+"','"+cita.getCliente()+"')",sentencias.RETURN_GENERATED_KEYS);
             
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
        }
        return false;
    }
        
    public Cita buscar(Cita cita){
        try {
            
            this.datos = this.sentencias.executeQuery("select * from citas where cliente="+cita.getCliente().getCedula());
            
                if(datos.next())
                {
             
                    
                    Cita oficial = new Cita();
                    cita.setId(datos.getInt(1));
                    cita.setFecha(datos.getDate(2));
                    cita.setHora(datos.getTime(3));
                    //cita.setCliente(datos.getInt(4));
                    
                    return oficial;
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
                    //no se puede agregar porque le falta un cliente
                    //citas.add(new Cita(datos.getInt(1),datos.getDate(2),datos.getTime(3),datos.getInt(4)));
               
                }
                return citas;
            } catch (SQLException ex) {
                System.out.println("Error al listar");
            }
        return null; 
    }
    
    
    
}
