package Facade;

import Service.EnvioService;
import Service.FacturaService;
import Service.InventarioService;
import Service.PagoService;

public class CheckoutFacade {
    private final InventarioService inventario= new InventarioService();
    private final EnvioService envio= new EnvioService();
    private final FacturaService factura = new FacturaService();
    private final PagoService pago = new PagoService();

    public void procesarpedido(String cliente, String codigoProducto, double cantidad, String tarjeta, double monto){
        System.out.println("realizar pedido");

        //verificar stock
        boolean hayStock = inventario.verificarStock(codigoProducto, cantidad);
        if(! hayStock){
            System.out.println("pedido cancelado: sin stock");
            return;
        }
        boolean pagoCorecto = pago.procesarPago(tarjeta, monto);
        if(!pagoCorecto){
            System.out.println("pedido cancelado: pago rechazado");
            return;
        }
        String numeroFactura = factura.generarFactura(cliente, monto);

        String codigoEnvio = envio.registrarEnvio(cliente, codigoProducto, cantidad);
        System.out.println("Pedido completo");
        System.out.println("Factura "+ numeroFactura);
        System.out.println("codigo de envio" + codigoEnvio);
    }
}
