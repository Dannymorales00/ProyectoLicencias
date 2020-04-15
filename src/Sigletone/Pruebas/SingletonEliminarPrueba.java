/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Pruebas;

import ventanaspruebas.EliminarPruebas;

/**
 *
 * @author Jose Mata
 */
public class SingletonEliminarPrueba {
         private static EliminarPruebas ventana;

  
    private SingletonEliminarPrueba() {}

    public static EliminarPruebas getInstance() {
        if (ventana==null) {
            ventana=new EliminarPruebas();
        }
        return ventana;
    }
}
