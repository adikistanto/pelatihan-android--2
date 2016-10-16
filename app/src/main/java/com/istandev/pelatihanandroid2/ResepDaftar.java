package com.istandev.pelatihanandroid2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.istandev.pelatihanandroid2.adapter.ResepAdapter;

import java.util.ArrayList;

public class ResepDaftar extends AppCompatActivity {

    public static String RESEP_ITEM = "resep_item";

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ResepAdapter adapter;
    private ArrayList<Resep> arrayList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_daftar);


        Resep resep1 = new Resep();
        resep1.setNama("asdadasd");

        Resep resep2 = new Resep();
        for(int m=1;m<=20;m++){
            Resep resep = new Resep();
            resep.setNama("Nama resep "+m);
            resep.setGambarUrl("Gambar"+m);
            resep.setLangkah1("Masukan bahan ke dalam panci "+m);
            resep.setLangkah2("Kukus bahan ke dalam panci "+m);
            arrayList.add(resep);
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new ResepAdapter(ResepDaftar.this, arrayList, new ResepAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Resep cairan) {

            }
        });
        recyclerView.setAdapter(adapter);
    }
}
