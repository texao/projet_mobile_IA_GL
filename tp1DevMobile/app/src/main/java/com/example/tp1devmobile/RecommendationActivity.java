package com.example.tp1devmobile;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class RecommendationActivity extends AppCompatActivity {

    private ListView listViewRecommendations;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendations_activity);

        listViewRecommendations = findViewById(R.id.recommendationsList);

        // Liste des recommandations (à récupérer dynamiquement)
        String[] recommendations = {"Revoir le cours de mathématiques.", "Pratiquer la programmation orientée objet.", "Étudier les réactions chimiques.", "Lire des articles sur l'histoire contemporaine."};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recommendations);
        listViewRecommendations.setAdapter(adapter);


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

