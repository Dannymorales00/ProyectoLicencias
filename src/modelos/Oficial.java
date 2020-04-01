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
public class Oficial {
    private int cedula;
    private String nombre;
    private Date fechanacimiento;
    private int telefono;
    private String correo;
    private double salario;

    public Oficial(int cedula, String nombre, Date fechanacimiento, int telefono, String correo, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.salario = salario;
    }
    
    public Oficial(){
        this.cedula = 0;
        this.nombre = null;
        this.fechanacimiento = null;
        this.telefono = 0;
        this.correo = null;
        this.salario = 0;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
