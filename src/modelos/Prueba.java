/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author Danny_PC
 */
public class Prueba {
    private Date fecha;
    private String hora;
    private Oficial oficial;// oficial que va realizar la Prueba enviamos la cedula a db para relacionar el oficial
    private String observaciones;
    private int nota;
    private Boolean estado;//aprobado-reprobado

    
    public Prueba(Date fecha, String hora, Oficial oficial, String observaciones, int nota, Boolean estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.oficial = oficial;
        this.observaciones = observaciones;
        this.nota = nota;
        this.estado = estado;
    }

    public Prueba() {
            
        this.fecha = null;
        this.hora = null;
        this.oficial = null;
        this.observaciones = null;
        this.nota = 0;
        this.estado = null;  
            
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
