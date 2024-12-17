/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libc.templates

import org.lwjgl.generator.*

val locale = "LibCLocale".nativeClass(Module.CORE_LIBC) {
    nativeImport(
        "<locale.h>"
    )

    macro..int("LC_ALL", void())
    macro..int("LC_COLLATE", void())
    macro..int("LC_CTYPE", void())
    macro..int("LC_MONETARY", void())
    macro..int("LC_NUMERIC", void())
    macro..int("LC_TIME", void())

    charASCII.p(
        "setlocale",

        int("category"),
        charASCII.const.p("locale")
    )
}