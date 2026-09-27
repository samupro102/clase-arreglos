/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Windows 11
 */
public class Estudiante {
    
    private String codigo;
    private String nombre;
    private String programa;
    private double nota1;
    private double nota2;
    private double nota3; // nota de desarrollo

    public Estudiante(String codigo, String nombre, String programa,
                      double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.programa = programa;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Calcula la nota definitiva (promedio de las 3 notas)
    public double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Indica si el estudiante es de tecnologías
    public boolean esDeTecnologia() {
        return programa.equalsIgnoreCase("Tecnologia");
    }

    // Punto 3: incrementa la nota de desarrollo sin pasar de 5.0
    public void incrementarNotaDesarrollo(double incremento) {
        nota3 = Math.min(nota3 + incremento, 5.0);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}

