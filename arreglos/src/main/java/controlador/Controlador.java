/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Estudiante;
import vista.Vista;/**
 *
 * @author Windows 11
 */
public class Controlador {
    private Vista vista;
    private Estudiante[] estudiantes;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        leerEstudiantes();                          // Punto 1

        mostrarEstudiantes("Notas iniciales");

        double notaLimite = vista.solicitarNotaLimite();
        reporteTecnologiaSuperiorALimite(notaLimite); // Punto 2

        double incremento = vista.solicitarIncremento();
        incrementarNotasDesarrollo(incremento);     // Punto 3

        mostrarEstudiantes("Notas después del incremento");
    }

    // Punto 1: pide la cantidad y lee los datos de cada estudiante
    private void leerEstudiantes() {
        int cantidad = vista.cantidadEstudiantes();
        estudiantes = new Estudiante[cantidad];

        for (int i = 0; i < estudiantes.length; i++) {
            String codigo = vista.solicitarCodigo();
            String nombre = vista.solicitarNombre();
            String programa = vista.solicitarPrograma();
            double nota1 = vista.solicitarNota1();
            double nota2 = vista.solicitarNota2();
            double nota3 = vista.solicitarNota3();

            estudiantes[i] = new Estudiante(codigo, nombre, programa, nota1, nota2, nota3);
        }
    }

    // Punto 2: estudiantes de tecnologías con definitiva mayor a notaLimite
    private void reporteTecnologiaSuperiorALimite(double notaLimite) {
        String reporte = "Estudiantes de tecnologías con definitiva > " + notaLimite + "\n\n";
        boolean hayAlguno = false;

        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante e = estudiantes[i];
            if (e.esDeTecnologia() && e.calcularDefinitiva() > notaLimite) {
                reporte += e.getCodigo() + " - " + e.getNombre() + " - "
                        + String.format("%.2f", e.calcularDefinitiva()) + "\n";
                hayAlguno = true;
            }
        }

        if (!hayAlguno) {
            reporte += "Ningún estudiante cumple la condición.";
        }
        vista.mostrarMensaje(reporte);
    }

    // Punto 3: incrementa la nota de desarrollo de todos (void, no retorna nada)
    private void incrementarNotasDesarrollo(double incremento) {
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].incrementarNotaDesarrollo(incremento);
        }
    }

    // Muestra todos los estudiantes con sus notas y definitiva
    private void mostrarEstudiantes(String titulo) {
        String texto = titulo + "\n\n";
        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante e = estudiantes[i];
            texto += e.getCodigo() + " - " + e.getNombre() + " (" + e.getPrograma() + ")"
                   + " | N1: " + e.getNota1()
                   + " | N2: " + e.getNota2()
                   + " | Desarrollo: " + String.format("%.2f", e.getNota3())
                   + " | Def: " + String.format("%.2f", e.calcularDefinitiva()) + "\n";
        }
        vista.mostrarMensaje(texto);
    }
}
