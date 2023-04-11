object Dependencies {

    object Versions {
        const val kotlin = "1.8.20"
        const val gradle = "7.4.2"
    }

    object Plugin {
        const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    //Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

    //Androidx
    const val androidxCore = "androidx.core:core-ktx:1.10.0"
    const val androidxAppCompat = "androidx.appcompat:appcompat:1.6.1"
    const val androidxConstraint = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val androidxNavigationFragment = "androidx.navigation:navigation-fragment-ktx:2.5.3"
    const val androidxLifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
    const val androidxLifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"

    //Google
    const val googleMaterial = "com.google.android.material:material:1.8.0"

    //Test
    const val junit = "junit:junit:4.13.2"
    const val androidxJunit = "androidx.test.ext:junit:1.1.5"
    const val androidxEspresso = "androidx.test.espresso:espresso-core:3.5.1"
}