package com.example.phompang.myapplication.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.phompang.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CheckBoxActivity extends AppCompatActivity {

    @BindView(R.id.checkbox1)
    CheckBox mCheckBox1;
    @BindView(R.id.checkbox2)
    CheckBox mCheckBox2;
    @BindView(R.id.checkbox3)
    CheckBox mCheckBox3;
    @BindView(R.id.checkboxBtn)
    Button mButton;
    @BindView(R.id.checkText)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        ButterKnife.bind(this);

        mCheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(getApplicationContext(), "checkbox1: " + b, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(getApplicationContext(), "checkbox2: " + b, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mCheckBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(getApplicationContext(), "checkbox3: " + b, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = "";
                if (mCheckBox1.isChecked()) {
                    ans += "checkbox1, ";
                }
                if (mCheckBox2.isChecked()) {
                    ans += "checkbox2, ";
                }
                if (mCheckBox3.isChecked()) {
                    ans += "checkbox3, ";
                }
                mTextView.setText(ans);
            }
        });
    }
}
