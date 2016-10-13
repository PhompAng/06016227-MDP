package com.example.phompang.myapplication.listview;

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
 * Created by phompang on 10/14/2016 AD.
 */

public class ListAdapter extends ArrayAdapter {

    private Context mContext;
    private List<User> users;
    private LayoutInflater inflater;

    public ListAdapter(Context context, int resource, List objects) {
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
        View v = inflater.inflate(R.layout.list_layout, parent, false);

        ImageView imageView = (ImageView) v.findViewById(R.id.listImg);
        TextView fName = (TextView) v.findViewById(R.id.listFName);
        TextView lName = (TextView) v.findViewById(R.id.listLName);
        TextView phone = (TextView) v.findViewById(R.id.listPhone);

        imageView.setImageResource(users.get(position).getPhoto());
        fName.setText(users.get(position).getfName());
        lName.setText(users.get(position).getlName());
        phone.setText(users.get(position).getPhone());

        return v;
    }
}
