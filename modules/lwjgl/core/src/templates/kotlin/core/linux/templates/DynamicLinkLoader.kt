/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import org.lwjgl.generator.*

val dlfcn = "DynamicLinkLoader".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport("<dlfcn.h>")

    IntConstant(
        "RTLD_LAZY"..0x00001,
        "RTLD_NOW"..0x00002,
        "RTLD_BINDING_MASK"..0x3,
        "RTLD_NOLOAD"..0x00004,
        "RTLD_DEEPBIND"..0x00008
    )

    IntConstant(
        "RTLD_GLOBAL"..0x00100,
        "RTLD_LOCAL".."0",
        "RTLD_NODELETE"..0x01000
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