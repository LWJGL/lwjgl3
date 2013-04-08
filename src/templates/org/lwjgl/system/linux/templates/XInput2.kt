/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun XInput2() = "XInput2".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h"
	)

	javaDoc("Native bindings to XInput2.h.")

	Status.func(
		"XIQueryVersion",
		"Announces and queries the supported XI2 version.",

		DISPLAY,
		Check(1) _ int_p.OUT("major_version_inout", "the client's supported XI2 major version, and returns the server's supported major version"),
		Check(1) _ int_p.OUT("minor_version_inout", "the client's supported XI2 minor version, and returns the server's supported minor version")
	)

	int.func(
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
	    XIEventMask_p.IN("masks", "a pointer to an array of {@link XIEventMask} structures"),
	    AutoSize("masks") _ int.IN("num_masks", "number of masks in {@code masks}")
	)

}