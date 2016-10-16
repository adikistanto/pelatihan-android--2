package com.istandev.pelatihanandroid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnResep = (Button) findViewById(R.id.resep);

        btnResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public void myprofil(View view){
        Intent intent = new Intent(Menu.this,MyProfile.class);
        startActivity(intent);
    }

    public void kalkulator(View view){
        startActivity(new Intent(this,Kalkulator.class));
    }

    public void project_final(View view){
        startActivity(new Intent(this,ResepMenu.class));
    }
}
