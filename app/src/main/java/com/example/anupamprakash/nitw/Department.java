package com.example.anupamprakash.nitw;

public class Department {
    private String name;
    private int thumbnail;

    public Department(){

    }
    public Department(String name,int thumbnail){
        this.name=name;
        this.thumbnail=thumbnail;
    }
    public String getName(){
        return name;
    }
    public int getThumbnail(){
        return thumbnail;
    }
    public void setThumbnail(int thumbnail){
        this.thumbnail=thumbnail;
    }
}
