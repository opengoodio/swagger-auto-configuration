import io.opengood.gradle.enumeration.ProjectType

plugins {
    id("io.opengood.gradle.config") version "1.22.0"
}

group = "io.opengood.autoconfig"

opengood {
    main {
        projectType = ProjectType.LIB
    }
    artifact {
        description = "Spring Boot auto-configuration for OpenAPI documentation using Spring Doc"
    }
}

object Versions {
    const val SPRING_DOC_OPENAPI = "1.5.9"
}

dependencies {
    implementation("javax.servlet:javax.servlet-api")
    implementation("org.springframework.boot:spring-boot-starter-web")
    api("org.springdoc:springdoc-openapi-ui:${Versions.SPRING_DOC_OPENAPI}")
}
