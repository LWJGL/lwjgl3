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

    val FILE = "FILE".opaque

    macro..FILE.p("stdin", void())
    macro..FILE.p("stdout", void())
    macro..FILE.p("stderr", void())

    int(
        "fflush",

        FILE.p("stream")
    )

    int(
        "feof",

        FILE.p("stream")
    )

    int(
        "ferror",

        FILE.p("stream")
    )

    macro..opaque_p("fscanf", void())
    macro..opaque_p("sscanf", void())

    int(
        "vsscanf",

        charASCII.const.p("buffer"),
        charASCII.const.p("format"),
        va_list("vlist")
    )

    macro..opaque_p("fprintf", void())
    macro..opaque_p("snprintf", void())

    int(
        "vsnprintf",

        nullable..char.p("buffer"),
        AutoSize("buffer")..size_t("buf_size"),
        charASCII.const.p("format"),
        va_list("vlist")
    )
}