package com.pere.user.hackathonjavapoc;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Yoav G on 17/11/2018.
 */
public class WordViewModel extends AndroidViewModel {

    private WordRepository wordRepository;
    private LiveData<List<Word>> allWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        wordRepository = new WordRepository(application);
        allWords = wordRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return allWords;
    }

    public void insert(Word word){
        wordRepository.insert(word);
    }

}
