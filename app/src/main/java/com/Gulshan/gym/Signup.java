package com.haris.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    EditText name, email, password, repassword, age;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.repassword);
        age = findViewById(R.id.age);
        signup = findViewById(R.id.register);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Regist();
            }
        });
    }

    public void Regist() {
        String na = name.getText().toString();
        String ema = email.getText().toString();
        String pas = password.getText().toString();
        String repas = repassword.getText().toString();
        String ag = age.getText().toString();

        String result = abc(na, ema, pas, repas, ag);

        if (result.equals("0")) {
            Toast.makeText(this, "Empty! Fill all Fields", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        Intent i=new Intent(Signup.this,MainActivity.class);
        startActivity(i);
        }
    }

    protected String abc(String a, String b, String c, String d, String e) {
        if (a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty() || e.isEmpty()) {
            return "0";
        } else {
            return "1";
        }
    }
}
