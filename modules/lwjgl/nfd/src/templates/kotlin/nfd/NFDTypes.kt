/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nfd

import org.lwjgl.generator.*

val nfdchar_t = CharType("nfdchar_t", CharMapping.UTF8)

val nfdpathset_t = "nfdpathset_t".opaque

val nfdfiltersize_t = typedef(unsigned_int, "nfdfiltersize_t")
val nfdpathsetsize_t = typedef(unsigned_int, "nfdpathsetsize_t")

val nfdresult_t = "nfdresult_t".enumType

val nfdfilteritem_t = struct(Module.NFD, "NFDFilterItem", nativeName = "nfdfilteritem_t") {
    nfdchar_t.const.p("name", "")
    nfdchar_t.const.p("spec", "")
}

val nfdpathsetenum_t = struct(Module.NFD, "NFDPathSetEnum", nativeName = "nfdpathsetenum_t", mutable = false) {
    nativeImport("nfd.h")
    documentation = "Opaque data structure -- see {@code NFD_PathSet_*}."
}
