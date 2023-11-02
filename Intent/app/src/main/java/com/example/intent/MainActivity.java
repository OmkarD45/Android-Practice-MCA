package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= et1.getText().toString();
                String pass= et2.getText().toString();
                String mobile= et3.getText().toString();
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("pass" +
                        "",pass);
                intent.putExtra("mobile",mobile);
                startActivity(intent);
            }
        });
    }
}