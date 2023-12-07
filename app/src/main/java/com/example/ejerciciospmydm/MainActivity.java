package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir_Perro (View view){
        Intent i = new Intent(this, Perro_activity.class);
        startActivity(i);
    }

    public void abrir_Login (View view){
        Intent i = new Intent(this, Login_activity.class);
        startActivity(i);
    }

    public void abrir_Calculadora (View view){
        Intent i = new Intent(this, Calculadora_activity.class);
        startActivity(i);
    }

    public void abrir_DanceMonsters (View view){
        Intent i = new Intent(this, DanceMonsters_activity.class);
        startActivity(i);
    }

    public void abrir_Layouts (View view){
        Intent i = new Intent(this, Layouts_activity.class);
        startActivity(i);
    }

    public void abrir_Frutas (View view){
        Intent i = new Intent(this, Frutas_activity.class);
        startActivity(i);
    }

    public void abrir_Intents_Google_Cam (View view){
        Intent i = new Intent(this, IntGoogleCam_activity.class);
        startActivity(i);
    }

    public void abrir_Switch_CheckBox_RadioGroup (View view){
        Intent i = new Intent(this, Switch_CheckBox_RadioGroup_activity.class);
        startActivity(i);
    }

    public void abrir_Conteo (View view){
        Intent i = new Intent(this, Conteo_activity.class);
        startActivity(i);
    }
}