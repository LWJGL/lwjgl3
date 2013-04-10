/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun XKBlib() = "XKBlib".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
	    "<X11/XKBlib.h>"
	)

	javaDoc("Native bindings to XKBlib.h.")

	IntConstant.block(
		"Mask bits for {@link XkbDescRec}.",

		"XkbControlsMask".expr<Int>("1<<0"),
		"XkbServerMapMask".expr<Int>("1<<1"),
		"XkbIClientMapMask".expr<Int>("1<<2"),
		"XkbIndicatorMapMask".expr<Int>("1<<3"),
		"XkbNamesMask".expr<Int>("1<<4"),
		"XkbCompatMapMask".expr<Int>("1<<5"),
		"XkbGeometryMask".expr<Int>("1<<6"),
		"XkbAllComponentsMask".expr<Int>("1<<7")
	)

	Bool.func(
		"XkbQueryExtension",
		"Determines the compatibility of a library at runtime.",

		DISPLAY,
		Check(1) _ int_p.OUT("opcodeReturn", "backfilled with the major extension opcode"),
		Check(1) _ int_p.OUT("eventBaseReturn", "backfilled with the extension base event code"),
		Check(1) _ int_p.OUT("errorBaseReturn", "backfilled with the extension base error code"),
		Check(1) _ int_p.OUT("majorRtrn", "compile time lib major version in, server major version out"),
		Check(1) _ int_p.OUT("minorRtrn", "compile time lib min version in, server minor version out")
	)

	Bool.func(
		"XkbSetDetectableAutoRepeat",
		"Sets DetectableAutorepeat.",

		DISPLAY,
		Bool.IN("detectable", "if true will enable detectable auto-repeat"),
		Bool_p.IN("supported", "backefilled with true if DetectableAutorepeat is supported")
	)

	KeySym.func(
		"XkbKeycodeToKeysym",
		"Finds the keysym bound to a particular key at a specified group and shift level.",

		DISPLAY,
		KeyCode.IN("kc", "key of interest"),
		int.IN("group", "group of interest"),
		int.IN("level", "shift level of interest")
	)

	XkbDescPtr.func(
		"XkbGetKeyboard",
		"Allocates and returns a pointer to a keyboard description.",

		DISPLAY,
		unsigned_int.IN("which", "the components to query"),
		unsigned_int.IN("deviceSpec", "the device to query")
	)

	void.func(
		"XkbFreeKeyboard",
		"Destroys either an entire {@link XkbDescRec} or just some of its members.",

		XkbDescPtr.IN("xkb", "the keyboard description with components to free"),
		unsigned_int.IN("which", "the mask selecting components to free"),
		Bool.IN("freeDesc", "if true, free all components and {@code xkb}")
	)

}