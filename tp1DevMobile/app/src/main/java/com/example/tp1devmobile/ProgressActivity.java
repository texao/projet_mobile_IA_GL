package com.example.tp1devmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressActivity extends AppCompatActivity {

    private TextView textViewProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        textViewProgress = findViewById(R.id.textViewProgress);

        // Exemple de progression (à récupérer dynamiquement)
        String progress = "Progrès :\n\nMathématiques: 75%\nPhysique: 60%\nInformatique: 90%\n";

        textViewProgress.setText(progress);


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
