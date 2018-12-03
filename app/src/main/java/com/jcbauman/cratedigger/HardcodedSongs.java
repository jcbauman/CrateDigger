package com.jcbauman.cratedigger;

// HardcodedSongs.java is mainly for testing purposes

public class HardcodedSongs extends  DisplaySong
{
    public HardcodedSongs()
    {
        SpotifyAPIHelper spotifyAPIHelper = new SpotifyAPIHelper();

        SongObject songObject = new SongObject();
        songObject.setSongArtist("Curtis Mayfield");
        songObject.setSongName("Superfly");
        songObject.setSongImageURL("https://i.scdn.co/image/755a2683937d13f338c1aa09284db25ff50e9b70");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/4ab4720efd311ee87a1fafe4ed7f65605addd8cc?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Classic Soul");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("UMO");
        songObject.setSongName("Can't Keep Checking My Phone");
        songObject.setSongImageURL("https://i.scdn.co/image/879df86e1d1c7652be108979817c5ec60025cf07");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/9e9c97ac933fe93e2ebb145167944c9223872c71?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        this.addSongObject(songObject);

        //spotify TEST

        //spotifyAPIHelper.getATrack("4XsH9zBWPOCdXoH9ZDdS8r");

        //concludes spotify TEST

        songObject = new SongObject();
        songObject.setSongArtist("Eminem");
        songObject.setSongName("Without Me");
        songObject.setSongImageURL("https://i.scdn.co/image/d6aebc8455b303340e188c20fd4f562a2ab980e0");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/c2b67567f040b2c924aed143ba21748b7ce092f6?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Steve Watson");
        songObject.setSongName("Born to Boogie");
        songObject.setSongImageURL("https://i.scdn.co/image/a501f65666e035306dcbb1411ae855270f1acbd7");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/4819fcee8a3258b7a47d9d8d9eb328ddb7e89971?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Eagles");
        songObject.setSongName("Hotel California - Remastered");
        songObject.setSongImageURL("https://i.scdn.co/image/a5d370a3ea82efa63784521a1d7352db0a7a4d3a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/50e82c99c20ffa4223e82250605bbd8500cb3928?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soft Rock");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Kero Kero Bonito");
        songObject.setSongName("Flamingo");
        songObject.setSongImageURL("https://i.scdn.co/image/e585e5392654dbaf62816ee27967fe79806a90f0");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/78756214124181a08331355bf6bb7741901efbcf?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Pop");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Gorillaz");
        songObject.setSongName("On Melancholy Hill");
        songObject.setSongImageURL("https://i.scdn.co/image/3d11b22022312540d8f220996d8a565251c9672a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/cd7991e7076d0410677032dd9093a9cd712b69fd?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Toto");
        songObject.setSongName("Africa");
        songObject.setSongImageURL("https://i.scdn.co/image/f934fc64507ef928a246607f5a505f1bac9ea746");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/dd78dafe31bb98f230372c038a126b8808f9349b?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Classic Rock");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Passion Pit");
        songObject.setSongName("Sleepyhead");
        songObject.setSongImageURL("https://i.scdn.co/image/9f5bb223ebb80874e19048232d8c73a037913236");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/de7153eb71eb8a582ff05bd54e31e841be591961?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Electropop");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Lemaitre, Jennie A.");
        songObject.setSongName("Closer");
        songObject.setSongImageURL("https://i.scdn.co/image/549a7e885fef7318d190a934034da52cabe770c6");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/3ad4d6496855d5437711d8fccb9a579c766e56a3?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Post Malone");
        songObject.setSongName("I Fall Apart");
        songObject.setSongImageURL("https://i.scdn.co/image/642a2144f2355ff17a0e0b9bb60e5013bafb59d9");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/274c36d482aea7c27a982b372f420d3f9c87bed8?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Contemporary R&B");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Distrion, Electro-Light");
        songObject.setSongName("Rubik");
        songObject.setSongImageURL("https://i.scdn.co/image/ae90b4fac612e1719d186478ed264fc46ea44a87");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/4e96e8fe958feb681751d992fba94579af931a63?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Marshmello");
        songObject.setSongName("Moving On");
        songObject.setSongImageURL("https://i.scdn.co/image/d6903dd1212f6e10dd9e086a65695df2239c2cb2");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/6753c3f099f3ec08bdcac335dc39a43d28777f0c?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        this.addSongObject(songObject);


        songObject = new SongObject();
        songObject.setSongArtist("Los Tigres Del Norte");
        songObject.setSongName("La Puerta Negra");
        songObject.setSongImageURL("https://i.scdn.co/image/f5a9cd99c679548a536b2cbefb01ce4304449e28");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/027604879d11030754ac078acd2874a728d80900?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Regional Mexican");
        this.addSongObject(songObject);


    }
}