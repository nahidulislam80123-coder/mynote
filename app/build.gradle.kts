// Top‑level plugins
plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    // ------------------------------------------------------------
    // 1️⃣  Set the module namespace (required by AGP 8+)
    // ------------------------------------------------------------
    namespace = "com.example.mynote"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mynote"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    // ------------------------------------------------------------
    // 2️⃣  Align Compose compiler with the Kotlin version used
    // ------------------------------------------------------------
    buildFeatures {
        compose = true
    }
    composeOptions {
        // Compose 1.5.3 works with Kotlin 1.9.20
        kotlinCompilerExtensionVersion = "1.5.3"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.03.00")
    implementation(composeBom)
    // UI
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.9.0")
    // Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")
    // Other dependencies …
}
