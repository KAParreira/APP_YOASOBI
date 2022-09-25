package com.example.yoasobi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class HonnAdapter extends ArrayAdapter<Albuns> {

    private Context context;

    private final ArrayList<Albuns> elementos;

    public HonnAdapter(@NonNull Context context, ArrayList<Albuns> elementos) {
        super(context, R.layout.line, elementos);

        this.context = context;
        this.elementos = elementos;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.line, parent, false);

        TextView nomeLivro = (TextView) rowView.findViewById(R.id.name);
        ImageView image = (ImageView)  rowView.findViewById(R.id.img);

        nomeLivro.setText(elementos.get(position).getNomeLivro());
        image.setImageResource(elementos.get(position).getImage());

        return rowView;
    }
}
