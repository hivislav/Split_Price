@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.deverline.splitprice"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.deverline.splitprice"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Dependencies.androidxCore)
    implementation(Dependencies.androidxAppCompat)
    implementation(Dependencies.googleMaterial)
    implementation(Dependencies.androidxConstraint)
    implementation(Dependencies.androidxLifecycleLivedata)
    implementation(Dependencies.androidxLifecycleViewModel)
    implementation(Dependencies.androidxNavigationFragment)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.androidxJunit)
    androidTestImplementation(Dependencies.androidxEspresso)
}