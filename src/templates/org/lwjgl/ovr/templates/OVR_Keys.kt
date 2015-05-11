/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.OVR_PACKAGE

val OVR_Keys = "OVRKeys".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR") {
	documentation = "Keys for libOVR's CAPI calls."

	StringConstant(
		"",

		"KEY_USER" _ "User", // string
		"KEY_NAME" _ "Name", // string
		"KEY_GENDER" _ "Gender", // string
		"KEY_PLAYER_HEIGHT" _ "PlayerHeight", // float
		"KEY_EYE_HEIGHT" _ "EyeHeight", // float
		"KEY_IPD" _ "IPD", // float
		"KEY_NECK_TO_EYE_DISTANCE" _ "NeckEyeDistance", // float[2]
		"KEY_EYE_RELIEF_DIAL" _ "EyeReliefDial", // int
		"KEY_EYE_TO_NOSE_DISTANCE" _ "EyeToNoseDist", // float[2]
		"KEY_MAX_EYE_TO_PLATE_DISTANCE" _ "MaxEyeToPlateDist", // float[2]
		"KEY_EYE_CUP" _ "EyeCup", // char[16]
		"KEY_CUSTOM_EYE_RENDER" _ "CustomEyeRender", // bool
		"KEY_CAMERA_POSITION" _ "CenteredFromWorld" // double[7]
	)

	StringConstant(
		"",

		"DEFAULT_GENDER" _ "Unknown" // string
	)

	FloatConstant(
		"Default measurements empirically determined at Oculus.",

		"DEFAULT_PLAYER_HEIGHT" _ 1.778f,
		"DEFAULT_EYE_HEIGHT" _ 1.675f,
		"DEFAULT_IPD" _ 0.064f,
		"DEFAULT_NECK_TO_EYE_HORIZONTAL" _ 0.0805f,
		"DEFAULT_NECK_TO_EYE_VERTICAL" _ 0.075f
	)

	IntConstant(
		"Default measurements empirically determined at Oculus.",

		"DEFAULT_EYE_RELIEF_DIAL" _ 3
	)

	ConstantType(javaClass<IntArray>()) { it.sequence().map { it.toString() }.join(separator = ", ", prefix = "{ ", postfix = " }") }(
		"",

		"DEFAULT_CAMERA_POSITION" _ intArray(0, 0, 0, 1, 0, 0, 0)
	)

}