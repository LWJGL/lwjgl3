/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.freebsd.templates

import org.lwjgl.generator.*

val dlfcn = "DynamicLinkLoader".nativeClass(Module.CORE_FREEBSD, nativeSubPath = "freebsd") {
    nativeImport("<dlfcn.h>")

    IntConstant(
        "RTLD_LAZY".."1",
        "RTLD_NOW".."2",
        "RTLD_MODEMASK"..0x3,
        "RTLD_GLOBAL"..0x100,
        "RTLD_LOCAL".."0",
        "RTLD_TRACE"..0x200,
        "RTLD_NODELETE"..0x01000,
        "RTLD_NOLOAD"..0x02000,
        "RTLD_DEEPBIND"..0x04000
    )

    opaque_p(
        "dlopen",

        nullable..charUTF8.const.p("filename"),
        int("mode")
    )

    charUTF8.p(
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