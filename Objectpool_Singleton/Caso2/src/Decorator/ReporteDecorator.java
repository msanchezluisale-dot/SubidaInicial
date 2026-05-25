package Decorator;
import Interfaces.Reporte;

public abstract class ReporteDecorator implements Reporte {

    protected Reporte reporte;

    public ReporteDecorator(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void generar() {
        reporte.generar();
    }

    @Override
    public String getDescripcion() {
        return reporte.getDescripcion();
    }
}