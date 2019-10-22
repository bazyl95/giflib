package com.millenial.giflib.model;

import java.time.LocalDate;

public class Gif {
    private String mName;
    private LocalDate mDateUploaded;
    private String mUsername;
    private boolean mFavorite;

    public Gif(String mName, LocalDate mDateUploaded, String mUsername, boolean mFavorite) {
        this.mName = mName;
        this.mDateUploaded = mDateUploaded;
        this.mUsername = mUsername;
        this.mFavorite = mFavorite;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public LocalDate getmDateUploaded() {
        return mDateUploaded;
    }

    public void setmDateUploaded(LocalDate mDateUploaded) {
        this.mDateUploaded = mDateUploaded;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public boolean ismFavorite() {
        return mFavorite;
    }

    public void setmFavorite(boolean mFavorite) {
        this.mFavorite = mFavorite;
    }
}
