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
import modelos.Oficial;

/**
 *
 * @author Danny_PC
 */
public class ControladorOficiales {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    
    public ControladorOficiales() {
       
       //conn = FrmMenu.getConexion();
       this.sentencias= conn.getSentencias();
       this.datos=conn.getDatos();
    }

    public ControladorOficiales(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencias();
        this.datos=conn.getDatos();
    }
    
        public boolean añadir(Oficial oficial){
        try {
           return sentencias.execute("insert into oficiales values(null,'"+oficial.getCedula()+"','"+oficial.getNombre()+"','"+oficial.getFechanacimiento()+"','"+oficial.getTelefono()+"','"+oficial.getCorreo()+"','"+oficial.getSalario()+"')",sentencias.RETURN_GENERATED_KEYS);
             
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
        }
        return false;
    }
        
        public Oficial buscar(String cedula){
        try {
            
            this.datos = this.sentencias.executeQuery("select * from oficiales where cedula="+cedula);
            
                if(datos.next())
                {
             
                    
                    Oficial oficial = new Oficial();
                    oficial.setCedula(datos.getInt(2));
                    oficial.setNombre(datos.getString(3));
                    oficial.setFechanacimiento(datos.getDate(4));
                    oficial.setTelefono(datos.getInt(5));
                    oficial.setCorreo(datos.getString(6));
                    oficial.setSalario(datos.getDouble(7));
                    
                    return oficial;
                } 
                
        }catch (SQLException ex) {
                System.out.println("Error al buscar");
            }
        return null;

    }
        
    public boolean eliminar(Oficial oficial){
        try {
            this.sentencias.executeUpdate("delete from oficiales where cedula="+oficial.getCedula());
            
            
        } catch (SQLException ex) {
                
            System.out.println("Error al borrar");
        }
            return false;
    }
    
    public boolean actualizar(Oficial oficial){
        
        try {  
              
            this.sentencias.executeUpdate("UPDATE oficiales SET nombre='"+oficial.getNombre()+"' WHERE cedula ='"+oficial.getCedula()+"';");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    }    
        
            public ArrayList<Oficial> listar(String cedula){
            ArrayList<Oficial> oficiales = new ArrayList();
            try {
                this.datos = this.sentencias.executeQuery("select * from oficiales where cedula='"+cedula+"'");
                
                while(datos.next()){
              
                    oficiales.add(new Oficial(datos.getInt(2),datos.getString(3),datos.getDate(4),datos.getInt(5),datos.getString(6),datos.getDouble(7)));
               
                }
                return oficiales;
            } catch (SQLException ex) {
                System.out.println("Error al listar");
            }
            return null; 
    }
}
