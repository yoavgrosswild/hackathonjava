package com.pere.user.hackathonjavapoc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yoav G on 17/11/2018.
 */
public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private final LayoutInflater layoutInflater;
    private List<Word> words;

    WordListAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = layoutInflater.inflate(R.layout.recycler_view_item, viewGroup, false);
        return new WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder wordViewHolder, int i) {
        if(words != null){

        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

     class WordViewHolder extends RecyclerView.ViewHolder{

        private final TextView textView;

        private WordViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
