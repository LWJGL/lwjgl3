/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    `java-platform`
    id("lwjgl-publishing")
}

lwjglPublication.all {
    from(components["javaPlatform"])

    pom {
        packaging = "pom"
    }
}

val lwjglModules = mutableListOf<String>()

project(":lwjgl-modules").subprojects.forEach { subProject ->
    lwjglModules.add(subProject.name)
}

dependencies {
    constraints {
        lwjglModules.forEach { module ->
            api(project(":lwjgl-modules:${module}"))
        }
    }
}