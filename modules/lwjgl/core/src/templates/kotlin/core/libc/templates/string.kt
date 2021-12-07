/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libc.templates

import org.lwjgl.generator.*

val string = "LibCString".nativeClass(Module.CORE_LIBC) {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
#endif""", beforeIncludes = true)
    nativeImport("<string.h>")

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
        )..void.p("dest", "pointer to the memory area to fill"),
        int("c", "byte to set"),
        AutoSize("dest")..size_t("count", "number of bytes to fill"),

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
        )..void.p("dest", "pointer to the destination memory area"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.const.p("src", "pointer to the source memory area"),
        AutoSize("src", "dest")..size_t("count", "the number of bytes to be copied"),

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

    opaque_p(
        "memmove",
        """
        Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.

        The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
        {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.
        """,

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.p("dest", "pointer to the destination memory area"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.const.p("src", "pointer to the source memory area"),
        AutoSize("src", "dest")..size_t("count", "the number of bytes to be copied"),

        returnDoc = "the value of {@code dest}"
    )

    customMethod("""
    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     *
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memmove(@NativeType("void *") T dest, @NativeType("void const *") T src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), (long)src.remaining() * src.sizeof());
    }""")

    charASCII.p(
        "strerror",
        "Returns string describing error number.",

        int("errnum", "")
    )
}