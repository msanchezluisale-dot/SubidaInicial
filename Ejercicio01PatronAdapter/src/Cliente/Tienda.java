package Cliente;

import Target.PasarelaPago;

/*
    Cliente
*/
public class Tienda {

    private PasarelaPago pasarelaPago;

    public Tienda(PasarelaPago pasarelaPago) {

        this.pasarelaPago = pasarelaPago;
    }

    public void realizarCompra(double monto, String moneda) {

        System.out.println("  TIENDA ONLINE");
        System.out.println("Procesando compra...\n");

        pasarelaPago.procesarPago(monto, moneda);
    }
}