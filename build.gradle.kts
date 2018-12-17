/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java Library project to get you started.
 * For more details take a look at the Java Libraries chapter in the Gradle
 * user guide available at https://docs.gradle.org/5.0/userguide/java_library_plugin.html
 */

plugins {
    id("io.franzbecker.gradle-lombok") version "1.14"
    // Apply the java-library plugin to add support for Java Library
    `java-library`
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api("org.apache.commons:commons-math3:3.6.1")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:26.0-jre")
    // https://mvnrepository.com/artifact/com.fasterxml.jackson/jackson-bom

    implementation(platform("com.fasterxml.jackson:jackson-bom:2.9.7"))
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")



    // Use JUnit test framework
    testCompile("org.junit.jupiter:junit-jupiter-api:5.3.2")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.3.2")

    testImplementation("org.assertj:assertj-core:3.11.1")
}
