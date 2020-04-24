/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Oficiales;

import ventanasoficiales.CalcularSalario;

/**
 *
 * @author Jose Mata
 */

    public class SingletonCalcularSalario {
    private static CalcularSalario ventana;

    
    private SingletonCalcularSalario() {}

    public static CalcularSalario getInstance() {
        if (ventana==null) {
            ventana=new CalcularSalario();
        }
        ventana.Limpiar();
        return ventana;
    }
}

