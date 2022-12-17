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

    documentation =
        """
        Bindings to ${url("https://github.com/btzy/nativefiledialog-extended", "Native File Dialog Extended")}, a small C library that portably invokes native
        file open, folder select and file save dialogs. Write dialog code once and have it pop up native dialogs on all supported platforms.

        <h3>Usage</h3>
        ${ul(
            "<a href=\"https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java\\#L115\">Single file open dialog</a>",
            "<a href=\"https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java\\#L133\">Multiple file open dialog</a>",
            "<a href=\"https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java\\#L184\">Save dialog</a>"
        )}

        <h3>File Filter Syntax</h3>

        Files can be filtered by file extension groups:
        ${codeBlock("""
nfdfilteritem_t filterItem[2] = { { "Source code", "c,cpp,cc" }, { "Headers", "h,hpp" } };""")}

        A file filter is a pair of strings comprising the friendly name and the specification (multiple file extensions are comma-separated).

        A list of file filters can be passed as an argument when invoking the library.

        A wildcard filter is always added to every dialog.

        Note: On MacOS, the file dialogs do not have friendly names and there is no way to switch between filters, so the filter specifications are combined
        (e.g. "c,cpp,cc,h,hpp"). The filter specification is also never explicitly shown to the user. This is usual MacOS behaviour and users expect it.

        Note 2: You must ensure that the specification string is non-empty and that every file extension has at least one character. Otherwise, bad things
        might ensue (i.e. undefined behaviour).

        Note 3: On Linux, the file extension is appended (if missing) when the user presses down the "Save" button. The appended file extension will remain
        visible to the user, even if an overwrite prompt is shown and the user then presses "Cancel".

        Note 4: On Windows, the default folder parameter is only used if there is no recently used folder available. Otherwise, the default folder will be the
        folder that was last used. Internally, the Windows implementation calls {@code IFileDialog::SetDefaultFolder(IShellItem)}. This is usual Windows
        behaviour and users expect it.

        <h3>Iterating Over PathSets</h3>

        A file open dialog that supports multiple selection produces a {@code PathSet}, which is a thin abstraction over the platform-specific collection.
        There are two ways to iterate over a {@code PathSet}:

        <h4>Accessing by index</h4>

        This method does array-like access on the {@code PathSet}, and is the easiest to use. However, on certain platforms (Linux, and possibly Windows), it
        takes O(N<sup>2</sup>) time in total to iterate the entire {@code PathSet}, because the underlying platform-specific implementation uses a linked list.

        <h4>Using an enumerator</h4>

        This method uses an enumerator object to iterate the paths in the {@code PathSet}. It is guaranteed to take O(N) time in total to iterate the entire
        {@code PathSet}.

        <h3>Usage with a Platform Abstraction Framework</h3>

        NFDe is known to work with SDL2 and GLFW, and should also work with other platform abstraction framworks. However, you should initialize NFDe after
        initializing the framework, and probably should deinitialize NFDe before deinitializing the framework. This is because some frameworks expect to be
        initialized on a "clean slate", and they may configure the system in a different way from NFDe. #Init() is generally very careful not to disrupt the
        existing configuration unless necessary, and #Quit() restores the configuration back exactly to what it was before initialization.

        <h3>Known Limitations</h3>
        ${ul(
            "No support for Windows XP's legacy dialogs such as {@code GetOpenFileName}.",
            """
            GTK dialogs don't set the existing window as parent, so if users click the existing window while the dialog is open then the dialog will go behind
            it. GTK writes a warning to {@code stdout} or {@code stderr} about this.
            """,
            """
            This library does not explicitly dispatch calls to the UI thread. This may lead to crashes if you call functions from other threads when the
            platform does not support it (e.g. MacOS). Users are generally expected to call NFDe from an appropriate UI thread (i.e. the thread performing the
            UI event loop).
            """
        )}
        """

    EnumConstant(
        "Result values. ({@code nfdresult_t})",

        "ERROR" enum "Programmatic error.",
        "OKAY" enum "User pressed okay, or successful return.",
        "CANCEL" enum "User pressed cancel."
    )

    void(
        "FreePath",
        "Free a file path that was returned by the dialogs.",

        RawPointer..nfdchar_t.p("filePath", "")
    )

    nfdresult_t(
        "Init",
        "Initialize NFD - call this for every thread that might use NFD, before calling any other NFD functions on that thread.",

        void()
    )

    void(
        "Quit",
        "Call this to de-initialize NFD, if #Init() returned #OKAY.",

        void()
    )

    nfdresult_t(
        "OpenDialog",
        """
        Single file open dialog.

        It is the caller's responsibility to free {@code outPath} via #FreePath() if this function returns #OKAY.
        """,

        Check(1)..nfdchar_t.p.p("outPath", ""),
        nullable..nfdfilteritem_t.const.p("filterList", ""),
        AutoSize("filterList")..nfdfiltersize_t("filterCount", "if zero, {@code filterList} is ignored (you can use #NULL)"),
        nullable..nfdchar_t.const.p("defaultPath", "if #NULL, the operating system will decide")
    )

    nfdresult_t(
        "OpenDialogMultiple",
        """
        Multiple file open dialog.

        It is the caller's responsibility to free {@code outPaths} via #PathSet_Free() if this function returns #OKAY.
        """,

        Check(1)..nfdpathset_t.const.p.p("outPath", ""),
        nullable..nfdfilteritem_t.const.p("filterList", ""),
        AutoSize("filterList")..nfdfiltersize_t("filterCount", "if zero, {@code filterList} is ignored (you can use #NULL)"),
        nullable..nfdchar_t.const.p("defaultPath", "if #NULL, the operating system will decide")
    )

    nfdresult_t(
        "SaveDialog",
        """
        Save dialog.

        It is the caller's responsibility to free {@code outPath} via #FreePath() if this function returns #OKAY.
        """,

        Check(1)..nfdchar_t.p.p("outPath", ""),
        nullable..nfdfilteritem_t.const.p("filterList", ""),
        AutoSize("filterList")..nfdfiltersize_t("filterCount", "if zero, {@code filterList} is ignored (you can use #NULL)"),
        nullable..nfdchar_t.const.p("defaultPath", "if #NULL, the operating system will decide"),
        nullable..nfdchar_t.const.p("defaultName", "")
    )

    nfdresult_t(
        "PickFolder",
        """
        Select folder dialog.

        It is the caller's responsibility to free {@code outPath} via #FreePath() if this function returns #OKAY.
        """,

        Check(1)..nfdchar_t.p.p("outPath", ""),
        nullable..nfdchar_t.const.p("defaultPath", "if #NULL, the operating system will decide")
    )

    charUTF8.const.p(
        "GetError",
        """
        Get last error -- set when {@code nfdresult_t} returns #ERROR. 

        Returns the last error that was set, or #NULL if there is no error. The memory is owned by NFD and should not be freed by user code. This is
        <b>always</b> ASCII printable characters, so it can be interpreted as UTF-8 without any conversion.
        """,

        void()
    )

    void(
        "ClearError",
        "Clear the error",

        void()
    )

    nfdresult_t(
        "PathSet_GetCount",
        """
        Gets the number of entries stored in {@code pathSet}.

        Note that some paths might be invalid (#ERROR will be returned by #PathSet_GetPath()), so we might not actually have this number of usable paths.
        """,

        nfdpathset_t.const.p("pathSet", ""),
        Check(1)..nfdpathsetsize_t.p("count", "")
    )

    nfdresult_t(
        "PathSet_GetPath",
        """
        Gets the UTF-8 path at offset index.

        It is the caller's responsibility to free {@code outPath} via #PathSet_FreePath() if this function returns #OKAY.
        """,

        nfdpathset_t.const.p("pathSet", ""),
        nfdpathsetsize_t("index", ""),
        Check(1)..nfdchar_t.p.p("outPath", "")
    )


    void(
        "PathSet_FreePath",
        "Free the path gotten by #PathSet_GetPath().",

        RawPointer..nfdchar_t.p("filePath", "")
    )

    nfdresult_t(
        "PathSet_GetEnum",
        """
        Gets an enumerator of the path set.

        It is the caller's responsibility to free {@code enumerator} via #PathSet_FreeEnum() if this function returns #OKAY, and it should be freed before
        freeing the pathset.
        """,

        nfdpathset_t.const.p("pathSet", ""),
        nfdpathsetenum_t.p("outEnumerator", "")
    )

    void(
        "PathSet_FreeEnum",
        "Frees an enumerator of the path set.",

        nfdpathsetenum_t.p("enumerator", "")
    )

    nfdresult_t(
        "PathSet_EnumNext",
        """
        Gets the next item from the path set enumerator.

        If there are no more items, then {@code *outPaths} will be set to #NULL.

        It is the caller's responsibility to free {@code *outPath} via #PathSet_FreePath() if this function returns #OKAY and {@code *outPath} is not null.  
        """,

        nfdpathsetenum_t.p("enumerator", ""),
        Check(1)..nfdchar_t.p.p("outPath", "")
    )

    void(
        "PathSet_Free",
        "Free the {@code pathSet}.",

        nfdpathset_t.const.p("pathSet", "")
    )
}