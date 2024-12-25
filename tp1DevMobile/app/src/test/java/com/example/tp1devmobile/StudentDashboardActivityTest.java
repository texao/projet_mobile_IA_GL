package com.example.tp1devmobile;

import android.content.Intent;
import android.os.Build;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(RobolectricTestRunner.class)
@Config(
        manifest = Config.NONE,  // On change ici pour éviter l'erreur de manifest
        sdk = Build.VERSION_CODES.P
)
public class StudentDashboardActivityTest {

    @Before
    public void setUp() {
        // Initialisation des intents
        Intents.init();
    }

    @After
    public void tearDown() {
        // Libération des intents après chaque test
        Intents.release();
    }

    @Test
    public void testButtonClickToCourseList() {
        try (ActivityScenario<StudentDashboardActivity> scenario = ActivityScenario.launch(StudentDashboardActivity.class)) {
            // Vérifier que le bouton 'Voir les cours' lance l'activité CourseListActivity
            onView(withId(R.id.btnViewCourses)).perform(click());
            Intents.intended(IntentMatchers.hasComponent(CourseListActivity.class.getName()));
        }
    }

    @Test
    public void testButtonClickToExerciseList() {
        try (ActivityScenario<StudentDashboardActivity> scenario = ActivityScenario.launch(StudentDashboardActivity.class)) {
            // Vérifier que le bouton 'Voir les exercices' lance l'activité ExerciseListActivity
            onView(withId(R.id.btnViewExercises)).perform(click());
            Intents.intended(IntentMatchers.hasComponent(ExerciseListActivity.class.getName()));
        }
    }

    @Test
    public void testButtonClickToProgress() {
        try (ActivityScenario<StudentDashboardActivity> scenario = ActivityScenario.launch(StudentDashboardActivity.class)) {
            // Vérifier que le bouton 'Voir la progression' lance l'activité ProgressActivity
            onView(withId(R.id.btnViewProgress)).perform(click());
            Intents.intended(IntentMatchers.hasComponent(ProgressActivity.class.getName()));
        }
    }

    @Test
    public void testButtonClickToRecommendations() {
        try (ActivityScenario<StudentDashboardActivity> scenario = ActivityScenario.launch(StudentDashboardActivity.class)) {
            // Vérifier que le bouton 'Voir les recommandations' lance l'activité RecommendationActivity
            onView(withId(R.id.btnViewRecommendations)).perform(click());
            Intents.intended(IntentMatchers.hasComponent(RecommendationActivity.class.getName()));
        }
    }

    @Test
    public void testBackButton() {
        try (ActivityScenario<StudentDashboardActivity> scenario = ActivityScenario.launch(StudentDashboardActivity.class)) {
            // Vérifier que l'image 'btnBack' ferme l'activité actuelle
            onView(withId(R.id.btnBack)).perform(click());
        }
    }
}
