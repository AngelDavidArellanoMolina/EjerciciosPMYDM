package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Layouts_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
    }
    public void layout1 (View view){
        Intent i = new Intent(this, Layout1.class);
        startActivity(i);
    }
    public void layout2 (View view){
        Intent i = new Intent(this, Layout2.class);
        startActivity(i);
    }
    public void layout3 (View view){
        Intent i = new Intent(this, Layout3.class);
        startActivity(i);
    }
    public void layout4 (View view){
        Intent i = new Intent(this, Layout4.class);
        startActivity(i);
    }

    public void barriers (View view){
        Intent i = new Intent(this, Barriers.class);
        startActivity(i);
    }
}

