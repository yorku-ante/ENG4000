package com.example.antepimentel.eng4000.Items;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.antepimentel.eng4000.Model;
import com.example.antepimentel.eng4000.R;

import java.util.ArrayList;

/**
 * Created by Ante Pimentel on 2/1/2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items) { super(context, 0, items);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final Item item = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }

        TextView name = (TextView)convertView.findViewById(R.id.textView);
        ImageView checked = (ImageView)convertView.findViewById(R.id.imageView3);

        String temp = Model.items.get(position).getName();
        name.setText(temp);

        if(Model.items.get(position).isObtained()){
            checked.setVisibility(View.VISIBLE);
        } else {
            checked.setVisibility(View.GONE);
        }

        return convertView;
    }
}