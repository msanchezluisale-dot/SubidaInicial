package Service;

import Model.Usuario;

public interface ReporteService {
    String generarReporte(String idReporte, Usuario usuario);
}
