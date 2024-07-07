package com.haris.gym;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DetailPage extends AppCompatActivity {
TextView clas,des;
RecyclerView list;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_page);
        clas=findViewById(R.id.clas);
        des=findViewById(R.id.des);
list=findViewById(R.id.list);
        Intent i=getIntent();
        String name=i.getStringExtra("Name");
        String source=i.getStringExtra("Image");
        String Description=i.getStringExtra("Description");
        clas.setText(name);
        des.setText(Description);
        List<SetClass>sets=new SetDatabase().getData(name);
        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    SetAdapter adp=new SetAdapter(sets,this);
    list.setAdapter(adp);
    }
}