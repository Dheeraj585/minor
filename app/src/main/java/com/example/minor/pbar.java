package com.example.minor;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pbar extends AppCompatActivity {
    private int progress1 = 0;

    ProgressBar progressBar1;
    ProgressBar progressBar2;
    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbar);

        progressBar1 = findViewById(R.id.progress_bar);
        progressBar2 = findViewById(R.id.progress_bar2);
        textView1 = findViewById(R.id.text_view_progress);
        textView2 = findViewById(R.id.text_view_progress2);

        Intent intent = getIntent();
        progress1 = intent.getIntExtra("carbon", 0);

        // Set progress and text for progressBar1
        progressBar1.setProgress(progress1);
        textView1.setText(String.valueOf(progress1));

        // Calculate progress for progressBar2 as integer division of progressBar1 by 1000
        int progress2 = progress1 / 1000;
        progressBar2.setProgress(progress2);
        textView2.setText(String.valueOf(progress2));
    }
}
