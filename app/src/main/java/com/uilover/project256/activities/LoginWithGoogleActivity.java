package com.uilover.project256.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.uilover.project256.databinding.ActivityLoginWithGoogleBinding;

public class LoginWithGoogleActivity extends AppCompatActivity {
    ActivityLoginWithGoogleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityLoginWithGoogleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}

