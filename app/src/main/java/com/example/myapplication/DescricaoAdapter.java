package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DescricaoAdapter extends ArrayAdapter {

    Context mContext;
    int mResource;

    public DescricaoAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);

        mContext = context;
        mResource = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);


        Fruta fruta = (Fruta) getItem(position);

        TextView tvMinerais = (TextView) convertView.findViewById(R.id.tvMinerais);
        tvMinerais.setText(fruta.getDescricao());

        TextView tvCalorias = (TextView) convertView.findViewById(R.id.tvCalorias);
        tvCalorias.setText(fruta.getNome());

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView2);
        imageView.setImageResource(fruta.getImagem());







        return convertView;
    }
}
