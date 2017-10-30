package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        // Find the button with id playlist_activity_shuffle_button and attach a listener to it
        Button shuffleButton = findViewById(R.id.playlist_activity_shuffle_button);
        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * If user clicks on shuffle button, go to {@link PlayingSongActivity}
                 * to start playing random song
                 */
                Intent intent = new Intent(PlaylistActivity.this, PlayingSongActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * When user clicks on back button in action bar, start  {@link MainActivity}
     * in order to prevent looping problem
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(PlaylistActivity.this, MainActivity.class);
        startActivity(intent);
    }
}