package Extras;

import Decorator.ReporteDecorator;
import Interfaces.Reporte;

public class SeccionGrafico extends ReporteDecorator {

    public SeccionGrafico(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("Incluye gráfico de barras");
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Gráfico";
    }
}