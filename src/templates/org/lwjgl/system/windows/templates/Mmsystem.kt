/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val Mmsystem = "Mmsystem".nativeClass(WINDOWS_PACKAGE) {
	nativeImport (
		"WindowsLWJGL.h"
	)

	val MMSYSERR_BASE = 0

	IntConstant(
		"general error return values.",

		"MMSYSERR_NOERROR" _ 0,
		"MMSYSERR_ERROR" expr "$MMSYSERR_BASE + 1",
		"MMSYSERR_BADDEVICEID" expr "$MMSYSERR_BASE + 2",
		"MMSYSERR_NOTENABLED" expr "$MMSYSERR_BASE + 3",
		"MMSYSERR_ALLOCATED" expr "$MMSYSERR_BASE + 4",
		"MMSYSERR_INVALHANDLE" expr "$MMSYSERR_BASE + 5",
		"MMSYSERR_NODRIVER" expr "$MMSYSERR_BASE + 6",
		"MMSYSERR_NOMEM" expr "$MMSYSERR_BASE + 7",
		"MMSYSERR_NOTSUPPORTED" expr "$MMSYSERR_BASE + 8",
		"MMSYSERR_BADERRNUM" expr "$MMSYSERR_BASE + 9",
		"MMSYSERR_INVALFLAG" expr "$MMSYSERR_BASE + 10",
		"MMSYSERR_INVALPARAM" expr "$MMSYSERR_BASE + 11",
		"MMSYSERR_HANDLEBUSY" expr "$MMSYSERR_BASE + 12",
		"MMSYSERR_INVALIDALIAS" expr "$MMSYSERR_BASE + 13",
		"MMSYSERR_BADDB" expr "$MMSYSERR_BASE + 14",
		"MMSYSERR_KEYNOTFOUND" expr "$MMSYSERR_BASE + 15",
		"MMSYSERR_READERROR" expr "$MMSYSERR_BASE + 16",
		"MMSYSERR_WRITEERROR" expr "$MMSYSERR_BASE + 17",
		"MMSYSERR_DELETEERROR" expr "$MMSYSERR_BASE + 18",
		"MMSYSERR_VALNOTFOUND" expr "$MMSYSERR_BASE + 19",
		"MMSYSERR_NODRIVERCB" expr "$MMSYSERR_BASE + 20",
		"MMSYSERR_MOREDATA" expr "$MMSYSERR_BASE + 21",
		"MMSYSERR_LASTERROR" expr "$MMSYSERR_BASE + 21"
	)

	val JOYERR_BASE = 160

	IntConstant(
		"joystick error return values.",

		"JOYERR_NOERROR" _ 0,
		"JOYERR_PARMS" expr "$JOYERR_BASE + 5",
		"JOYERR_NOCANDO" expr "$JOYERR_BASE + 6",
		"JOYERR_UNPLUGGED" expr "$JOYERR_BASE + 7"
	)

	IntConstant(
		"Constants used with JOYINFO and JOYINFOEX structures and MM_JOY* messages.",

		"JOY_BUTTON1" _ 0x0001,
		"JOY_BUTTON2" _ 0x0002,
		"JOY_BUTTON3" _ 0x0004,
		"JOY_BUTTON4" _ 0x0008,
		"JOY_BUTTON1CHG" _ 0x0100,
		"JOY_BUTTON2CHG" _ 0x0200,
		"JOY_BUTTON3CHG" _ 0x0400
	)

	IntConstant(
		"constants used with JOYINFOEX.",

		"JOY_BUTTON5" _ 0x00000010,
		"JOY_BUTTON6" _ 0x00000020,
		"JOY_BUTTON7" _ 0x00000040,
		"JOY_BUTTON8" _ 0x00000080,
		"JOY_BUTTON9" _ 0x00000100,
		"JOY_BUTTON10" _ 0x00000200,
		"JOY_BUTTON11" _ 0x00000400,
		"JOY_BUTTON12" _ 0x00000800,
		"JOY_BUTTON13" _ 0x00001000,
		"JOY_BUTTON14" _ 0x00002000,
		"JOY_BUTTON15" _ 0x00004000,
		"JOY_BUTTON16" _ 0x00008000,
		"JOY_BUTTON17" _ 0x00010000,
		"JOY_BUTTON18" _ 0x00020000,
		"JOY_BUTTON19" _ 0x00040000,
		"JOY_BUTTON20" _ 0x00080000,
		"JOY_BUTTON21" _ 0x00100000,
		"JOY_BUTTON22" _ 0x00200000,
		"JOY_BUTTON23" _ 0x00400000,
		"JOY_BUTTON24" _ 0x00800000,
		"JOY_BUTTON25" _ 0x01000000,
		"JOY_BUTTON26" _ 0x02000000,
		"JOY_BUTTON27" _ 0x04000000,
		"JOY_BUTTON28" _ 0x08000000,
		"JOY_BUTTON29" _ 0x10000000,
		"JOY_BUTTON30" _ 0x20000000,
		"JOY_BUTTON31" _ 0x40000000,
		"JOY_BUTTON32" _ 0x80000000.i
	)

	IntConstant(
		"constants used with JOYINFOEX structure.",

		"JOY_POVCENTERED" _ -1,
		"JOY_POVFORWARD" _ 0,
		"JOY_POVRIGHT" _ 9000,
		"JOY_POVBACKWARD" _ 18000,
		"JOY_POVLEFT" _ 27000,

		"JOY_RETURNX" _ 0x00000001,
		"JOY_RETURNY" _ 0x00000002,
		"JOY_RETURNZ" _ 0x00000004,
		"JOY_RETURNR" _ 0x00000008,
		"JOY_RETURNU" _ 0x00000010,
		"JOY_RETURNV" _ 0x00000020,
		"JOY_RETURNPOV" _ 0x00000040,
		"JOY_RETURNBUTTONS" _ 0x00000080,
		"JOY_RETURNRAWDATA" _ 0x00000100,
		"JOY_RETURNPOVCTS" _ 0x00000200,
		"JOY_RETURNCENTERED" _ 0x00000400,
		"JOY_USEDEADZONE" _ 0x00000800,
		"JOY_RETURNALL" expr "(JOY_RETURNX | JOY_RETURNY | JOY_RETURNZ | JOY_RETURNR | JOY_RETURNU | JOY_RETURNV | JOY_RETURNPOV | JOY_RETURNBUTTONS)",
		"JOY_CAL_READALWAYS" _ 0x00010000,
		"JOY_CAL_READXYONLY" _ 0x00020000,
		"JOY_CAL_READ3" _ 0x00040000,
		"JOY_CAL_READ4" _ 0x00080000,
		"JOY_CAL_READXONLY" _ 0x00100000,
		"JOY_CAL_READYONLY" _ 0x00200000,
		"JOY_CAL_READ5" _ 0x00400000,
		"JOY_CAL_READ6" _ 0x00800000,
		"JOY_CAL_READZONLY" _ 0x01000000,
		"JOY_CAL_READRONLY" _ 0x02000000,
		"JOY_CAL_READUONLY" _ 0x04000000,
		"JOY_CAL_READVONLY" _ 0x08000000
	)

	IntConstant(
		"joystick ID constants.",

		"JOYSTICKID1" _ 0,
		"JOYSTICKID2" _ 1
	)

	IntConstant(
		"joystick driver capabilites.",

		"JOYCAPS_HASZ" _ 0x0001,
		"JOYCAPS_HASR" _ 0x0002,
		"JOYCAPS_HASU" _ 0x0004,
		"JOYCAPS_HASV" _ 0x0008,
		"JOYCAPS_HASPOV" _ 0x0010,
		"JOYCAPS_POV4DIR" _ 0x0020,
		"JOYCAPS_POVCTS" _ 0x0040
	)

	documentation = "Native bindings to Mmsystem.h."

	MMRESULT(
		"joyGetDevCaps",
		"Queries a joystick to determine its capabilities.",

		UINT_PTR.IN(
			"joyID",
			"""
			Identifier of the joystick to be queried. Valid values for {@code joyID} range from -1 to 15. A value of -1 enables retrieval of the
			{@code szRegKey} member of the ##JOYCAPS structure whether a device is present or not.
			"""
		),
		LPJOYCAPS.OUT("jc", "pointer to a {@code JOYCAPS} structure to contain the capabilities of the joystick."),
		UINT.IN("bjc", "size, in bytes, of the {@code JOYCAPS} structure.")
	)

	MMRESULT(
		"joyGetPos",
		"Queries a joystick for its position and button status.",

		UINT.IN("joyID", "identifier of the joystick to be queried. Valid values for {@code joyID} range from zero (#JOYSTICKID1) to 15"),
		LPJOYINFO.IN("ji", "pointer to a ##JOYINFO structure that contains the position and button status of the joystick")
	)

	MMRESULT(
		"joyGetPosEx",
		"Queries a joystick for its position and button status.",

		UINT.IN("joyID", "identifier of the joystick to be queried. Valid values for {@code joyID} range from zero (#JOYSTICKID1) to 15"),
		LPJOYINFOEX.IN(
			"ji",
			"""
			pointer to a ##JOYINFOEX structure that contains the position and button status of the joystick. You must set the {@code size} and
			{@code flags} members or {@code joyGetPosEx} will fail. The information returned from {@code joyGetPosEx} depends on the flags you specify in
			{@code flags}.
			"""
		)
	)

	DWORD(
		"timeGetTime",
		"""
		retrieves the system time, in milliseconds. The system time is the time elapsed since Windows was started.

		Note that the value returned by the {@code timeGetTime} function is a {@code DWORD} value. The return value wraps around to 0 every 2^32 milliseconds,
		which is about 49.71 days. This can cause problems in code that directly uses the {@code timeGetTime} return value in computations, particularly where
		the value is used to control code execution. You should always use the difference between two {@code timeGetTime} return values in computations.
		"""
	)

}