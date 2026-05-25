package Model;

public class ConexionBD {

    private int id;
    private boolean disponible;

    public ConexionBD(int id) {
        this.id = id;
        this.disponible = true;
    }

    public void abrir() {
        disponible = false;
        System.out.println("Conexion " + id + " asignada.");
    }

    public void cerrar() {
        disponible = true;
        System.out.println("Conexion " + id + " liberada.");
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public int getId() {
        return id;
    }
}