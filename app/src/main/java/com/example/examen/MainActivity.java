package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.List;

public class MainActivity extends AppCompatActivity{
    WebView wv;
    Button boton;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=findViewById(R.id.button2);
        wv = findViewById(R.id.webView2);
        progressBar = findViewById(R.id.progressBar2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PedirCamaras p = new PedirCamaras(new PedirCamaras.actualizarDatos() {
                    @Override
                    public void actualizarwv(Camaras c) {
                        actualizar(c);
                    }
                });
                progressBar.setVisibility(View.VISIBLE);
                p.pedirDatos();
                boton.setVisibility(View.INVISIBLE);
            }
        });

    }


    private void actualizar(Camaras c) {
        List<Camara> cama = c.getCamaras();
        String datos = PintarHTML.crearTabla(cama);
        wv.loadData(datos,"text/html","UTF-8");
        progressBar.setVisibility(View.INVISIBLE);
    }
}