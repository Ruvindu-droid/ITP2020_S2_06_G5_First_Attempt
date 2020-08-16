package com.example.gifts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class giftcategoryActivity2 extends AppCompatActivity {

    private Button Box, Box1, Box2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giftcategory2);

        Box = (Button) findViewById(R.id.Box);
        Box1 = (Button) findViewById(R.id.Box1);
        Box2 = (Button) findViewById(R.id.Box2);

        Box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(giftcategoryActivity2.this,Box_WrapActivity2.class);
                startActivity(intent);

            }
        });
        Box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(giftcategoryActivity2.this,Bag_WrapActivity2.class);
                startActivity(intent);

            }
        });

        Box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(giftcategoryActivity2.this,Paper_WrapActivity2.class);
                startActivity(intent);

            }
        });



    }
}