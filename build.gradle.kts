buildscript {
    dependencies {
        classpath(libs.google.services)
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.googleAndroidLibrariesMapsplatformSecretsGradlePlugin) apply false
}

//plugins {
//    id 'com.android.application' version '7.1.2' apply false
//    id 'com.android.library' version '7.1.2' apply false
//}
//
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
