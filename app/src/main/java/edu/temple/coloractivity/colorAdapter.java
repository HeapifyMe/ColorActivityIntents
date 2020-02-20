package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class colorAdapter extends BaseAdapter {
    private Context context;
    private String[] color;
    public colorAdapter(Context context, String[] color)
    {
        this.context = context;
        this.color=color;
    }

    @Override
    public int getCount() {
        //returns how many views it'll generate
        return color.length;
    }

    @Override
    public Object getItem(int position) {
        //returns item in the position of arraylist
        return color[position];
    }

    @Override
    public long getItemId(int position) {
        //returns index
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View colorView;
        if (convertView==null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            colorView = inflater.inflate(R.layout.spinner_item,parent,false);

        }
        else
            colorView=convertView;
        TextView colorChoice = colorView.findViewById(R.id.tvColor);
        colorChoice.setText(color[position]);
        colorChoice.setBackgroundColor(Color.parseColor(color[position]));


        return colorView;

    }
}
