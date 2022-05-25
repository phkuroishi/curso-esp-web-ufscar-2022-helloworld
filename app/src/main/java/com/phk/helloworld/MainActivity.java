package com.phk.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        Button btnClick = findViewById(R.id.btnHelloWorld);
        TextView textView = findViewById(R.id.textFieldToShow);

        btnClick.setOnClickListener(view -> {
            textView.setText("Hello World!");
        });
    }
}