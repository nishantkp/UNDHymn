package com.example.android.undhymn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);
    }
}
