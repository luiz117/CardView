package com.luizao.cardview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.luizao.cardview.Models.Postagem;
import com.luizao.cardview.R;


import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<Postagem> postagemList;



    public Adapter(List<Postagem> postagemList) {
        this.postagemList = postagemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View post = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_detail,parent,false);

        return new ViewHolder(post);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Postagem p = postagemList.get(position);

        holder.username.setText(p.getUsername());
        holder.post.setText(p.getPost());
        holder.img.setImageResource(p.getImg());
        holder.horario.setText(p.getHorario());

    }

    @Override
    public int getItemCount() {
        return postagemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView username;
        TextView post;
        TextView horario;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.txtUsername);
            post = itemView.findViewById(R.id.txtPost);
            horario = itemView.findViewById(R.id.txtHorario);
            img = itemView.findViewById(R.id.imgPost);
        }
    }
}
