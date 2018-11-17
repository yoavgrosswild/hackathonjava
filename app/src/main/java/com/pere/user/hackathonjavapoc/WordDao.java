package com.pere.user.hackathonjavapoc;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Yoav G on 16/11/2018.
 */
@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("select * from words order by word asc")
    LiveData<List<Word>> getAllWords();

    @Query("delete from words")
    void deleteAll();
}
