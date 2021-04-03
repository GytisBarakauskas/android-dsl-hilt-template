plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.daggerHiltAndroid)
    kotlin(BuildPlugins.kotlinAndroid)
    kotlin(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdkVersion(AndroidSDK.compileSdk)
    buildToolsVersion(AndroidSDK.buildTools)
    defaultConfig {
        applicationId = DefaultConfig.applicationID
        minSdkVersion(DefaultConfig.minSdk)
        targetSdkVersion(DefaultConfig.targetSdk)
        versionCode = DefaultConfig.versionCode
        versionName = DefaultConfig.versionName
        testInstrumentationRunner = DefaultConfig.instrumentationRunner
    }

    buildTypes {
        getByName(BuildTypes.release) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProguardFile.textFile),
                ProguardFile.ruleFile
            )
        }
    }
    compileOptions {
        sourceCompatibility(Options.sourceCompatibilityJavaVersion)
        targetCompatibility(Options.targetCompatibilityJavaVersion)
    }
    kotlinOptions {
        jvmTarget = Options.jvmTarget
    }
}

dependencies {
    implementation(Dependencies.Kotlin.kotlinStdLib)
    implementation(Dependencies.Google.materialDesign)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation(Dependencies.AndroidX.coreKtx)

    implementation(Dependencies.Google.daggerHilt)
    kapt(Dependencies.Google.daggerHiltCompiler)

    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.androidXjUnit)
}