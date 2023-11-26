package com.example.minor;

// OffsetActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class offsetActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offset);

        // Retrieve the distance traveled from the intent

        String distanceTraveled = getIntent().getStringExtra("distanceTraveled");

        // Set the distance in the OffsetActivity
        EditText distanceTraveledValueTextView = findViewById(R.id.distanceEditText);
        distanceTraveledValueTextView.setText(distanceTraveled);
    }
        public void to_bar(View v){
            EditText ed = findViewById(R.id.carbonFootprintEditText);
            String carbon = ed.getText().toString();
            int carbonInt = Integer.parseInt(carbon);
            Intent intent = new Intent(offsetActivity.this, com.example.minor.pbar.class);

            intent.putExtra("carbon",carbonInt);
            startActivity(intent);


        }
}
