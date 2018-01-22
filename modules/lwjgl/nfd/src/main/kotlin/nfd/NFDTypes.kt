/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.nfd

import org.lwjgl.generator.*

val NFD_PACKAGE = "org.lwjgl.util.nfd"
val NFD_LIBRARY = "LibNFD.initialize();"

fun config() {
    packageInfo(
        NFD_PACKAGE,
        """
        Contains bindings to ${url("https://github.com/mlabbe/nativefiledialog", "Native File Dialog")}, a tiny, neat C library that portably invokes native
        file open and save dialogs. Write dialog code once and have it popup native dialogs on all supported platforms.
        """
    )

    Generator.registerLibraryInit(NFD_PACKAGE, "LibNFD", "nfd", setupAllocator = true)
}

val nfdchar_t = CharType("nfdchar_t", CharMapping.UTF8)
val nfdchar_t_p = nfdchar_t.p
val nfdchar_t_pp = nfdchar_t_p.p

val nfdpathset_t_p = struct(NFD_PACKAGE, "NFDPathSet", nativeName = "nfdpathset_t", mutable = false) {
    nativeImport("nfd.h")
    documentation = "An opaque data structure to be used with #OpenDialogMultiple()."
    static(NFD_LIBRARY)
}.p

val nfdresult_t = "nfdresult_t".enumType

