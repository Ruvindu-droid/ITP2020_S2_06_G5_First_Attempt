package com.example.gifts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Paper_WrapActivity2 extends AppCompatActivity {

    private Button Box7, Box8,Box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper__wrap2);


        Box7 = (Button) findViewById(R.id.Box7);
        Box8 = (Button) findViewById(R.id.Box8);
        Box = (Button) findViewById(R.id.Box);
    }
}