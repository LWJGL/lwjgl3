/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.gamepad

import org.lwjgl.generator.*

val GAMEPAD_PACKAGE = "org.lwjgl.system.gamepad"

fun config() {
	packageInfo(
		GAMEPAD_PACKAGE,
		"""
		Contains bindings to the <a href="https://github.com/ThemsAllTook/libstem_gamepad">Gamepad</a> library.

		Gamepad provides a low-level interface for USB game controller input. Each element on an attached game controller is mapped to zero or more buttons and
		zero or more axes. Buttons are binary controls; axes are continuous values ranging from -1.0f to 1.0f. The presence and ordering of elements depends on
		the platform and driver.
		"""
	)
}

val Gamepad_device_p = struct_p(GAMEPAD_PACKAGE, "GamepadDevice", nativeName = "struct Gamepad_device") {
	documentation = "A gamepad device."

	unsigned_int.member(
		"deviceID",
		"""
		unique device identifier for application session, starting at 0 for the first device attached and incrementing by 1 for each additional device. If a
		device is removed and subsequently reattached during the same application session, it will have a new {@code deviceID}.
		"""
	)
	charASCII.const_p.member("description", "human-readable device name")
	int.member("vendorID", "USB vendor ID, as returned by the driver")
	int.member("productID", "USB product ID, as returned by the driver")
	AutoSize("axisStates")..unsigned_int.member("numAxes", "number of axis elements belonging to the device")
	AutoSize("buttonStates")..unsigned_int.member("numButtons", "number of button elements belonging to the device")
	float_p.member("axisStates", "array of values representing the current state of each axis, in the range [-1..1]")
	bool_p.member("buttonStates", "array of values representing the current state of each button")
	voidptr.member(
		"privateData",
		"""
		platform-specific device data storage. Don't touch unless you know what you're doing and don't mind your code breaking in future versions of this
		library.
		"""
	)
}

val Gamepad_deviceAttachCallback = "Gamepad_deviceAttachCallback *".callback(
	GAMEPAD_PACKAGE, void, "GamepadDeviceAttachCallback",
	"Device attached callback.",

	Gamepad_device_p.IN("device", "the gamepad device that was attached"),
	voidptr.IN("context", "the context pointer passed to #deviceAttachFunc()")
) {
	documentation = "Instances of this interface may be passed to the #deviceAttachFunc() function."
}

val Gamepad_deviceRemoveCallback = "Gamepad_deviceRemoveCallback *".callback(
	GAMEPAD_PACKAGE, void, "GamepadDeviceRemoveCallback",
	"Device removed callback.",

	Gamepad_device_p.IN("device", "the gamepad device that was removed"),
	voidptr.IN("context", "the context pointer passed to #deviceRemoveFunc()")
) {
	documentation = "Instances of this interface may be passed to the #deviceRemoveFunc() function."
}

val Gamepad_buttonDownCallback = "Gamepad_buttonDownCallback *".callback(
	GAMEPAD_PACKAGE, void, "GamepadButtonDownCallback",
	"Button pressed callback.",

	Gamepad_device_p.IN("device", "the gamepad device on which the button was pressed"),
	unsigned_int.IN("buttonID", "the button ID"),
	double.IN("timestamp", "the event timestamp"),
	voidptr.IN("context", "the context pointer passed to #buttonDownFunc()")
) {
	documentation = "Instances of this interface may be passed to the #buttonDownFunc() function."
}

val Gamepad_buttonUpCallback = "Gamepad_buttonUpCallback *".callback(
	GAMEPAD_PACKAGE, void, "GamepadButtonUpCallback",
	"Button released callback.",

	Gamepad_device_p.IN("device", "the gamepad device on which the button was released"),
	unsigned_int.IN("buttonID", "the button ID"),
	double.IN("timestamp", "the event timestamp"),
	voidptr.IN("context", "the context pointer passed to #buttonUpFunc()")
) {
	documentation = "Instances of this interface may be passed to the #buttonUpFunc() function."
}

val Gamepad_axisMoveCallback = "Gamepad_axisMoveCallback *".callback(
	GAMEPAD_PACKAGE, void, "GamepadAxisMoveCallback",
	"Axis moved callback.",

	Gamepad_device_p.IN("device", "the gamepad device on which the axis was moved"),
	unsigned_int.IN("axisID", "the axis ID"),
	float.IN("value", "the axis value"),
	float.IN("lastValue", "the last axis value"),
	double.IN("timestamp", "the event timestamp"),
	voidptr.IN("context", "the context pointer passed to #axisMoveFunc()")
) {
	documentation = "Instances of this interface may be passed to the #axisMoveFunc() function."
}