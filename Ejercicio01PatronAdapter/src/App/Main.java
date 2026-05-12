package App;

import Adapter.LegacyPayAdapter;
import Adaptee.LegacyPayLib;
import Cliente.Tienda;
import Target.PasarelaPago;

public class Main {

    public static void main(String[] args) {

        // Librería heredada
        LegacyPayLib legacy = new LegacyPayLib();

        // Adapter
        PasarelaPago adaptador =
                new LegacyPayAdapter(legacy);

        // Cliente
        Tienda tienda = new Tienda(adaptador);

        // Pruebas
        tienda.realizarCompra(25.50, "PEN");

        tienda.realizarCompra(100.75, "USD");
    }
}