package Base;
import Interfaces.Reporte;

public class ReporteBase implements Reporte {

    @Override
    public void generar() {
        System.out.println("REPORTE BASE");
        System.out.println("Venta A: $100");
        System.out.println("Venta B: $200");
        System.out.println("Venta C: $300");
    }

    @Override
    public String getDescripcion() {
        return "Reporte base";
    }
}
