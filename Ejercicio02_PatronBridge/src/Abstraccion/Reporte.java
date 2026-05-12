package Abstraccion;

import Implementacion.Exportador;

import java.util.List;

public abstract class Reporte {

    protected Exportador exportador;

    public Reporte(Exportador exportador) {
        this.exportador = exportador;
    }

    public abstract void generar(List<String> datos);

}