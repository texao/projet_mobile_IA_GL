package com.example.tp1devmobile;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

import android.os.Build;

@RunWith(RobolectricTestRunner.class)
@Config(
        manifest = Config.NONE,  // On change ici pour éviter l'erreur de manifest
        sdk = Build.VERSION_CODES.P
)
public class RecommendationActivityTest {

    @Rule
    public ActivityTestRule<RecommendationActivity> activityRule =
            new ActivityTestRule<>(RecommendationActivity.class);

    @Test
    public void testListViewRecommendations() {
        // Vérifier que la liste contient au moins un élément
        onData(anything())
                .inAdapterView(withId(R.id.recommendationsList))
                .atPosition(0)
                .check(matches(withText("Revoir le cours de mathématiques.")));
    }
}
