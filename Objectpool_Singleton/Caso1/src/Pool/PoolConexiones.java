package Pool;
import Model.ConexionBD;
import java.util.ArrayList;
import java.util.List;

public class PoolConexiones {

    private static PoolConexiones instancia;
    private List<ConexionBD> conexiones;
    private final int MAX = 3;

    private PoolConexiones() {
        conexiones = new ArrayList<>();

        for (int i = 1; i <= MAX; i++) {
            conexiones.add(new ConexionBD(i));
        }
    }

    public static PoolConexiones getInstancia() {
        if (instancia == null) {
            instancia = new PoolConexiones();
        }
        return instancia;
    }

    public ConexionBD obtenerConexion() {

        for (ConexionBD c : conexiones) {
            if (c.estaDisponible()) {
                c.abrir();
                return c;
            }
        }

        System.out.println("⚠ No hay conexiones disponibles");
        return null;
    }

    public void liberarConexion(ConexionBD c) {
        if (c != null) {
            c.cerrar();
        }
    }
}
