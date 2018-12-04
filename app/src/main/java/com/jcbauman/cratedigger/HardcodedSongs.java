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
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/4XsH9zBWPOCdXoH9ZDdS8r?si=YF82o6oKQ6meCWzW5CKlAQ");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Unknown Mortal Orchestra");
        songObject.setSongName("Can't Keep Checking My Phone");
        songObject.setSongImageURL("https://i.scdn.co/image/879df86e1d1c7652be108979817c5ec60025cf07");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/9e9c97ac933fe93e2ebb145167944c9223872c71?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/0x38UMMhYacciPRK7ETk1M?si=UamhrujoS3WWArBEm1efJw");
        this.addSongObject(songObject);

        //spotify TEST

        //spotifyAPIHelper.getATrack("4XsH9zBWPOCdXoH9ZDdS8r");

        //concludes spotify TEST

        songObject = new SongObject();
        songObject.setSongArtist("Marvin Gaye");
        songObject.setSongName("Let's Get It On");
        songObject.setSongImageURL("https://i.scdn.co/image/9ce1da27292e8ae2d1b4486e336e4adbc2affc3a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/68f7099bfd9995d4f2d611d5fc1f16cb6d8bfa83?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/0jHkgTtTaqg5LNCiYDQPUB?si=1u1U4zl0QmeApMdD0hKrzA");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Eminem");
        songObject.setSongName("Without Me");
        songObject.setSongImageURL("https://i.scdn.co/image/d6aebc8455b303340e188c20fd4f562a2ab980e0");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/c2b67567f040b2c924aed143ba21748b7ce092f6?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7lQ8MOhq6IN2w8EYcFNSUk?si=-hUISFxSTTmiGpL9HPHChQ");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Steve Watson");
        songObject.setSongName("Born to Boogie");
        songObject.setSongImageURL("https://i.scdn.co/image/a501f65666e035306dcbb1411ae855270f1acbd7");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/4819fcee8a3258b7a47d9d8d9eb328ddb7e89971?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/0ufRuWwD0Zi4ILZcd8VBOe?si=l6DxQWcsSZO3KESUOGJ_yQ");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Eagles");
        songObject.setSongName("Hotel California - Remastered");
        songObject.setSongImageURL("https://i.scdn.co/image/a5d370a3ea82efa63784521a1d7352db0a7a4d3a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/50e82c99c20ffa4223e82250605bbd8500cb3928?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/40riOy7x9W7GXjyGp4pjAv?si=lxl9uvrRRjmAhIqeTTQTmQ");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Kero Kero Bonito");
        songObject.setSongName("Flamingo");
        songObject.setSongImageURL("https://i.scdn.co/image/e585e5392654dbaf62816ee27967fe79806a90f0");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/78756214124181a08331355bf6bb7741901efbcf?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3AaiEsiqHO2ylnnOdWninE?si=xC7vfKNBRNmpuyvWfxTYcg");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Gorillaz");
        songObject.setSongName("On Melancholy Hill");
        songObject.setSongImageURL("https://i.scdn.co/image/3d11b22022312540d8f220996d8a565251c9672a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/cd7991e7076d0410677032dd9093a9cd712b69fd?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/0q6LuUqGLUiCPP1cbdwFs3?si=eBqo_zRNTDWWhvRTYVIa1Q");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Toto");
        songObject.setSongName("Africa");
        songObject.setSongImageURL("https://i.scdn.co/image/f934fc64507ef928a246607f5a505f1bac9ea746");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/dd78dafe31bb98f230372c038a126b8808f9349b?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/2374M0fQpWi3dLnB54qaLX?si=wHeOebd1Tsa-ie8YM96U0Q");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Passion Pit");
        songObject.setSongName("Sleepyhead");
        songObject.setSongImageURL("https://i.scdn.co/image/9f5bb223ebb80874e19048232d8c73a037913236");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/de7153eb71eb8a582ff05bd54e31e841be591961?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/4prEPl61C8qZpeo3IkYSMl?si=oVl-QrMLTuya7h1KYrTm7A");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Lemaitre, Jennie A.");
        songObject.setSongName("Closer");
        songObject.setSongImageURL("https://i.scdn.co/image/549a7e885fef7318d190a934034da52cabe770c6");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/3ad4d6496855d5437711d8fccb9a579c766e56a3?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3h5IIiL9vK5aR0DZO6jD7D?si=7jV232J_SVGBJY5FokiMsg");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Post Malone");
        songObject.setSongName("I Fall Apart");
        songObject.setSongImageURL("https://i.scdn.co/image/642a2144f2355ff17a0e0b9bb60e5013bafb59d9");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/274c36d482aea7c27a982b372f420d3f9c87bed8?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/75ZvA4QfFiZvzhj2xkaWAh?si=v3tfmL1kSR6OVmdD0fvHGA");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Distrion, Electro-Light");
        songObject.setSongName("Rubik");
        songObject.setSongImageURL("https://i.scdn.co/image/ae90b4fac612e1719d186478ed264fc46ea44a87");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/4e96e8fe958feb681751d992fba94579af931a63?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/0kU03fMOPlBqyRqwrGldli?si=AVw2P_nlQ4GDWh3IrU61dA");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Marshmello");
        songObject.setSongName("Moving On");
        songObject.setSongImageURL("https://i.scdn.co/image/d6903dd1212f6e10dd9e086a65695df2239c2cb2");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/6753c3f099f3ec08bdcac335dc39a43d28777f0c?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/6Ehy8wRUYjAZcMMRCxMZVM?si=jaF2FmqqTtCwTCGPgD9fNg");
        this.addSongObject(songObject);


        songObject = new SongObject();
        songObject.setSongArtist("Los Tigres Del Norte");
        songObject.setSongName("La Puerta Negra");
        songObject.setSongImageURL("https://i.scdn.co/image/f5a9cd99c679548a536b2cbefb01ce4304449e28");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/027604879d11030754ac078acd2874a728d80900?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("World");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/19Tx1GJy2JGJP43yjZUK6u?si=wAsFZwaSTG2xTxg_Qq2CMw");
        this.addSongObject(songObject);

