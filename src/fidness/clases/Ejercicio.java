
package fidness.clases;

public class Ejercicio {

    private String nombre;
    private String tipo;
    private String descripcion;
    private String instrucciones;
    

public Ejercicio(String nombre, String tipo, String descripcion, String instrucciones) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.descripcion = descripcion;
    this.instrucciones = instrucciones;
      
}

public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Tipo: " + tipo);
    System.out.println("Descripcion: " + descripcion);
}

public void mostrarInstrucciones() {
    System.out.println("Instrucciones: " + instrucciones);
}


public String getNombre() {
    return nombre;
}

}
