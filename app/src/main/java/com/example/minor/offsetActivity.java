package com.example.minor;

// OffsetActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class offsetActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offset);

        // Retrieve the distance traveled from the intent

        String distanceTraveled = getIntent().getStringExtra("distanceTraveled");

        // Set the distance in the OffsetActivity
        TextView distanceTraveledValueTextView = findViewById(R.id.distanceTextView);
        distanceTraveledValueTextView.setText(distanceTraveled);
    }
        public void to_bar(View v){
            TextView ed = findViewById(R.id.carbonFootprintTextView);
            String carbon = ed.getText().toString();
            int carbonInt = Integer.parseInt(carbon);
            Intent intent = new Intent(offsetActivity.this, bar.class);

            intent.putExtra("carbon",carbonInt);
            startActivity(intent);


        }
}
