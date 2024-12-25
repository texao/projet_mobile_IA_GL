package com.example.tp1devmobile;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;


@RunWith(RobolectricTestRunner.class)
@Config(
        manifest = Config.NONE,  // On change ici pour éviter l'erreur de manifest
        sdk = Build.VERSION_CODES.P
)
public class UtilsTest {
    @Test
    public void emailValidation_isCorrect() {
        // Cas d'email valide
        assertTrue(Utils.isValidEmail("test@example.com"));
        assertTrue(Utils.isValidEmail("user.name@example.com"));
        assertTrue(Utils.isValidEmail("user@domain.co.uk"));
        assertTrue(Utils.isValidEmail("a@b.com")); // Accepté comme valide

        // Cas d'email invalide
        assertFalse(Utils.isValidEmail("invalidemail"));
        assertFalse(Utils.isValidEmail(null));
        assertFalse(Utils.isValidEmail("a@.com")); // Domaine invalide
        assertFalse(Utils.isValidEmail("user@domain..com")); // Deux points consécutifs
    }
}
