/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.dyncall.templates

import org.lwjgl.generator.*
import org.lwjgl.system.dyncall.*

val DynLoad = "DynLoad".nativeClass(DYNCALL_PACKAGE, prefix = "DL") {
    nativeImport(
        "dynload.h"
    )

    documentation =
        """
        Native bindings to \"dynload.h\".

        The dynload library provides an interface to load foreign dynamic libraries and access to their symbols.
        """

    DLLib_p(
        "LoadLibrary",
        "Loads a dynamic library at {@code libpath} and returns a handle to it.",

        const..charASCII_p.IN("libpath", "the dynamic library path")
    )

    void(
        "FreeLibrary",
        "Frees a loaded library.",

        DLLib_p.IN("pLib", "the dynamic library to free")
    )

    opaque_p(
        "FindSymbol",
        """
        Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
        found.
        """,

        DLLib_p.IN("pLib", "the dynamic library"),
        const..charASCII_p.IN("pSymbolName", "the symbol name")
    )

    DLSyms_p(
        "SymsInit",
        "Creates a new {@code DLSyms} object.",

        const..charASCII_p.IN("libPath", "the dynamic library path")
    )

    void(
        "SymsCleanup",
        "Frees the specified {@code DLSyms} object.",

        DLSyms_p.IN("pSyms", "the {@code DLSyms} object to free")
    )

    int(
        "SymsCount",
        "Returns the number of symbols exported by the specified library.",

        DLSyms_p.IN("pSyms", "a {@code DLSyms} object")
    )

    const..charASCII_p(
        "SymsName",
        "Returns the symbol name exported by the specified library at the specified index.",

        DLSyms_p.IN("pSyms", "a {@code DLSyms} object"),
        int.IN("index", "")
    )

    const..charASCII_p(
        "SymsNameFromValue",
        "Returns the symbol name exported by the specified library at the specified address.",

        DLSyms_p.IN("pSyms", "a {@code DLSyms} object"),
        opaque_p.IN("value", "the symbol address")
    )
}