package com.example.hardikdesaii.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by HardikDesaii on 16/01/17.
 */

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> implements View.OnClickListener
{
    private Context context;
    private ArrayList<Album> albumArrayList;

    AlbumsAdapter(Context context , ArrayList albumArrayList)
    {
        this.context=context;
        this.albumArrayList=albumArrayList;
    }
    @Override
    public AlbumsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardviewdemo, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final AlbumsAdapter.MyViewHolder holder, int position) {

        final Album album = albumArrayList.get(position);
        holder.name1.setText(String.valueOf(album.getName()));
        holder.count1.setText(String.valueOf(album.getNumOfSongs()));
        Glide.with(context).load(album.getThumbnail()).into(holder.thumbnail1);
        holder.address.setText(String.valueOf(album.getAddress()));
        holder.id.setText(String.valueOf(album.getId()));
        holder.thumbnail1.setTag(R.string.app_name, position);
        holder.thumbnail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,PhotoActivity.class);
                intent.putExtra("image",album.getThumbnail());
                context.startActivity(intent);
            }
        });
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,CardViewClick.class);
                intent.putExtra("name",String.valueOf(album.getName()));
                intent.putExtra("photo",String.valueOf(album.getThumbnail()));
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return albumArrayList.size();

    }

    @Override
    public void onClick(View v) {

    }

    static class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView name1, count1,address,id;
        public ImageView thumbnail1;
        public CardView cardview;
        public MyViewHolder(View itemView)
        {
            super(itemView);
            thumbnail1 = (ImageView) itemView.findViewById(R.id.thumbnail);
            name1 = (TextView) itemView.findViewById(R.id.name);
            count1 = (TextView) itemView.findViewById(R.id.nos);
            address=(TextView) itemView.findViewById(R.id.address);
            id=(TextView) itemView.findViewById(R.id.idalbum);
            cardview=(CardView)itemView.findViewById(R.id.card_view);
        }
    }
}
