package com.pere.user.hackathonjavapoc;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

/**
 * Created by Yoav G on 17/11/2018.
 */
public class WordRepository {

    private WordDao wordDao;
    private LiveData<List<Word>> allWords;

    WordRepository(Application application) {

        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        wordDao = db.wordDao();
        allWords = wordDao.getAllWords();
    }

    LiveData<List<Word>> getAllWords(){
        return allWords;
    }

    public void insert(Word word){
        new InsertAsyncTask(wordDao).execute(word);
    }

    private static class InsertAsyncTask extends AsyncTask<Word, Void, Void> {

        private WordDao wordDao;

        InsertAsyncTask(WordDao wordDao) {
            this.wordDao = wordDao;
        }

        @Override
        protected Void doInBackground(Word... words) {
            wordDao.insert(words[0]);
            return null;
        }
    }
}
