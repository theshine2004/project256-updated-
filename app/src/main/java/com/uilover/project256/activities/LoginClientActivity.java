package com.uilover.project256.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.uilover.project256.databinding.ActivityLoginClientBinding;

public class LoginClientActivity extends AppCompatActivity {
    ActivityLoginClientBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityLoginClientBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Nút đăng nhập (chưa có chức năng)
        binding.loginBtn.setOnClickListener(v -> {
            // Tạm để trống
        });

        // Đăng nhập với Google
        binding.loginWithGoogleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(LoginClientActivity.this, LoginWithGoogleActivity.class);
            startActivity(intent);
        });

        // Đăng nhập với tư cách Admin
        binding.loginAdminBtn.setOnClickListener(v -> {
            Intent intent = new Intent(LoginClientActivity.this, LoginAdminActivity.class);
            startActivity(intent);
        });

        // Đăng ký khách hàng
        binding.registerBtn.setOnClickListener(v -> {
            Intent intent = new Intent(LoginClientActivity.this, RegisterClientActivity.class);
            startActivity(intent);
        });
    }
}
