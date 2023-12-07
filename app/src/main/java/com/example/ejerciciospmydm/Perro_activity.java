package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Perro_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perro);

        EditText ageEdit = findViewById(R.id.age_edit);
        TextView resultText = findViewById(R.id.result_set);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edad = ageEdit.getText().toString();
                if (!edad.isEmpty()){
                    int ageInt = Integer.parseInt(edad);
                    int result = ageInt * 7;
                    String resultString = ("Si fueras perro, tu edad sería de " + result + " años");

                    resultText.setText(resultString);
                }

            }
        });
    }
}