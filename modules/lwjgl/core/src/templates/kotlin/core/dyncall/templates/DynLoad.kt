/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.dyncall.templates

import org.lwjgl.generator.*
import core.dyncall.*

val DynLoad = "DynLoad".nativeClass(Module.CORE_DYNCALL, prefix = "DL") {
    nativeImport(
        "dynload.h"
    )

    documentation =
        """
        Native bindings to \"dynload.h\".

        The dynload library provides an interface to load foreign dynamic libraries and access to their symbols.
        """

    DLLib.p(
        "LoadLibrary",
        "Loads a dynamic library at {@code libpath} and returns a handle to it.",

        charASCII.const.p("libpath", "the dynamic library path")
    )

    void(
        "FreeLibrary",
        "Frees a loaded library.",

        DLLib.p("pLib", "the dynamic library to free")
    )

    opaque_p(
        "FindSymbol",
        """
        Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
        found.
        """,

        DLLib.p("pLib", "the dynamic library"),
        charASCII.const.p("pSymbolName", "the symbol name")
    )

    int(
        "GetLibraryPath",
        """
        Gets a copy of the path to the library loaded with handle {@code pLib}.

        The parameter {@code sOut} is a pointer to a buffer of size {@code bufSize} (in bytes), to hold the output string. The return value is the size of the
        buffer (in bytes) needed to hold the null-terminated string, or 0 if it can't be looked up. If {@code bufSize >= return value > 1}, a null-terminated
        string with the path to the library should be in {@code sOut}. If it returns 0, the library name wasn't able to be found. Please note that this might
        happen in some rare cases, so make sure to always check.
        """,

        DLLib.p("pLib", "the dynamic library"),
        Return(RESULT, includesNT = true)..charASCII.p("sOut", "pointer to a buffer where the library path will be stored"),
        AutoSize("sOut")..int("bufSize", "the size of {@code sOut}, in bytes")
    )

    DLSyms.p(
        "SymsInit",
        "Creates a new {@code DLSyms} object.",

        charASCII.const.p("libPath", "the dynamic library path")
    )

    void(
        "SymsCleanup",
        "Frees the specified {@code DLSyms} object.",

        DLSyms.p("pSyms", "the {@code DLSyms} object to free")
    )

    int(
        "SymsCount",
        "Returns the number of symbols exported by the specified library.",

        DLSyms.p("pSyms", "a {@code DLSyms} object")
    )

    charASCII.const.p(
        "SymsName",
        "Returns the symbol name exported by the specified library at the specified index.",

        DLSyms.p("pSyms", "a {@code DLSyms} object"),
        int("index", "")
    )

    charASCII.const.p(
        "SymsNameFromValue",
        "Returns the symbol name exported by the specified library at the specified address.",

        DLSyms.p("pSyms", "a {@code DLSyms} object"),
        opaque_p("value", "the symbol address")
    )
}