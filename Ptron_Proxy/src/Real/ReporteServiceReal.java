package Real;

import Model.Usuario;
import Service.ReporteService;

public class ReporteServiceReal implements ReporteService {

    @Override
    public String generarReporte(String idReporte, Usuario usuario) {

        System.out.println("Service real consultando la base de datos");

        simularConsultaPesada();

        String resultado  ="===REPORTE:" + idReporte +"==="
                +"n Gererado para:"+ usuario.getNombre()
                +"n Ventas totales: $/ 128450.00"
                +"n Unidades ventidas: 3241"
                +"n Mes con mayor ventas: Octubre";
        System.out.println("[service real] Reporte generado");
        return resultado;
    }

    private void simularConsultaPesada() {
        try {
            System.out.println("Service real procesando 342 registros...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}