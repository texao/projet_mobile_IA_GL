package com.example.tp1devmobile;

import android.content.Intent;
import android.widget.Button;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class StudentDashboardActivityTest {

    @Rule
    public ActivityTestRule<StudentDashboardActivity> activityRule =
            new ActivityTestRule<>(StudentDashboardActivity.class);

    @Before
    public void setUp() {
        // Initialisation des intents
        Intents.init();
    }

    @Test
    public void testButtonClickToCourseList() {
        // Vérifier que le bouton 'Voir les cours' lance l'activité CourseListActivity
        onView(withId(R.id.btnViewCourses)).perform(click());
        Intents.intended(IntentMatchers.hasComponent(CourseListActivity.class.getName()));
    }

    @Test
    public void testButtonClickToExerciseList() {
        // Vérifier que le bouton 'Voir les exercices' lance l'activité ExerciseListActivity
        onView(withId(R.id.btnViewExercises)).perform(click());
        Intents.intended(IntentMatchers.hasComponent(ExerciseListActivity.class.getName()));
    }

    @Test
    public void testButtonClickToProgress() {
        // Vérifier que le bouton 'Voir la progression' lance l'activité ProgressActivity
        onView(withId(R.id.btnViewProgress)).perform(click());
        Intents.intended(IntentMatchers.hasComponent(ProgressActivity.class.getName()));
    }

    @Test
    public void testButtonClickToRecommendations() {
        // Vérifier que le bouton 'Voir les recommandations' lance l'activité RecommendationActivity
        onView(withId(R.id.btnViewRecommendations)).perform(click());
        Intents.intended(IntentMatchers.hasComponent(RecommendationActivity.class.getName()));
    }

    @Test
    public void testBackButton() {
        // Vérifier que l'image 'btnBack' ferme l'activité actuelle
        onView(withId(R.id.btnBack)).perform(click());
    }
}
