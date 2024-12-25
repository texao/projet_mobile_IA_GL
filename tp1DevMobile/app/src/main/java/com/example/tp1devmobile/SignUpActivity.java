package com.example.tp1devmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private EditText inputName, inputSurname, inputEmail, inputPassword;
    private EditText inputStudentName, inputStudentSurname, inputStudentRelationship, inputStudentLevel;
    private RadioButton radioButtonParent, radioButtonStudent;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        inputName = findViewById(R.id.inputName);
        inputSurname = findViewById(R.id.inputSurname);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputStudentName = findViewById(R.id.inputStudentName);
        inputStudentSurname = findViewById(R.id.inputStudentSurname);
        inputStudentRelationship = findViewById(R.id.inputStudentRelationship);
        inputStudentLevel = findViewById(R.id.inputStudentLevel);

        radioButtonParent = findViewById(R.id.radioButtonParent);
        radioButtonStudent = findViewById(R.id.radioButtonStudent);

        btnSubmit = findViewById(R.id.btnSignUpSubmit);

        String login = "login";
        String identifiant = "identifiant";

        // Lors de la soumission du formulaire d'inscription
        btnSubmit.setOnClickListener(view -> {
            String name = inputName.getText().toString();
            String surname = inputSurname.getText().toString();
            String email = inputEmail.getText().toString();
            String password = inputPassword.getText().toString();
            String studentName = inputStudentName.getText().toString();
            String studentSurname = inputStudentSurname.getText().toString();
            String studentRelationship = inputStudentRelationship.getText().toString();
            String studentLevel = inputStudentLevel.getText().toString();

            if (radioButtonParent.isChecked()) {
                // Traitement pour l'inscription d'un parent
                handleParentRegistration(name, surname, email, password, studentName, studentSurname, studentRelationship, studentLevel);
            } else if (radioButtonStudent.isChecked()) {
                // Traitement pour l'inscription d'un élève
                handleStudentRegistration(name, surname, email, password);
            } else {
                Toast.makeText(this, "Veuillez choisir un profil", Toast.LENGTH_SHORT).show();
            }
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

    private void handleParentRegistration(String name, String surname, String email, String password, String studentName, String studentSurname, String studentRelationship, String studentLevel) {

        String parentInfo = "Parent Info: " + name + " " + surname + ", Email: " + email + ", Password: " + password;
        String studentInfo = "Student Info: " + studentName + " " + studentSurname + ", Relationship: " + studentRelationship + ", Level: " + studentLevel;

        Toast.makeText(this, "Inscription réussie en tant que parent", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, parentInfo + "\n" + studentInfo, Toast.LENGTH_LONG).show();
    }

    private void handleStudentRegistration(String name, String surname, String email, String password) {

        String studentInfo = "Student Info: " + name + " " + surname + ", Email: " + email + ", Password: " + password;

        Toast.makeText(this, "Inscription réussie en tant qu'élève", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, studentInfo, Toast.LENGTH_LONG).show();
    }







}
