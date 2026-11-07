
package fidness.clases;
import java.util.ArrayList;


public class Rutina {
 
private String nombre;
private ArrayList<Ejercicio> ejercicios;

 
public Rutina(String nombre) {
    this.nombre = nombre;
    this.ejercicios = new ArrayList<>();
}

public void agregarEjercicio(Ejercicio ejercicio) {
    ejercicios.add(ejercicio);
}

public void eliminarEjercicio(Ejercicio ejercicio) {
    ejercicios.remove(ejercicio);
}

public void mostrarRutina() {
    System.out.println("Nombre de la rutina: " + nombre);
    System.out.println("Ejercicios:");

    for (Ejercicio ejercicio : ejercicios) {
        ejercicio.mostrarInformacion();
    }
}
public String obtenerEjercicios() {
    String texto = "Ejercicios de la rutina:\n";

    for (Ejercicio ejercicio : ejercicios) {
        texto = texto + ejercicio.getNombre() + "\n";
    }

    return texto;
}
public boolean exportarRutina() {
    try {
        java.io.FileWriter archivo = new java.io.FileWriter("rutina.txt");

        archivo.write("Nombre de la rutina: " + nombre + "\n");
        archivo.write("Ejercicios:\n");

        for (Ejercicio ejercicio : ejercicios) {
            archivo.write(ejercicio.getNombre() + "\n");
        }

        archivo.close();
        System.out.println("Rutina exportada correctamente.");
        return true;

    } catch (java.io.IOException e) {
        javax.swing.JOptionPane.showMessageDialog(null,
        "Error al exportar la rutina: " + e.getMessage());
        
        return false;
    }

}
}