//        -------------------------------------------

        songObject = new SongObject();
        songObject.setSongArtist("The Temptations");
        songObject.setSongName("My Girl");
        songObject.setSongImageURL("https://i.scdn.co/image/9b671409f85549101a56deca982a483b15facad2");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/3ce5f09bdafecac6f06edc080f3c2fe93dd4f74b?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/album/7C4vMPQR8KcbZv4e2ZI0lc");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Ben E. King");
        songObject.setSongName("Stand By Me");
        songObject.setSongImageURL("https://i.scdn.co/image/135bb198dad5c469f1864544b7b9657b9e97bad2");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/cdc0401bbc4a03b855d9dd820fdf680917865dba?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3SdTKo2uVsxFblQjpScoHy");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Estelle ft. Kanye West");
        songObject.setSongName("American Boy");
        songObject.setSongImageURL("https://i.scdn.co/image/e9913add8029c7e55fc18806b99309f0c5a53b15");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/c5ee61bf5c6c01d923aec35b6f52df76ac651bfb?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/22UDw8rSfLbUsaAGTXQ4Z8");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Stevie Wonder");
        songObject.setSongName("Superstition");
        songObject.setSongImageURL("https://i.scdn.co/image/71d0049b26d4cb214517a6c2aa6e6540a8b43d03");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/21f8efb060ceaa7bb03a12ef89d74bad6c72720f?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/4dwrL3Z5U2RZ6MZiKE2PgL");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Queen");
        songObject.setSongName("Bohemian Rhapsody - Remastered 2011");
        songObject.setSongImageURL("https://i.scdn.co/image/f4111b2cd4d2459cfdf9aad9010d74c97b7e3a68");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/d5bc71c0bdc98b547a39aeba9538a7c6d33fc342?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7tFiyTwD0nx5a1eklYtX2J");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Queen");
        songObject.setSongName("We Are The Champions - Remastered 2011");
        songObject.setSongImageURL("https://i.scdn.co/image/a491839ba2cecedb308ec5fbdeb93f7c69e7d4b2");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/17759318de956b71473df83106f2198bce89c6c3?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7ccI9cStQbQdystvc6TvxD");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Lynyrd Skynyrd");
        songObject.setSongName("Sweet Home Alabama");
        songObject.setSongImageURL("https://i.scdn.co/image/f9c789390ef79dba64e3bb68abc76c0018806bc8");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/56c87d16c2f7514de3887a75e1084849b4f33198?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7e89621JPkKaeDSTQ3avtg");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("AC/DC");
        songObject.setSongName("Back In Black");
        songObject.setSongImageURL("https://i.scdn.co/image/b7b31914e0c4951249fad37271248212c8ac3025");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/506bc9a0485990973449b0467791e06174371284?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/08mG3Y1vljYA6bvDt4Wqkj");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("The White Stripes");
        songObject.setSongName("Seven Nation Army");
        songObject.setSongImageURL("https://i.scdn.co/image/a5875d60a916adf24c223b4b4195c2e6ba7b83b0");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/d5c742f7e2d651d8f34761e045cfbcdb76f6b077?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7i6r9KotUPQg3ozKKgEPIN");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Smash Mouth");
        songObject.setSongName("All Star");
        songObject.setSongImageURL("https://i.scdn.co/image/da954f7ead3803db2d95ea07bdd42d7ea3acf5f7");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/baf18743c412db2c1fcff31fac079c1c982637d2?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3cfOd4CMv2snFaKAnMdnvK");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("AC/DC");
        songObject.setSongName("Highway to Hell");
        songObject.setSongImageURL("https://i.scdn.co/image/d07f49e9e0900414d625d855b8341d5f351743c5");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/aa4f9186e0c3f4436bb40572a63862db80d7ef2d?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/2zYzyRzz6pRmhPzyfMEC8s");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Foster The People");
        songObject.setSongName("Pumped Up Kicks");
        songObject.setSongImageURL("https://i.scdn.co/image/c3f13b4f7a674abda9aa36fd72fa341e918c0f26");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/db83e69f4ef8a49f5b77e367f7031cc3bcc41b1a?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7w87IxuO7BDcJ3YUqCyMTT");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Phoenix");
        songObject.setSongName("1901");
        songObject.setSongImageURL("https://i.scdn.co/image/554ac4de36701c9d9d1b0f75f2624f12e7086b72");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/67fcb35dfbcf3d5d85d5eb0254963513f2e93666?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5JtPGzRgrWxkXX9LoROq3d");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Dillon Francis, Kygo, James Hersey");
        songObject.setSongName("Coming Over");
        songObject.setSongImageURL("https://i.scdn.co/image/795ce52a64136e593cd962ca95ca188d770aab2c");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/db5156de3b28e368070ce02f2933db98f9b0d635?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/6m3ZWIXhjoV76syT1j2oE9");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("DJ Snake, Justin Bieber");
        songObject.setSongName("Let Me Love You");
        songObject.setSongImageURL("https://i.scdn.co/image/ce0906f04ff38fd21a7ad96a752862dc849f960a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/86f2c7ebe49bf7da094b7f1e418dd3b12e2051c1?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/0lYBSQXN6rCTvUZvg9S0lU");
        this.addSongObject(songObject);

//        songObject = new SongObject();
//        songObject.setSongArtist("");
//        songObject.setSongName("");
//        songObject.setSongImageURL("");
//        songObject.setSongPreviewURL("");
//        songObject.setSongGenre("");
//        songObject.setSongSpotifyLink("");
//        this.addSongObject(songObject);



    }
}
