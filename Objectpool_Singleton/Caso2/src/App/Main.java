package App;

import Base.ReporteBase;
import Extras.*;
import Interfaces.Reporte;

public class Main {

    public static void main(String[] args) {

        Reporte r1 = new ReporteBase();

        Reporte r2 = new SeccionTotales(new ReporteBase());

        Reporte r3 = new SeccionGrafico(
                new SeccionTotales(
                        new ReporteBase()));

        Reporte r4 = new SeccionEnvios(
                new SeccionGrafico(
                        new SeccionTotales(
                                new ReporteBase())));

        System.out.println("\nREPORTE 1");
        r1.generar();

        System.out.println("\nREPORTE 2");
        r2.generar();

        System.out.println("\nREPORTE 3");
        r3.generar();

        System.out.println("\nREPORTE 4");
        r4.generar();
    }
}