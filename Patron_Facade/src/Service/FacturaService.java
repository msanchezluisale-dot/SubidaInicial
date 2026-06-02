package Service;

public class FacturaService {
    public String generarFactura(String cliente, double monto){
        String numeroFactura= "F"+ System.currentTimeMillis();
        System.out.println("[Factura] generando"+ numeroFactura+ "para"+ cliente + "total: $/." + monto);
        return numeroFactura;
    }
}
