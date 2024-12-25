package com.example.tp1devmobile;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ParentDashboardActivityTest {

    @Rule
    public ActivityTestRule<ParentDashboardActivity> activityRule =
            new ActivityTestRule<>(ParentDashboardActivity.class);

    @Test
    public void testButtonViewStudentProgress() {
        // Vérifier que le bouton redirige vers StudentProgressActivity
        onView(withId(R.id.btnViewStudentProgress)).perform(click());
        intended(hasComponent(StudentProgressActivity.class.getName()));
    }

    @Test
    public void testButtonViewCourses() {
        // Vérifier que le bouton redirige vers CourseListActivity
        onView(withId(R.id.btnViewCourses)).perform(click());
        intended(hasComponent(CourseListActivity.class.getName()));
    }
}

