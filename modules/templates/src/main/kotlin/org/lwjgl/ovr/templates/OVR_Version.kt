/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.OVR_PACKAGE

val OVR_Version = "OVRVersion".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR") {
	documentation = "LibOVR version identification."

	IntConstant(
		"",

	    "PRODUCT_VERSION" _ 0,
		"MAJOR_VERSION" _ 7,
		"MINOR_VERSION" _ 0,
		"PATCH_VERSION" _ 0,
		"BUILD_NUMBER" _ 0
	)

	StringConstant(
		"\"Product.Major.Minor.Patch.Build\"",

	    "VERSION_STRING" expr "Integer.toString(OVR_PRODUCT_VERSION) + '.' + OVR_MAJOR_VERSION + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION"
	)

	StringConstant(
		"The product version for the Oculus Display Driver.",

	    "DISPLAY_DRIVER_PRODUCT_VERSION" _ "1.2.7.0"
	)

	StringConstant(
		"The product version for the Oculus Position Tracker Driver.",

		"POSITIONAL_TRACKER_DRIVER_PRODUCT_VERSION" _ "1.0.11.0"
	)
}