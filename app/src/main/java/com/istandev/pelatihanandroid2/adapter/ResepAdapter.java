package com.istandev.pelatihanandroid2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.istandev.pelatihanandroid2.R;
import com.istandev.pelatihanandroid2.Resep;

import java.util.ArrayList;

/**
 * Created by ADIK on 16/10/2016.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.MyViewHolder> {
    public interface OnItemClickListener {
        void onItemClick(Resep cairan);
    }

    private ArrayList<Resep> arrayList;
    private  OnItemClickListener listener;
    Context context;

    public ResepAdapter() {
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nama;
        private ImageView gambar;
        private LinearLayout item1;

        public MyViewHolder(View view) {
            super(view);
            nama = (TextView) view.findViewById(R.id.nama_resep);
            gambar = (ImageView) view.findViewById(R.id.gambar_resep);
            item1 = (LinearLayout) view.findViewById(R.id.item_resep);

        }

        public void bind(final Resep item, final OnItemClickListener listener) {
            item1.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }

        @Override
        public void onClick(View v) {
        }
    }


    public ResepAdapter(Context context,ArrayList<Resep> arrayList,OnItemClickListener listener) {
        this.context = context;
        this.arrayList = arrayList;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_resep, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.bind(arrayList.get(position), listener);
        final Resep data = arrayList.get(position);
        holder.nama.setText(data.getNama());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
