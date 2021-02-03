plugins {
    id("org.springframework.boot")

    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {

    runtimeOnly("com.h2database:h2")
    implementation("org.springframework.data:spring-data-jpa")
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation("org.hibernate:hibernate-entitymanager:5.4.27.Final")

    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
