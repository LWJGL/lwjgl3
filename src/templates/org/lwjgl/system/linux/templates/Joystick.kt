/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun Joystick() = "Joystick".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<linux/joystick.h>"
	)

	javaDoc("Native bindings to &ltlinux/joystick.h&gt;.")

	IntConstant.block(
		"Types and constants for reading from /dev/js",

		"JS_EVENT_BUTTON" _ 0x01,
		"JS_EVENT_AXIS" _ 0x02,
		"JS_EVENT_INIT" _ 0x80
	)

	StructType(
		struct(LINUX_PACKAGE, "JSEvent", structName = "js_event", globalIdentifier = false) {
			javaDoc("Joystick event.")
			nativeImport (
				"LinuxLWJGL.h",
				"<linux/joystick.h>"
			)

			int.member("time")
			short.member("value")
			unsigned_char.member("type")
			unsigned_char.member("number")
		}
	)

	macro _ int.func("JSIOCGVERSION", "IOCTL command: get driver version.")
	macro _ int.func("JSIOCGAXES", "IOCTL command: get number of axes.")
	macro _ int.func("JSIOCGBUTTONS", "IOCTL command: get number of buttons.")

	int.func("JSIOCGNAME", "IOCTL command: get identifier string.", int.IN("len", "the string length"))

}