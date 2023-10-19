package com.victor.preferenciascompartidas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView dato;

    //@Override
    protected  void Oncreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dato = findViewById(R.id.testViewUser);
        dato.setText("Bienvenido"+new PreferenciaMAnager(this).getEmail());

    }
}
