/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyfd.templates

import org.lwjgl.generator.*

val tinyfiledialogs = "TinyFileDialogs".nativeClass(Module.TINYFD, prefix = "tinyfd_") {
    nativeImport("tinyfiledialogs.h")

    documentation =
        """
        Bindings to ${url("https://sourceforge.net/projects/tinyfiledialogs/", "tiny file dialogs")}, a native dialog library with support for:
        ${ul(
            "message / question",
            "input / password",
            "save file",
            "open file &amp; multiple files",
            "select folder",
            "color picker"
        )}

        The dialogs can be forced into console mode.
        """

    StringConstant("Contains tinyfd current version number.", "version".."tinyfd_version")
    StringConstant("Contains info about requirements.", "needs".."tinyfd_needs")
    StringConstant(
        """
        If you pass "tinyfd_query" as {@code aTitle}, the functions will not display the dialogs but will fill {@code tinyfd_response} with the retain solution
        and return 0 for console mode, 1 for graphic mode.

        Possible values for {@code tinyfd_response} are (all lowercase) for the graphic mode:
        ${codeBlock("""
windows_wchar windows applescript kdialog zenity zenity3 matedialog
shellementary qarma yad python2-tkinter python3-tkinter python-dbus
perl-dbus gxmessage gmessage xmessage xdialog gdialog""")}

        For the console mode:
        ${codeBlock("""
dialog whiptail basicinput no_solution""")}
        """,

        "response".."tinyfd_response"
    )

    StringConstant(
        "0 (default) or 1 : on unix, prints the command line calls",
        "verbose".."tinyfd_verbose"
    )
    StringConstant(
        "1 (default) or 0 : on unix, hide errors and warnings from called dialogs",

        "silent".."tinyfd_silent"
    )
    StringConstant(
        "Curses dialogs are difficult to use, on windows they are only ascii and uses the unix backslash",

        "allowCursesDialogs".."tinyfd_allowCursesDialogs"
    )
    StringConstant(
        """
        0 (default) or 1. For unix &amp; windows: 0 (graphic mode) or 1 (console mode).

        0: try to use a graphic solution, if it fails then it uses console mode.
        
        1: forces all dialogs into console mode even when an X server is present, it can use the package dialog or dialog.exe. On windows it only make sense
        for console applications
        """,
        "forceConsole".."tinyfd_forceConsole")
    StringConstant(
        """
         0 (default) or 1.
         
         Some systems don't set the environment variable {@code DISPLAY} even when a graphic display is present. Set this to 1 to tell tinyfiledialogs to
         assume the existence of a graphic display.
        """,
        "assumeGraphicDisplay".."tinyfd_assumeGraphicDisplay")
    StringConstant(
        """
        On windows, set to 1 if you want to use UTF-8.
        
        <b>LWJGL note</b>: this is automatically set to 1.
        """,

        "winUtf8".."tinyfd_winUtf8"
    )

    charASCII.const.p(
        "getGlobalChar",
        "",

        charASCII.const.p("aCharVariableName", "", "#version #needs #response"),

        returnDoc = "#NULL on error"
    )

    int(
        "getGlobalInt",
        "",

        charASCII.const.p("aIntVariableName", "", "#verbose #silent #allowCursesDialogs #forceConsole #assumeGraphicDisplay #winUtf8"),

        returnDoc = "-1 on error"
    )

    int(
        "setGlobalInt",
        "",

        charASCII.const.p("aIntVariableName", "", "#verbose #silent #allowCursesDialogs #forceConsole #assumeGraphicDisplay #winUtf8"),
        int("aValue", ""),

        returnDoc = "-1 on error"
    )

    void(
        "beep",
        "",

        void()
    )

    int(
        "notifyPopup",
        "Displays a notification popup.",

        nullable..charUTF8.const.p("aTitle", "the dialog title or #NULL"),
        nullable..charUTF8.const.p("aMessage", "the message or #NULL. It may contain \\n and \\t characters."),
        charASCII.const.p("aIconType", "the icon type", """"info" "warning" "error"""")
    )

    val messageBox = intb(
        "messageBox",
        "Displays a message dialog.",

        nullable..charUTF8.const.p("aTitle", "the dialog title or #NULL"),
        nullable..charUTF8.const.p("aMessage", "the message or #NULL. It may contain \\n and \\t characters."),
        charASCII.const.p("aDialogType", "the dialog type", """"ok" "okcancel" "yesno" "yesnocancel""""),
        charASCII.const.p("aIconType", "the icon type", """"info" "warning" "error" "question""""),
        intb("aDefaultButton", "0 for cancel/no, 1 for ok/yes"),

        returnDoc = "0 for cancel/no, 1 for ok/yes, 2 for no in yesnocancel"
    )

    charUTF8.const.p(
        "inputBox",
        "Displays an input dialog.",

        messageBox["aTitle"],
        nullable..charUTF8.const.p("aMessage", "the message or #NULL. May NOT contain \\n and \\t characters on Windows."),
        nullable..charUTF8.const.p("aDefaultInput", "if #NULL it's a password box"),

        returnDoc = "the input value or #NULL on cancel"
    )

    val saveFileDialog = charUTF8.const.p(
        "saveFileDialog",
        "Displays a file save dialog.",

        messageBox["aTitle"],
        nullable..charUTF8.const.p("aDefaultPathAndFile", "the default path and/or file or #NULL"),
        AutoSize("aFilterPatterns")..int("aNumOfFilterPatterns", "the number of patterns in {@code aFilterPatterns}"),
        nullable..charUTF8.const.p.const.p("aFilterPatterns", """an array of file type patterns (#NULL or {"*.jpg","*.png"}"""),
        nullable..charUTF8.const.p("aSingleFilterDescription", "#NULL or \"image files\""),

        returnDoc = "the selected file path or #NULL on cancel"
    )

    charUTF8.const.p(
        "openFileDialog",
        "Displays a file open dialog.",

        messageBox["aTitle"],
        saveFileDialog["aDefaultPathAndFile"],
        saveFileDialog["aNumOfFilterPatterns"],
        saveFileDialog["aFilterPatterns"],
        saveFileDialog["aSingleFilterDescription"],
        intb("aAllowMultipleSelects", "if true, multiple selections are allowed"),

        returnDoc = "the file(s) selected or #NULL on cancel. In case of multiple files, the separator is '|'."
    )

    charUTF8.const.p(
        "selectFolderDialog",
        "Displays a folder selection dialog.",

        messageBox["aTitle"],
        charUTF8.const.p("aDefaultPath", "the default path or #NULL")
    )

    charUTF8.const.p(
        "colorChooser",
        "Displays a color chooser dialog.",

        messageBox["aTitle"],
        nullable..charASCII.const.p("aDefaultHexRGB", "#NULL or \"\\#FF0000\""),
        nullable..Check(3)..unsigned_char.p("aDefaultRGB", "{ 0 , 255 , 255 }. Used only if {@code aDefaultHexRGB} is #NULL."),
        Check(3)..unsigned_char.p("aoResultRGB", "returns the selected color. {@code aDefaultRGB} and {@code aoResultRGB} can be the same array."),

        returnDoc = "the selected hexcolor as a string \"\\#FF0000\" or #NULL on cancel"
    )
}