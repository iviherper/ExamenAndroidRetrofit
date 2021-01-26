package com.example.examen;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="Camaras", strict=false)
public class Camaras {
    @ElementList(name="Camaras", inline = true, required = false)
    private List<Camara> camaras;

    public Camaras() {
    }

    public Camaras(List<Camara> camaras) {
        this.camaras = camaras;
    }

    public List<Camara> getCamaras() {
        return camaras;
    }

    public void setCamaras(List<Camara> camaras) {
        this.camaras = camaras;
    }
}
