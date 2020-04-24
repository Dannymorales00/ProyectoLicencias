/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigletone.Clientes;


import ventanasclientes.AgregarClientes;

/**
 *
 * @author Jose Mata
 */

    public class SingletonAgregarClientes {
    private static AgregarClientes ventana;

  
    private SingletonAgregarClientes() {}

    public static AgregarClientes getInstance() {
        if (ventana==null) {
            ventana=new AgregarClientes();
        }
        ventana.Limpiar();
        return ventana;
    }
}

