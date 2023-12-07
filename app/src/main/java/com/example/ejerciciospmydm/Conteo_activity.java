package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Conteo_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo);

        Button mas = findViewById(R.id.mas);
        Button menos = findViewById(R.id.menos);
        Button reset = findViewById(R.id.reset);
        EditText contador = findViewById(R.id.contador);
        EditText num = findViewById(R.id.num);
        ToggleButton onoff = findViewById(R.id.onoff);
        CheckBox check = findViewById(R.id.check);

        onoff.setTextOn("ON");
        onoff.setTextOff("OFF");
        onoff.setChecked(false);

        reset.setVisibility(View.INVISIBLE);
        check.setVisibility(View.INVISIBLE);
        num.setVisibility(View.INVISIBLE);

        final boolean[] ConteoNegativo = {false};

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int valor = 0;
                int valornum;

                if (String.valueOf(contador.getText()).isEmpty()) {
                    contador.setText(String.valueOf(0));
                } else {
                    if (String.valueOf(num.getText()).isEmpty()) {
                        valor = Integer.parseInt(String.valueOf(contador.getText()));
                        valor++;
                    } else if (Integer.parseInt(String.valueOf(num.getText())) < 0 &&
                            !ConteoNegativo[0]) {
                        Toast.makeText(Conteo_activity.this,
                                "Introduzca un número positivo", Toast.LENGTH_SHORT).show();
                    } else {
                        valornum = Integer.parseInt(String.valueOf(num.getText()));
                        valor = Integer.parseInt(String.valueOf(contador.getText()));
                        valor = valor + valornum;
                    }

                    contador.setText(String.valueOf(valor));
                }
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor = 0;
                int valornum;

                if (String.valueOf(contador.getText()).isEmpty()) {
                    contador.setText(String.valueOf(-1));
                } else {
                    if (String.valueOf(num.getText()).isEmpty()) {
                        valor = Integer.parseInt(String.valueOf(contador.getText()));
                        valor--;
                    } else if (Integer.parseInt(String.valueOf(num.getText())) < 0 && !ConteoNegativo[0]) {
                        Toast.makeText(Conteo_activity.this, "Introduzca un número positivo", Toast.LENGTH_SHORT).show();
                    } else {
                        valornum = Integer.parseInt(String.valueOf(num.getText()));
                        valor = Integer.parseInt(String.valueOf(contador.getText()));
                        valor = valor - valornum;
                    }
                    contador.setText(String.valueOf(valor));
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador.setText(String.valueOf(0));
            }
        });

        onoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    reset.setVisibility(View.VISIBLE);
                    check.setVisibility(View.VISIBLE);
                    num.setVisibility(View.VISIBLE);
                } else {
                    reset.setVisibility(View.INVISIBLE);
                    check.setVisibility(View.INVISIBLE);
                    num.setVisibility(View.INVISIBLE);
                    check.setChecked(false);
                }
            }
        });

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ConteoNegativo[0] = true;
                    menos.setVisibility(View.INVISIBLE);
                } else {
                    ConteoNegativo[0] = false;
                    menos.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}