plugins {
    id("java")
}
group = "com.robert"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.ow2.asm:asm:${Config.asmVersion}")
    implementation("org.ow2.asm:asm-commons:${Config.asmVersion}")
    implementation("org.ow2.asm:asm-util:${Config.asmVersion}")
    implementation("org.ow2.asm:asm-tree:${Config.asmVersion}")
    implementation("org.ow2.asm:asm-analysis:${Config.asmVersion}")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}