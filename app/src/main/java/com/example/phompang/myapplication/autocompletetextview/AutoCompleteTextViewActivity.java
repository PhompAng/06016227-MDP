package com.example.phompang.myapplication.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.phompang.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    @BindView(R.id.autoCompleteTextView)
    AutoCompleteTextView mAutoCompleteTextView;

    private String[] data = {"first","second item" ,"third item"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        ButterKnife.bind(this);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        mAutoCompleteTextView.setAdapter(arrayAdapter);

    }
}
