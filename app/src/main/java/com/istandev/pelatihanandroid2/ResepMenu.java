package com.istandev.pelatihanandroid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class ResepMenu extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_menu);

        FrameLayout padangFL = (FrameLayout) findViewById(R.id.masakan_padang);
        FrameLayout jawaFL = (FrameLayout) findViewById(R.id.masakan_jawa);
        FrameLayout sundaFL = (FrameLayout) findViewById(R.id.masakan_sunda);
        FrameLayout batakFL = (FrameLayout) findViewById(R.id.masakan_batak);

        padangFL.setOnClickListener(this);
        jawaFL.setOnClickListener(this);

        padangFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResepMenu.this,ResepDaftar.class));
            }
        });

        jawaFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(ResepMenu.this,ResepDaftar.class));
                Toast.makeText(ResepMenu.this,"Belum diimplementasikan",Toast.LENGTH_SHORT).show();
            }
        });

        sundaFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(ResepMenu.this,ResepDaftar.class));
                Toast.makeText(ResepMenu.this,"Belum diimplementasikan",Toast.LENGTH_SHORT).show();
            }
        });

        batakFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(ResepMenu.this,ResepDaftar.class));
                Toast.makeText(ResepMenu.this,"Belum diimplementasikan",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.masakan_padang:
                startActivity(new Intent(ResepMenu.this,ResepDaftar.class));
                break;
            case R.id.masakan_batak:
                Toast.makeText(ResepMenu.this,"Belum diimplementasikan",Toast.LENGTH_SHORT).show();
                break;
            case R.id.masakan_jawa:
                Toast.makeText(ResepMenu.this,"Belum diimplementasikan",Toast.LENGTH_SHORT).show();
                break;
            case R.id.masakan_sunda:
                Toast.makeText(ResepMenu.this,"Belum diimplementasikan",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
