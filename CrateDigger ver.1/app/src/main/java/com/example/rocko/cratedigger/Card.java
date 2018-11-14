package com.example.rocko.cratedigger;

public class Card {

    private String id;
    private String name;
    private String imageURL;
    private String audioURL;

    public Card(String id, String name, String imageURL, String audioURL){
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.audioURL = audioURL;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getImageURL(){
        return imageURL;
    }

    public String getAudioURL(){
        return audioURL;
    }

    public void setImageURL(String url){
        this.imageURL = url;
    }

    public void setAudioURL(String url){
        this.audioURL = url;
    }
}
