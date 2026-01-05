// Top of the file – plugins
plugins {
    id("com.android.application")
    kotlin("android") version "1.9.20"
    // other plugins …
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.mynote"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    // ... other android config ...
    composeOptions {
        // Updated to a Compose compiler version that supports Kotlin 1.9.20
        kotlinCompilerExtensionVersion = "1.5.2"
        // (optional) if you use a BOM you can also bump it here
    }
}

// Dependencies
dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.04.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose")
    // other dependencies …
}
