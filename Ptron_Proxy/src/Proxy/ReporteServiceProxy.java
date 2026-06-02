package Proxy;

import Model.Usuario;
import Real.ReporteServiceReal;
import Service.ReporteService;

import java.util.HashMap;
import java.util.Map;

public class ReporteServiceProxy implements ReporteService {

    private ReporteServiceReal serviceReal;
    private final Map<String, String> cache = new HashMap<>();

    @Override
    public String generarReporte(String idReporte, Usuario usuario) {

        // Control de acceso
        if (usuario.getRol() != Usuario.Rol.GERENTE) {
            System.out.println("[PROXY] Acceso denegado. No tiene permisos.");
            return "ERROR: Acceso denegado para " + usuario.getNombre();
        }
        System.out.println("[PROXY] Acceso permitido para " + usuario.getNombre());
        // Cache
        if (cache.containsKey(idReporte)) {
            System.out.println("[PROXY] Cache HIT - devolviendo resultado");
            return cache.get(idReporte);
        }
        // Lazy initialization
        if (serviceReal == null) {
            System.out.println("[PROXY] Creando instancia del servicio real...");
            serviceReal = new ReporteServiceReal();
        }
        System.out.println("[PROXY] Cache MISS - llamando al servicio real");
        String resultado = serviceReal.generarReporte(idReporte, usuario);
        cache.put(idReporte, resultado);
        return resultado;
    }
}