package com.example.baihuay;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_number);

        Intent intent = getIntent();
        String typeHuay = intent.getStringExtra("ResultNameHuay");
        int Number = intent.getIntExtra("RandomHuay", -1);
        int typeNumber = intent.getIntExtra("KeyHuay", -1);

        if (typeNumber == 1) {
            TextView typeHuayTextView = (TextView) findViewById(R.id.text_two_or_three);
            typeHuayTextView.setText(typeHuay);

            if (Number < 10) {
                String showNumber = "" + Number;
                TextView numberTextView = (TextView) findViewById(R.id.Huay);

                numberTextView.setText("0"+showNumber);

            } else {
                String showNumber = Number + "";
                TextView numberTextView = (TextView) findViewById(R.id.Huay);
                numberTextView.setText(showNumber);
            }
        } else if (typeNumber == 2) {
            TextView typeHuayTextView = (TextView) findViewById(R.id.text_two_or_three);
            typeHuayTextView.setText(typeHuay);

            if (Number < 10) {
                String showNumber = "" + Number;
                TextView numberTextView = (TextView) findViewById(R.id.Huay);
                numberTextView.setText("00" + showNumber);
            } else if (Number < 100) {
                String showNumber = "" + Number;
                TextView numberTextView = (TextView) findViewById(R.id.Huay);
                numberTextView.setText("0" + showNumber);
            } else {
                String showNumber = Number + "";
                TextView numberTextView = (TextView) findViewById(R.id.Huay);
                numberTextView.setText(showNumber);
            }
        }
    }
}
