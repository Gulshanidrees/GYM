package com.haris.gym;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.io.Serializable;
import java.util.List;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ProductViewHolder> {
    List<ExerClass>e;
    Context c;
    ExerciseAdapter(List<ExerClass> ex,Context con){
        e=ex;
        c=con;
    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
LayoutInflater inf=LayoutInflater.from(parent.getContext());
View v=inf.inflate(R.layout.demo,parent,false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ExerClass temp = e.get(position);
        holder.name.setText(temp.getName());
        holder.des.setText(temp.getDescription());
        Glide.with(c).load(temp.getSource()).into(holder.im);
        holder.im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(c,DetailPage.class);
                i.putExtra("Name",temp.getName());
                i.putExtra("Image",temp.getSource());
                i.putExtra("Description",temp.getDescription());
               // i.putExtra("Data",(Serializable) getReleventData(temp.getName()));
                c.startActivity(i);
            }
        });
    }
//    public List<ExerClass>getReleventData(String a){
//        List<ExerClass> data = new ExerciseDatabase().getDataInClass(a);
//        return data;
//    }
    @Override
    public int getItemCount() {
        return e.size();
    }
    static class ProductViewHolder extends RecyclerView.ViewHolder{
TextView name,des;
ImageView im;
        public ProductViewHolder(@NonNull View v) {
            super(v);
            im=v.findViewById(R.id.image);
            name=v.findViewById(R.id.name);
            des=v.findViewById(R.id.des);
        }
    }
}
