/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import config.Manejoconfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.FrmConfiguracion;


/**
 *
 * @author Danny_PC
 */
public class Conexion {
        Manejoconfig manejoconfig = new Manejoconfig();
    
        //profe

    private Statement sentencias;
    private ResultSet datos;
 
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";

    public Statement getSentencias() {
        return sentencias;
    }

    public void setSentencias(Statement sentencias) {
        this.sentencias = sentencias;
    }

    public ResultSet getDatos() {
        return datos;
    }

    public void setDatos(ResultSet datos) {
        this.datos = datos;
    }

    
    
    public void Conectar() {
       
        
        String datos[]=manejoconfig.leer();
        
        if(datos!=null){
           
            //motor-basededatos-servidor-usuario-contraseña
            
            
            
            String user = datos[3] ;
            String password =datos[4];
            String url = "jdbc:"+datos[0]+"://"+datos[2]+"/"+datos[1]+"?useServerPrepStmts=true";
            conn = null; 
       
        
        
            try {
            
                conn = DriverManager.getConnection(url, user, password);
                this.sentencias=this.conn.createStatement();
                if(conn!=null)
                {
                    System.out.println("se conecto la madre");
                    
                }       
            
             
            } catch (SQLException e) {
            
                System.out.println("no se conecto la madre");
                //System.out.println(e);
                FrmConfiguracion frmconfig= new FrmConfiguracion();
                frmconfig.setVisible(true);
            } 
        
            
        }
        
        
    }
    
   
    
    public void Desconectar() {
        conn=null;
        
        if(conn==null)
        {
            System.out.println("desconectamos la madre");
        
        }
    
      }
    
    
    
     
}
