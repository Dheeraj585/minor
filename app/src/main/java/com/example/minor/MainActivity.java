package com.example.minor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by ID
        TextView welcomeBackText = findViewById(R.id.welcomeBackText);
        TextView emailIdText = findViewById(R.id.emailIdText);
        TextView userEmail = findViewById(R.id.userEmail);
        TextView passwordText = findViewById(R.id.passwordText);
        TextView passwordDots = findViewById(R.id.passwordDots);
        ImageView passwordVisibilityIcon = findViewById(R.id.passwordVisibilityIcon);
        TextView forgotPasswordText = findViewById(R.id.forgotPasswordText);
        Button signInButton = findViewById(R.id.signInButton);
        RelativeLayout signInWithGoogleButton = findViewById(R.id.signInWithGoogleButton);
        ImageView googleIcon = findViewById(R.id.googleIcon);
        TextView signInWithGoogleText = findViewById(R.id.signInWithGoogleText);
        TextView dontHaveAccountText = findViewById(R.id.dontHaveAccountText);
        Button signUpButton = findViewById(R.id.signUpButton);

        // Set up click listeners or other functionality as needed
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform sign-in logic
                String email = userEmail.getText().toString();
                String password = passwordDots.getText().toString();
                // Validate the email and password
                if (isValidCredentials(email, password)) {
                    startActivity(new Intent(MainActivity.this, distance_Activity.class));
                    finish();
                }
            }
        });




        signInWithGoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform sign-in with Google logic
                // This could involve initiating Google Sign-In API or any other authentication method
                // After successful sign-in, navigate to the home screen or perform other actions
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                finish(); // Optional: finish the current activity
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the sign-up screen or perform sign-up logic
                startActivity(new Intent(MainActivity.this, SignupActivity.class));
            }
        });
    }
    public void resetPass(View v){
        Intent io = new Intent(MainActivity.this,ResetPass.class);
        startActivity(io);

    }


    // Helper method to validate email and password
    private boolean isValidCredentials(String email, String password) {
        if (email.isEmpty()) {
            showErrorMessagePopup("Email  is empty");
            return false;
        }else if(password.isEmpty()){
                showErrorMessagePopup("password  is empty");
                return false;
        } else if  ( !email.contains("@") || email.startsWith("@") || email.endsWith("@") || !email.endsWith(".com")) {
            showErrorMessagePopup("Invalid email format");
            return false;
        } else if (password.length() < 8) {
            showErrorMessagePopup("Password must have at least 8 characters");
            return false;
        }



        // Your additional validation logic for email and password can be added here

        // If all validations pass, return true
        return true;
    }

    // Helper method to show an error message (replace with your actual UI handling)
    private void showErrorMessage(String message) {
        // Implement your UI logic to show the error message
        // For example, you might display a Toast or update a TextView with the error message
    }
    // Helper method to show an error message in a pop-up
    private void showErrorMessagePopup(String message) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Error")
                .setMessage(message)
                .setPositiveButton("OK", null) // No action on OK button
                .show();
    }


    // Example method to retrieve the password (replace with your actual implementation)


}