package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingSongActivity extends AppCompatActivity {

    /**
     * Intent receiver through {@link SongsActivity}
     */
    private Intent currentSongIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        // Receive the intent send by {@link SongsActivity}
        currentSongIntent = getIntent();
        if(currentSongIntent.hasExtra(SongsActivity.SONG_NAME_KEY)){
            // Get the data from intent and display accordingly
            displayCurrentPlayingSong();
        } else {
            /**
             * If user comes to this activity other than {@link SongsActivity}
             * display dummy data
             */
            displayDummyData();
        }

        // Find the button with id playing_song_activity_library_button and attach a listener to it
        Button libraryButton = findViewById(R.id.playing_song_activity_library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the library button, start the activity for going to
                 * {@link MainActivity} through intent
                 */
                Intent intent = new Intent(PlayingSongActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    // This method is called to get data from intent and display it on layout properly
    private void displayCurrentPlayingSong() {
        // Get name of the song with key SONGS_NME_KEY
        String songName = currentSongIntent.getStringExtra(SongsActivity.SONG_NAME_KEY);
        // Get the name of artist with key ARTIST_NAME_KEY
        String artistName = currentSongIntent.getStringExtra(SongsActivity.ARTIST_NAME_KEY);
        // Get the resource id of album cover with key ALBUM_COVER_KEY
        int albumCover = currentSongIntent.getIntExtra(SongsActivity.ALBUM_COVER_KEY, R.drawable.album_placeholder);

        // Find the ImageView with ID playing_song_album_cover and set the album cover for that song
        ImageView albumCoverImageView = findViewById(R.id.playing_song_album_cover);
        albumCoverImageView.setImageResource(albumCover);

        // Find the TextView with ID playing_song_name and set text with name of the song
        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(songName);

        // Find the TextView with ID playing_song_artist_name and set text with name of the artist
        // for that song
        TextView artistNameTextView = findViewById(R.id.playing_song_artist_name);
        artistNameTextView.setText(artistName);
    }

    // Display dummy data
    private void displayDummyData() {
        // Find the ImageView with ID playing_song_album_cover and set the album cover for that song
        ImageView albumCoverImageView = findViewById(R.id.playing_song_album_cover);
        albumCoverImageView.setImageResource(R.drawable.avicii_nights_artwork);

        // Find the TextView with ID playing_song_name and set text with name of the song
        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(getString(R.string.song_2_name));

        // Find the TextView with ID playing_song_artist_name and set text with name of the artist
        // for that song
        TextView artistNameTextView = findViewById(R.id.playing_song_artist_name);
        artistNameTextView.setText(getString(R.string.song_2_artist));
    }
}