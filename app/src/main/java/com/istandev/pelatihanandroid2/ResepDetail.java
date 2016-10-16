package com.istandev.pelatihanandroid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ResepDetail extends AppCompatActivity {

    private Resep resep = new Resep();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_detail);

        ImageView gambar = (ImageView) findViewById(R.id.gambar_resep);
        TextView nama = (TextView) findViewById(R.id.nama_resep);
        TextView persiapan = (TextView) findViewById(R.id.persiapan);
        TextView langkah1 = (TextView) findViewById(R.id.langkah1);
        TextView langkah2 = (TextView) findViewById(R.id.langkah2);
        TextView langkah3 = (TextView) findViewById(R.id.langkah3);
        TextView langkah4 = (TextView) findViewById(R.id.langkah4);
        TextView langkah5 = (TextView) findViewById(R.id.langkah5);

        resep = getIntent().getParcelableExtra(ResepDaftar.RESEP_ITEM);

        nama.setText(resep.getNama());
        persiapan.setText(resep.getPersiapan());
        langkah1.setText(resep.getLangkah1());
        langkah2.setText(resep.getLangkah2());
        langkah3.setText(resep.getLangkah3());
        langkah4.setText(resep.getLangkah4());
        langkah5.setText(resep.getLangkah5());
        Picasso.with(this).load(R.mipmap.ic_launcher).into(gambar);

    }
}
