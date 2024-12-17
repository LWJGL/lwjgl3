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
    LLVMBool(
        "LoadLibraryPermanently",

        charUTF8.const.p("Filename")
    )

    void(
        "ParseCommandLineOptions",

        AutoSize("argv")..int("argc"),
        charUTF8.const.p.const.p("argv"),
        charUTF8.const.p("Overview")
    )

    opaque_p(
        "SearchForAddressOfSymbol",

        charUTF8.const.p("symbolName")
    )

    void(
        "AddSymbol",

        charUTF8.const.p("symbolName"),
        opaque_p("symbolValue")
    )
}