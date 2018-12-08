package com.codepath.apps.restclienttemplate.models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface TweetDao {

    // @Query annotation requires knowing SQL syntax
    // See http://www.sqltutorial.org/

    @Query("SELECT * FROM TweetModel WHERE uid = :uid")
        public TweetModel getById(String uid);

    @Query("SELECT * FROM tweetModel")
    List<TweetModel> getAllTweets();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertModel(TweetModel tweetModels);
}
