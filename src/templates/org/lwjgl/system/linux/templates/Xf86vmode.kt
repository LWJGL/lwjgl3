/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun Xf86vmode() = "Xf86vmode".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h"
	)

	javaDoc("Native bindings to Xf86vmode.h.")

	Bool.func(
		"XF86VidModeQueryExtension",
		"Returns the lowest numbered error and event values assigned to the extension.",

		DISPLAY,
		Check(1) _ int_p.OUT("event_base", "the lowest numbered event value"),
		Check(1) _ int_p.OUT("error_base", "the lowest numbered error value")
	)

	Bool.func(
		"XF86VidModeGetGammaRampSize",
		"Returns the gamma ramp size.",

		DISPLAY,
		int.IN("screen", "the screen number"),
		int_p.OUT("size", "the gamma ramp size")
	)

	Bool.func(
		"XF86VidModeGetGammaRamp",
		"Returns the gamma ramp.",

		DISPLAY,
		int.IN("screen", "the screen number"),
		AutoSize(
			"red_array",
			"green_array",
			"blue_array"
		) _ int.IN("size", "the gamma ramp size"),
		unsigned_short_p.OUT("red_array", "the red gamma ramp"),
		unsigned_short_p.OUT("green_array", "the green gamma ramp"),
		unsigned_short_p.OUT("blue_array", "the blue gamma ramp")
	)

	Bool.func(
		"XF86VidModeSetGammaRamp",
		"Sets the gamma ramp.",

		DISPLAY,
		int.IN("screen", "the screen number"),
		AutoSize(
			"red_array",
			"green_array",
			"blue_array"
		) _ int.IN("size", "the gamma ramp size"),
		unsigned_short_p.IN("red_array", "the red gamma ramp"),
		unsigned_short_p.IN("green_array", "the green gamma ramp"),
		unsigned_short_p.IN("blue_array", "the blue gamma ramp")
	)

}