/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val XInput2 = "XInput2".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/XInput2.h>"
	)

	documentation = "Native bindings to XInput2.h."

	IntConstant(
		"Event types",

		"XI_DeviceChanged" _ 1,
		"XI_KeyPress" _ 2,
		"XI_KeyRelease" _ 3,
		"XI_ButtonPress" _ 4,
		"XI_ButtonRelease" _ 5,
		"XI_Motion" _ 6,
		"XI_Enter" _ 7,
		"XI_Leave" _ 8,
		"XI_FocusIn" _ 9,
		"XI_FocusOut" _ 10,
		"XI_HierarchyChanged" _ 11,
		"XI_PropertyEvent" _ 12,
		"XI_RawKeyPress" _ 13,
		"XI_RawKeyRelease" _ 14,
		"XI_RawButtonPress" _ 15,
		"XI_RawButtonRelease" _ 16,
		"XI_RawMotion" _ 17,
		"XI_TouchBegin" _ 18,
		"XI_TouchUpdate" _ 19,
		"XI_TouchEnd" _ 20,
		"XI_TouchOwnership" _ 21,
		"XI_RawTouchBegin" _ 22,
		"XI_RawTouchUpdate" _ 23,
		"XI_RawTouchEnd" _ 24
	)

	Status(
		"XIQueryVersion",
		"Announces and queries the supported XI2 version.",

		DISPLAY,
		Check(1) _ int_p.OUT("major_version_inout", "the client's supported XI2 major version, and returns the server's supported major version"),
		Check(1) _ int_p.OUT("minor_version_inout", "the client's supported XI2 minor version, and returns the server's supported minor version")
	)

	int(
		"XISelectEvents",
		"""
		Selects XI2 events.

		{@code XISelectEvents} sets the event mask for this client on win. Further events are only reported to this client if the event type matches the
		selected event mask. The masks overrides the previously selected event mask for the given device.

		If deviceid is a valid device, the event mask is selected only for this device. If deviceid is XIAllDevices or XIAllMasterDevices, the event mask is
		selected for all devices or all master devices, respectively. The effective event mask is the bit-wise OR of the XIAllDevices, XIAllMasterDevices and
		the respective device's event mask.
		""",

		DISPLAY,
		WINDOW,
		XIEventMask_p.IN("masks", "a pointer to an array of ##XIEventMask structures"),
		AutoSize("masks") _ int.IN("num_masks", "number of masks in {@code masks}")
	)

}