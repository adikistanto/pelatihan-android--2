package com.istandev.pelatihanandroid2;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ADIK on 16/10/2016.
 */

public class Resep implements Parcelable {
    private String nama;
    private String gambarUrl;
    private String deskripsi;
    private String langkah1;
    private String langkah2;


    public Resep() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGambarUrl() {
        return gambarUrl;
    }

    public void setGambarUrl(String gambarUrl) {
        this.gambarUrl = gambarUrl;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLangkah1() {
        return langkah1;
    }

    public void setLangkah1(String langkah1) {
        this.langkah1 = langkah1;
    }

    public String getLangkah2() {
        return langkah2;
    }

    public void setLangkah2(String langkah2) {
        this.langkah2 = langkah2;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.gambarUrl);
        dest.writeString(this.deskripsi);
        dest.writeString(this.langkah1);
        dest.writeString(this.langkah2);
    }

    protected Resep(Parcel in) {
        this.nama = in.readString();
        this.gambarUrl = in.readString();
        this.deskripsi = in.readString();
        this.langkah1 = in.readString();
        this.langkah2 = in.readString();
    }

    public static final Parcelable.Creator<Resep> CREATOR = new Parcelable.Creator<Resep>() {
        @Override
        public Resep createFromParcel(Parcel source) {
            return new Resep(source);
        }

        @Override
        public Resep[] newArray(int size) {
            return new Resep[size];
        }
    };
}
