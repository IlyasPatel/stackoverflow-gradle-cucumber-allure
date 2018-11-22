### Build
    gradle clean build -i

### Gradle File

    buildscript {
        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }
        dependencies {
            classpath "io.qameta.allure:allure-gradle:2.5"
        }
    }

    apply plugin: 'java'
    apply plugin: 'io.qameta.allure'

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
    }

    allure {
        autoconfigure = true
        version = '2.4.1'
    }

    dependencies {
        compile 'io.cucumber:cucumber-java:3.0.2'
        compile 'io.cucumber:cucumber-junit:3.0.2'
        compile 'io.qameta.allure:allure-cucumber3-jvm:2.7.0'
        compile 'io.qameta.allure:allure-junit4:2.8.1'

    }


