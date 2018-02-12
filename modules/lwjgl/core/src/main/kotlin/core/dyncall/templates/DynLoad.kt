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

        charASCII.const.p.IN("libpath", "the dynamic library path")
    )

    void(
        "FreeLibrary",
        "Frees a loaded library.",

        DLLib.p.IN("pLib", "the dynamic library to free")
    )

    opaque_p(
        "FindSymbol",
        """
        Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
        found.
        """,

        DLLib.p.IN("pLib", "the dynamic library"),
        charASCII.const.p.IN("pSymbolName", "the symbol name")
    )

    DLSyms.p(
        "SymsInit",
        "Creates a new {@code DLSyms} object.",

        charASCII.const.p.IN("libPath", "the dynamic library path")
    )

    void(
        "SymsCleanup",
        "Frees the specified {@code DLSyms} object.",

        DLSyms.p.IN("pSyms", "the {@code DLSyms} object to free")
    )

    int(
        "SymsCount",
        "Returns the number of symbols exported by the specified library.",

        DLSyms.p.IN("pSyms", "a {@code DLSyms} object")
    )

    charASCII.const.p(
        "SymsName",
        "Returns the symbol name exported by the specified library at the specified index.",

        DLSyms.p.IN("pSyms", "a {@code DLSyms} object"),
        int.IN("index", "")
    )

    charASCII.const.p(
        "SymsNameFromValue",
        "Returns the symbol name exported by the specified library at the specified address.",

        DLSyms.p.IN("pSyms", "a {@code DLSyms} object"),
        opaque_p.IN("value", "the symbol address")
    )
}