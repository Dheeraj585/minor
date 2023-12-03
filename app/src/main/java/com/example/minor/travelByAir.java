package com.example.minor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class travelByAir extends AppCompatActivity {

    private EditText flightDistanceEditText;
    private EditText airlineNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_by_air);

        // Initialize your EditText fields
        flightDistanceEditText = findViewById(R.id.flightDistanceEditText);
        airlineNameEditText = findViewById(R.id.airlineNameEditText);

        Button offsetCarbonButtonAir = findViewById(R.id.offsetCarbonButtonAir);
        offsetCarbonButtonAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform validation
                if (validateInputs()) {
                    // Do your offset carbon logic here
                }
            }
        });
    }

    private boolean validateInputs() {
        // Get the input values
        String flightDistance = flightDistanceEditText.getText().toString().trim();
        String airlineName = airlineNameEditText.getText().toString().trim();

        // Check if any of the fields is empty
        if (flightDistance.isEmpty()) {
            flightDistanceEditText.setError("Enter flight distance");
            return false;
        }

        if (airlineName.isEmpty()) {
            airlineNameEditText.setError("Enter airline name");
            return false;
        }

        // If everything is valid, return true
        return true;
    }
}
