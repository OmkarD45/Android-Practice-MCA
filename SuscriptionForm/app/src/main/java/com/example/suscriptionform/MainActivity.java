package com.example.suscriptionform;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etSubscriptionEmail, etLoginUsername, etLoginPassword;
    private Button btnSubscribe, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSubscriptionEmail = findViewById(R.id.etSubscriptionEmail);
        btnSubscribe = findViewById(R.id.btnSubscribe);

        etLoginUsername = findViewById(R.id.etLoginUsername);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnSubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle subscription logic here
                String email = etSubscriptionEmail.getText().toString();
                String message = "Subscribed with email: " + email;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login logic here
                String username = etLoginUsername.getText().toString();
                String password = etLoginPassword.getText().toString();

                // Display a toast message for login
                String message = "Logged in as: " + username;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
