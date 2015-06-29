/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val XKBlib = "XKBlib".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/XKBlib.h>"
	)

	documentation = "Native bindings to XKBlib.h."

	IntConstant(
		"""
		XkbUseCoreKbd is used to specify the core keyboard without having to look up its X input extension identifier.
		XkbUseCorePtr is used to specify the core pointer without having to look up its X input extension identifier.
		XkbDfltXIClass is used to specify "don't care" any place that the XKB protocol is looking for an X Input Extension device class.
		XkbDfltXIId is used to specify "don't care" any place that the XKB protocol is looking for an X Input Extension feedback identifier.
		XkbAllXIClasses is used to get information about all device indicators, whether they're part of the indicator feedback class or the keyboard feedback class.
		XkbAllXIIds is used to get information about all device indicator feedbacks without having to list them.
		XkbXINone is used to indicate that no class or id has been specified.

		XkbLegalXILedClass(c) True if 'c' specifies a legal class with LEDs
		XkbLegalXIBellClass(c) True if 'c' specifies a legal class with bells
		XkbExplicitXIDevice(d) True if 'd' explicitly specifies a device
		XkbExplicitXIClass(c) True if 'c' explicitly specifies a device class
		XkbExplicitXIId(c) True if 'i' explicitly specifies a device id
		XkbSingleXIClass(c) True if 'c' specifies exactly one device class, including the default.
		XkbSingleXIId(i) True if 'i' specifies exactly one device identifier, including the default.
		""",

		"XkbUseCoreKbd" _ 0x0100,
		"XkbUseCorePtr" _ 0x0200,
		"XkbDfltXIClass" _ 0x0300,
		"XkbDfltXIId" _ 0x0400,
		"XkbAllXIClasses" _ 0x0500,
		"XkbAllXIIds" _ 0x0600,
		"XkbXINone" _ 0xff00
	)

	IntConstant(
		"",

		"XkbNumKbdGroups" _ 4
	)

	IntConstant(
		"Assorted constants and limits.",

		"XkbNumModifiers" _ 8,
		"XkbNumVirtualMods" _ 16,
		"XkbNumIndicators" _ 32,
		"XkbAllIndicatorsMask" expr "0xffffffff",
		"XkbMaxRadioGroups" _ 32,
		"XkbAllRadioGroupsMask" expr "0xffffffff",
		"XkbMaxShiftLevel" _ 63,
		"XkbMaxSymsPerKey" expr "XkbMaxShiftLevel*XkbNumKbdGroups",
		"XkbRGMaxMembers" _ 12,
		"XkbActionMessageLength" _ 6,
		"XkbKeyNameLength" _ 4,
		"XkbMaxRedirectCount" _ 8
	)

	IntConstant(
		"Mask bits for ##XkbDescRec.",

		"XkbControlsMask" expr "1<<0",
		"XkbServerMapMask" expr "1<<1",
		"XkbIClientMapMask" expr "1<<2",
		"XkbIndicatorMapMask" expr "1<<3",
		"XkbNamesMask" expr "1<<4",
		"XkbCompatMapMask" expr "1<<5",
		"XkbGeometryMask" expr "1<<6",
		"XkbAllComponentsMask" _ 0x7F
	)

	Bool(
		"XkbQueryExtension",
		"Determines the compatibility of a library at runtime.",

		DISPLAY,
		Check(1) _ int_p.OUT("opcodeReturn", "backfilled with the major extension opcode"),
		Check(1) _ int_p.OUT("eventBaseReturn", "backfilled with the extension base event code"),
		Check(1) _ int_p.OUT("errorBaseReturn", "backfilled with the extension base error code"),
		Check(1) _ int_p.OUT("majorRtrn", "compile time lib major version in, server major version out"),
		Check(1) _ int_p.OUT("minorRtrn", "compile time lib min version in, server minor version out")
	)

	Bool(
		"XkbSetDetectableAutoRepeat",
		"Sets DetectableAutorepeat.",

		DISPLAY,
		Bool.IN("detectable", "if true will enable detectable auto-repeat"),
		Bool_p.IN("supported", "backefilled with true if DetectableAutorepeat is supported")
	)

	KeySym(
		"XkbKeycodeToKeysym",
		"Finds the keysym bound to a particular key at a specified group and shift level.",

		DISPLAY,
		unsigned_int.IN("kc", "key of interest"),
		int.IN("group", "group of interest"),
		int.IN("level", "shift level of interest")
	)

	XkbDescPtr(
		"XkbGetKeyboard",
		"Allocates and returns a pointer to a keyboard description.",

		DISPLAY,
		unsigned_int.IN("which", "the components to query"),
		unsigned_int.IN("deviceSpec", "the device to query")
	)

	void(
		"XkbFreeKeyboard",
		"Destroys either an entire ##XkbDescRec or just some of its members.",

		XkbDescPtr.IN("xkb", "the keyboard description with components to free"),
		unsigned_int.IN("which", "the mask selecting components to free"),
		Bool.IN("freeDesc", "if true, free all components and {@code xkb}")
	)

}