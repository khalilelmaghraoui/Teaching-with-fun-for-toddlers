package com.example.myapplication;

import android.media.MediaPlayer;

public class ViewPagerItem {

    int imageID;
    String heading, description;
    int media;

    public ViewPagerItem(int imageID, String heading, String description) {
        this.imageID = imageID;
        this.heading = heading;
        this.description = description;
    }

    public ViewPagerItem(int imageID, String heading, String description, int media) {
        this.imageID = imageID;
        this.heading = heading;
        this.description = description;
        this.media = media;
    }
}
