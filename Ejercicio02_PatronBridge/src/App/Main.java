package App;

import Implementacion.Exportador;
import Implementacion.ExportadorArchivo;
import Implementacion.ExportadorConsola;

import Abstraccion.Reporte;
import Abstraccion.ReporteResumen;
import Abstraccion.ReporteDetallado;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> ventas = Arrays.asList(
                "Venta Laptop - $1200",
                "Venta Mouse - $25",
                "Venta Teclado - $45",
                "Venta Monitor - $300"
        );

        // Exportadores
        Exportador consola = new ExportadorConsola();

        Exportador archivoResumen =
                new ExportadorArchivo("resumen.txt");

        Exportador archivoDetalle =
                new ExportadorArchivo("detalle.txt");

        // Resumen + Consola
        Reporte reporte1 = new ReporteResumen(consola);
        reporte1.generar(ventas);

        // Resumen + Archivo
        Reporte reporte2 = new ReporteResumen(archivoResumen);
        reporte2.generar(ventas);

        // Detallado + Consola
        Reporte reporte3 = new ReporteDetallado(consola);
        reporte3.generar(ventas);

        // Detallado + Archivo
        Reporte reporte4 = new ReporteDetallado(archivoDetalle);
        reporte4.generar(ventas);
    }
}