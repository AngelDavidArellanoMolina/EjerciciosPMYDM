package com.example.ejerciciospmydm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_activity extends AppCompatActivity {

    String comprobacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String correctUser = "david";
        String correctPass = "admin";

        EditText User = findViewById(R.id.usr);
        EditText Password = findViewById(R.id.pswd);
        Button button = findViewById(R.id.button);
        TextView texto = findViewById(R.id.error);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = User.getText().toString();
                String contrasena = Password.getText().toString();
                Log.d("User: ", usuario);
                Log.d("Password: ", contrasena);

                if (usuario.equals(correctUser) && contrasena.equals(correctPass)) {
                    setContentView(R.layout.activity_login);
                    texto.setText("");
                    comprobacion = usuario;
                    cambiarPantalla(button);
                } else {
                    comprobacion = "Usuario o contraseña incorrecto";
                    texto.setText(comprobacion);
                }
            }
        });

    }
    public void cambiarPantalla (View view){
        Intent i = new Intent(this, Login_Correcto_activity.class);
        i.putExtra("USER", comprobacion);
        startActivity(i);
    }
}