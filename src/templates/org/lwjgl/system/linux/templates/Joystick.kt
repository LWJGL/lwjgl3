/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val joystick = "Joystick".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<linux/joystick.h>"
	)

	documentation = "Native bindings to &ltlinux/joystick.h&gt;."

	IntConstant(
		"Types and constants for reading from /dev/js",

		"JS_EVENT_BUTTON" _ 0x01,
		"JS_EVENT_AXIS" _ 0x02,
		"JS_EVENT_INIT" _ 0x80
	)

	macro _ int("JSIOCGVERSION", "IOCTL command: get driver version.")
	macro _ int("JSIOCGAXES", "IOCTL command: get number of axes.")
	macro _ int("JSIOCGBUTTONS", "IOCTL command: get number of buttons.")

	int("JSIOCGNAME", "IOCTL command: get identifier string.", int.IN("len", "the string length"))

}