package com.example.tp1devmobile;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ExerciseListActivity extends AppCompatActivity {

    private ListView listViewExercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        listViewExercises = findViewById(R.id.listViewExercises);

        // Liste des exercices (à récupérer dynamiquement)
        String[] exercises = {"Exercice 1: Algèbre", "Exercice 2: Programmation", "Exercice 3: Chimie", "Exercice 4: Littérature"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, exercises);
        listViewExercises.setAdapter(adapter);
    }
}
