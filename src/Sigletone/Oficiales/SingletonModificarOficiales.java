/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Oficiales;


import ventanasoficiales.ModificarOficiales;

/**
 *
 * @author Jose Mata
 */

    public class SingletonModificarOficiales {
    private static ModificarOficiales ventana;

  
    private SingletonModificarOficiales() {}

    public static ModificarOficiales getInstance() {
        if (ventana==null) {
            ventana=new ModificarOficiales();
        }
        return ventana;
    }
}

