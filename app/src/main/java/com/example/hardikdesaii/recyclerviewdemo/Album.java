package com.example.hardikdesaii.recyclerviewdemo;

/**
 * Created by HardikDesaii on 16/01/17.
 */

public class Album {
    private String name;
    private int numOfSongs; // camel case
    private int thumbnail;
    private int address;
    private String id;
    public Album(String name, int numOfSongs, int thumbnail, int address,String id)
    {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
        this.address = address;
        this.id=id;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public String getId()
    {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

}
