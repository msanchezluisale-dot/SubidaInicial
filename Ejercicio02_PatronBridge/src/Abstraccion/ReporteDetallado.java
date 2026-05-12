package Abstraccion;

import Implementacion.Exportador;

import java.util.ArrayList;
import java.util.List;

public class ReporteDetallado extends Reporte {

    public ReporteDetallado(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void generar(List<String> datos) {

        List<String> detalle = new ArrayList<>();

        for (int i = 0; i < datos.size(); i++) {

            detalle.add((i + 1) + ". " + datos.get(i));
        }

        exportador.exportar("REPORTE DETALLADO", detalle);
    }
}
