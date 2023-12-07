package com.example.ejerciciospmydm;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Frutas_activity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);

        final ListView listView = findViewById(R.id.listView);

        final ImageButton frutas = findViewById(R.id.frutas);
        final ImageButton verduras = findViewById(R.id.verduras);

        final ImageButton albaricoque = findViewById(R.id.albaricoque);
        final ImageButton platano = findViewById(R.id.platano);
        final ImageButton pimiento = findViewById(R.id.pimiento);
        final ImageButton patata = findViewById(R.id.patata);

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        albaricoque.setVisibility(View.INVISIBLE);
        platano.setVisibility(View.INVISIBLE);
        pimiento.setVisibility(View.INVISIBLE);
        patata.setVisibility(View.INVISIBLE);

        frutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                albaricoque.setVisibility(View.VISIBLE);
                platano.setVisibility(View.VISIBLE);
            }
        });

        verduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pimiento.setVisibility(View.VISIBLE);
                patata.setVisibility(View.VISIBLE);
            }
        });

        albaricoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItemAndShowToast("Albaricoque");
            }
        });

        platano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItemAndShowToast("Plátano");
            }
        });

        pimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItemAndShowToast("Pimiento");
            }
        });

        patata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItemAndShowToast("Patata");
            }
        });
    }

    private void addItemAndShowToast(String item) {
        adapter.add(item);
        adapter.notifyDataSetChanged();
        showToast(item);
    }

    private void showToast(String producto) {
        Toast.makeText(this, "Has añadido '" + producto +
                "' a la lista", Toast.LENGTH_SHORT).show();
    }
}