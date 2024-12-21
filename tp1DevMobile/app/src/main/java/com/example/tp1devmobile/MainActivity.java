package com.example.tp1devmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLogin).setOnClickListener(view -> {
            startActivity(new Intent(this, LoginActivity.class));
        });

        findViewById(R.id.btnSignUp).setOnClickListener(view -> {
            startActivity(new Intent(this, SignUpActivity.class));
        });


        // Trouver l'ImageView de la flèche
        ImageView btnBack = findViewById(R.id.btnBack);

        // Définir un écouteur pour la flèche
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Fermer l'activité actuelle et revenir à la précédente
                finish();
            }
        });


    }
}