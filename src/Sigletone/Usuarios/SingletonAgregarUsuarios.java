/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Usuarios;


import ventanasusuarios.AgregarUsuarios;

/**
 *
 * @author Jose Mata
 */

    public class SingletonAgregarUsuarios {
    private static AgregarUsuarios ventana;

  
    private SingletonAgregarUsuarios() {}

    public static AgregarUsuarios getInstance() {
        if (ventana==null) {
            ventana=new AgregarUsuarios();
        }
        return ventana;
    }
}

