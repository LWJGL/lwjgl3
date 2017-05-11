/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libc.*

val stdio = "LibCStdio".nativeClass(packageName = LIBC_PACKAGE) {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
    __pragma(warning(disable : 4710))
#endif""", beforeIncludes = true)

    nativeImport(
        "<stdio.h>"
    )

    documentation = "Native bindings to stdio.h."

    macro..opaque_p("sscanf", "The address of the {@code sscanf} function.")

    int(
        "vsscanf",
        """
        Reads data from the null-terminated character string {@code buffer}, interprets it according to {@code format} and stores the results into locations
        defined by {@code vlist}.
        """,

        const..charASCII_p.IN("buffer", "pointer to a null-terminated character string to read from"),
        const..charASCII_p.IN("format", "pointer to a null-terminated character string specifying how to read the input"),
        va_list.IN("vlist", "variable argument list containing the receiving arguments"),

        returnDoc =
        "the number of receiving arguments successfully assigned, or {@code EOF} if read failure occurs before the first receiving argument was assigned"
    )

    macro..opaque_p("sprintf", "The address of the {@code sprintf} function.")
    macro..opaque_p("snprintf", "The address of the {@code snprintf} function.")

    int(
        "vsnprintf",
        """
        Loads the data from the locations, defined by {@code vlist}, converts them to character string equivalents and writes the results to a character string
        buffer.
        """,

        nullable..char_p.OUT("buffer", "pointer to a character string to write to"),
        AutoSize("buffer")..size_t.IN("buf_size", "up to {@code buf_size - 1} characters may be written, plus the null terminator"),
        const..charASCII_p.IN("format", "pointer to a null-terminated character string specifying how to interpret the data"),
        va_list.IN("vlist", "variable argument list containing the data to print"),

        returnDoc =
        """
        the number of characters written if successful or negative value if an error occurred. If the resulting string gets truncated due to {@code buf_size}
        limit, function returns the total number of characters (not including the terminating null-byte) which would have been written, if the limit was not
        imposed.
        """
    )
}