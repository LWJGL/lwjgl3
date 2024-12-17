/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libc.templates

import org.lwjgl.generator.*

val stdio = "LibCStdio".nativeClass(Module.CORE_LIBC) {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
#endif""", beforeIncludes = true)

    nativeImport("<stdio.h>")

    macro..opaque_p("sscanf", void())

    int(
        "vsscanf",

        charASCII.const.p("buffer"),
        charASCII.const.p("format"),
        va_list("vlist")
    )

    macro..opaque_p("snprintf", void())

    int(
        "vsnprintf",

        nullable..char.p("buffer"),
        AutoSize("buffer")..size_t("buf_size"),
        charASCII.const.p("format"),
        va_list("vlist")
    )
}