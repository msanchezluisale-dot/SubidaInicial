package Service;

public class EnvioService {
    public String registrarEnvio(String cliente, String codigoProducto, double cantidad) {
        String codigo= "ENV-"+(int) Math.random()* 9000 + 1000;
        System.out.println("[Envio] Registrar de despacho de " + cantidad + " x" + codigoProducto+ "cliente"+ cliente);
        return codigo;
    }
}
