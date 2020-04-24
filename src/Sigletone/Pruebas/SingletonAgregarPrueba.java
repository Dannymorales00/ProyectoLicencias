/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Pruebas;


import ventanaspruebas.AgregarPruebas;

/**
 *
 * @author Jose Mata
 */

    public class SingletonAgregarPrueba {
    private static AgregarPruebas ventana;

  
    private SingletonAgregarPrueba() {}

    public static AgregarPruebas getInstance() {
        if (ventana==null) {
            ventana=new AgregarPruebas();
            
        }
        ventana.limpiar();
        return ventana;
    }
}

