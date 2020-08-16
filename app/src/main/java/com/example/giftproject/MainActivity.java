package com.example.giftproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button joinNowButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton =(Button)findViewById(R.id.welcome_main_login_btn);
        joinNowButton =(Button)findViewById(R.id.welcome_main_join_now_btn);





        loginButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,LoginActivity2.class);
            startActivity(intent);
        }
    });



    joinNowButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,RegisterActivity2.class);
            startActivity(intent);
        }
    });


    }
}