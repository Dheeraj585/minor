package com.example.minor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class modeOfTransport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_of_transport);
    }
    public void goToAirTravel(View v){

        Intent intent = new Intent(modeOfTransport.this, travelByAir.class);
        startActivity(intent);

    }
    public void goToRoadTravel(View v){

        Intent intent = new Intent(modeOfTransport.this, distance_Activity.class);
        startActivity(intent);

    }
    public void showProfile(View v){
        Intent intent = new Intent(modeOfTransport.this, showProfile.class);
        startActivity(intent);
    }
}