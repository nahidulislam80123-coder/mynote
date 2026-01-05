// Top of the file – apply plugins and android configuration
plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.mynote" // <-- added namespace for AGP 8.x
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mynote"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        // Updated to a version compatible with Kotlin 1.9.20
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.1")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.compose.ui:ui:1.6.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.3")
    implementation("androidx.compose.material3:material3:1.2.1")
    // Added AppCompat to provide Theme.AppCompat.DayNight.NoActionBar
    implementation("androidx.appcompat:appcompat:1.7.0")
    // (Optional) Material components if you use them elsewhere
    implementation("com.google.android.material:material:1.12.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.6.3")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.6.3")
}
