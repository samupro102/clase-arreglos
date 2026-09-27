/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;
import controlador.Controlador;
import vista.Vista;
/**
 *
 * @author Windows 11
 */
public class Arreglos {

    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        controlador.iniciar();
    }
}
