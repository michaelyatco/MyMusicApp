package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the artists.xml layout file
        setContentView(R.layout.activity_artists);

        // Find the View that shows the Genre category
        TextView genre = (TextView) findViewById(R.id.genre);

        // Set a click listener on that View
        genre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Genre category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenreActivity}
                Intent genreIntent = new Intent(ArtistsActivity.this, GenreActivity.class);

                // Start the new activity
                startActivity(genreIntent);
            }
        });

        // Find the View that shows the Now Playing category
        TextView now_playing = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that View
        now_playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent now_playingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(now_playingIntent);
            }
        });

        // Find the View that shows the MainActivity category
        TextView main = (TextView) findViewById(R.id.main_activity);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Genre category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(ArtistsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);
            }
        });
    }
}