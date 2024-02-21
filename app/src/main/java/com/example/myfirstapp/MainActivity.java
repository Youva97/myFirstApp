package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton floatAB;

    private TextView TxtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatAB = findViewById(R.id.floatingActionButton);
        TxtV = findViewById(R.id.textView1);

        floatAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TxtV.setText("Merci d'avoir cliqué");
            }
        });
    }
}