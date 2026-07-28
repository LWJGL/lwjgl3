/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libc.templates

import org.lwjgl.generator.*

val stdlib = "LibCStdlib".nativeClass(Module.CORE_LIBC) {
    nativeImport(
        "<stdlib.h>"
    )

    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #define __aligned_alloc(alignment, size) _aligned_malloc(size, alignment)
    #define __aligned_free _aligned_free
#else
    #if defined(__USE_ISOC11)
        #define __aligned_alloc aligned_alloc
    #else
        static inline void* __aligned_alloc(size_t alignment, size_t size) {
            void *p;
            return posix_memalign(&p, alignment, size) ? NULL : p;
        }
    #endif
    #define __aligned_free free
#endif""")

    void.p(
        "malloc",

        AutoSizeResult..size_t("size")
    )

    void.p(
        "calloc",

        AutoSizeResult..size_t("nmemb"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "realloc",

        Unsafe..nullable..void.p("ptr"),
        AutoSizeResult..size_t("size")
    )

    OffHeapOnly..void(
        "free",

        MultiTypeAll..Unsafe..nullable..void.p("ptr")
    )

    Code(
        nativeCall = "${t}return (jlong)(uintptr_t)__aligned_alloc((size_t)alignment, (size_t)size);"
    )..void.p(
        "aligned_alloc",

        size_t("alignment"),
        AutoSizeResult..size_t("size")
    )

    Code(
        nativeCall = "${t}__aligned_free(ptr);"
    )..OffHeapOnly..void(
        "aligned_free",

        Unsafe..MultiTypeAll..nullable..void.p("ptr")
    )
}