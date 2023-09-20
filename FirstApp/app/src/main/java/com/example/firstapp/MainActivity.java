package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText t1,t2;
    private Button b1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        b1=findViewById(R.id.b1);
        tv1=findViewById(R.id.t1);
        String a="";
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b= Integer.parseInt(String.valueOf(t1))+Integer.parseInt(String.valueOf(t2));
                tv1.setText(b);
            }
        });
    }
}