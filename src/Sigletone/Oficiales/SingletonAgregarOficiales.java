/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Oficiales;


import ventanasoficiales.AgregarOficiales;

/**
 *
 * @author Jose Mata
 */

    public class SingletonAgregarOficiales {
    private static AgregarOficiales ventana;

    private SingletonAgregarOficiales() {}

    public static AgregarOficiales getInstance() {
      
        if (ventana==null) {
      
            ventana = new AgregarOficiales();
            
           
        }
        ventana.limpiar();
        return ventana;
     
    }
}

    

