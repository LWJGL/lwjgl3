/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMSupport = "LLVMSupport".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    LLVMBool(
        "LoadLibraryPermanently",
        "This function permanently loads the dynamic library at the given path. It is safe to call this function multiple times for the same library.",

        charUTF8.const.p("Filename", "")
    )

    void(
        "ParseCommandLineOptions",
        """
        This function parses the given arguments using the LLVM command line parser.

        Note that the only stable thing about this function is its signature; you cannot rely on any particular set of command line arguments being interpreted
        the same way across LLVM versions.
        """,

        AutoSize("argv")..int("argc", ""),
        charUTF8.const.p.const.p("argv", ""),
        charUTF8.const.p("Overview", "")
    )

    opaque_p(
        "SearchForAddressOfSymbol",
        """
        This function will search through all previously loaded dynamic libraries for the symbol {@code symbolName}. If it is found, the address of that symbol
        is returned. If not, null is returned.
        """,

        charUTF8.const.p("symbolName", "")
    )

    void(
        "AddSymbol",
        "This functions permanently adds the symbol {@code symbolName} with the value {@code symbolValue}. These symbols are searched before any libraries.",

        charUTF8.const.p("symbolName", ""),
        opaque_p("symbolValue", "")
    )
}