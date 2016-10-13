package com.example.phompang.myapplication.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.phompang.myapplication.R;
import com.example.phompang.myapplication.model.User;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {

    @BindView(R.id.listView)
    ListView mListView;

    private List<User> users;

    private String[] name = {"Godelieve", "Orfeo", "Mahesha", "Theodorus", "Rubena"};
    private String[] surname = {"Zlatkov", "Etxeberria", "Taylor", "Lavoie", "Simon"};
    private int[] photo = {R.drawable.ic_menu_camera, R.drawable.ic_menu_gallery, R.drawable.ic_menu_manage, R.drawable.ic_menu_share, R.drawable.ic_menu_slideshow};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        setUsers();

        ListAdapter adapter = new ListAdapter(this, R.layout.list_layout, users);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                User u = (User) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(ListActivity.this, ListDetailActivity.class);
                intent.putExtra("user", u);
                startActivity(intent);
            }
        });

    }

    private void setUsers() {
        users = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            User c = new User();
            c.setId(i);
            c.setfName(name[i%5]);
            c.setlName(surname[i%5]);
            c.setPhone(Integer.toString(i));
            c.setPhoto(photo[i%5]);
            users.add(c);
        }
    }
}
