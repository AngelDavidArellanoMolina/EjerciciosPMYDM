package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Login_Correcto_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_correcto);

        TextView texto = findViewById(R.id.texto_saludo);
        String user = getIntent().getStringExtra("USER");
        texto.setText("¡BIENVENIDO " + user.toUpperCase() + "!");

    }
}