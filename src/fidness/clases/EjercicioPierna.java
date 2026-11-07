
package fidness.clases;


public class EjercicioPierna extends Ejercicio {
    
public EjercicioPierna(String nombre, String tipo,
                       String descripcion, String instrucciones) {
    super(nombre, tipo, descripcion, instrucciones);
}
@Override
public void mostrarInstrucciones() {
    System.out.println("Instrucciones para ejercicios de pierna:");
    System.out.println("Mantenga una postura correcta durante el ejercicio.");
    System.out.println("Realice los movimientos de forma controlada.");

}
}
