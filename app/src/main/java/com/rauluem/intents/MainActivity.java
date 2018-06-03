package com.rauluem.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String CLAVE_NOMBRE="nombre";
    Button boton;
    EditText editNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.buttonAbrir);
        editNombre = (EditText) findViewById(R.id.EscribirNombre);


    }
//para pasar a la otra pantalla (cambiar de una pantalla a otra)
    public void nuevaPantalla (View v){
        Intent intent = new Intent(this, Main2Activity.class);


        intent.putExtra(CLAVE_NOMBRE, editNombre.getText().toString());

        startActivity(intent);

        }

        }
