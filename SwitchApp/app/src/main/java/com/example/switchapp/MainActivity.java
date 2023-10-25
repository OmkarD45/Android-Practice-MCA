package com.example.switchapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch sw1;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw1 = findViewById(R.id.sw1);
        btnsubmit = findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str;
                if (sw1.isChecked()) {
                    str = sw1.getTextOn().toString();
                } else {
                    str = sw1.getTextOff().toString();
                }
                Toast.makeText(MainActivity.this, "Bluetooth is" + str, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

