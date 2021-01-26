package com.example.examen;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="Camara", strict=false)
public class Camara {
    @Element(name="Posicion")
    private Posicion posicion;
    @Element(name="URL")
    private String url;

    public Camara() {
    }

    public Camara(Posicion posicion, String url) {
        this.posicion = posicion;
        this.url = url;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
