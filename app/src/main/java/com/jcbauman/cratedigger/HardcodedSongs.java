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

        songObject = new SongObject();
        songObject.setSongArtist("San Holo");
        songObject.setSongName("Light");
        songObject.setSongImageURL("https://i.scdn.co/image/83dfeeb23116e671bcbe9c1dd2c39bcf71db555a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/5f7ee64a3b07b9523505439dcb3c588381ab1224?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/6jq6rcOikCZAmjliAgAmfT");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Daft Punk");
        songObject.setSongName("Harder Better Faster Stronger");
        songObject.setSongImageURL("https://i.scdn.co/image/f04bb6fba32e89475d9981007aff21e13745dec2");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/92a04c7c0e96bf93a1b1b1cae7dfff1921969a7b?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Dance/Electronic");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5W3cjX2J3tjhG8zb6u0qHn");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Eminem");
        songObject.setSongName("Killshot");
        songObject.setSongImageURL("https://i.scdn.co/image/472a45210543a502405bf4f357005e7a182906d7");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/5522afbe8a7c52b5f99e6eb6a47d7bdee3fb8b1d?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/1jo3TwNGCXfNdB5uba3ZVv");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Logic, Alessia Cara, Khalid");
        songObject.setSongName("1-800-273-8255");
        songObject.setSongImageURL("https://i.scdn.co/image/3df14cbaac20470a0b8523420eeae52e6849960f");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/db9d48e8b5cae63aebb19b2e45c6aca050e06026?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5tz69p7tJuGPeMGwNTxYuV");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Drake");
        songObject.setSongName("God's Plan");
        songObject.setSongImageURL("https://i.scdn.co/image/239ec906572231368d8ebd72614094bd3bd10b33");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/31210c42323914bd3ef87df4d817a1a184cc7ae0?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/6DCZcSspjsKoFjzjrWoCdn");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Drake");
        songObject.setSongName("I'm Upset");
        songObject.setSongImageURL("https://i.scdn.co/image/239ec906572231368d8ebd72614094bd3bd10b33");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/41f82c2b12eb88223deac93aebfb81903e0b8c27?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3qN5qMTKyEEmiTZD38BNTT");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Eminem");
        songObject.setSongName("Fall");
        songObject.setSongImageURL("https://i.scdn.co/image/706834f25e3b96ddc4643277e11333f0a8ca16c0");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/2b38ecc7b3f2674e431599190b02ce6aa9796ea2?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/58QhkbaAkLFnn7JwAnAato");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("50 Cent");
        songObject.setSongName("In Da Club");
        songObject.setSongImageURL("https://i.scdn.co/image/58a07596d44402f7f40d32589fe99fc5d1f95f4d");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/54633fb1c75af27495e491a0889ddf02ec3ad25e?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/4RY96Asd9IefaL3X4LOLZ8");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Fetty Wap");
        songObject.setSongName("Trap Queen");
        songObject.setSongImageURL("https://i.scdn.co/image/5aa0bd2874ec6ae0885adc84bb02d5ffce6f8cc2");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/62bf932cdc4d351174128d974397f5093de4f994?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/2d8JP84HNLKhmd6IYOoupQ");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("The Weeknd, Daft Punk");
        songObject.setSongName("Starboy");
        songObject.setSongImageURL("https://i.scdn.co/image/387c963be76db261c25a1811546ac802ebc8f67c");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/e01d459eacfbf519a77a94dcbc3398b40c7ee601?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7MXVkk9YMctZqd1Srtv4MB");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Rihanna, JAY Z");
        songObject.setSongName("Umbrella");
        songObject.setSongImageURL("https://i.scdn.co/image/bce0e821755b24afe7cece9e8d73620df7274dcf");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/d2f6c09abf795c6842cab7e60310cd7cd10898c5?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/49FYlytm3dAAraYgpoJZux");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Th Weeknd");
        songObject.setSongName("Can't Feel My Face");
        songObject.setSongImageURL("https://i.scdn.co/image/32d91abbb59d3b1e6a6bf354a33d8830a3a3530f");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/7ad50d9f822e855476b90de215e6370175065f8b?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/22VdIZQfgXJea34mQxlt81");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Bob Marley");
        songObject.setSongName("Is This Love");
        songObject.setSongImageURL("https://i.scdn.co/image/4914dae56a9f22a53f502aad76f9f78ca0f0725d");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/de79d8d6a6f969a51ba330d683a4c78c89dda0c7?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/6eokVph5Yty6I3NnleHgmm");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Bob Marley");
        songObject.setSongName("No Woman, No Cry - Live At The Lyceum, London/1975");
        songObject.setSongImageURL("https://i.scdn.co/image/eba1539763378eb7755f997c57d725d4ff613cb3");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/5daf0d5338f61443311eea0cd664e60611035904?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/423hwXFgoN8RYmqLoLuVvY");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Fela Kuti ft. Ginger Baker");
        songObject.setSongName("Black Man's Cry");
        songObject.setSongImageURL("https://i.scdn.co/image/e4ab4a0633e6e0400e316438ae9b65e560773229");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/f0a419fa0c3cb369a782fd0dd0876bbbb566b3b6?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("World");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5iLp7H9jMIj00DJs1G4mbn");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Earth, Wind & Fire");
        songObject.setSongName("September");
        songObject.setSongImageURL("https://i.scdn.co/image/c6e16cafc38a72eaf953b4b828c1faa114190a43");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/5fce831e28eb2ae69f1c44e340c2368c228e0764?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Soul/Funk/R&B");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5nNmj1cLH3r4aA4XDJ2bgY");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Milt Jackson");
        songObject.setSongName("Bags' Groove");
        songObject.setSongImageURL("https://i.scdn.co/image/71624044d3ad28ab259fc4ca9f6c8562a326b66f");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/fad9d6ded7778f98a3e44328e32b6f59945fdda7?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/1FGP7KqNANyPi10M3PkFtY");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Milt Jackson");
        songObject.setSongName("Olinga");
        songObject.setSongImageURL("https://i.scdn.co/image/1ee578e712253e2792daf2a9c15b8dd11aaca99a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/85092a4cfa81f1729f0d03838e816349d3309744?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/4q5wg6MFFg96ud5SDxaqvQ");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Ella Fitzgerald, Louis Armstrong");
        songObject.setSongName("Dream A Little Dream Of Me");
        songObject.setSongImageURL("https://i.scdn.co/image/0901c84ce6da1a8581046f3ef17e1588268f1787");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/26e3017404ccf9d5c8151da3f2b9fea3c14eb57c?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5MjAGtm2ihbBK9G30ZN3Ju");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Ella Fitzgerald, Louis Armstrong");
        songObject.setSongName("Cheek To Cheek");
        songObject.setSongImageURL("https://i.scdn.co/image/2e77ba0e800dfc3c8ca88d8c36cf1721c6bc51cf");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/f011fbe55514c8a9dfc117ebea3c855db23316a0?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/1gcuhZPKmTYvn5VT5EZLR6");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("The Dave Brubeck Quartet");
        songObject.setSongName("Take Five");
        songObject.setSongImageURL("https://i.scdn.co/image/c802f3432473acd809760da577996ae2890c75aa");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/e07188169190e5892b6425d0ddae3673d375427d?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/1YQWosTIljIvxAgHWTp7KP");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("The Dave Brubeck Quartet");
        songObject.setSongName("Unsquare Dance");
        songObject.setSongImageURL("https://i.scdn.co/image/0311e2e5aef38a6bcdaca3dd7f333e4621ed88f7");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/481e53155c281482f1fef1845f2a83d0ab35cab1?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/2VUo8O3ymKRYNgj97ZG2kM");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Thelonious Monk");
        songObject.setSongName("`Round Midnight");
        songObject.setSongImageURL("https://i.scdn.co/image/92d42a424902c4eabc5ea51b6830a51e7ef58e37");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/30c12035b17aac0e8076eae7fb054acd7cad8d16?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/1wl5b2lw3YagQtZiYZbQWP");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Miles Davis");
        songObject.setSongName("So What");
        songObject.setSongImageURL("https://i.scdn.co/image/01f81fbd70d1cef051806e892e6db4e49224697b");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/e692f71aa410f2dd6dc50e59e7f75e31d925aca5?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/4vLYewWIvqHfKtJDk8c8tq");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Oscar Peterson, Connie Kay, Herb Ellis, Ray Brown");
        songObject.setSongName("My Funny Valentine - Mono Version");
        songObject.setSongImageURL("https://i.scdn.co/image/fbd2b0f475c5cfd65359b3ab2137aabc0b5eecab");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/3e922bd25314009422455318578cd1559797a01f?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3FZZhKwXDcqUZN4gulL1je");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Billie Holiday");
        songObject.setSongName("Strange Fruit");
        songObject.setSongImageURL("https://i.scdn.co/image/1a4cffadbe2d36b9597fa97555358ff5afd6b7ec");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/d69e122b02ba67e20ab6d8a329f096c83805e2b4?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Jazz");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/6W5706MsehAWMAZLIg9Fu2");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Cage The Elephant");
        songObject.setSongName("Trouble");
        songObject.setSongImageURL("https://i.scdn.co/image/a13016817c0496ee44a48adc80b5c345e8c8925e");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/809d189e8d99db8200488185750355465d6b64a5?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5n0CTysih20NYdT2S0Wpe8");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Capital Cities");
        songObject.setSongName("Safe And Sound");
        songObject.setSongImageURL("https://i.scdn.co/image/5b5b97a268f39426c8bf1ada36606e6fcbb317eb");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/896ae94d6d36e855c3692a18e066840133bed843?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/6Z8R6UsFuGXGtiIxiD8ISb");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("The Temper Trap");
        songObject.setSongName("Sweet Disposition");
        songObject.setSongImageURL("https://i.scdn.co/image/09c93c23196c9e57fef5cadb87241857f300983e");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/385f0135b7ba06c3ac3bdbadd15eb9b02c5ecdf0?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5RoIXwyTCdyUjpMMkk4uPd");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Jaymes Young");
        songObject.setSongName("I'll Be Good");
        songObject.setSongImageURL("https://i.scdn.co/image/558c0cc588bd76d349ef10f2142e26a44354c4bf");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/0c94dde2f13273e3ed1eec72cb184537d0ae77d2?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5WLSak7DN3LY1K71oWYuoN");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Fitz and The Tantrums");
        songObject.setSongName("Out Of My League");
        songObject.setSongImageURL("https://i.scdn.co/image/bf7b464032c397f498f897d8f89b663218b21f1d");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/454dfd2b54dad6440f49d6aa43557849f2480bd0?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Alternative/Indie");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5qEn8c0MBzyRKgQq91Vevi");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("John Denver");
        songObject.setSongName("Take Me Home, Country Roads - Rerecorded");
        songObject.setSongImageURL("https://i.scdn.co/image/37008443bd35f72ff56bb1c67ba4174c12c60837");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/ec43998cba1a71480be11c069a68197db2c75928?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/2xYlyywNgefLCRDG8hlxZq");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Twenty One Pilots");
        songObject.setSongName("Car Radio");
        songObject.setSongImageURL("https://i.scdn.co/image/720e15f97da5c03662d2e5f31d4dbc7e14aa4cf1");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/ea3ed2e51bccacc2791af5686520e8f9abf0ef65?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/5cbpoIu3YjoOwbBDGUEp3P");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Post Malone, Swae Lee");
        songObject.setSongName("Sunflower - Spider-Man: Into the Spider-Verse");
        songObject.setSongImageURL("https://i.scdn.co/image/c30bfc4adfa8924e87f3dff571d0d8c6f032fa0a");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/54c64f2c5c0dbb094226e7a3d1617195ed0aa448?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Hip-Hop/Rap");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/1A6OTy97kk0mMdm78rHsm8");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("gnash, Olivia O'Brien");
        songObject.setSongName("i hate u, i love u (feat. olivia o'brien)");
        songObject.setSongImageURL("https://i.scdn.co/image/cf2c83d30a116cc09e795dcab484f4d663846ba0");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/915f200cd1d5ed99ca02c1d290d7729df84b7580?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7vRriwrloYVaoAe3a9wJHe");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Parov Stelar");
        songObject.setSongName("Booty Swing");
        songObject.setSongImageURL("https://i.scdn.co/image/db890f9df1b55bc76070c25eed0dbb5b1670733c");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/a3f32fd933fb3e7764694446bbedf669c328d5ca?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3sMleqdCDalZ6xsAQe8xuY");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Tristam, Braken");
        songObject.setSongName("Flight");
        songObject.setSongImageURL("https://i.scdn.co/image/af96aa0adcd2b459b5625bd364c942a323976ac4");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/84ce7f7aaea7c2117c6c29c261a5bb58bea61e4e?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/66WcaWVGRFmpx0euxmw9yM");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Pegboard Nerds");
        songObject.setSongName("Hero (feat. Elizaveta)");
        songObject.setSongImageURL("https://i.scdn.co/image/b82a46c72612d81e5af283ece5bd6ee2ba6613b5");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/de4ccd70f27d95f15a98ffc7d5dbe74aec096dd1?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/1mPPo1eG1joz3HX0Ecw9LL");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Caravan Palace");
        songObject.setSongName("Lone Digger");
        songObject.setSongImageURL("https://i.scdn.co/image/c9b9052483cf7cf196a2c13889b6b0dc8451a125");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/c7cb1fe3466ffddaafb567498ab1daa1adbf020f?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Other");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/0thLhIqWsqqycEqFONOyhu");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Fela Kuti");
        songObject.setSongName("Water No Get Enemy");
        songObject.setSongImageURL("https://i.scdn.co/image/3794821e7020fea2a09502c095f44827e5987816");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/bb2efddd59d5827e7aefe5afc7cac73fbb0d545b?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("World");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/35TrgfOPoBpHp2XF3EHN1J");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Edward Sharpe & The Magnetic Zeros");
        songObject.setSongName("Home");
        songObject.setSongImageURL("https://i.scdn.co/image/87fd1b33f3208d7d3a3bbfb3d4f22ab089dc0d4e");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/8e1ff07117c78984d221597a80148e80eae6e146?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("World");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/7w5cxTEzp1rfV3KCy0Bd5N");
        this.addSongObject(songObject);

        songObject = new SongObject();
        songObject.setSongArtist("Twenty One Pilots");
        songObject.setSongName("Stressed Out");
        songObject.setSongImageURL("https://i.scdn.co/image/cd5eb6933cca9421578e3badfed816f046f3a86e");
        songObject.setSongPreviewURL("https://p.scdn.co/mp3-preview/0e0951b811f06fea9162eb7e95e4bae4802d97af?cid=774b29d4f13844c495f206cafdad9c86");
        songObject.setSongGenre("Rock");
        songObject.setSongSpotifyLink("https://open.spotify.com/track/3CRDbSIZ4r5MsZ0YwxuEkn");
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
