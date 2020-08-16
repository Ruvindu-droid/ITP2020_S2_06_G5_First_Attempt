package com.example.giftproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.rey.material.widget.EditText;

public class LoginActivity2 extends AppCompatActivity {


    private Button LoginButton;
    private EditText InputPhoneNumber1 ,InputPassword1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        LoginButton =(Button) findViewById(R.id.login_btn);

        InputPhoneNumber1 =(EditText) findViewById(R.id.login_phone_number_input);
        InputPassword1 =(EditText) findViewById(R.id.login_password_input);

    }
}