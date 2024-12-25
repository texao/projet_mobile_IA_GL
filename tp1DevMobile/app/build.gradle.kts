plugins {
    alias(libs.plugins.android.application)
    id("org.sonarqube") version "6.0.1.5171"
}

android {
    namespace = "com.example.tp1devmobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tp1devmobile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }


    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    testImplementation(libs.robolectric) // ou la dernière version stable
    testImplementation("org.mockito:mockito-core:4.0.0")
    testImplementation("androidx.appcompat:appcompat:1.6.0")
    testImplementation("org.robolectric:robolectric:4.10.2")

    testImplementation("androidx.test:core:1.5.0")
    testImplementation("androidx.test:runner:1.5.0")
    testImplementation("androidx.test.ext:junit:1.1.5")
    testImplementation("org.mockito:mockito-inline:4.0.0")
    testImplementation("androidx.test.espresso:espresso-core:3.5.1")

    testImplementation("androidx.test:core-ktx:1.5.0")
    testImplementation("androidx.test:rules:1.5.0")

    testImplementation("com.google.android.material:material:1.11.0")
    testImplementation("androidx.test.espresso:espresso-intents:3.5.1")
}


// Configuration SonarQube
sonar {
    properties {
        property("sonar.projectKey", "texao_projet_mobile_IA_GL")
        property("sonar.organization", "texao")  // Si vous utilisez SonarCloud
        property("sonar.host.url", "https://sonarcloud.io")  // Utilisez l'URL de SonarCloud ou votre serveur SonarQube
        property("sonar.login", "ec5006257ed704c666342efeab803c3c6a1174a0")  // Le jeton d'authentification (token)
    }
}

tasks.sonar {
    dependsOn("build")  // la tâche 'build' est exécutée avant 'sonar'
}