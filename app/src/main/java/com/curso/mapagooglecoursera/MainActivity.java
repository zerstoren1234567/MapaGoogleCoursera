package com.curso.mapagooglecoursera;

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

    public void irMapa1(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1",1);
        startActivity(intent);
    }

    public void irMapa2(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1",2);
        startActivity(intent);
    }

    public void irMapa3(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1",3);
        startActivity(intent);
    }

    public void irMapa4(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1",4);
        startActivity(intent);
    }
}