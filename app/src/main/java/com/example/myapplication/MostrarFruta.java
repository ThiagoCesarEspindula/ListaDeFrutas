package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MostrarFruta extends AppCompatActivity {


    ArrayList<Fruta> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_fruta);

        Intent i = getIntent();

        int pos = i.getIntExtra("Posição", -1);

        final ListView listView = findViewById(R.id.listViewDesc);

        lista = new ArrayList<Fruta>();

        Frutas fcontroller = new Frutas();

        lista.add(fcontroller.FRUTAS[pos]);

        DescricaoAdapter adapter = new DescricaoAdapter(getApplicationContext(), R.layout.layout_descricao_fruta, lista);

        listView.setAdapter(adapter);




    }
}
