package com.example.gifts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Bag_WrapActivity2 extends AppCompatActivity {
    private Button  Box5, Box6, Box9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag__wrap2);


        Box5 = (Button) findViewById(R.id.Box5);
        Box6 = (Button) findViewById(R.id.Box6);
        Box9 = (Button) findViewById(R.id.Box9);
    }
}