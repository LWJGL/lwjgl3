/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libc.*

val locale = "LibCLocale".nativeClass(packageName = LIBC_PACKAGE) {
    nativeImport(
        "<locale.h>"
    )

    documentation = "Native bindings to locale.h."

    macro..int("LC_ALL", "Selects the entire C locale.")
    macro..int("LC_COLLATE", "Selects the collation category of the C locale.")
    macro..int("LC_CTYPE", "Selects the character classification category of the C locale.")
    macro..int("LC_MONETARY", "Selects the monetary formatting category of the C locale.")
    macro..int("LC_NUMERIC", "Selects the numeric formatting category of the C locale.")
    macro..int("LC_TIME", "Selects the time formatting category of the C locale.")

    charASCII_p(
        "setlocale",
        """
        Gets and sets the current C locale.

        The {@code setlocale} function installs the specified system locale or its portion as the new C locale. The modifications remain in effect and
        influences the execution of all locale-sensitive C library functions until the next call to {@code setlocale}. If {@code locale} is a null pointer,
        {@code setlocale} queries the current C locale without modifying it.
        """,

        int.IN("category", "the locale category identifier, may by null", "#LC_ALL #LC_COLLATE #LC_CTYPE #LC_MONETARY #LC_NUMERIC #LC_TIME"),
        const..charASCII_p.IN("locale", "system-specific locale identifier. Can be \"\" for the user-preferred locale or \"C\" for the minimal locale."),

        returnDoc =
        """
        a pointer to a narrow null-terminated string identifying the C locale after applying the changes, if any, or null pointer on failure.

        A copy of the returned string along with the category used in this call to {@code setlocale} may be used later in the program to restore the locale
        back to the state at the end of this call.
        """
    )
}