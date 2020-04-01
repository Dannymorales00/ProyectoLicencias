/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;


/**
 *
 * @author Danny_PC
 */

public class Usuario {
    private int cedula;
    private String nombre;
    private Date fechanacimiento;
    private int telefono;
    private String correo;
    private String sobrenombre;
    private String contraseña;
    private String tipo;//oficial/secretario

    public Usuario(int cedula, String nombre, Date fechanacimiento, int telefono, String correo, String sobrenombre,String contraseña, String tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.sobrenombre = sobrenombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public Usuario(){
        this.cedula = 0;
        this.nombre = null;
        this.fechanacimiento = null;
        this.telefono = 0;
        this.correo = null;
        this.sobrenombre = null;
        this.contraseña = null;
        this.tipo = null;
    }
    
    
    
    public boolean comprobar() {
        
        return  this.telefono >0 && this.tipo!=null &&
                this.cedula >0 && this.nombre!=null && 
                this.contraseña!=null && this.correo!=null && 
                this.fechanacimiento!=null && this.sobrenombre!=null ;
        
    }
    
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
