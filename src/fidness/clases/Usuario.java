

package fidness.clases;

public class Usuario {

    private String nombre;
    private String nombreUsuario;
    private String contrasena;
    
    
public Usuario(String nombre, String nombreUsuario, String contrasena) {
    this.nombre = nombre;
    this.nombreUsuario = nombreUsuario;
    this.contrasena = contrasena;
    
}   

public boolean iniciarSesion(String usuario, String clave) {
    if (nombreUsuario.equals(usuario) && contrasena.equals(clave)) {
        return true;
    } else {
        return false;
    }
}

}



