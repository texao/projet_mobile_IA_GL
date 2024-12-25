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

       // Button btnStart = findViewById(R.id.btnStart);
       // btnStart.setOnClickListener(view -> startApp(view));


        // Méthode pour démarrer une autre activité, par exemple le Dashboard
    /*
    public void startApp(View view) {
        // Par exemple, ouvrir le tableau de bord de l'étudiant
        Intent intent = new Intent(Accueil.this, MainActivity.class);
        startActivity(intent);
    }
    */

        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(view -> {
            // Mauvaise gestion : Si MainActivity n'existe pas ou a des erreurs, crash possible.
            startActivity(new Intent(Accueil.this, MainActivity.class));
            // Mauvaise pratique : Exécuter des actions qui peuvent échouer sans vérification.
            finish(); // Appelle `finish()` immédiatement, ce qui peut causer un comportement inattendu.
        });

    }
}
