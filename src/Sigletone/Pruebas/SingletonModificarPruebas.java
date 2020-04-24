/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Pruebas;

import ventanaspruebas.ModificarPruebas;

/**
 *
 * @author Jose Mata
 */
public class SingletonModificarPruebas {
      private static ModificarPruebas ventana;

  
    private SingletonModificarPruebas() {}

    public static ModificarPruebas getInstance() {
        if (ventana==null) {
            ventana=new ModificarPruebas();
        }
        ventana.limpiar();
        return ventana;
    }
}
