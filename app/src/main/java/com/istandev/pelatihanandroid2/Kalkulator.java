package com.istandev.pelatihanandroid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    private TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a0,kali,bagi,kurang,tambah,hasil,angka,hapus;
    private String bil1="",bil2="",tampil="",operan;
    private boolean isOperator,isResult,isBil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);
        a5 = (TextView) findViewById(R.id.a5);
        a6 = (TextView) findViewById(R.id.a6);
        a7 = (TextView) findViewById(R.id.a7);
        a8 = (TextView) findViewById(R.id.a8);
        a9 = (TextView) findViewById(R.id.a9);
        a0 = (TextView) findViewById(R.id.a0);
        bagi = (TextView) findViewById(R.id.bagi);
        kali = (TextView) findViewById(R.id.kali);
        kurang = (TextView) findViewById(R.id.kurang);
        tambah = (TextView) findViewById(R.id.tambah);
        hasil = (TextView) findViewById(R.id.hasil);
        angka = (TextView) findViewById(R.id.angka);
        hapus = (TextView) findViewById(R.id.hapus);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("1");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("2");
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("3");
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("4");
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("5");
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               inputAngka("6");
            }
        });

        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("7");
            }
        });

        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("8");
            }
        });

        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("9");
            }
        });

        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka("0");
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalikan();
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bagikan();
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahkan();
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               kurangkan();
            }
        });

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               hitung();
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hapus();
            }
        });
    }

    private void inputAngka(String a){
        if(isOperator){
            bil2 = bil2+a;
            tampil = tampil+a;
            angka.setText(tampil);
            isBil2=true;
        }else{
            bil1 = bil1+a;
            tampil = bil1;
            angka.setText(tampil);
            isBil2=false;
        }
        isResult=false;
    }

    private void kalikan(){
        if(!isOperator){
            if(isResult){
                tampil="";
                angka.setText(tampil);
            }else{
                if(isBil2){
                    Toast.makeText(Kalkulator.this,"Sorry, it is only 2 operand",Toast.LENGTH_SHORT).show();
                }else {
                    isOperator=true;
                    operan="kali";
                    tampil = tampil+"x";
                    angka.setText(tampil);
                }
            }

        }else{
            Toast.makeText(Kalkulator.this,"double operator",Toast.LENGTH_SHORT).show();
        }
    }

    private void bagikan(){
        if(!isOperator){
            if(isResult){
                tampil="";
                angka.setText("0");
            }else{
                isOperator=true;
                operan="bagi";
                tampil = tampil+"/";
                angka.setText(tampil);
            }

        }else{
            Toast.makeText(Kalkulator.this,"double operator",Toast.LENGTH_SHORT).show();
        }
    }

    private void tambahkan(){
        if(!isOperator){
            if(isResult){
                tampil="";
                angka.setText("0");
            }else{
                isOperator=true;
                operan="tambah";
                tampil = tampil+"+";
                angka.setText(tampil);
            }

        }else{
            Toast.makeText(Kalkulator.this,"double operator",Toast.LENGTH_SHORT).show();
        }
    }

    private void kurangkan(){
        if(!isOperator){
            if(isResult){
                tampil="";
                angka.setText("0");
            }else{
                if(!bil1.equals("")){
                    isOperator=true;
                    operan="kurang";
                    tampil = tampil+"-";
                    angka.setText(tampil);
                }
            }

        }else{
            Toast.makeText(Kalkulator.this,"double operator",Toast.LENGTH_SHORT).show();
        }
    }

    private void hitung(){
        if(isBil2){
            if(operan.equals("kali")){
                angka.setText(""+Integer.parseInt(bil1)*Integer.parseInt(bil2));
                bil1="";bil2="";
                isOperator=false;
                isResult=true;
                isBil2=false;
            }else if(operan.equals("bagi")){
                angka.setText(""+Double.valueOf(bil1)/Double.valueOf(bil2));
                bil1="";bil2="";
                isOperator=false;
                isResult=true;
                isBil2=false;
            }else if(operan.equals("tambah")){
                angka.setText(""+(Integer.parseInt(bil1)+Integer.parseInt(bil2)));
                bil1="";bil2="";
                isOperator=false;
                isResult=true;
                isBil2=false;
            }else if(operan.equals("kurang")){
                angka.setText(""+(Integer.parseInt(bil1)-Integer.parseInt(bil2)));
                bil1="";bil2="";
                isOperator=false;
                isResult=true;
                isBil2=false;
            }
        }
    }

    private void hapus(){
        bil1="";bil2="";
        tampil="";
        isResult=false;
        isBil2=false;
        isOperator=false;
        angka.setText("0");
    }
}
