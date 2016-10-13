package com.example.phompang.myapplication.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phompang.myapplication.R;
import com.example.phompang.myapplication.model.User;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListDetailActivity extends AppCompatActivity {

    @BindView(R.id.listDetailImg)
    ImageView mImageView;
    @BindView(R.id.listDetailFName)
    TextView mFTextView;
    @BindView(R.id.listDetailLName)
    TextView mLTextView;
    @BindView(R.id.listDetailPhone)
    TextView mPTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        User u = (User) intent.getSerializableExtra("user");

        mImageView.setImageResource(u.getPhoto());
        mFTextView.setText(u.getfName());
        mLTextView.setText(u.getlName());
        mPTextView.setText(u.getPhone());

    }
}
