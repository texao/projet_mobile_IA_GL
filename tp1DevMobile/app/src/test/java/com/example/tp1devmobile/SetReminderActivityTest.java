package com.example.tp1devmobile;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.action.ViewActions.click;

@RunWith(AndroidJUnit4.class)
public class SetReminderActivityTest {

    @Rule
    public ActivityTestRule<SetReminderActivity> activityRule =
            new ActivityTestRule<>(SetReminderActivity.class);

    @Test
    public void testBackButton() {
        // Vérifier que l'image 'btnBack' ferme l'activité actuelle
        onView(withId(R.id.btnBack)).perform(click());
    }
}

