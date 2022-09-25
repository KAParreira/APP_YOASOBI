package com.example.yoasobi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class OngakuAdapter extends BaseAdapter {

    Context context;
    String ongaku[];
    int ongakuIMG[];
    int more;
    LayoutInflater inflater;

    public OngakuAdapter(Context ctx, String[] ongaku, int[] ongakuIMG, int more){
        this.context = ctx;
        this.ongaku = ongaku;
        this.ongakuIMG = ongakuIMG;
        this.more = more;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return ongaku.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.music, null);
        TextView textView = (TextView) convertView.findViewById(R.id.name);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imgM);
        ImageView img = (ImageView) convertView.findViewById(R.id.more);
        textView.setText(ongaku[position]);
        imageView.setImageResource(ongakuIMG[position]);
        img.setImageResource(more);
        return convertView;
    }
}
