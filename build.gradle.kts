buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(BuildPlugins.androidGradlePlugin)
        classpath(BuildPlugins.kotlinGradlePlugin)
        classpath(BuildPlugins.daggerHiltGradlePlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        maven { setUrl("https://jitpack.io") }
        google()
        jcenter()
    }
}

tasks.register(BuildPlugins.taskTypeClean, Delete::class) {
    delete(rootProject.buildDir)
}