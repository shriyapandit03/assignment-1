plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.mygridapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mygridapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
}
