/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Windows 11
 */
 public class Paladin extends Personaje{
    
    public Paladin (String nombre, int constitucion) {
           super (nombre, constitucion);  
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String realizaAtaque (){
    return "Ataca con su martillo divino y hace un ataque radiante";
    
    }
    
 }
