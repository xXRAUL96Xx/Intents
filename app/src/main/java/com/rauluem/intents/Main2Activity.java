package com.rauluem.intents;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtNombre = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();

        String miNombre = intent.getStringExtra(MainActivity.CLAVE_NOMBRE);
        txtNombre.setText("Hola "+miNombre);
    }
}
