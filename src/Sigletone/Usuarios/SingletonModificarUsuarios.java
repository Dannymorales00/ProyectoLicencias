/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Usuarios;

import ventanasusuarios.ModificarUsuarios;

/**
 *
 * @author Jose Mata
 */
public class SingletonModificarUsuarios {
      private static ModificarUsuarios ventana;

  
    private SingletonModificarUsuarios() {}

    public static ModificarUsuarios getInstance() {
        if (ventana==null) {
            ventana=new ModificarUsuarios();
        }
        ventana.Limpiar();
        return ventana;
    }
}
