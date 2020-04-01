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
import modelos.Prueba;

/**
 *
 * @author Danny_PC
 */
public class ControladorPruebas {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    private ControladorOficiales conOficiales;
    
    public ControladorPruebas() {
       
       //conn = FrmMenu.getConexion();
       this.sentencias= conn.getSentencias();
       this.datos=conn.getDatos();
    }

    public ControladorPruebas(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencias();
        this.datos=conn.getDatos();
    }
    
        public boolean añadir(Prueba prueba){
        try {
           sentencias.execute("insert into pruebas values(null,'"+prueba.getFecha()+"','"+prueba.getHora()+"','"+prueba.getOficial().getCedula()+"','"+prueba.getObservaciones()+"','"+prueba.getNota()+"','"+prueba.getEstado()+"')");
           return true;
           
           
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
        }
        return false;
    }
    
        public Prueba buscar(int cedula){
        try {
            
            this.datos = this.sentencias.executeQuery("select * from pruebas where cedula_oficial="+cedula);
            
                if(datos.next())
                {
             
                    Prueba prueba = new Prueba(datos.getDate(2),datos.getTime(3),this.conOficiales.buscar(datos.getInt(4)),datos.getString(5),datos.getInt(6),datos.getBoolean(7));
                    return prueba;
                } 
                
        }catch (SQLException ex) {
                System.out.println("Error al buscar");
            }
        return null;

    }
        
    public boolean eliminar(Prueba prueba){
        try {
            this.sentencias.executeUpdate("delete from pruebas where cedula_oficial="+prueba.getOficial().getCedula());
            
            
        } catch (SQLException ex) {
                
            System.out.println("Error al borrar");
        }
            return false;
    }
    
    public boolean actualizar(Prueba prueba){
        
        try {  
              
            this.sentencias.executeUpdate("UPDATE pruebas SET nota='"+prueba.getNota()+"' WHERE cedula_oficial='"+prueba.getOficial().getCedula()+"';");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    } 
        
    public ArrayList<Prueba> listar(int cedula){
        ArrayList<Prueba> pruebas = new ArrayList();
            try {
                this.datos = this.sentencias.executeQuery("select * from pruebas where cedula_oficial='"+cedula+"'");
                
                while(datos.next()){
                    
                    pruebas.add(new Prueba(datos.getDate(2),datos.getTime(3),this.conOficiales.buscar(datos.getInt(4)),datos.getString(5),datos.getInt(6),datos.getBoolean(7)));
               
                }
                return pruebas;
            } catch (SQLException ex) {
                System.out.println("Error al listar");
            }
        return null; 
    }
    
    //valida que exista un oficial para poder agregar una prueba
    public boolean ValidarFKOficial(Prueba prueba){

        try 
        {
            this.datos = this.sentencias.executeQuery("select * from oficiales where cedula="+prueba.getOficial().getCedula());
                
            if (datos.next()) 
            {
            
                return true;
              
            }
                
        } catch (SQLException ex){
            System.out.println("Error al validarFKOficial");
            
        }
         
        return false;
       
    }  
    //valida que exista una cita con esa fecha para poder agregar una prueba
    public boolean ValidarFKFecha(Prueba prueba){

        try 
        {
            this.datos = this.sentencias.executeQuery("select * from citas where fecha="+prueba.getFecha());
                
            if (datos.next()) 
            {
            
                return true;
              
            }
                
        } catch (SQLException ex){
            System.out.println("Error al validarFKFecha");
            
        }
         
        return false;
       
    }
    //valida que exista una cita con esa hora para poder agregar una prueba
    public boolean ValidarFKHora(Prueba prueba){

        try 
        {
            this.datos = this.sentencias.executeQuery("select * from citas where hora="+prueba.getHora());
                
            if (datos.next()) 
            {
            
                return true;
              
            }
                
        } catch (SQLException ex){
            System.out.println("Error al validarFKHora");
            
        }
         
        return false;
       
    }  
    
    
}
