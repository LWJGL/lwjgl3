/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libc.templates

import org.lwjgl.generator.*

val string = "LibCString".nativeClass(Module.CORE_LIBC) {
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
        "Fills a memory area with a constant byte.",

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.p.IN("dest", "pointer to the memory area to fill"),
        int.IN("c", "byte to set"),
        AutoSize("dest")..size_t.IN("count", "number of bytes to fill"),

        returnDoc = "the value of {@code dest}"
    )

    customMethod("""
    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memset(@NativeType("void *") T dest, @NativeType("int") int c) {
        return nmemset(memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) * dest.sizeof());
    }""")

    opaque_p(
        "memcpy",
        "Copies bytes between memory areas that must not overlap.",

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.p.IN("dest", "pointer to the destination memory area"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.const.p.IN("src", "pointer to the source memory area"),
        AutoSize("src", "dest")..size_t.IN("count", "the number of bytes to be copied"),

        returnDoc = "the value of {@code dest}"
    )

    customMethod("""
    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memcpy(@NativeType("void *") T dest, @NativeType("void const *") T src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), (long)src.remaining() * src.sizeof());
    }""")
}