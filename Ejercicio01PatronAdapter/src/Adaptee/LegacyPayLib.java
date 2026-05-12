package Adaptee;

public class LegacyPayLib {

    public void realizarTransaccion(int centavos, String codigoDivisa) {

        System.out.println("       LIBRERIA LEGACY");
        System.out.println("Monto recibido: " + centavos + " centavos");
        System.out.println("Código divisa: " + codigoDivisa);
        System.out.println("Pago realizado correctamente");
        System.out.println("\n");
    }
}