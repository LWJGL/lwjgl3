/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nfd

import org.lwjgl.generator.*

const val NFD_LIBRARY = "LibNFD.initialize();"

fun config() {
    packageInfo(
        Module.NFD,
        """
        Contains bindings to ${url("https://github.com/mlabbe/nativefiledialog", "Native File Dialog")}, a tiny, neat C library that portably invokes native
        file open and save dialogs. Write dialog code once and have it popup native dialogs on all supported platforms.
        """
    )

    Generator.registerLibraryInit(Module.NFD, "LibNFD", "nfd", setupAllocator = true)
}

val nfdchar_t = CharType("nfdchar_t", CharMapping.UTF8)

val nfdpathset_t = struct(Module.NFD, "NFDPathSet", nativeName = "nfdpathset_t", mutable = false) {
    nativeImport("nfd.h")
    documentation = "An opaque data structure to be used with #OpenDialogMultiple()."
    static(NFD_LIBRARY)
}

val nfdresult_t = "nfdresult_t".enumType

