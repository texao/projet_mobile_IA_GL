package com.example.tp1devmobile;

import android.content.Intent;
import android.os.Build;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
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
public class ParentDashboardActivityTest {

    @Rule
    public ActivityTestRule<ParentDashboardActivity> activityRule =
            new ActivityTestRule<>(ParentDashboardActivity.class);

    @Before
    public void setUp() {
        // Initialisation des intents avant chaque test
        Intents.init();
    }

    @Test
    public void testButtonViewCourses() {
        // Vérifier que le bouton 'Voir les cours' lance l'activité CourseListActivity
        onView(withId(R.id.btnViewCourses)).perform(click());
        Intents.intended(IntentMatchers.hasComponent(CourseListActivity.class.getName()));
    }

    @Test
    public void testButtonViewStudentProgress() {
        // Vérifier que le bouton 'Voir la progression des étudiants' lance l'activité StudentProgressActivity
        onView(withId(R.id.btnViewStudentProgress)).perform(click());
        Intents.intended(IntentMatchers.hasComponent(StudentProgressActivity.class.getName()));
    }

    @Test
    public void testBackButton() {
        // Vérifier que le bouton 'Retour' ferme l'activité actuelle
        onView(withId(R.id.btnBack)).perform(click());
    }

    @After
    public void tearDown() {
        // Libérer les intents après chaque test
        Intents.release();
    }
}
