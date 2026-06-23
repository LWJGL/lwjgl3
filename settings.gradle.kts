/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
rootProject.name = "Root"

// Turn each LWJGL module directory into a Gradle subproject.
private val excludedDirectories = setOf(
    "core11",
    "core25",
    "core27"
)
file("modules/lwjgl")
    .listFiles { file -> file.isDirectory && file.name !in excludedDirectories }
    .sortedBy { it.name }
    .forEach { include(":modules:lwjgl:${it.name}") }