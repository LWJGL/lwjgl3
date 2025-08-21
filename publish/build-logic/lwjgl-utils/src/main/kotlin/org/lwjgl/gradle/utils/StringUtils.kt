/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.gradle.utils

fun String.toPascalCase(): String {
    val parts = this.lowercase().split("-", "_")
    return parts.joinToString("") {
        it.replaceFirstChar { c -> c.uppercaseChar() }
    }
}

fun String.toCamelCase(): String {
    val parts = this.lowercase().split("-", "_")
    return parts.first() + parts.drop(1).joinToString("") {
        it.replaceFirstChar { c -> c.uppercaseChar() }
    }
}