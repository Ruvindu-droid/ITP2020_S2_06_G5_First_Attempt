package com.example.gifts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class GiftUpdateActivity2 extends AppCompatActivity {

    private Button BoxA, BoxB, BoxC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_update2);

        BoxA = (Button) findViewById(R.id.BoxA);
        BoxB = (Button) findViewById(R.id.BoxB);
        BoxC = (Button) findViewById(R.id.BoxC);



    }
}