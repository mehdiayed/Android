package com.example.recycleview_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{


    private List<Android_Version> mylist;


    public Adapter(List<Android_Version> myList){
        this.mylist=myList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.android_version_row,parent,false);
        return new MyViewHolder(v);
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView n,a,i;
        public ImageView pic;

        public MyViewHolder(View view) {
            super(view);
            n=view.findViewById(R.id.nom);
            a=view.findViewById(R.id.annee);
            i=view.findViewById(R.id.id);
            pic=view.findViewById(R.id.img);
        }
    }

    @Override
    public void onBindViewHolder(Adapter.MyViewHolder holder, int position) {
       Android_Version av = mylist.get(position);

        holder.n.setText(av.getNom());
        holder.a.setText(""+av.getAnnee());
        holder.i.setText((""+av.getId()));
        holder.pic.setImageResource(av.getImage());

    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
}
