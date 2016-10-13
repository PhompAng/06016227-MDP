package com.example.phompang.myapplication.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.phompang.myapplication.R;
import com.example.phompang.myapplication.model.User;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpinnerActivity extends AppCompatActivity {

    @BindView(R.id.spinner)
    Spinner mSpinner;
    @BindView(R.id.spinnerBtn)
    Button mButton;

    private List<User> users;

    private String[] name = {"Godelieve", "Orfeo", "Mahesha", "Theodorus", "Rubena"};
    private String[] surname = {"Zlatkov", "Etxeberria", "Taylor", "Lavoie", "Simon"};
    private int[] photo = {R.drawable.ic_menu_camera, R.drawable.ic_menu_gallery, R.drawable.ic_menu_manage, R.drawable.ic_menu_share, R.drawable.ic_menu_slideshow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);

        setUsers();

        SpinnerAdapter adapter = new SpinnerAdapter(this, R.layout.spinner_custom_layout, users);
        mSpinner.setAdapter(adapter);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User u = (User) mSpinner.getSelectedItem();
                Toast.makeText(getApplicationContext(), u.toString(), Toast.LENGTH_SHORT).show();
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
