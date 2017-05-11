/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.tinyfd.templates

import org.lwjgl.generator.*
import org.lwjgl.util.tinyfd.*

val tinyfiledialogs = "TinyFileDialogs".nativeClass(packageName = TinyFD_PACKAGE, prefix = "tinyfd_", library = TinyFD_LIBRARY) {
    nativeImport("tinyfiledialogs.h")
    nativeDirective(
        """#ifndef LWJGL_WINDOWS
    static int tinyfd_winUtf8;
#endif"""
    )

    documentation =
        """
        Bindings to ${url("https://sourceforge.net/projects/tinyfiledialogs/", "tiny file dialogs")}, a native dialog library with support for:
        ${ul(
            "message / question",
            "input / password",
            "save file",
            "open file & multiple files",
            "select folder",
            "color picker"
        )}

        The dialogs can be forced into console mode.
        """

    macro..charASCII_p(
        "version",
        "The library version."
    )

    private..macro..Address..int_p(
        "winUtf8",
        "On windows string char can be 0:MBSC or 1:UTF-8. Unless your code is really prepared for UTF-8 on windows, leave this on MBSC."
    )

    macro..Address..int_p(
        "forceConsole",
        """
        Can be modified at run time.

        For unix & windows: 0 (graphic mode) or 1 (console mode).

        0: try to use a graphic solution, if it fails then it uses console mode.
        1: forces all dialogs into console mode even when the X server is present. It will use the package dialog or dialog.exe if installed. On windows it
        only makes sense for console applications.
        """
    )

    macro(variable = true)..charUTF8_p(
        "response",
        """
        If you pass "tinyfd_query" as {@code aTitle}, the functions will not display the dialogs but will fill {@code tinyfd_response} with the retain solution
        and return:

        Possible values for {@code tinyfd_response} are (all lowercase) for the graphic mode: windows applescript zenity zenity3 matedialog kdialog xdialog
        tkinter gdialog gxmessage xmessage

        For the console mode: dialog whiptail basicinput
        """
    )

    val messageBox = intb(
        "messageBox",
        "Displays a message dialog.",

        nullable..const..charUTF8_p.IN("aTitle", "the dialog title or #NULL"),
        nullable..const..charUTF8_p.IN("aMessage", "the message or #NULL. It may contain \\n and \\t characters."),
        const..charASCII_p.IN("aDialogType", "the dialog type", """"ok" "okcancel" "yesno""""),
        const..charASCII_p.IN("aIconType", "the icon type", """"info" "warning" "error" "question""""),
        intb.IN("aDefaultButton", "0 for cancel/no, 1 for ok/yes"),

        returnDoc = "0 for cancel/no, 1 for ok/yes"
    )

    const..charUTF8_p(
        "inputBox",
        "Displays an input dialog.",

        messageBox["aTitle"],
        nullable..const..charUTF8_p.IN("aMessage", "the message or #NULL. May NOT contain \\n and \\t characters on Windows."),
        nullable..const..charUTF8_p.IN("aDefaultInput", "if #NULL it's a password box"),

        returnDoc = "the input value or #NULL on cancel"
    )

    val saveFileDialog = const..charUTF8_p(
        "saveFileDialog",
        "Displays a file save dialog.",

        messageBox["aTitle"],
        nullable..const..charUTF8_p.IN("aDefaultPathAndFile", "the default path and/or file or #NULL"),
        AutoSize("aFilterPatterns")..int.IN("aNumOfFilterPatterns", "the number of patterns in {@code aFilterPatterns}"),
        nullable..const..charUTF8_p.const.p.IN("aFilterPatterns", """an array of file type patterns (#NULL or {"*.jpg","*.png"}"""),
        nullable..const..charUTF8_p.IN("aSingleFilterDescription", "#NULL or \"image files\""),

        returnDoc = "the selected file path or #NULL on cancel"
    )

    const..charUTF8_p(
        "openFileDialog",
        "Displays a file open dialog.",

        messageBox["aTitle"],
        saveFileDialog["aDefaultPathAndFile"],
        saveFileDialog["aNumOfFilterPatterns"],
        saveFileDialog["aFilterPatterns"],
        saveFileDialog["aSingleFilterDescription"],
        intb.IN("aAllowMultipleSelects", "if true, multiple selections are allowed"),

        returnDoc = "the file(s) selected or #NULL on cancel. In case of multiple files, the separator is '|'."
    )

    const..charUTF8_p(
        "selectFolderDialog",
        "Displays a folder selection dialog.",

        messageBox["aTitle"],
        const..charUTF8_p.IN("aDefaultPath", "the default path or #NULL")
    )

    const..charUTF8_p(
        "colorChooser",
        "Displays a color chooser dialog.",

        messageBox["aTitle"],
        nullable..const..charASCII_p.IN("aDefaultHexRGB", "#NULL or \"\\#FF0000\""),
        nullable..Check(3)..unsigned_char_p.INOUT("aDefaultRGB", "{ 0 , 255 , 255 }. Used only if {@code aDefaultHexRGB} is #NULL."),
        Check(3)..unsigned_char_p.OUT("aoResultRGB", "returns the selected color. {@code aDefaultRGB} and {@code aoResultRGB} can be the same array."),

        returnDoc = "the selected hexcolor as a string \"\\#FF0000\" or #NULL on cancel"
    )
}