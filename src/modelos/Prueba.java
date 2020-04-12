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
public class Prueba {
    private int id;
    private Date fecha;
    private String hora;
    private Oficial oficial;// oficial que va realizar la Prueba enviamos la cedula a db para relacionar el oficial
    private Cliente cliente;
    private String observaciones;
    private int nota;
    private int estado;//aprobado-reprobado
    
    public Prueba(int id, Date fecha, String hora, Oficial oficial,Cliente cliente, String observaciones, int nota, int estado) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.oficial = oficial;
        this.cliente = cliente;
        this.observaciones = observaciones;
        this.nota = nota;
        this.estado = estado;
    }

    public Prueba() {
        

        this.fecha = null;
        this.hora = null;
        this.oficial = null;
        this.cliente = null;
        this.observaciones = null;
        this.nota = 0;
        this.estado = 0;  
            
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

    public Oficial getOficial() {
        return oficial;
    }

    public void setOficial(Oficial oficial) {
        this.oficial = oficial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
