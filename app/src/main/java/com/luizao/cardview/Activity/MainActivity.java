package com.luizao.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
//import android.widget.GridLayout;
//import android.widget.LinearLayout;

import com.luizao.cardview.Adapter.Adapter;
import com.luizao.cardview.Models.Postagem;
import com.luizao.cardview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        //layoutManager.setOrientation(RecyclerView.VERTICAL);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setHasFixedSize(true);

        Adapter adapter = new Adapter(postagem);
        this.prepararPostagens();

        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){
        String user = "Carlos da Silva";
        String post = "#TBT Viagem";
        int[] pics={R.drawable.imagem1,R.drawable.imagem2,R.drawable.imagem3,R.drawable.imagem4};

        for(int i=0;i<30;i++) {
            int j=i;
            if(j>3){
                j=0;
            }
            Postagem p = new Postagem(user, post, pics[j], "18:45");
            this.postagem.add(p);
        }
    }
}