package com.schedulamon.vishnu.schedulamon;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class assesment_detailed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assesment_detailed);
        setTitle("FIT 2069 - Assesment 1 ");
        final RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton3);
        final RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton4);

        radioButton.setTextColor(Color.WHITE);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton.setTextColor(Color.GREEN);
            }
        });
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton1.setTextColor(Color.GREEN);
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton2.setTextColor(Color.GREEN);
            }
        });
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton3.setTextColor(Color.GREEN);
            }
        });


        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relative);
        relativeLayout.setBackgroundColor(Color.argb(255,56,52,52));
    }
}
