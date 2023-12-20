plugins {
    alias(libs.plugins.android).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.ksp).apply(false)
}

tasks.register<Delete>("clean") {
    delete {
        rootProject.buildDir
    }
}
buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://storage.googleapis.com/r8-releases/raw")
        }
    }
    dependencies {
        classpath("com.android.tools.build:gradle")
        classpath("com.android.tools:r8:8.2.16-dev")

    }
}