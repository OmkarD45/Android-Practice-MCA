package com.example.radiob;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        RadioGroup rbgroup;
        RadioButton radioButton;
        Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            rbgroup=findViewById(R.id.rbgroup);
            btn=findViewById(R.id.btnRegister);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int selectedId=rbgroup.getCheckedRadioButtonId();
                    radioButton=findViewById(selectedId);
                    Toast.makeText(MainActivity.this, "Following Radio Button is clicked"+radioButton.getText(),Toast.LENGTH_LONG);
                }
            });
        }
    }
