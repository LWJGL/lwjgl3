/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.tinyfd.templates

import org.lwjgl.generator.*
import org.lwjgl.util.tinyfd.*

val tinyfiledialogs = "TinyFileDialogs".nativeClass(packageName = TinyFD_PACKAGE, prefix = "tinyfd_", library = TinyFD_LIBRARY) {
	nativeImport("tinyfiledialogs.h")

	documentation =
		"""
		Bindings to <a href="https://sourceforge.net/projects/tinyfiledialogs/">tiny file dialogs</a>, a native dialog library with support for:
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

	macro..(Address..int_p)(
		"forceConsole",
		"""
		Can be modified at run time.

		For unix & windows: 0 (graphic mode) or 1 (console mode).

		0: try to use a graphic solution, if it fails then it uses console mode.
		1: forces all dialogs into console mode even when the X server is present. It will use the package dialog or dialog.exe if installed. On windows it
		only makes sense for console applications.
		"""
	)

	macro(dynamic = true)..charUTF8_p(
		"response",
		"""
		If you pass "tinyfd_query" as {@code aTitle}, the functions will not display the dialogs but will fill {@code tinyfd_response} with the retain solution
		and return:

		Possible values for {@code tinyfd_response} are (all lowercase) for the graphic mode: windows applescript zenity zenity3 matedialog kdialog xdialog
		tkinter gdialog gxmessage xmessage

		For the console mode: dialog whiptail basicinput
		"""
	)

	intb(
		"messageBox",
		"Displays a message dialog.",

		const..charUTF8_p.IN("aTitle", "the dialog title"),
		const..charUTF8_p.IN("aMessage", "the message. It may contain \\n and \\t characters."),
		const..charASCII_p.IN("aDialogType", "the dialog type", """"ok" "okcancel" "yesno""""),
		const..charASCII_p.IN("aIconType", "the icon type", """"info" "warning" "error" "question""""),
		intb.IN("aDefaultButton", "0 for cancel/no, 1 for ok/yes"),

		returnDoc = "0 for cancel/no, 1 for ok/yes"
	)

	(const..charUTF8_p)(
		"inputBox",
		"Displays an input dialog.",

		const..charUTF8_p.IN("aTitle", "the dialog title"),
		const..charUTF8_p.IN("aMessage", "the message. May NOT contain \\n and \\t characters on Windows."),
		nullable..const..charUTF8_p.IN("aDefaultInput", "if $NULL it's a password box"),

		returnDoc = "the input value or $NULL on cancel"
	)

	val saveFileDialog = (const..charUTF8_p)(
		"saveFileDialog",
		"Displays a file save dialog.",

		const..charUTF8_p.IN("aTitle", "the dialog title"),
		const..charUTF8_p.IN("aDefaultPathAndFile", "the default path and/or file"),
		AutoSize("aFilterPatterns")..int.IN("aNumOfFilterPatterns", "the number of patterns in {@code aFilterPatterns}"),
		nullable..const..charUTF8_p.p_const_p.IN("aFilterPatterns", """an array of file type patterns ($NULL or {"*.jpg","*.png"}"""),
		nullable..const..charUTF8_p.IN("aSingleFilterDescription", "$NULL or \"image files\""),

		returnDoc = "the selected file path or $NULL on cancel"
	)

	(const..charUTF8_p)(
		"openFileDialog",
		"Displays a file open dialog.",

		const..charUTF8_p.IN("aTitle", "the dialog title"),
		const..charUTF8_p.IN("aDefaultPathAndFile", "the default path and/or file"),
		saveFileDialog["aNumOfFilterPatterns"],
		saveFileDialog["aFilterPatterns"],
		saveFileDialog["aSingleFilterDescription"],
		intb.IN("aAllowMultipleSelects", "if true, multiple selections are allowed"),

		returnDoc = "the file(s) selected or $NULL on cancel. In case of multiple files, the separator is '|'."
	)

	(const..charUTF8_p)(
		"selectFolderDialog",
		"Displays a folder selection dialog.",

		const..charUTF8_p.IN("aTitle", "the dialog title"),
		const..charUTF8_p.IN("aDefaultPath", "the default path")
	)

	(const..charUTF8_p)(
		"colorChooser",
		"Displays a color chooser dialog.",

		const..charUTF8_p.IN("aTitle", "the dialog title"),
		nullable..const..charASCII_p.IN("aDefaultHexRGB", "$NULL or \"\\#FF0000\""),
		nullable..Check(3)..unsigned_char_p.INOUT("aDefaultRGB", "{ 0 , 255 , 255 }. Used only if {@code aDefaultHexRGB} is $NULL."),
		Check(3)..unsigned_char_p.OUT("aoResultRGB", "returns the selected color. {@code aDefaultRGB} and {@code aoResultRGB} can be the same array."),

		returnDoc = "the selected hexcolor as a string \"\\#FF0000\" or $NULL on cancel"
	)
}