package com.example.android.undhymn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nishant on 10/28/2017.
 */

public class TrackAdapter extends ArrayAdapter<TrackDetail> {

    /* Context of App */
    private Context mContext;

    /* ListView item to inflate */
    private View mListView;

    /* Current object either song or artist */
    private TrackDetail mCurrentItem;

    /**
     * Identifier for artist list or song list
     * i.e  1 : It's songs list
     * 2 : artist list
     */
    private int mIdentifier;

    public TrackAdapter(@NonNull Context context, @NonNull List<TrackDetail> trackList, int identifier) {
        super(context, 0, trackList);
        mContext = context;
        mIdentifier = identifier;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        mListView = convertView;
        if (mListView == null) {
            mListView = LayoutInflater.from(mContext)
                    .inflate(R.layout.song_list_item, parent, false);
        }

        // Get the current track
        mCurrentItem = getItem(position);

        switch (mIdentifier) {
            case 1:
                // Use list item layout to display track detail
                displayTrack();
                break;
            case 2:
                // Use list item layout to display artist detail
                displayArtist();
                break;
        }
        return mListView;
    }

    // Display the song name, song artist and album cover
    private void displayTrack() {
        // Find the TextView for displaying track name from song_list_item.xml and set the text
        TextView trackNameTextView = mListView.findViewById(R.id.song_list_item_track_name);
        trackNameTextView.setText(mCurrentItem.getSongName().toString());

        // Find the textView for track artist name from song_list_item.xml and set the text
        TextView trackArtistTextView = mListView.findViewById(R.id.song_list_item_track_artist);
        trackArtistTextView.setVisibility(View.VISIBLE);
        trackArtistTextView.setText(mCurrentItem.getArtistName().toString());

        // Find the imageView for album art from song_list_item.xml and set the image
        ImageView albumArt = mListView.findViewById(R.id.song_list_item_track_album_art);
        albumArt.setImageResource(mCurrentItem.getAlbumArt());
    }

    // Display the name of artist and photo of artist
    private void displayArtist() {
        // Find the TextView for displaying artist name from song_list_item.xml and set the text
        TextView trackNameTextView = mListView.findViewById(R.id.song_list_item_track_name);
        trackNameTextView.setText(mCurrentItem.getArtistName().toString());
        trackNameTextView.setTextSize(16);

        // Find the ImageView for displaying artist photo from song_list_item.xml and set the image
        ImageView artistPhoto = mListView.findViewById(R.id.song_list_item_track_album_art);
        artistPhoto.setImageResource(mCurrentItem.getArtistPhoto());

        // Find the other TextView and set visibility to GONE,
        // because we only need artist image and name
        TextView textView = mListView.findViewById(R.id.song_list_item_track_artist);
        textView.setVisibility(View.GONE);
    }
}