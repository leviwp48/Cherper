package com.codepath.apps.restclienttemplate.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.text.format.DateUtils;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

@Parcel
@Entity
public class TweetModel {


    @NonNull
    @ColumnInfo
    @PrimaryKey
    public String uid; // database ID for the tweet

    // list out the attributes
    @ColumnInfo
    public String body;
    @ColumnInfo
    public String username;
    @ColumnInfo
    public String screenName;
    @ColumnInfo
    public String createdAt;



    // empty constructor for Parceler library
    public TweetModel() { super();
    }

    public String getUid() {
        return uid;
    }

    public String getBody() {
        return body;
    }

    public String getUsername() {
        return username;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
