package Adapter;

import Adaptee.LegacyPayLib;
import Target.PasarelaPago;
/*
    Adapter
*/
public class LegacyPayAdapter implements PasarelaPago {

    private LegacyPayLib legacyPayLib;

    public LegacyPayAdapter(LegacyPayLib legacyPayLib) {

        this.legacyPayLib = legacyPayLib;
    }

    @Override
    public void procesarPago(double monto, String moneda) {

        // Conversión a centavos
        int centavos = (int) (monto * 100);

        // Conversión moneda
        String codigoDivisa;

        switch (moneda.toUpperCase()) {

            case "PEN":
                codigoDivisa = "604";
                break;

            case "USD":
                codigoDivisa = "840";
                break;

            default:
                codigoDivisa = "000";
        }

        System.out.println(" ADAPTER EN ACCIÓN");
        System.out.println("Monto original: " + monto);
        System.out.println("Monto convertido: " + centavos);
        System.out.println("Código convertido: " + codigoDivisa);
        System.out.println("\n");

        legacyPayLib.realizarTransaccion(centavos, codigoDivisa);
    }
}
