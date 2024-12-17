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

    opaque_p(
        "memset",

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.p("dest"),
        int("c"),
        AutoSize("dest")..size_t("count")
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

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.p("dest"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.const.p("src"),
        AutoSize("src", "dest")..size_t("count")
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

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.p("dest"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE,
            byteArray = true
        )..void.const.p("src"),
        AutoSize("src", "dest")..size_t("count")
    )

    size_t(
        "strlen",

        NullTerminated..char.const.p("str")
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

        int("errnum")
    )
}