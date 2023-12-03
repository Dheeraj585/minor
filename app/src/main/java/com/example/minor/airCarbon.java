    package com.example.minor;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.TextView;

    public class airCarbon extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_air_carbon);
            int carbonEmission;

            TextView distTw = findViewById(R.id.flightDistanceTextView);
            TextView carbonTw = findViewById(R.id.carbonFootprintTextViewAir);

            Intent intent = getIntent();
            int dist = intent.getIntExtra("distance", 0);
            distTw.setText(String.valueOf(dist)); // Convert int to String before setting in TextView

            double distanceTraveled = (double) dist;
        }
        public void to_bar1(View v){
            TextView tw = findViewById(R.id.carbonFootprintTextViewAir);
            String carbon = tw.getText().toString();
            int carbonInt = Integer.parseInt(carbon);
            Intent intent = new Intent(airCarbon.this, bar.class);

            intent.putExtra("carbon",carbonInt);
            startActivity(intent);
        }
       /* public static int calculateCarbonEmissionAir(double distanceTraveled, double fuelConsumptionPerKm, double emissionFactor) {
            // Check if input parameters are valid
            if (distanceTraveled <= 0 || fuelConsumptionPerKm <= 0 || emissionFactor < 0) {
                throw new IllegalArgumentException("Invalid input parameters. Mileage, carbonPerKm, and distance must be positive values.");
            }

            // Calculate carbon emission and round to the nearest integer
            int  carbonEmission = (int) Math.round(distanceTraveled * fuelConsumptionPerKm * emissionFactor);
            return carbonEmission;
        }*/
    }