/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladordnd;
import modelo.*;
import vista.VistaCombate;
import controlador.ControladorCombate;
/**
 *
 * @author Windows 11
 */
public class SimuladorDND {

    public static void main(String[] args) {
        System.out.println("sIMULADOR DND");
        
        //inicializar modelo
        Personaje explorador = new Ranger ("simon",15);
        Personaje guerrero = new Paladin ("tatiana",28);
        Personaje profe = new Personaje ("edwin",10);
        
       Personaje [] miGrupo= {explorador, guerrero,profe};
       
       VistaCombate miVista= new VistaCombate ();
       //inicializar controlador
       ControladorCombate control = new ControladorCombate (miGrupo,miVista);
       control.ejecutarRonda(); 
        
    }
}
