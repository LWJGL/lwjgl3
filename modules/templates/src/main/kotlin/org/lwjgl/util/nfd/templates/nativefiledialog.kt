/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.nfd.templates

import org.lwjgl.generator.*
import org.lwjgl.util.nfd.*

val nativefiledialog = "NativeFileDialog".nativeClass(packageName = NFD_PACKAGE, prefix = "NFD_", prefixMethod = "NFD_", library = NFD_LIBRARY) {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
#endif""", beforeIncludes = true)

    nativeImport("lwjgl_malloc.h")
    nativeImport("nfd_common.h")
    nativeImport("nfd.h")

    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4711))
#endif""")

    documentation =
        """
        Bindings to ${url("https://github.com/mlabbe/nativefiledialog", "Native File Dialog")}, a tiny, neat C library that portably invokes native file open
        and save dialogs. Write dialog code once and have it pop up native dialogs on all supported platforms.

        <h3>Usage</h3>
        ${ul(
            "<a href=\"https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java\\#L97\">Single file open dialog</a>",
            "<a href=\"https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java\\#L119\">Multiple file open dialog</a>",
            "<a href=\"https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java\\#L140\">Save dialog</a>"
        )}

        <h3>File Filter Syntax</h3>

        There is a form of file filtering in every file dialog, but no consistent means of supporting it. NFD provides support for filtering files by groups of
        extensions, providing its own descriptions (where applicable) for the extensions.

        A wildcard filter is always added to every dialog.

        Separators:
        ${ul(
            "<i>;</i> Begin a new filter.",
            "<i>,</i> Add a separate type to the filter."
        )}

        Examples:
        ${ul(
            "<i>txt</i> The default filter is for text files. There is a wildcard option in a dropdown.",
            "<i>png,jpg;psd</i> The default filter is for png and jpg files. A second filter is available for psd files. There is a wildcard option in a dropdown.",
            "#NULL Wildcard only."
        )}

        <h3>Known Limitations</h3>
        ${ul(
            "No support for Windows XP's legacy dialogs such as GetOpenFileName.",
            "No support for file filter names -- ex: \"Image Files\" (*.png, *.jpg). Nameless filters are supported, though.",
            "No support for selecting folders instead of files.",
            "On Linux, GTK+ cannot be uninitialized to save memory. Launching a file dialog costs memory."
        )}
        """

    EnumConstant(
        "Result values.",

        "ERROR" enum "Programmatic error.",
        "OKAY" enum "User pressed okay, or successful return.",
        "CANCEL" enum "User pressed cancel."
    )

    val OpenDialog = nfdresult_t(
        "OpenDialog",
        """
        Launches a single file open dialog.

        If #OKAY is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with #Free() when it is no longer
        needed.
        """,

        nullable..const..nfdchar_t_p.IN("filterList", "an optional filter list"),
        nullable..const..nfdchar_t_p.IN("defaultPath", "an optional default path"),
        Check(1)..nfdchar_t_pp.OUT("outPath", "returns the selected file path")
    )

    nfdresult_t(
        "OpenDialogMultiple",
        """
        Launches a multiple file open dialog.

        If #OKAY is returned, {@code outPaths} will be filled with information about the selected file or files. The user must free that information with
        #PathSet_Free() when it is no longer needed.
        """,

        OpenDialog["filterList"],
        OpenDialog["defaultPath"],
        nfdpathset_t_p.OUT("outPaths", "a path set that will be filled with the selected files")
    )

    nfdresult_t(
        "SaveDialog",
        """
        Launches a save dialog.

        If #OKAY is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with #Free() when it is no longer
        needed.
        """,

        OpenDialog["filterList"],
        OpenDialog["defaultPath"],
        OpenDialog["outPath"]
    )

    nfdresult_t(
        "PickFolder",
        """
        Launches a select folder dialog.

        If #OKAY is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with #Free() when it is no longer
        needed.
        """,

        OpenDialog["defaultPath"],
        OpenDialog["outPath"]
    )

    const..charASCII_p(
        "GetError",
        "Returns the last error."
    )

    size_t(
        "PathSet_GetCount",
        "Returns the number of entries stored in {@code pathSet}.",

        const..nfdpathset_t_p.IN("pathSet", "the path set to query")
    )

    nfdchar_t_p(
        "PathSet_GetPath",
        "Returns the UTF-8 path at offset {@code index}.",

        const..nfdpathset_t_p.IN("pathSet", "the path set to query"),
        size_t.IN("index", "the path offset")
    )

    void(
        "PathSet_Free",
        "Frees the contents of the specified path set.",

        nfdpathset_t_p.IN("pathSet", "the path set")
    )

    NativeName("NFDi_Free")..void(
        "Free",
        "Frees memory allocated by NativeFileDialog.",

        Check(1)..void_p.IN("outPath", "the string to free")
    )
}