package com.example.tp1devmobile;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class StudentProgressActivity extends AppCompatActivity {

    private ImageView imgMathsProgress, imgProgrammingProgress, imgHistoryProgress;
    private TextView tvMathsProgress, tvProgrammingProgress, tvHistoryProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_progress);

        // Initialisation des vues
        imgMathsProgress = findViewById(R.id.imgMathsProgress);
        imgProgrammingProgress = findViewById(R.id.imgProgrammingProgress);
        imgHistoryProgress = findViewById(R.id.imgHistoryProgress);

        tvMathsProgress = findViewById(R.id.tvMathsProgress);
        tvProgrammingProgress = findViewById(R.id.tvProgrammingProgress);
        tvHistoryProgress = findViewById(R.id.tvHistoryProgress);

        // Exemple de pourcentage de progrès pour chaque matière
        int mathsProgress = 75;  // Exemple de pourcentage
        int programmingProgress = 50;
        int historyProgress = 90;

        // Mise à jour des TextViews avec les pourcentages
        tvMathsProgress.setText("Mathématiques : " + mathsProgress + "%");
        tvProgrammingProgress.setText("Programmation : " + programmingProgress + "%");
        tvHistoryProgress.setText("Histoire : " + historyProgress + "%");

        // Mise à jour des ImageViews en fonction des progrès
        updateProgress(imgMathsProgress, mathsProgress);
        updateProgress(imgProgrammingProgress, programmingProgress);
        updateProgress(imgHistoryProgress, historyProgress);


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

    // Fonction pour mettre à jour l'image d'une matière en fonction du progrès
    private void updateProgress(ImageView imageView, int progress) {
        if (progress >= 80) {
            imageView.setImageResource(R.drawable.star_filled);  // Icône étoile remplie
        } else if (progress >= 50) {
            imageView.setImageResource(R.drawable.star_half);  // Icône étoile à moitié remplie
        } else {
            imageView.setImageResource(R.drawable.star_empty);  // Icône étoile vide
        }
    }


}



