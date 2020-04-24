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
import modelos.Cliente;
import modelos.Oficial;
import modelos.Prueba;
import ventanas.FrmMenu;

/**
 *
 * @author Danny_PC
 */
public class ControladorPruebas {
    private Conexion conn;
    private Statement sentencias;
    private Statement sentencias2;
    private ResultSet datos;
    private ControladorOficiales conOficiales;
    private Oficial oficial;
    private Cliente cliente;
    private ControladorClientes conCliente;
 
    public ControladorPruebas() {
       
       conn = FrmMenu.getConexion();
        try {
            this.sentencias2 = FrmMenu.getConexion().getConn().createStatement();
        } catch (SQLException ex) {
            System.out.println("Error al crear otra sentencia");
        }
       
       
        this.sentencias= conn.getSentencias();
        this.datos=conn.getDatos();
        this.conCliente = new ControladorClientes();
        this.conOficiales = new ControladorOficiales();
       
    }

    public ControladorPruebas(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencias();
        this.datos=conn.getDatos();
        this.conCliente = new ControladorClientes();
        this.conOficiales = new ControladorOficiales();
    }
    
    public boolean añadir(Prueba prueba){
        try {
           SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
   
            sentencias.execute("insert into pruebas values(null,'"+f.format(prueba.getFecha())+"','"+prueba.getHora()+"','"+prueba.getOficial().getCedula()+"','"+prueba.getCliente().getCedula()+"','"+prueba.getObservaciones()+"','"+prueba.getNota()+"','"+prueba.getEstado()+"')");
            return true;
           
           
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
            System.out.println(ex);
        }   
        return false;
    }
    
    public Prueba buscar(Prueba prueba){
        try {
            
            this.datos = this.sentencias.executeQuery("select * from pruebas where id="+prueba.getId());
            
                if(datos.next())
                {
             
                    //Para poder buscar el oficial y cliente
                    oficial = new Oficial();
                    oficial.setCedula(datos.getInt(4));
                    cliente = new Cliente();
                    cliente.setCedula(datos.getInt(5));
                    
                    Prueba prueba2 = new Prueba(datos.getInt(1),datos.getDate(2),datos.getTime(3).toString(),this.conOficiales.buscar(oficial),this.conCliente.buscar(cliente),datos.getString(6),datos.getInt(7),datos.getInt(8));
                    return prueba2;
                } 
                
        }catch (SQLException ex) {
                System.out.println("Error al buscar");
            }
        return null;

    }
        
    public boolean eliminar(Prueba prueba){
        try {
            this.sentencias.executeUpdate("delete from pruebas where id="+prueba.getId());
            return true;
            
        } catch (SQLException ex) {
                
            System.out.println("Error al borrar");
        }
            return false;
    }
    
    public boolean actualizar(Prueba prueba){
        
        try {  
              
            this.sentencias.executeUpdate("UPDATE pruebas SET nota='"+prueba.getNota()+"', observaciones='"+prueba.getObservaciones()+"', estado='"+prueba.getEstado()+"' WHERE id='"+prueba.getId()+"';");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    } 
        
    public ArrayList<Prueba> listar(){
        ArrayList<Prueba> pruebas = new ArrayList();
            try {
                this.datos = this.sentencias2.executeQuery("select * from pruebas");
                
                while(datos.next()){
                    
                    oficial = new Oficial();
                    oficial.setCedula(datos.getInt(4));
                    cliente = new Cliente();
                    cliente.setCedula(datos.getInt(5));
                    
                    pruebas.add(new Prueba(datos.getInt(1),datos.getDate(2),datos.getTime(3).toString(),this.conOficiales.buscar(oficial),this.conCliente.buscar(cliente),datos.getString(6),datos.getInt(7),datos.getInt(8)));
               
                }
                if(pruebas.size()>=1)
                {
                   return pruebas;
                }
            
            } catch (SQLException ex) {
                System.out.println("Error al listar");
                System.out.println(ex);
            }
        return null; 
    }
    
     public ResultSet listarCedula(String cedula){
            try {
                
                ResultSet datosPrueba = this.sentencias.executeQuery("SELECT * from pruebas JOIN oficiales on pruebas.cedula_oficial = oficiales.cedula JOIN clientes ON clientes.cedula = pruebas.cedula_cliente WHERE pruebas.cedula_cliente="+cedula+";");
                return datosPrueba;
            } catch (SQLException ex) {
                System.out.println(ex);
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
    //Valida que exista una cita de ese cliente
    public boolean ValidarFKCliente(Prueba prueba){

        try 
        {
            this.datos = this.sentencias.executeQuery("select * from citas where cedula_cliente="+prueba.getCliente().getCedula());
                
            if (datos.next()) 
            {
            
                return true;
              
            }
                
        } catch (SQLException ex){
            System.out.println("Error al validarFKCliente");
            
        }
         
        return false;
       
    }
    //valida que exista una cita con esa fecha para poder agregar una prueba
    public boolean ValidarFKFecha(Prueba prueba){

        try 
        {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
   
            this.datos = this.sentencias.executeQuery("select * from citas where fecha='"+f.format( prueba.getFecha() )+"'  AND estado = 'activado'  ;");

                
            if (datos.next()) 
            {
            
                return true;
              
            }
                
        } catch (SQLException ex){
            System.out.println("Error al validarFKFecha");
            System.out.println(ex);
            
        }
         
        return false;
       
    }
    //valida que exista una cita con esa hora para poder agregar una prueba
    public boolean ValidarFKHora(Prueba prueba){

        try 
        {
            this.datos = this.sentencias.executeQuery("select * from citas where hora='"+prueba.getHora()+"'  AND estado = 'activado'  ;");
                
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
