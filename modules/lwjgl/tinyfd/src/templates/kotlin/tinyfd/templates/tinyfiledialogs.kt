/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyfd.templates

import org.lwjgl.generator.*

val tinyfiledialogs = "TinyFileDialogs".nativeClass(Module.TINYFD, prefix = "tinyfd_") {
    nativeImport("tinyfiledialogs.h")

    StringConstant(
        "version".."tinyfd_version",
        "needs".."tinyfd_needs",
        "response".."tinyfd_response",
        "verbose".."tinyfd_verbose",
        "silent".."tinyfd_silent",
        "allowCursesDialogs".."tinyfd_allowCursesDialogs",
        "forceConsole".."tinyfd_forceConsole",
        "winUtf8".."tinyfd_winUtf8"
    )

    charASCII.const.p(
        "getGlobalChar",

        charASCII.const.p("aCharVariableName")
    )

    int(
        "getGlobalInt",

        charASCII.const.p("aIntVariableName")
    )

    int(
        "setGlobalInt",

        charASCII.const.p("aIntVariableName"),
        int("aValue")
    )

    void(
        "beep",

        void()
    )

    int(
        "notifyPopup",

        nullable..charUTF8.const.p("aTitle"),
        nullable..charUTF8.const.p("aMessage"),
        charASCII.const.p("aIconType")
    )

    val messageBox = int(
        "messageBox",

        nullable..charUTF8.const.p("aTitle"),
        nullable..charUTF8.const.p("aMessage"),
        charASCII.const.p("aDialogType"),
        charASCII.const.p("aIconType"),
        int("aDefaultButton")
    )

    charUTF8.const.p(
        "inputBox",

        messageBox["aTitle"],
        nullable..charUTF8.const.p("aMessage"),
        nullable..charUTF8.const.p("aDefaultInput")
    )

    val saveFileDialog = charUTF8.const.p(
        "saveFileDialog",

        messageBox["aTitle"],
        nullable..charUTF8.const.p("aDefaultPathAndOrFile"),
        AutoSize("aFilterPatterns")..int("aNumOfFilterPatterns"),
        nullable..charUTF8.const.p.const.p("aFilterPatterns"),
        nullable..charUTF8.const.p("aSingleFilterDescription")
    )

    charUTF8.const.p(
        "openFileDialog",

        messageBox["aTitle"],
        saveFileDialog["aDefaultPathAndOrFile"],
        saveFileDialog["aNumOfFilterPatterns"],
        saveFileDialog["aFilterPatterns"],
        saveFileDialog["aSingleFilterDescription"],
        intb("aAllowMultipleSelects")
    )

    charUTF8.const.p(
        "selectFolderDialog",

        messageBox["aTitle"],
        nullable..charUTF8.const.p("aDefaultPath")
    )

    charUTF8.const.p(
        "colorChooser",

        messageBox["aTitle"],
        nullable..charASCII.const.p("aDefaultHexRGB"),
        nullable..Check(3)..unsigned_char.p("aDefaultRGB"),
        Check(3)..unsigned_char.p("aoResultRGB")
    )
}