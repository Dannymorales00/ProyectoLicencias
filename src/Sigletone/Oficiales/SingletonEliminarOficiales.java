/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Oficiales;

import ventanasoficiales.EliminarOficiales;




/**
 *
 * @author Jose Mata
 */

    public class SingletonEliminarOficiales {
    private static EliminarOficiales ventana;

    
    private SingletonEliminarOficiales() {}

    public static EliminarOficiales getInstance() {
        if (ventana==null) {
            ventana=new EliminarOficiales();
        }
        ventana.limpiar();
        return ventana;
    }
}

