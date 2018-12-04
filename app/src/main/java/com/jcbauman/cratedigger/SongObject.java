package com.jcbauman.cratedigger;

public class SongObject {
    private int songId;
    private String songURI;
    private String songName;
    private String songArtist;
    private String songImageURL;
    private String songPreviewURL;
    private String songSpotifyLink;
    private String songGenre;
    private int songLiked;

    //Constructors

    public SongObject() {

    }

    public SongObject(int songId, String songURI, String songName, String songArtist,
                      String songImageURL, String songPreviewURL, String songSpotifyLink,
                      String songGenre, int songLiked) {
        this.songId = songId;
        this.songURI = songURI;
        this.songName = songName;
        this.songArtist = songArtist;
        this.songImageURL = songImageURL;
        this.songPreviewURL = songPreviewURL;
        this.songSpotifyLink = songSpotifyLink;
        this.songGenre = songGenre;
        this.songLiked = songLiked;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongURI() {
        return songURI;
    }

    public void setSongURI(String songURI) {
        this.songURI = songURI;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public String getSongGenre() {
        return this.songGenre;
    }

    public void setSongGenre(String genre) {
        this.songGenre = genre;
    }

    public String getSongImageURL() {
        return songImageURL;
    }

    public void setSongImageURL(String songImageURL) {
        this.songImageURL = songImageURL;
    }

    public String getSongPreviewURL() {
        return songPreviewURL;
    }

    public void setSongPreviewURL(String songPreviewURL) {
        this.songPreviewURL = songPreviewURL;
    }

    public String getSongSpotifyLink() {
        return songSpotifyLink;
    }

    public void setSongSpotifyLink(String songSpotifyLink) {
        this.songSpotifyLink = songSpotifyLink;
    }

    public void setSongLiked(int songLiked) {
        this.songLiked = songLiked;
    }

    public int getSongLiked() {
        return this.songLiked;
    }
}
