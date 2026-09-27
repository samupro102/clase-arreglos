/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 11
 */
public class Vista {
     public int cantidadEstudiantes() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes"));
    }

    public String solicitarCodigo() {
        return JOptionPane.showInputDialog("Digite el código del estudiante");
    }

    public String solicitarNombre() {
        return JOptionPane.showInputDialog("Digite el nombre del estudiante");
    }

    public String solicitarPrograma() {
        return JOptionPane.showInputDialog("Digite el programa (ej: Tecnologia, Ingenieria)");
    }

    public double solicitarNota1() {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite la nota 1"));
    }

    public double solicitarNota2() {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite la nota 2"));
    }

    public double solicitarNota3() {
        return Double.parseDouble(JOptionPane.showInputDialog("Digite la nota 3 (desarrollo)"));
    }

    // Punto 2: pide la nota límite entre 0.0 y 4.9
    public double solicitarNotaLimite() {
        double notaLimite;
        do {
            notaLimite = Double.parseDouble(
                JOptionPane.showInputDialog("Digite la nota límite (0.0 a 4.9)"));
            if (notaLimite < 0.0 || notaLimite > 4.9) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Debe estar entre 0.0 y 4.9");
            }
        } while (notaLimite < 0.0 || notaLimite > 4.9);
        return notaLimite;
    }

    // Punto 3: pide el incremento entre 0.0 y 0.5
    public double solicitarIncremento() {
        double incremento;
        do {
            incremento = Double.parseDouble(
                JOptionPane.showInputDialog("Digite el incremento (0.0 a 0.5)"));
            if (incremento < 0.0 || incremento > 0.5) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Debe estar entre 0.0 y 0.5");
            }
        } while (incremento < 0.0 || incremento > 0.5);
        return incremento;
    }

    // Muestra cualquier mensaje (lo usaremos para el reporte)
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
