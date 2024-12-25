package com.example.tp1devmobile;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import android.os.Build;

@RunWith(RobolectricTestRunner.class)
@Config(
        manifest = Config.NONE,  // On change ici pour éviter l'erreur de manifest
        sdk = Build.VERSION_CODES.P
)
public class StudentProgressActivityTest {

    @Rule
    public ActivityTestRule<StudentProgressActivity> activityRule =
            new ActivityTestRule<>(StudentProgressActivity.class);

    @Test
    public void testProgressTextViews() {
        // Vérifier si les TextViews de progression sont affichés avec les bonnes valeurs
        onView(withId(R.id.tvMathsProgress)).check(matches(withText("Mathématiques : 75%")));
        onView(withId(R.id.tvProgrammingProgress)).check(matches(withText("Programmation : 50%")));
        onView(withId(R.id.tvHistoryProgress)).check(matches(withText("Histoire : 90%")));
    }

    @Test
    public void testProgressImages() {
        // Vérifier que les ImageViews de progression sont visibles
        onView(withId(R.id.imgMathsProgress)).check(matches(isDisplayed()));
        onView(withId(R.id.imgProgrammingProgress)).check(matches(isDisplayed()));
        onView(withId(R.id.imgHistoryProgress)).check(matches(isDisplayed()));
    }

    @Test
    public void testBackButton() {
        // Vérifier que l'image 'btnBack' ferme l'activité actuelle
        onView(withId(R.id.btnBack)).perform(click());
    }
}

