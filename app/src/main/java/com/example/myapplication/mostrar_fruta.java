package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mostrar_fruta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_fruta);

        Intent i = getIntent();

        int pos = i.getIntExtra("Posição", -1);

        TextView tvDescricao = findViewById(R.id.tvDescricao);


         //FrutaAdapter frutaAdapter = new FrutaAdapter(getApplicationContext(), pos);

        //tvDescricao.setText(frutaAdapter.getItem(pos).toString());


    }
}
