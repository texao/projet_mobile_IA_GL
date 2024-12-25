package com.example.tp1devmobile;

import android.app.Application;
import android.os.Build;

import androidx.fragment.app.FragmentActivity;
import androidx.test.core.app.ApplicationProvider;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
@Config(
        manifest = Config.NONE,  // On change ici pour éviter l'erreur de manifest
        sdk = Build.VERSION_CODES.P
)
public class LoginActivityTest {
    private LoginActivity activity;

    @Before
    public void setUp() {
        // Configurer le thème via l'application
        Application application = RuntimeEnvironment.application;
        application.setTheme(R.style.Theme_Tp1DevMobile);

        // Initialiser l'activité
        activity = Robolectric.buildActivity(LoginActivity.class)
                .create()
                .start()
                .resume()
                .get();
    }

    @Test
    public void validateUser_validParentCredentials_returnsTrue() {
        boolean isValid = activity.validateUser("test@parent.com", "password123");
        assertTrue("Parent credentials should be valid", isValid);
    }

    @Test
    public void validateUser_validStudentCredentials_returnsTrue() {
        boolean isValid = activity.validateUser("test@student.com", "password123");
        assertTrue("Student credentials should be valid", isValid);
    }

    @Test
    public void validateUser_invalidCredentials_returnsFalse() {
        boolean isValid = activity.validateUser("invalid@example.com", "wrongpassword");
        assertFalse("Invalid credentials should return false", isValid);
    }

    @Test
    public void getUserProfile_validParentEmail_returnsParentProfile() {
        String profile = activity.getUserProfile("test@parent.com");
        assertEquals("Should return parent profile", "parent", profile);
    }

    @Test
    public void getUserProfile_validStudentEmail_returnsStudentProfile() {
        String profile = activity.getUserProfile("test@student.com");
        assertEquals("Should return student profile", "student", profile);
    }

    @Test
    public void getUserProfile_invalidEmail_returnsUnknownProfile() {
        String profile = activity.getUserProfile("unknown@example.com");
        assertEquals("Should return unknown profile", "unknown", profile);
    }

    // Tests supplémentaires pour les cas limites
    @Test
    public void validateUser_emptyCredentials_returnsFalse() {
        boolean isValid = activity.validateUser("", "");
        assertFalse("Empty credentials should return false", isValid);
    }

    @Test
    public void validateUser_nullCredentials_returnsFalse() {
        boolean isValid = activity.validateUser(null, null);
        assertFalse("Null credentials should return false", isValid);
    }

    @Test
    public void validateUser_invalidEmailFormat_returnsFalse() {
        boolean isValid = activity.validateUser("notanemail", "password123");
        assertFalse("Invalid email format should return false", isValid);
    }

    @Test
    public void validateUser_shortPassword_returnsFalse() {
        boolean isValid = activity.validateUser("test@example.com", "123");
        assertFalse("Short password should return false", isValid);
    }
}