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
                    cliente2.setEdad(calcularEdad(datos.getDate(4)));
                
                    
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
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");   
            this.sentencias.executeUpdate("UPDATE clientes SET nombre='"+cliente.getNombre()+"',fecha_nacimiento='"+f.format(cliente.getFechanacimiento())+"',telefono='"+cliente.getTelefono()+"',correo='"+cliente.getCorreo()+"'  WHERE cedula ='"+cliente.getCedula()+"';");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    } 
        
       public ArrayList<Cliente> listar(){
        ArrayList<Cliente> clientes = new ArrayList();
            try {
                this.datos = this.sentencias.executeQuery("select * from clientes");
                
                while(datos.next()){
                  
                   
                    clientes.add(new Cliente(datos.getInt(2),datos.getString(3),datos.getDate(4),datos.getInt(5),datos.getString(6),calcularEdad(datos.getDate(4)) ));
               
                }
                return clientes;
            
            }catch (SQLException ex) {
                
                System.out.println("Error al listar");
            }
            
        return null; 
    }
       
    public int calcularEdad(Date fecha) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        
//        System.out.println("año actual:------- "+f.format(fechaActual).substring(0, 4));
//        System.out.println("nacimiento:------- "+f.format(fecha).substring(0, 4) );
//       
        int fechaActual2 = Integer.parseInt( f.format(fechaActual).substring(0, 4) );
        int fechanacimiento = Integer.parseInt( f.format(fecha).substring(0, 4) );
        System.out.println("edad------:"+(fechaActual2-fechanacimiento));
        return (fechaActual2-fechanacimiento) ;
           
    }
       
       
       
}
