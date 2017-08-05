package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the payment.xml layout file
        setContentView(R.layout.activity_payment);

        // Find the View that shows the MainActivity category
        TextView main = (TextView) findViewById(R.id.main_activity);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Genre category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenreActivity}
                Intent mainIntent = new Intent(PaymentActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);
            }
        });

    }
}
