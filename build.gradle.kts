plugins {
    scala
    application

    id("com.github.maiflai.scalatest").version("0.25")
}

group = "org.dimitrovchi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.0")
    implementation("org.scala-lang.modules:scala-async_2.13:0.10.0")
    implementation("org.ekrich:sconfig_2.13:1.0.0")
    implementation("com.typesafe.scala-logging:scala-logging_2.13:3.9.2")
    implementation("org.slf4j:jul-to-slf4j:1.7.28")
    implementation("ch.qos.logback:logback-classic:1.2.3")

    testImplementation("org.scalatest:scalatest_2.13:3.0.8")
    testImplementation("org.pegdown:pegdown:1.6.0")
}

configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.parboiled" && requested.name == "parboiled-java") {
            useVersion("1.3.1")
        }
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_12
}

configure<ApplicationPluginConvention> {
    mainClassName = "org.dimitrovchi.confluentui.Launch"
}

tasks {
    "compileScala"(ScalaCompile::class) {
        targetCompatibility = JavaVersion.VERSION_12.majorVersion
    }

    "test"(Test::class) {
        jvmArgs = listOf(
                "--illegal-access=warn",
                "--add-opens=java.base/java.lang=ALL-UNNAMED"
        )
    }
}