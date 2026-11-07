
package fidness;

import fidness.clases.Usuario;
import fidness.clases.Ejercicio;
import fidness.clases.Rutina;



public class Fidness {

  
    public static void main(String[] args) {
        
   
Usuario usuario1 = new Usuario("Jose", "jose123", "1234");

System.out.println(usuario1.iniciarSesion("jose123", "1234"));
System.out.println(usuario1.iniciarSesion("jose123", "0000"));


    
Ejercicio ejercicio1 = new Ejercicio(
        "Sentadilla",
        "Pierna",
        "Ejercicio para trabajar el tren inferior",
        "Colocar los pies al ancho de los hombros, mantener la espalda recta y flexionar las rodillas."
);

ejercicio1.mostrarInformacion();
ejercicio1.mostrarInstrucciones();
Rutina rutina1 = new Rutina("Rutina de piernas");
rutina1.agregarEjercicio(ejercicio1);
rutina1.mostrarRutina();
rutina1.exportarRutina();
rutina1.eliminarEjercicio(ejercicio1);
rutina1.mostrarRutina();

Ejercicio ejercicioPrueba = new fidness.clases.EjercicioPierna(
        "Sentadilla",
        "Pierna",
        "Ejercicio para fortalecer las piernas",
        "Flexionar las rodillas y bajar la cadera"
);

ejercicioPrueba.mostrarInstrucciones();



    
}

}
