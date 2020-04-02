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
import modelos.Usuario;
import ventanas.FrmMenu;

/**
 *
 * @author Danny_PC
 */
public class ControladorUsuarios {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    
    public ControladorUsuarios() {
       
       conn = FrmMenu.getConexion();
       this.sentencias= conn.getSentencias();
       this.datos=conn.getDatos();
    }

    public ControladorUsuarios(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencias();
        this.datos=conn.getDatos();
    }
    
    
    public boolean añadir(Usuario usuario){
        try 
        {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            sentencias.execute("insert into usuarios values(null,'"+usuario.getCedula()+"','"+usuario.getNombre()+"','"+f.format(usuario.getFechanacimiento())+"','"+usuario.getTelefono()+"','"+usuario.getCorreo()+"','"+usuario.getSobrenombre()+"','"+usuario.getContraseña()+"','"+usuario.getTipo()+"')");
            return true;
        }catch (SQLException ex) {
            System.out.println("Error al añadir");
        }
        return false;
    }
        
    public Usuario buscar(Usuario usuario){
        try {
            usuario.setNombre("juan");
            System.out.println("antes de la sentencia...."+usuario.getNombre());
            this.datos = this.sentencias.executeQuery("select * from usuarios where cedula="+usuario.getCedula());
                System.out.println("despues de la sentencia");
                
                if(datos.next())
                {
             
                    
                    Usuario usuario2 = new Usuario();
                    usuario2.setCedula(datos.getInt(2));
                    usuario2.setNombre(datos.getString(3));
                    usuario2.setFechanacimiento(datos.getDate(4));
                    usuario2.setTelefono(datos.getInt(5));
                    usuario2.setCorreo(datos.getString(6));
                    usuario2.setSobrenombre(datos.getString(7));
                    usuario2.setContraseña(datos.getString(8));
                    usuario2.setTipo(datos.getString(9));
                    
                    return usuario2;
                } 
                
        }catch (SQLException ex) {
                System.out.println("Error al buscar"+ex);
            }
        return null;

    }
    
    
    public boolean eliminar(Usuario usuario){
        try {
            this.sentencias.executeUpdate("delete from usuarios where cedula="+usuario.getCedula());
            
            
        } catch (SQLException ex) {
                
            System.out.println("Error al borrar");
        }
            return false;
    }
    
    public boolean actualizar(Usuario usuario){
        
        try {  
              
            this.sentencias.executeUpdate("UPDATE usuarios SET nombre='"+usuario.getNombre()+"' WHERE cedula ='"+usuario.getCedula()+"';");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    }
    
        public ArrayList<Usuario> listar(int cedula){
            ArrayList<Usuario> usuarios = new ArrayList();
            try {
                this.datos = this.sentencias.executeQuery("select * from usuarios where cedula='"+cedula+"'");
                
                while(datos.next()){
              
//                   usuarios.add(new Usuario(datos.getInt(2),datos.getString(3),datos.getDate(4),datos.getInt(5),datos.getString(6),datos.getString(7),datos.getString(8),datos.getString(9)));
               
                }
                return usuarios;
            } catch (SQLException ex) {
                System.out.println("Error al listar");
            }
            return null; 
    }

}
