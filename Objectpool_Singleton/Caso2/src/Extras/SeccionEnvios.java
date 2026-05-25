package Extras;

import Decorator.ReporteDecorator;
import Interfaces.Reporte;

public class SeccionEnvios extends ReporteDecorator {

    public SeccionEnvios(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("Envíos:");
        System.out.println("- Lima");
        System.out.println("- Arequipa");
        System.out.println("- Cusco");
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Envíos";
    }
}