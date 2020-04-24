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
public class Cita {
    private int id;
    private Date fecha;
    private String hora;
    private Cliente cliente; 
    private String estado;
    

    public Cita(Date fecha, String hora, Cliente cliente) {
        
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.estado = "activado";
    }

    public Cita(int id, Date fecha, String hora, Cliente cliente, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.estado = estado;
    }
    


    

    public Cita() {
    
        this.fecha = null;
        this.hora = null;
        this.cliente = null;
        this.estado =null;
        
    }

    
    public boolean comprobar() {
        
        return this.fecha!=null && this.hora!=null && this.estado!=null && this.cliente!=null;
    }
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
}
