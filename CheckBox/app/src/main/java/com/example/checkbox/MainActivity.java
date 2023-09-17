package com.example.checkbox;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3;
    Button btn,clr;
    TextView txtv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        btn = findViewById(R.id.btn);
        txtv1=findViewById(R.id.txtv1);
        clr=findViewById(R.id.clr);
        btn.setOnClickListener(new View.OnClickListener() {
            String str="";
            @Override
            public void onClick(View view) {
                if (cb1.isChecked()) {
                    str += cb1.getText().toString() + ", ";
                }
                if (cb2.isChecked()) {
                    str += cb2.getText().toString() + ", ";
                }
                if (cb3.isChecked()) {
                    str += cb3.getText().toString() + ", ";
                }
                txtv1.setText(str);

            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv1.setText("");
                cb1.setChecked(false);
                cb2.setChecked(false);
                cb3.setChecked(false);
            }
        });
    }
}