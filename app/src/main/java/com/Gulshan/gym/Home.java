package com.haris.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    ImageView image;
    TextView name,age,gender,weight,maritalstatus;
    Button exercies,timetable,fav,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        image=findViewById(R.id.image);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        gender=findViewById(R.id.gender);
        weight=findViewById(R.id.weight);
        maritalstatus=findViewById(R.id.maritalStatus);
        exercies=findViewById(R.id.exercies);
        timetable=findViewById(R.id.time);
        fav=findViewById(R.id.fav);
        profile=findViewById(R.id.profile);
    }
    public void ex(View v){
        Intent i=new Intent(Home.this,Exercies.class);
        startActivity(i);
    }
    public void timeTable(View v){
        Intent i = new Intent(Home.this,timeTable.class);
        startActivity(i);
    }
    public void profile(View v){
        Intent i = new Intent(Home.this,profile.class);
        startActivity(i);
    }


}