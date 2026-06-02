package Model;

public class Usuario {
    public enum Rol{GERENTE, VENDEDOR}
    private final String nombre;
    private final Rol rol;

    public Usuario(String nombre, Rol rol){
        this.nombre=nombre;
        this.rol=rol;

    }
    public String getNombre(){
        return this.nombre;

    }
    public Rol getRol(){
        return this.rol;
    }
}
