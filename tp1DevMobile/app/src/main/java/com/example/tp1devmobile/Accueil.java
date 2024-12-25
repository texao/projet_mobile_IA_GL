package com.example.tp1devmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Accueil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        Toast.makeText(this, "Bienvenue dans MeFormer", Toast.LENGTH_LONG).show();

        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(view -> startApp(view));

    }

        public void startApp (View view){
            // Par exemple, ouvrir le tableau de bord de l'étudiant
            Intent intent = new Intent(Accueil.this, MainActivity.class);
            startActivity(intent);
        }

    }
