plugins {
    id("org.springframework.boot")

    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {

    implementation("com.lowagie:itext:2.1.7")
    implementation("br.com.caelum.stella:caelum-stella-core:2.1.2")
    implementation("br.com.caelum.stella:caelum-stella-boleto:2.1.2")

    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
