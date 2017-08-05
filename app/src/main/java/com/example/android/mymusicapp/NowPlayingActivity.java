package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the now_playing.xml layout file
        setContentView(R.layout.activity_now_playing);


        // Find the View that shows the Artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent artistsIntent = new Intent(NowPlayingActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the Genre category
        TextView genre = (TextView) findViewById(R.id.genre);

        // Set a click listener on that View
        genre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Genre category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenreActivity}
                Intent genreIntent = new Intent(NowPlayingActivity.this, GenreActivity.class);

                // Start the new activity
                startActivity(genreIntent);
            }
        });

        // Find the View that shows the MainActivity category
        TextView main = (TextView) findViewById(R.id.main_activity);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Genre category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenreActivity}
                Intent mainIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);
            }
        });

    }
}
