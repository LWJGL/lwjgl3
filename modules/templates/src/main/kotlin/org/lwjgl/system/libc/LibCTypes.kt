/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc

import org.lwjgl.generator.*

val LIBC_PACKAGE = "org.lwjgl.system.libc"

fun config() {
    packageInfo(
        LIBC_PACKAGE,
        "Contains bindings to standard C library APIs."
    )
}