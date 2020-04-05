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
import ventanas.FrmMenu;

/**
 *
 * @author Danny_PC
 */
public class ControladorClientes {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    
    public ControladorClientes() {
       
       conn = FrmMenu.getConexion();
       this.sentencias= conn.getSentencias();
       this.datos=conn.getDatos();
    }

    public ControladorClientes(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencias();
        this.datos=conn.getDatos();
    }
    
    public boolean añadir(Cliente cliente){
        try {
           SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd"); 
           sentencias.execute("insert into clientes values(null,'"+cliente.getCedula()+"','"+cliente.getNombre()+"','"+f.format(cliente.getFechanacimiento())+"','"+cliente.getTelefono()+"','"+cliente.getCorreo()+"')");
           return true;  
           
           
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
        }
        return false;
    }
    
        public Cliente buscar(Cliente cliente){
        try {
            
            this.datos = this.sentencias.executeQuery("select * from clientes where cedula="+cliente.getCedula());
            
                if(datos.next())
                {
             
                    
                    Cliente cliente2 = new Cliente();
                    cliente2.setCedula(datos.getInt(2));
                    cliente2.setNombre(datos.getString(3));
                    cliente2.setFechanacimiento(datos.getDate(4));
                    cliente2.setTelefono(datos.getInt(5));
                    cliente2.setCorreo(datos.getString(6));
                
                    
                    return cliente2;
                } 
                
        }catch (SQLException ex) {
                System.out.println("Error al buscar");
            }
        return null;

    }
        
    public boolean eliminar(Cliente cliente){
        try {
            this.sentencias.executeUpdate("delete from clientes where cedula="+cliente.getCedula());
            return true;
            
        } catch (SQLException ex) {
                
            System.out.println("Error al borrar");
        }
            return false;
    }
    
    public boolean actualizar(Cliente cliente){
        
        try {  
              
            this.sentencias.executeUpdate("UPDATE clientes SET nombre='"+cliente.getNombre()+"' WHERE cedula ='"+cliente.getCedula()+"';");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    } 
        
       public ArrayList<Cliente> listar(int cedula){
        ArrayList<Cliente> clientes = new ArrayList();
            try {
                this.datos = this.sentencias.executeQuery("select * from clientes where cedula='"+cedula+"'");
                
                while(datos.next()){
                    //No se pueden agregar al array porque le falta la edad y esta no esta en la base de datos
                    //clientes.add(new Cliente(datos.getInt(2),datos.getString(3),datos.getDate(4),datos.getInt(5),datos.getString(6)));
               
                }
                return clientes;
            } catch (SQLException ex) {
                System.out.println("Error al listar");
            }
        return null; 
    }   
       
}
