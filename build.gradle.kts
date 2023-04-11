buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Plugin.gradle)
        classpath(Dependencies.Plugin.kotlin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}