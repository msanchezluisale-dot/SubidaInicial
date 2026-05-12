package Implementacion;

import java.util.List;

public class ExportadorConsola implements Exportador {

    @Override
    public void exportar(String titulo, List<String> filas) {

        System.out.println("===== " + titulo + " =====");

        for (String fila : filas) {
            System.out.println(fila);
        }

        System.out.println();
    }
}