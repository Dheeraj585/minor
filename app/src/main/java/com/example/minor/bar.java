package com.example.minor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class bar extends AppCompatActivity {


    private TextView textCarbonProduced, valueCarbonProduced, textTotalCarbon, valueTotalCarbon,
            textTotalTrees, valueTotalTrees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbar);

        // Initialize Views

        textCarbonProduced = findViewById(R.id.textCarbonProduced);
        valueCarbonProduced = findViewById(R.id.valueCarbonProduced);
        textTotalCarbon = findViewById(R.id.textTotalCarbon);
        valueTotalCarbon = findViewById(R.id.valueTotalCarbon);
        textTotalTrees = findViewById(R.id.textTotalTrees);
        valueTotalTrees = findViewById(R.id.valueTotalTrees);





        valueCarbonProduced.setText("100 kg");
        valueTotalCarbon.setText("1000 kg");
        valueTotalTrees.setText("10");
    }
    public void planted(View view) {
        String tree = valueTotalTrees.getText().toString();
        int treeCount = Integer.parseInt(tree);
        Intent intent = new Intent(bar.this, offsetActivity.class);
        intent.putExtra("tree",treeCount);
        startActivity(intent);

    }
    public void profile(View view) {
        // Handle image button click
        // Add your logic here
        Intent intent = new Intent(bar.this, offsetActivity.class);
        startActivity(intent);

    }
}
