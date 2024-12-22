package com.example.tp1devmobile;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Lors de la soumission du formulaire de connexion
        btnLogin.setOnClickListener(view -> {
            String email = inputEmail.getText().toString();
            String password = inputPassword.getText().toString();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }

            // Simuler une validation de l'email et mot de passe
            if (validateUser(email, password)) {
                // Identifier le profil de l'utilisateur
                String userProfile = getUserProfile(email);

                // Lancer l'activité appropriée en fonction du profil
                if (userProfile.equals("parent")) {
                    // Lancer l'écran du parent
                    Intent intent = new Intent(this, ParentDashboardActivity.class);
                    startActivity(intent);
                } else if (userProfile.equals("student")) {
                    // Lancer l'écran de l'élève
                    Intent intent = new Intent(this, StudentDashboardActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Profil introuvable", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Identifiants incorrects", Toast.LENGTH_SHORT).show();
            }
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

    private boolean validateUser(String email, String password) {
        // Fonction de validation de l'utilisateur (peut être remplacée par un appel à un serveur)
        // Ici, on simule une validation simpleparent
        return email.equals("test@parent.com") && password.equals("password123") || email.equals("test@student.com") && password.equals("password123");

    }

    private String getUserProfile(String email) {
        // Fonction de récupération du profil de l'utilisateur (peut être remplacée par un appel à un serveur)
        // On simule un profil pour l'exemple
        if (email.equals("test@parent.com")) {
            return "parent";  // Profil Parent
        } else if (email.equals("test@student.com")) {
            return "student";  // Profil Élève
        }
        return "unknown";
    }
}