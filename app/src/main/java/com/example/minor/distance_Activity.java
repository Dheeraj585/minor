package com.example.minor;

// MainActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
                String distanceTraveled = distanceEditText.getText().toString();

                // Start OffsetActivity and pass the distance as an extra
                Intent intent = new Intent(distance_Activity.this,offsetActivity.class);
                intent.putExtra("distanceTraveled", distanceTraveled);
                startActivity(intent);
            }
        }

