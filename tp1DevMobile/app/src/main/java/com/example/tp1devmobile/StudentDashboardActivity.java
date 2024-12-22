package com.example.tp1devmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StudentDashboardActivity extends AppCompatActivity {

    private Button btnViewCourses, btnViewExercises, btnViewProgress, btnViewRecommendations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        btnViewCourses = findViewById(R.id.btnViewCourses);
        btnViewExercises = findViewById(R.id.btnViewExercises);
        btnViewProgress = findViewById(R.id.btnViewProgress);
        btnViewRecommendations = findViewById(R.id.btnViewRecommendations);

        // Redirection vers la liste des cours
        btnViewCourses.setOnClickListener(view -> {
            Intent intent = new Intent(StudentDashboardActivity.this, CourseListActivity.class);
            startActivity(intent);
        });

        // Redirection vers la liste des exercices
        btnViewExercises.setOnClickListener(view -> {
            Intent intent = new Intent(StudentDashboardActivity.this, ExerciseListActivity.class);
            startActivity(intent);
        });

        // Redirection vers la progression
        btnViewProgress.setOnClickListener(view -> {
            Intent intent = new Intent(StudentDashboardActivity.this, ProgressActivity.class);
            startActivity(intent);
        });

        // Redirection vers les recommandations
        btnViewRecommendations.setOnClickListener(view -> {
            Intent intent = new Intent(StudentDashboardActivity.this, RecommendationActivity.class);
            startActivity(intent);
        });

        // Trouver l'ImageView de la flèche
        ImageView btnBack = findViewById(R.id.btnBack);

        // Définir un écouteur pour la flèche
        btnBack.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                // Fermer l'activité actuelle et revenir à la précédente
                finish();
            }
        });

    }



}

