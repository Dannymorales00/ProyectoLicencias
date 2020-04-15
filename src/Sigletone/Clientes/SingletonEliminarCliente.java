/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Clientes;

import ventanasclientes.EliminarClientes;

/**
 *
 * @author Jose Mata
 */
public class SingletonEliminarCliente {
         private static EliminarClientes ventana;

  
    private SingletonEliminarCliente() {}

    public static EliminarClientes getInstance() {
        if (ventana==null) {
            ventana=new EliminarClientes();
        }
        return ventana;
    }
}
