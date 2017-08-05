package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Now Playing category
        TextView now_playing = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that View
        now_playing.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Now Playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent now_playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(now_playingIntent);
            }
        });

        // Find the View that shows the Artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the Genre category
        TextView genre = (TextView) findViewById(R.id.genre);

        // Set a click listener on that View
        genre.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Genre category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenreActivity}
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);

                // Start the new activity
                startActivity(genreIntent);
            }
        });

        // Find the View that shows the Payment category
        TextView payment = (TextView) findViewById(R.id.payment);

        // Set a click listener on that View
        payment.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Payment category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PaymentActivity}
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });
    }
}
