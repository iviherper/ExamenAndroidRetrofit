package com.example.examen;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitXML {
    @GET("components/com_hotspots/datos/camaras.xml")
    Call<Camaras> listCamaras();
}
