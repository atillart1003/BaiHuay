package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {


    Random random = new Random();

    public int getRandomTwoDigits() {
        int number = random.nextInt(100);
        return  number;
    }

    public int getRandomThreeDigits() {
        int number = random.nextInt(1000);
        return  number;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MainActivity ran = new MainActivity();

        Button randomButton = (Button) findViewById(R.id.Number2);
        Button randomButton2 = (Button) findViewById(R.id.Number3);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                String ResultName = "เลขท้าย 2 ตัว";
                Intent intent = new Intent(MainActivity.this, resultNumber.class);
                intent.putExtra("ResultNameHuay", ResultName);
                intent.putExtra("RandomHuay", ran.getRandomTwoDigits());
                intent.putExtra("KeyHuay", 1);
                startActivity(intent);
            }
        });

        randomButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                String ResultName = "เลขท้าย 3 ตัว";
//                TextView myText = (TextView) findViewById(R.id.textView);

//                myText.setText(myString);
                Intent intent = new Intent(MainActivity.this, resultNumber.class);
                intent.putExtra("ResultNameHuay", ResultName);
                intent.putExtra("RandomHuay", ran.getRandomThreeDigits());
                intent.putExtra("KeyHuay", 2);
                startActivity(intent);
            }
        });
    }
}