/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Danny_PC
 */
public class Cita {
    private int id;
    private Date fecha;
    private Time hora;
    private Cliente cliente;

    public Cita(int id, Date fecha, Time hora, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
    }

    public Cita() {
        this.id = 0;
        this.fecha = null;
        this.hora = null;
        this.cliente = null;
        
        
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

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    
}
