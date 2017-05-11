/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libc.*

val string = "LibCString".nativeClass(packageName = LIBC_PACKAGE) {
    /*nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
    __pragma(warning(disable : 4710))
#endif""", beforeIncludes = true)*/

    nativeImport(
        "<string.h>"
    )

    documentation = "Native bindings to string.h."

    opaque_p(
        "memset",
        "Fills memory with a constant byte.",

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void_p.IN("dest", "pointer to destination"),
        int.IN("c", "character to set"),
        AutoSize("dest")..size_t.IN("count", "number of characters"),

        returnDoc = "the value of {@code dest}"
    )

    opaque_p(
        "memcpy",
        "Copies characters between buffers.",

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void_p.IN("dest", "new buffer"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..const..void_p.IN("src", "buffer to copy from"),
        AutoSize("dest", "src")..size_t.IN("count", "number of characters to copy"),

        returnDoc = "the value of {@code dest}"
    )
}