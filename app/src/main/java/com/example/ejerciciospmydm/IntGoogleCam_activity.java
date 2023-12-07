package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class IntGoogleCam_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_google_cam);

        Button botonIntent = findViewById(R.id.botonIntent);
        Button botonGoogle = findViewById(R.id.botonGoogle);
        Button botonCamara = findViewById(R.id.buttonThird);

        botonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntGoogleCam_activity.this, cambiodepantalla.class);
                startActivity(i);
            }
        });

        botonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        botonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirCamara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(abrirCamara);
            }
        });
    }
}