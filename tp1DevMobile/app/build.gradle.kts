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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
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