package com.example.giftproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.rey.material.widget.EditText;

public class RegisterActivity2 extends AppCompatActivity {
    private Button CreateAccountButton;
    private EditText InputName ,InputPhoneNumber ,InputPassword ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        CreateAccountButton =(Button) findViewById(R.id.Register_btn);
        InputName =(EditText) findViewById(R.id.Register_username_input_input);
        InputPhoneNumber =(EditText) findViewById(R.id.Register_phone_number_input);
        InputPassword =(EditText) findViewById(R.id.Register_password_input);

    }
}