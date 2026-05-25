package App;

import Model.ConexionBD;
import Pool.PoolConexiones;

public class Main {

    public static void main(String[] args) {

        PoolConexiones pool = PoolConexiones.getInstancia();

        System.out.println("SOLICITANDO CONEXIONES");

        ConexionBD c1 = pool.obtenerConexion();
        ConexionBD c2 = pool.obtenerConexion();
        ConexionBD c3 = pool.obtenerConexion();
        ConexionBD c4 = pool.obtenerConexion(); // no disponible

        System.out.println("\nLIBERANDO ");

        pool.liberarConexion(c1);
        pool.liberarConexion(c2);

        System.out.println("\nREUTILIZANDO");

        ConexionBD c5 = pool.obtenerConexion();
        ConexionBD c6 = pool.obtenerConexion();
    }
}