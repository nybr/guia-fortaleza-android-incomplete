package com.udacity.nadjayanna.guiafortaleza_ce.Model;

import android.widget.TextView;

/**
 * Created by nadja on 25/08/2017.
 */

public class Card {

    private String mName;
    private int mImageId;

    public Card(String name, int imageId){
        this.mName = name;
        this.mImageId = imageId;
    }
    public Card(String name) {
        this.mName = name;
    }

    public String getmName() {
        return mName;
    }

    public int getmImageId() {
        return mImageId;
    }
}
