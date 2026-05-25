package Extras;

import Decorator.ReporteDecorator;
import Interfaces.Reporte;

public class SeccionTotales extends ReporteDecorator {

    public SeccionTotales(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("TOTAL: $600");
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Totales";
    }
}