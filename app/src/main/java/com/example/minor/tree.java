package com.example.minor;// CarbonOffsetActivity.java

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class tree extends AppCompatActivity {

    private ProgressBar carbonProgressBar;
    private ProgressBar treesProgressBar;
    private TextView treesCountTextView;

    private int carbonProduced = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treeplanting1);

        carbonProgressBar = findViewById(R.id.carbonFootprintProgressBar);
        treesProgressBar = findViewById(R.id.treePlantingProgressBar);
        treesCountTextView = findViewById(R.id.treeCount);

        // Example: You can update carbon produced dynamically (e.g., based on user actions)
        updateCarbonProduced(30);
    }

    private void updateCarbonProduced(int newCarbonProduced) {
        carbonProduced += newCarbonProduced;
        carbonProgressBar.setProgress(carbonProduced);

        // Calculate trees to plant
        int treesToPlant = carbonProduced / 10;
        treesProgressBar.setProgress(treesToPlant * 10);
        treesCountTextView.setText("Trees to plant: " + treesToPlant);
    }
}
