package com.example.phompang.myapplication.spinner;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phompang.myapplication.R;
import com.example.phompang.myapplication.model.User;

import java.util.List;

/**
 * Created by phompang on 10/13/2016 AD.
 */

public class SpinnerAdapter extends ArrayAdapter {
    private Context mContext;
    private List<User> users;
    private LayoutInflater inflater;


    public SpinnerAdapter(Context context, int resource, List<User> objects) {
        super(context, resource, objects);

        mContext = context;
        users = objects;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return users.get(position).getId();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, View convertView,ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    private View getCustomView(int position, View convertView,ViewGroup parent) {
        View v = inflater.inflate(R.layout.spinner_custom_layout, parent, false);

        ImageView imageView = (ImageView) v.findViewById(R.id.spinnerImg);
        TextView textView = (TextView) v.findViewById(R.id.spinnerText);

        imageView.setImageResource(users.get(position).getPhoto());
        textView.setText(users.get(position).toString());

        return v;
    }
}
