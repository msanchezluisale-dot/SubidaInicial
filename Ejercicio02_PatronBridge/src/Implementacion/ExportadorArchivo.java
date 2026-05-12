package Implementacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorArchivo implements Exportador {

    private String nombreArchivo;

    public ExportadorArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void exportar(String titulo, List<String> filas) {

        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {

            writer.write("===== " + titulo + " =====\n");

            for (String fila : filas) {
                writer.write(fila + "\n");
            }

            writer.write("\n");

            System.out.println("Reporte guardado en: " + nombreArchivo);

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
