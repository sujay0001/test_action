// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("org.sonarqube") version "4.4.1.3373"
}


sonar {
    properties {
        property("sonar.projectKey", "sujay0001_test_action")
        property("sonar.organization", "sujay0001")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}