package com.olaplaystudio.databases;

/**
 * Created by anujkumar on 17/12/17.
 */

public class SongsDTO {

    String songTitle;
    String artistsName;
    String songUrl;
    String songCoverImageUrl;

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtistsName() {
        return artistsName;
    }

    public void setArtistsName(String artistsName) {
        this.artistsName = artistsName;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public String getSongCoverImageUrl() {
        return songCoverImageUrl;
    }

    public void setSongCoverImageUrl(String songCoverImageUrl) {
        this.songCoverImageUrl = songCoverImageUrl;
    }
}
