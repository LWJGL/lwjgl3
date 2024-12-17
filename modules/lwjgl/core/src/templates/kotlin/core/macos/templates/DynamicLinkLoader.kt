/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos.templates

import org.lwjgl.generator.*

val dlfcn = "DynamicLinkLoader".nativeClass(Module.CORE_MACOS, nativeSubPath = "macos") {
    nativeImport("<dlfcn.h>")

    IntConstant(
        "RTLD_LAZY"..0x1,
        "RTLD_NOW"..0x2,
        "RTLD_LOCAL"..0x4,
        "RTLD_GLOBAL"..0x8
    )

    LongConstant(
        "RTLD_NEXT"..-1L,
        "RTLD_DEFAULT"..-2L,
        "RTLD_SELF"..-3L,
        "RTLD_MAIN_ONLY"..-5L
    )

    // skipping dladdr

    opaque_p(
        "dlopen",
        nullable..charUTF8.const.p("path"),
        int("mode")
    )

    charUTF8.const.p(
        "dlerror",
        void()
    )

    opaque_p(
        "dlsym",

        opaque_p("handle"),
        charASCII.const.p("name")
    )

    int(
        "dlclose",

        opaque_p("handle")
    )

}