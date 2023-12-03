package com.example.minor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class distance_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
    }

    public void onOffsetButtonClick(View v) {
        // Get the distance traveled from the EditText
        EditText distanceEditText = findViewById(R.id.distanceEditText);
        String distanceTraveled = distanceEditText.getText().toString().trim();

        // Validate input
        if (distanceTraveled.isEmpty()) {
            // Show error if distance is empty
            distanceEditText.setError("Enter distance traveled");
            return;
        }

        // Parse the distance as a double
        double distance = Double.parseDouble(distanceTraveled);

        // Get the car name from the EditText
        EditText carNameEditText = findViewById(R.id.carNameEditText);
        String carName = carNameEditText.getText().toString().trim();

        // Validate car name input
        if (carName.isEmpty()) {
            // Show error if car name is empty
            carNameEditText.setError("Enter car name");
            return;
        }

        // Other initializations
        double mileage; // You need to initialize mileage, e.g., get it from the database
        double carbonPerKm; // You need to initialize carbonPerKm, e.g., get it from the database

        // You might want to add validation for mileage and carbonPerKm here if needed

        // Calculate carbon emission
       // double carbon = calculateCarbonEmission(mileage, carbonPerKm, distance);

        // Start OffsetActivity and pass the distance, car name, and carbon as extras
        Intent intent = new Intent(distance_Activity.this, offsetActivity.class);
        intent.putExtra("distanceTraveled", distanceTraveled);
        intent.putExtra("carName", carName);
      //  intent.putExtra("carbonProduced", carbon);

        startActivity(intent);
    }

    // You might want to add validation for mileage and carbonPerKm here if needed
    public static double calculateCarbonEmission(double mileage, double carbonPerKm, double distance) {
        // Check if input parameters are valid
        if (mileage <= 0 || carbonPerKm <= 0 || distance < 0) {
            // Throw exception for invalid input parameters
            throw new IllegalArgumentException("Invalid input parameters. Mileage, carbonPerKm, and distance must be positive values.");
        }

        // Calculate carbon emission
        double carbonEmission = (distance / mileage) * carbonPerKm;
        return carbonEmission;
    }
}
