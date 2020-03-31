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
public class Prueba {
    private Date fecha;
    private Time hora;
    //private Oficial oficial;// oficial que va realizar la Prueba enviamos la cedula a db para relacionar el oficial
    private String observaciones;
    private int nota;
    private String estado;//aprobado-reprobado

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

//    public Oficial getOficial() {
//        return oficial;
//    }
//
//    public void setOficial(Oficial oficial) {
//        this.oficial = oficial;
//    }

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
