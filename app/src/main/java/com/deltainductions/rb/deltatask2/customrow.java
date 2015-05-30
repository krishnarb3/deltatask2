package com.deltainductions.rb.deltatask2;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


class customrow extends ArrayAdapter<String>
{
    customrow(Context context, String[] names)
    {
        super(context,R.layout.customrow,names);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.customrow,parent,false);
        String name = getItem(position);
        TextView nametext = (TextView)view.findViewById(R.id.name);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.ic_launcher);
        nametext.setText(name);
        return view;
    }
}
