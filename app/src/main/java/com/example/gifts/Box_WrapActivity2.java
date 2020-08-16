package com.example.gifts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Box_WrapActivity2 extends AppCompatActivity {

    private Button  Box3, Box4, Box5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box__wrap2);

        Box3 = (Button) findViewById(R.id.Box3);
        Box4 = (Button) findViewById(R.id.Box4);
        Box5 = (Button) findViewById(R.id.Box5);

        Box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Box_WrapActivity2.this, GiftUpdateActivity2.class  );
                startActivity(intent);

            }
        });
    }
}