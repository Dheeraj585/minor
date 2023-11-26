package com.example.minor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;

public class ResetPass extends AppCompatActivity {
    EditText newPasswordEditText = findViewById(R.id.newPasswordEditText);
    EditText confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
    Button resetPasswordButton = findViewById(R.id.resetPasswordButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);

        // Find views by ID


        // Set up click listener for the Reset Password button
    }
    public void confirmPass(View view) {
        // Get the entered passwords
        String newPassword = newPasswordEditText.getText().toString();
        String confirmPassword = confirmPasswordEditText.getText().toString();

        // Check if passwords match
        if (newPassword.equals(confirmPassword)) {
            Intent i = new Intent(ResetPass.this, MainActivity.class);
            showToast("Password reset successful!");
        } else {
            // Passwords do not match, show an error popup
            showErrorMessagePopup("Passwords do not match. Please enter the same password.");
        }
    }

    // Helper method to show a toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // Helper method to show an error message in a pop-up
    private void showErrorMessagePopup(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage(message)
                .setPositiveButton("OK", null) // No action on OK button
                .show();
    }
}
