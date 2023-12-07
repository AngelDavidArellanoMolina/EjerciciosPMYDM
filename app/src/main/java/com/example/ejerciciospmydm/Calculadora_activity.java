package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.util.Objects;

public class Calculadora_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        EditText result = findViewById(R.id.result);
        EditText numArriba = findViewById(R.id.numArriba);
        Button ac = findViewById(R.id.ac);
        Button masmenos = findViewById(R.id.masmenos);
        Button porcentaje = findViewById(R.id.porcentaje);
        Button division = findViewById(R.id.division);
        Button multiplicacion = findViewById(R.id.multiplicacion);
        Button mas = findViewById(R.id.mas);
        Button menos = findViewById(R.id.menos);
        Button igual = findViewById(R.id.igual);
        Button coma = findViewById(R.id.coma);
        Button uno = findViewById(R.id.uno);
        Button dos = findViewById(R.id.dos);
        Button tres = findViewById(R.id.tres);
        Button cuatro = findViewById(R.id.cuatro);
        Button cinco = findViewById(R.id.cinco);
        Button seis = findViewById(R.id.seis);
        Button siete = findViewById(R.id.siete);
        Button ocho = findViewById(R.id.ocho);
        Button nueve = findViewById(R.id.nueve);
        Button cero = findViewById(R.id.cero);
        final double[] primerNumero = new double[1];
        final double[] segundoNumero = new double[1];
        final String[] operacion = new String[1];
        operacion[0] = "";

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", cero.getText().toString());

                if (result.getText().toString().equals("")) {
                    result.setText("0");
                } else {
                    result.setText(result.getText().toString() + "0");
                }
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", uno.getText().toString());
                result.setText(result.getText().toString() + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", dos.getText().toString());
                result.setText(result.getText().toString() + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", tres.getText().toString());
                result.setText(result.getText().toString() + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", cuatro.getText().toString());
                result.setText(result.getText().toString() + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", cinco.getText().toString());
                result.setText(result.getText().toString() + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", seis.getText().toString());
                result.setText(result.getText().toString() + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", siete.getText().toString());
                result.setText(result.getText().toString() + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", ocho.getText().toString());
                result.setText(result.getText().toString() + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", nueve.getText().toString());
                result.setText(result.getText().toString() + "9");
            }
        });
        coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", coma.getText().toString());
                if (!result.getText().toString().contains(".")) {
                    if (!result.getText().toString().isEmpty()) {
                        result.setText(result.getText().toString() + ".");
                    } else if (result.getText().toString().isEmpty() ||
                            Objects.equals(result.getText().toString(), "0")) {
                        result.setText("0.");
                    }
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", ac.getText().toString());
                result.setText("");
                numArriba.setText("");
                primerNumero[0] = Double.NaN;
                segundoNumero[0] = Double.NaN;
                operacion[0] = "";
            }
        });
        masmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", masmenos.getText().toString());

                if (result.getText().toString().contains("-")) {
                    result.setText(result.getText().toString().replace("-", ""));
                } else if (result.getText().toString().equals("") ||
                        result.getText().toString().equals("0")){
                    result.setText("");
                }
                else {
                    result.setText("-" + result.getText().toString());
                }
            }
        });
        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", porcentaje.getText().toString());
                if (!result.getText().toString().isEmpty()) {
                    if (!Double.isNaN(primerNumero[0])) {
                        Double prueba = Double.parseDouble(result.getText().toString());
                        segundoNumero[0] = primerNumero[0] * prueba * 0.01;
                        result.setText(String.valueOf(segundoNumero[0]));
                    } else {
                        primerNumero[0] = Double.parseDouble(result.getText().toString()) * 0.01;
                        result.setText(String.valueOf(primerNumero[0]));
                    }
                } else {
                    result.setText("+");
                }
            }
        });
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", mas.getText().toString());
                primerNumero[0] = Double.parseDouble(result.getText().toString());
                String texto = (primerNumero[0] % 1 == 0) ?
                        String.valueOf((int) primerNumero[0]) : String.valueOf(primerNumero[0]);
                numArriba.setText(texto + " +");
                operacion[0] = "+";
                result.setText("");
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", menos.getText().toString());
                primerNumero[0] = Double.parseDouble(result.getText().toString());
                String texto = (primerNumero[0] % 1 == 0) ?
                        String.valueOf((int) primerNumero[0]) : String.valueOf(primerNumero[0]);
                numArriba.setText(texto + " -");
                operacion[0] = "-";
                result.setText("");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", multiplicacion.getText().toString());
                primerNumero[0] = Double.parseDouble(result.getText().toString());
                String texto = (primerNumero[0] % 1 == 0) ?
                        String.valueOf((int) primerNumero[0]) : String.valueOf(primerNumero[0]);
                numArriba.setText(texto + " ×");
                operacion[0] = "x";
                result.setText("");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", division.getText().toString());
                primerNumero[0] = Double.parseDouble(result.getText().toString());
                String texto = (primerNumero[0] % 1 == 0) ?
                        String.valueOf((int) primerNumero[0]) : String.valueOf(primerNumero[0]);
                numArriba.setText(texto + " /");
                operacion[0] = "/";
                result.setText("");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", igual.getText().toString());
                if (!operacion[0].equals("")) {
                    Double resultado;
                    String texto;
                    DecimalFormat df = new DecimalFormat("#.####");


                    segundoNumero[0] = Double.parseDouble(result.getText().toString());
                    switch (operacion[0]) {
                        case "+":
                            resultado = segundoNumero[0] + primerNumero[0];
                            texto = (resultado % 1 == 0) ?
                                    String.valueOf((int) Math.round(resultado)) :
                                    String.valueOf(df.format(resultado));
                            result.setText(texto);
                            operacion[0] = "";
                            break;
                        case "-":
                            resultado = primerNumero[0] - segundoNumero[0];
                            texto = (resultado % 1 == 0) ?
                                    String.valueOf((int) Math.round(resultado)) :
                                    String.valueOf(df.format(resultado));
                            result.setText(texto);
                            operacion[0] = "";
                            break;
                        case "x":
                            resultado = segundoNumero[0] * primerNumero[0];
                            texto = (resultado % 1 == 0) ?
                                    String.valueOf((int) Math.round(resultado)) :
                                    String.valueOf(df.format(resultado));
                            result.setText(texto);
                            operacion[0] = "";
                            break;
                        case "/":
                            resultado = primerNumero[0] / segundoNumero[0];
                            texto = (resultado % 1 == 0) ?
                                    String.valueOf((int) Math.round(resultado)) :
                                    String.valueOf(df.format(resultado));
                            result.setText(texto);
                            operacion[0] = "";
                            break;
                        default:
                            result.setText("Error");
                            break;
                    }
                    numArriba.setText("");
                }
            }
        });
    }
}