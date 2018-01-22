/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux

import org.lwjgl.generator.*

const val LINUX_PACKAGE = "org.lwjgl.system.linux"

fun config() {
    packageInfo(
        Module.CORE_LINUX,
        "Contains bindings to native APIs specific to the Linux operating system."
    )
}

val long = IntegerType("long", PrimitiveMapping.POINTER)
val unsigned_long = IntegerType("unsigned long", PrimitiveMapping.POINTER, unsigned = true)
val unsigned_long_p = unsigned_long.p