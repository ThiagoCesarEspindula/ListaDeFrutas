package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MostrarFruta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_fruta);

        Intent i = getIntent();

        //int pos = i.getIntExtra("Posição", -1);

        String desc = i.getStringExtra("Descricao");

        TextView tvDescricao = findViewById(R.id.tvDescricao);



        ////Fruta f = new Fruta("","","","","","","","");



         //FrutaAdapter frutaAdapter = new FrutaAdapter(getApplicationContext(), pos);



        tvDescricao.setText("" + desc);


    }
}
