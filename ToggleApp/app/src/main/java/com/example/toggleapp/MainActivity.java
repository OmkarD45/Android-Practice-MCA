package com.example.toggleapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tog;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tog = findViewById(R.id.tog);
        textview = findViewById(R.id.textView);
    }
    public void onToggleClick(View view)
    {
        if (tog.isChecked()) {
            textview.setText("Toggle is ON");
        }
        else {
            textview.setText("Toggle is OFF");
        }
    }}
