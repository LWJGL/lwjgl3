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
    nfdchar_t.const.p("name")
    nfdchar_t.const.p("spec")
}

val nfdpathsetenum_t = struct(Module.NFD, "NFDPathSetEnum", nativeName = "nfdpathsetenum_t", mutable = false) {
    nativeImport("nfd.h")
}

val nfdwindowhandle_t = struct(Module.NFD, "NFDWindowHandle", nativeName = "nfdwindowhandle_t") {
    size_t("type")
    nullable..opaque_p("handle")
}

val nfdopendialogu8args_t = struct(Module.NFD, "NFDOpenDialogArgs", nativeName = "nfdopendialogu8args_t") {
    nfdfilteritem_t.const.p("filterList")
    AutoSize("filterList", optional = true)..nfdfiltersize_t("filterCount")
    nullable..nfdchar_t.const.p("defaultPath")
    nfdwindowhandle_t("parentWindow")
}

val nfdsavedialogu8args_t = struct(Module.NFD, "NFDSaveDialogArgs", nativeName = "nfdsavedialogu8args_t") {
    nfdfilteritem_t.const.p("filterList")
    AutoSize("filterList", optional = true)..nfdfiltersize_t("filterCount")
    nullable..nfdchar_t.const.p("defaultPath")
    nullable..nfdchar_t.const.p("defaultName")
    nfdwindowhandle_t("parentWindow")
}

val nfdpickfolderu8args_t = struct(Module.NFD, "NFDPickFolderArgs", nativeName = "nfdpickfolderu8args_t") {
    nullable..nfdchar_t.const.p("defaultPath")
    nfdwindowhandle_t("parentWindow")
}