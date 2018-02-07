package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.harmoush.javalibrary.Joker;

import com.example.harmoush.androidlibrary.AndroidLibraryActivity;
/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button mJokeButton;
    Joker mJoker;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        mJoker = new Joker();
        mJokeButton = root.findViewById(R.id.btn_joke);
        mJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ToDo: complete this method.
                new EndpointsAsyncTask().execute(getActivity());

            }
        });
        return root;
    }
}
