/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val sys_stat_h = "Stat".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport(
        "<sys/stat.h>",
        "<errno.h>"
    )
    // TODO:

    int(
        "stat",

        CaptureCallState.errno.param,
        charUTF8.const.p("__file"),
        stat.p("__buf")
    )

    int(
        "fstat",

        CaptureCallState.errno.param,
        int("__fd"),
        stat.p("__buf")
    )
}