plugins {
    scala
}

group = "org.dimitrovchi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang.modules:scala-swing_2.13:2.1.1")
    implementation("org.scala-lang.modules:scala-java8-compat_2.13:0.9.0")
    implementation("org.scala-lang.modules:scala-async_2.13:0.10.0")
    implementation("org.ekrich:sconfig_2.13:1.0.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}