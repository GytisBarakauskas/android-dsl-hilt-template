import org.gradle.api.JavaVersion

const val kotlinVersion = "1.4.31"
const val gradleVersion = "4.1.1"
const val daggerHiltVersion = "2.33-beta"

object AndroidSDK {
    const val compileSdk = 30
    const val buildTools = "30.0.2"
}

object DefaultConfig {
    const val applicationID = "com.gytisdev.countriesinfo"
    const val minSdk = 23
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object BuildTypes {
    const val release = "release"
}

object ProguardFile {
    const val textFile = "proguard-android-optimize.txt"
    const val ruleFile = "proguard-rules.pro"
}

object BuildPlugins {
    const val androidGradlePlugin = "com.android.tools.build:gradle:$gradleVersion"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val daggerHiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${daggerHiltVersion}"

    const val taskTypeClean = "clean"

    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinAndroidExtensions = "android.extensions"
    const val kotlinKapt = "kotlin-kapt"
    const val daggerHiltAndroid = "dagger.hilt.android.plugin"
}

object Options {
    val sourceCompatibilityJavaVersion = JavaVersion.VERSION_1_8
    val targetCompatibilityJavaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"
}

object Dependencies {

    object Local {
        // For local modules
    }

    object Kotlin {
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    }

    object AndroidX {
        private const val coreKtxVersion = "1.3.2"
        private const val appCompatVersion = "1.2.0"
        private const val constraintLayoutVersion = "2.0.4"

        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    }

    object Google {
        private const val materialVersion = "1.3.0"

        const val materialDesign = "com.google.android.material:material:$materialVersion"
        const val daggerHilt = "com.google.dagger:hilt-android:${daggerHiltVersion}"
        const val daggerHiltCompiler = "com.google.dagger:hilt-android-compiler:${daggerHiltVersion}"
    }

    object Test {
        private const val jUnitVersion = "4.13.2"
        private const val androidXjUnitVersion = "1.1.2"

        const val jUnit = "junit:junit:${jUnitVersion}"
        const val androidXjUnit = "androidx.test.ext:junit:${androidXjUnitVersion}"
    }
}