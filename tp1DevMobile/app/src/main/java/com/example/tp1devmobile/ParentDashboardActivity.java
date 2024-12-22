package com.example.tp1devmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ParentDashboardActivity extends AppCompatActivity {

    private Button btnViewStudentProgress, btnViewCourses, btnSetReminder, btnViewRecommendations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dashboard);

        btnViewStudentProgress = findViewById(R.id.btnViewStudentProgress);
        btnViewCourses = findViewById(R.id.btnViewCourses);
        btnSetReminder = findViewById(R.id.btnSetReminder);
        btnViewRecommendations = findViewById(R.id.btnViewRecommendations);

        // Visualiser les progrès de l'élève
        btnViewStudentProgress.setOnClickListener(view -> {
            // Exemple d'activation de la logique de progrès de l'élève
            Intent intent = new Intent(ParentDashboardActivity.this, StudentProgressActivity.class);
            startActivity(intent);
        });

        // Visualiser les cours
        btnViewCourses.setOnClickListener(view -> {
            // Exemple d'activation de la logique de cours
            Intent intent = new Intent(ParentDashboardActivity.this, CourseListActivity.class);
            startActivity(intent);
        });

        // Définir un rappel
        btnSetReminder.setOnClickListener(view -> {
            // Exemple d'action pour définir un rappel
            Intent intent = new Intent(ParentDashboardActivity.this, SetReminderActivity.class);
            startActivity(intent);
        });

        // Visualiser les recommandations
        btnViewRecommendations.setOnClickListener(view -> {
            // Exemple d'action pour visualiser les recommandations
            Intent intent = new Intent(ParentDashboardActivity.this, RecommendationActivity.class);
            startActivity(intent);
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

