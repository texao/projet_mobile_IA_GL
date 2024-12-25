package com.example.tp1devmobile;

import android.app.Application;

public class TestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Ici vous pouvez initialiser des composants spécifiques pour les tests
        // Par exemple : des bases de données de test, des configurations spéciales, etc.
    }
}
