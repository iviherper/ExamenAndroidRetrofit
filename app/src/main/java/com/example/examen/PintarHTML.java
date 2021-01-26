package com.example.examen;

import android.util.Log;

import java.util.List;

public class PintarHTML {
    public static String crearTabla(List<Camara> c){
        String tabla = "<!DOCTYPE html><html><head><meta charset='utf-8'></head><body><table border='1px'>";
        tabla+="<tr><th>Foto</th><th>Latitud</th><th>Longitud</th></td>";

        for (Camara cam:
             c)  {
            tabla += "<tr>";
            tabla+="<td><img src='http://"+cam.getUrl()+"' width=150 height=150></td>";
            Log.d("img", cam.getUrl());
            tabla+="<td>"+cam.getPosicion().getLatitud()+"</td>";
            tabla+="<td>"+cam.getPosicion().getLongitud()+"</td>";
            tabla+="</tr>";
        }
        tabla += "</table></body></html>";

        return tabla;
    }
}
