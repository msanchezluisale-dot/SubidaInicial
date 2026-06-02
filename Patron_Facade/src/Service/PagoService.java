package Service;

public class PagoService {
    public boolean procesarPago(String tarjeta, double monto){
        System.out.println("[Pago] procesando $/. "+monto+" con tarjeta"+ tarjeta);
        System.out.println("[Pago] aprobado");
        return true;
    }
}
