package com.example.mobilegift;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class text extends AppCompatActivity {

    private Button NEXT;
    private Button UPDATE;
    private Button DELETE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        NEXT = (Button) findViewById(R.id.next);
        UPDATE = (Button) findViewById(R.id.update);
        DELETE = (Button) findViewById(R.id.delete);

    }
}