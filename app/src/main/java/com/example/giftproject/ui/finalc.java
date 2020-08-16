package com.example.mobilegift;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class finalc extends AppCompatActivity {
    private Button NEXT;
    private Button OK;
    private Button DELETE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalc);
        NEXT = (Button) findViewById(R.id.next);
        OK = (Button) findViewById(R.id.ok);
        DELETE = (Button) findViewById(R.id.delete);
    }
}