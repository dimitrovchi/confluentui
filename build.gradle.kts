plugins {
    scala

    id("com.github.maiflai.scalatest").version("0.25")
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

    testImplementation("org.scalatest:scalatest_2.13:3.0.8")
    testImplementation("org.pegdown:pegdown:1.6.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}