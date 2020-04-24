/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Citas;

import ventanascitas.EliminarCitas;

/**
 *
 * @author Jose Mata
 */

    public class SingletonEliminarCitas {
    private static EliminarCitas ventana;

    private SingletonEliminarCitas() {}

    public static EliminarCitas getInstance() {
        if (ventana==null) {
            ventana=new EliminarCitas();
        }
        ventana.limpiar();
        return ventana;
    }
}

