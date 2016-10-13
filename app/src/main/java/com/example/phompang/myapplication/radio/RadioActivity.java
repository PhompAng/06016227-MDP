package com.example.phompang.myapplication.radio;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.phompang.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RadioActivity extends AppCompatActivity {

    @BindView(R.id.radioGroup)
    RadioGroup mRadioGroup;
    @BindView(R.id.radio1)
    RadioButton mRadioButton1;
    @BindView(R.id.radio2)
    RadioButton mRadioButton2;
    @BindView(R.id.radio3)
    RadioButton mRadioButton3;
    @BindView(R.id.radioBtn)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        ButterKnife.bind(this);

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // i = selected radio id
                Toast.makeText(getApplicationContext(), "onCheckedChanged: " + ((RadioButton) findViewById(i)).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getCheckedRadioButtonId return id of checked radio button
                Toast.makeText(getApplicationContext(), "onClick: " + ((RadioButton) findViewById(mRadioGroup.getCheckedRadioButtonId())).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
