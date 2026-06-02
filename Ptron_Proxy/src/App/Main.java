package App;

import Model.Usuario;
import Proxy.ReporteServiceProxy;
import Service.ReporteService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Proxy -  service de reporte");
        ReporteService service=new ReporteServiceProxy();

        Usuario gerente = new Usuario("Carlos", Usuario.Rol.GERENTE);

        Usuario vendedor = new Usuario("Ana", Usuario.Rol.VENDEDOR);

        System.out.println("vendedor intenta ver reporte");
        String Ra1=service.generarReporte("ventas - 2026", vendedor);
        System.out.println("resultado");

        System.out.println("genrente solicita reporte");
        long inicio=System.currentTimeMillis();
        String Ra2= service.generarReporte("venta-2026", gerente);
        long fin=System.currentTimeMillis();
        System.out.println("Reporte recibido en "+ (fin-inicio)+ "ms");
        System.out.println(Ra2);
        System.out.println();

        long inicio2 =System.currentTimeMillis();
        String Ra3= service.generarReporte("ventas-2026", gerente);
        long fin2=System.currentTimeMillis();
        System.out.println("Reporte recibido en "+(fin2-inicio2)+"ms");
        System.out.println(Ra3);
    }
}


