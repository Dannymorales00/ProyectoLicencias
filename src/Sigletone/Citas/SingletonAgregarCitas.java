/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Citas;

import ventanascitas.AgregarCitas;

/**
 *
 * @author Jose Mata
 */

    public class SingletonAgregarCitas {
    private static AgregarCitas ventana;

  
    private SingletonAgregarCitas() {}

    public static AgregarCitas getInstance() {
        if (ventana==null) {
            ventana=new AgregarCitas();
        }
        return ventana;
    }
}

