package com.haris.gym;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminPannel extends AppCompatActivity {
Button a,b,c;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_pannel);
        a=findViewById(R.id.exe);
        b=findViewById(R.id.users);
        c=findViewById(R.id.logout);
    }


    public void Exer(View v){
        Intent i=new Intent(AdminPannel.this,Exer.class);
        startActivity(i);
    }

    public void Users(View v){
        Intent i=new Intent(AdminPannel.this,users.class);
        startActivity(i);
    }
}