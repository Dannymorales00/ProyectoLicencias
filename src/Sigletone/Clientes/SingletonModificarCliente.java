/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Clientes;

import ventanasclientes.ModificarClientes;

/**
 *
 * @author Jose Mata
 */
public class SingletonModificarCliente {
      private static ModificarClientes ventana;

  
    private SingletonModificarCliente() {}

    public static ModificarClientes getInstance() {
        if (ventana==null) {
            ventana=new ModificarClientes();
        }
        ventana.Limpiar();
        return ventana;
    }
}
