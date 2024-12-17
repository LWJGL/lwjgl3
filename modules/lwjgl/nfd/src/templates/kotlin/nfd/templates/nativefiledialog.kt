/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nfd.templates

import org.lwjgl.generator.*
import nfd.*

val nativefiledialog = "NativeFileDialog".nativeClass(Module.NFD, prefix = "NFD", prefixMethod = "NFD_") {
    nativeImport("lwjgl_malloc.h")
    nativeImport("include/nfd.h")

    EnumConstant(
        "ERROR".enum,
        "OKAY".enum,
        "CANCEL".enum
    )

    EnumConstant(
        "WINDOW_HANDLE_TYPE_UNSET".enum("0"),
        "WINDOW_HANDLE_TYPE_WINDOWS".enum,
        "WINDOW_HANDLE_TYPE_COCOA".enum,
        "WINDOW_HANDLE_TYPE_X11".enum,
    )

    void(
        "FreePath",

        RawPointer..nfdchar_t.p("filePath")
    )

    nfdresult_t(
        "Init",

        void()
    )

    void(
        "Quit",

        void()
    )

    nfdresult_t(
        "OpenDialog",

        Check(1)..nfdchar_t.p.p("outPath"),
        nullable..nfdfilteritem_t.const.p("filterList"),
        AutoSize("filterList")..nfdfiltersize_t("filterCount"),
        nullable..nfdchar_t.const.p("defaultPath")
    )

    nfdresult_t(
        "OpenDialog_With",

        Check(1)..nfdchar_t.p.p("outPath"),
        nfdopendialogu8args_t.const.p("args")
    )

    nfdresult_t(
        "OpenDialogMultiple",

        Check(1)..nfdpathset_t.const.p.p("outPath"),
        nullable..nfdfilteritem_t.const.p("filterList"),
        AutoSize("filterList")..nfdfiltersize_t("filterCount"),
        nullable..nfdchar_t.const.p("defaultPath")
    )

    nfdresult_t(
        "OpenDialogMultiple_With",

        Check(1)..nfdpathset_t.const.p.p("outPath"),
        nfdopendialogu8args_t.const.p("args")
    )

    nfdresult_t(
        "SaveDialog",

        Check(1)..nfdchar_t.p.p("outPath"),
        nullable..nfdfilteritem_t.const.p("filterList"),
        AutoSize("filterList")..nfdfiltersize_t("filterCount"),
        nullable..nfdchar_t.const.p("defaultPath"),
        nullable..nfdchar_t.const.p("defaultName")
    )

    nfdresult_t(
        "SaveDialog_With",

        Check(1)..nfdchar_t.p.p("outPath"),
        nfdsavedialogu8args_t.const.p("args")
    )

    nfdresult_t(
        "PickFolder",

        Check(1)..nfdchar_t.p.p("outPath"),
        nullable..nfdchar_t.const.p("defaultPath")
    )

    nfdresult_t(
        "PickFolder_With",

        Check(1)..nfdchar_t.p.p("outPath"),
        nfdpickfolderu8args_t.const.p("args")
    )

    nfdresult_t(
        "PickFolderMultiple",

        Check(1)..nfdpathset_t.const.p.p("outPaths"),
        nullable..nfdchar_t.const.p("defaultPath")
    )

    nfdresult_t(
        "PickFolderMultiple_With",

        Check(1)..nfdpathset_t.const.p.p("outPaths"),
        nfdpickfolderu8args_t.const.p("args")
    )

    charUTF8.const.p(
        "GetError",

        void()
    )

    void(
        "ClearError",

        void()
    )

    nfdresult_t(
        "PathSet_GetCount",

        nfdpathset_t.const.p("pathSet"),
        Check(1)..nfdpathsetsize_t.p("count")
    )

    nfdresult_t(
        "PathSet_GetPath",

        nfdpathset_t.const.p("pathSet"),
        nfdpathsetsize_t("index"),
        Check(1)..nfdchar_t.p.p("outPath")
    )


    void(
        "PathSet_FreePath",

        RawPointer..nfdchar_t.p("filePath")
    )

    nfdresult_t(
        "PathSet_GetEnum",

        nfdpathset_t.const.p("pathSet"),
        nfdpathsetenum_t.p("outEnumerator")
    )

    void(
        "PathSet_FreeEnum",

        nfdpathsetenum_t.p("enumerator")
    )

    nfdresult_t(
        "PathSet_EnumNext",

        nfdpathsetenum_t.p("enumerator"),
        Check(1)..nfdchar_t.p.p("outPath")
    )

    void(
        "PathSet_Free",

        nfdpathset_t.const.p("pathSet")
    )
}