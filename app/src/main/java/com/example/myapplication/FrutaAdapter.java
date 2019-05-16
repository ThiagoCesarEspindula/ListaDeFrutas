package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

class FrutaAdapter extends ArrayAdapter {
    Context mContext;
    int mresource;
    public FrutaAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);

        mContext = context;
        mresource = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mContext);

        convertView = inflater.inflate(mresource, parent, false);

        //Associando os objetos do layout à variáveis locais
        TextView tvCodigo = (TextView) convertView.findViewById(R.id.tvcodigo);
        TextView tvNome = (TextView) convertView.findViewById(R.id.tvNomeFruta);
        TextView tvPreco = (TextView) convertView.findViewById(R.id.tvPreco);
        TextView tvPrecovenda = (TextView) convertView.findViewById(R.id.tvPrecoVenda);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        // Atribuir valores a cada View
        Fruta f= (Fruta) getItem(position);

        NumberFormat format = new DecimalFormat("#,###.00");

        tvCodigo.setText(Integer.toString(f.getCodigo()));
        tvNome.setText(f.getNome());
        tvPreco.setText(format.format(f.getPreco()));
        tvPrecovenda.setText(format.format(f.getPreco_venda()));

        imageView.setImageResource(f.getImagem());

        return convertView;




    }




}
