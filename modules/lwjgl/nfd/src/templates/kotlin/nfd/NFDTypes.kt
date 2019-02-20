/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nfd

import org.lwjgl.generator.*

val nfdchar_t = CharType("nfdchar_t", CharMapping.UTF8)

val nfdpathset_t = struct(Module.NFD, "NFDPathSet", nativeName = "nfdpathset_t", mutable = false) {
    nativeImport("nfd.h")
    documentation = "An opaque data structure to be used with #OpenDialogMultiple()."
}

val nfdresult_t = "nfdresult_t".enumType

