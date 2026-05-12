package Abstraccion;

import Implementacion.Exportador;

import java.util.ArrayList;
import java.util.List;

public class ReporteResumen extends Reporte {

    public ReporteResumen(  Exportador exportador) {
        super(exportador);
    }

    @Override
    public void generar(List<String> datos) {

        List<String> resumen = new ArrayList<>();

        resumen.add("Total registros: " + datos.size());

        if (!datos.isEmpty()) {

            resumen.add("Primer registro: " + datos.get(0));
            resumen.add("Último registro: " + datos.get(datos.size() - 1));
        }

        exportador.exportar("REPORTE RESUMEN", resumen);
    }
}