/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Usuarios;

import ventanasusuarios.EliminarUsuarios;

/**
 *
 * @author Jose Mata
 */
public class SingletonEliminarUsuarios {
         private static EliminarUsuarios ventana;

  
    private SingletonEliminarUsuarios() {}

    public static EliminarUsuarios getInstance() {
        if (ventana==null) {
            ventana=new EliminarUsuarios();
        }
        return ventana;
    }
}
