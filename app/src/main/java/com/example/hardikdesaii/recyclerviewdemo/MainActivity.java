package com.example.hardikdesaii.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        ArrayList<Album> dataList=getValues();
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);

        AlbumsAdapter adapter = new AlbumsAdapter(MainActivity.this,dataList);

        recyclerView.setAdapter(adapter);

    }

    public ArrayList<Album> getValues() {
        ArrayList<Album> values=new ArrayList<>();
        values.add(new Album("Hardik", 10, R.mipmap.ic_launcher, R.string.add_1,"1"));
        values.add(new Album("rhutwa", 11, R.mipmap.ic_launcher, R.string.add_2,"2"));
        values.add(new Album("chintan", 12, R.mipmap.ic_launcher, R.string.add_3,"3"));
        values.add(new Album("yash", 05, R.mipmap.ic_launcher, R.string.add_4,"4"));
        values.add(new Album("pooja", 19, R.mipmap.ic_launcher, R.string.add_5,"5"));
        values.add(new Album("heli", 16, R.mipmap.ic_launcher, R.string.add_6,"6"));
        values.add(new Album("komal", 14, R.mipmap.ic_launcher, R.string.add_1,"7"));
        values.add(new Album("amit", 12, R.mipmap.ic_launcher, R.string.add_2,"8"));
        values.add(new Album("ashish", 11, R.mipmap.ic_launcher, R.string.add_3,"9"));
        values.add(new Album("kinjal", 13, R.mipmap.ic_launcher, R.string.add_4,"10"));
        return values;
    }
}
