/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.templates

import org.lwjgl.generator.*

val MemoryAccessJNI = "MemoryAccessJNI".nativeClass(packageName = "org.lwjgl.system") {
    nativeImport(
        "<stdlib.h>",
        "<stdint.h>"
    )

    access = Access.INTERNAL
    documentation = "Memory access utilities."

    Code(
        nativeCall = "${t}return (jint)sizeof(void *);"
    )..int(
        "getPointerSize",
        "Returns the {@code sizeof(void *)}."
    )

    val primitives = arrayOf(
        Triple(int8_t, "Byte", "a byte value"),
        Triple(int16_t, "Short", "a short value"),
        Triple(int32_t, "Int", "an int value"),
        Triple(int64_t, "Long", "a long value"),

        Triple(float, "Float", "a float value"),
        Triple(double, "Double", "a double value"),

        Triple(intptr_t, "Address", "a pointer address")
    )

    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4711))
    static void* __aligned_alloc(size_t alignment, size_t size) {
        return _aligned_malloc(size, alignment);
    }
    #define __aligned_free _aligned_free
#else
    #if defined(__USE_ISOC11) && !defined(LWJGL_LINUX)
        #define __aligned_alloc aligned_alloc
    #else
        static void* __aligned_alloc(size_t alignment, size_t size) {
            void *p;
            return posix_memalign(&p, alignment, size) ? NULL : p;
        }
    #endif
    #define __aligned_free free
#endif

// -----------

${primitives
            .asSequence()
            .map {
                val (type, name) = it
                "static inline ${type.name} get$name(void *ptr) { return *(${type.name} *)ptr; }"
            }
            .joinToString("\n")}

// -----------

${primitives
            .asSequence()
            .map {
                val (type, name) = it
                "static inline void put$name(void *ptr, ${type.name} value) { *(${type.name} *)ptr = value; }"
            }
            .joinToString("\n")}

// -----------""")

    arrayOf(
        "malloc",
        "calloc",
        "realloc",
        "free"
    ).forEach {
        macro..Address..opaque_p(
            it,
            "Returns the address of the stdlib {@code $it} function."
        )
    }

    Code(
        nativeCall = "return (jlong)(intptr_t)&__aligned_alloc;"
    )..macro..Address..opaque_p(
        "aligned_alloc",
        "Returns the address of the stdlib {@code aligned_alloc} function."
    )

    Code(
        nativeCall = "return (jlong)(intptr_t)&__aligned_free;"
    )..macro..Address..opaque_p(
        "aligned_free",
        "Returns the address of the stdlib {@code aligned_free} function."
    )

    for ((type, name, msg) in primitives)
        type(
            "get$name",
            "Reads $msg from the specified memory address.",

            opaque_p.IN("ptr", "the memory address to read")
        )

    for ((type, name, msg) in primitives)
        void(
            "put$name",
            "Writes $msg to the specified memory address.",

            opaque_p.IN("ptr", "the memory address to write"),
            type.IN("value", "the value to write")
        )
}