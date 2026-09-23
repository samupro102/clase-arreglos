/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Paladin;
import modelo.Personaje;
import modelo.Ranger;
import vista.VistaCombate;

/**
 *
 * @author Windows 11
 */
public class ControladorCombate {
    //atributos

    private Personaje[] grupo;
    private VistaCombate vista;
    
    public ControladorCombate(Personaje[] grupo, VistaCombate vista) {
        this.grupo = grupo;
        this.vista = vista;
    }
    
    public void ejecutarRonda() {
        vista.mostrarInicioDeCombate();

        //polimorfismo
        for (Personaje p : grupo) {
            String accion = p.realizarAtaque();
            vista.mostrarAtaque(p.getNombre(), accion);
        }
        
    }
    
}
