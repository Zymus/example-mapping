plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("biz.aQute.bnd.builder:biz.aQute.bnd.builder.gradle.plugin:5.3.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.5.0")
}
