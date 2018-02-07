package com.example.harmoush.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library);
        String joke = getIntent().getStringExtra(getString(R.string.joke));
        TextView mJokeTextView = findViewById(R.id.tv_joke);
        mJokeTextView.setText(joke);
    }
}
