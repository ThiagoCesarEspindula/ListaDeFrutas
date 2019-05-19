package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Fruta> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.listView);

        lista = new ArrayList<Fruta>();

        Frutas fcontroller = new Frutas();

        for(Fruta f: fcontroller.FRUTAS){

            lista.add(f);

        }

       // ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, lista);

        FrutaAdapter adapter = new FrutaAdapter(getApplicationContext(), R.layout.layout_iten_list, lista);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // Toast.makeText(getApplicationContext(), lista.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), MostrarFruta.class);

                intent.putExtra("Posição", position);

                //intent.putExtra("Descricao", lista.get(position).getDescricao());

                startActivity(intent);


            }
        });
    }
}
