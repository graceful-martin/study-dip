dependencies {
    implementation(project(":domain"))
    implementation(project(":storage"))
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
