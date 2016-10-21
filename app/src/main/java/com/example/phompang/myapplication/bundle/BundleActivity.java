package com.example.phompang.myapplication.bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.phompang.myapplication.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BundleActivity extends AppCompatActivity {

    @BindView(R.id.bundleValue)
    TextView mBundleValue;

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("super.onCreate", "aaaaaaaaaaa");
        setContentView(R.layout.activity_bundle);
        ButterKnife.bind(this);

        Random random = new Random();
        if (savedInstanceState != null) {
            i = savedInstanceState.getInt("i");
        } else {
            i = random.nextInt(100);
        }

        mBundleValue.setText(Integer.toString(i));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("super.onStop", "aaaaaaaaaa");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("super.onDestroy", "aaaaaaaaaa");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("super.onPause", "aaaaaaaaaa");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("super.onResume", "aaaaaaaaaa");
    }


    @Override
    protected void onStart() {
        super.onResume();
        Log.i("super.onStart", "aaaaaaaaaa");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("i", i);
    }
}
