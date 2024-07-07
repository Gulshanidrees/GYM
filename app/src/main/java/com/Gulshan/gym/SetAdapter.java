package com.haris.gym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class SetAdapter extends RecyclerView.Adapter<SetAdapter.ProductViewHolder> {
List<SetClass>set=new ArrayList<>();
Context c;
    public SetAdapter(List<SetClass>se,Context con) {
    c=con;
    set=se;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inf=LayoutInflater.from(parent.getContext());
            View v=inf.inflate(R.layout.demo2,parent,false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
SetClass se=set.get(position);
holder.name.setText(se.getName());
        holder.des.setText(se.getDescription());
        holder.target.setText(se.getTargetMuscles());
        holder.set.setText(se.getSet());
        holder.cati.setText(se.getCategory());
        Glide.with(c).load(se.getPic()).into(holder.imag);
    }

    @Override
    public int getItemCount() {
        return set.size();
    }
    static class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView name,cati,target,des,set;
        ImageView imag;
        public ProductViewHolder(@NonNull View v) {
            super(v);
            imag=v.findViewById(R.id.imag);
            name=v.findViewById(R.id.name);
            cati=v.findViewById(R.id.cati);
            target=v.findViewById(R.id.target);
            set=v.findViewById(R.id.sets);
            des=v.findViewById(R.id.des);
        }
    }
}

