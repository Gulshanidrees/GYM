package com.haris.gym;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Exercies extends AppCompatActivity {
RecyclerView lis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercies);
        lis=findViewById(R.id.list);
        List<ExerClass>data=new ExerciseDatabase().getData();
        lis.setLayoutManager(new LinearLayoutManager(this));
        ExerciseAdapter adp=new ExerciseAdapter(data,this);
        lis.setAdapter(adp);
    }
}