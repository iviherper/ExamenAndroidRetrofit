package com.example.examen;


import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class PedirCamaras {
    actualizarDatos a;

    public PedirCamaras(actualizarDatos a) {
        this.a = a;
    }

    public interface actualizarDatos {
        public void actualizarwv(Camaras c);
    }


    public void pedirDatos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.mc30.es/").addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        RetrofitXML service = retrofit.create(RetrofitXML.class);
        Call<Camaras> llamada = service.listCamaras();
        llamada.enqueue(new Callback<Camaras>() {

            @Override
            public void onResponse(Call<Camaras> call, Response<Camaras> response) {
                Camaras c = response.body();
                a.actualizarwv(c);
            }

            @Override
            public void onFailure(Call<Camaras> call, Throwable t) {
                Log.d("Error", t.getLocalizedMessage());
            }

        });
    }
}
