/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Windows 11
 */
public class Ranger extends Personaje{
    
    public Ranger (String nombre, int constitucion) {
           super (nombre, constitucion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
            
  public String realizarAtaque(){
  return "Dispara una flecha envenenada desde las sombras";
  }          
            
            
            
            
            
            
            
            
            
            
            
}
