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

		"KEY_USER".."User", // string
		"KEY_NAME".."Name", // string
		"KEY_GENDER".."Gender", // string
		"KEY_PLAYER_HEIGHT".."PlayerHeight", // float
		"KEY_EYE_HEIGHT".."EyeHeight", // float
		"KEY_IPD".."IPD", // float
		"KEY_NECK_TO_EYE_DISTANCE".."NeckEyeDistance", // float[2]
		"KEY_EYE_RELIEF_DIAL".."EyeReliefDial", // int
		"KEY_EYE_TO_NOSE_DISTANCE".."EyeToNoseDist", // float[2]
		"KEY_MAX_EYE_TO_PLATE_DISTANCE".."MaxEyeToPlateDist", // float[2]
		"KEY_EYE_CUP".."EyeCup", // char[16]
		"KEY_CUSTOM_EYE_RENDER".."CustomEyeRender", // bool
		"KEY_CAMERA_POSITION".."CenteredFromWorld2" // double[7]
	)

	StringConstant(
		"",

		"DEFAULT_GENDER".."Unknown" // string
	)

	FloatConstant(
		"Default measurements empirically determined at Oculus.",

		"DEFAULT_PLAYER_HEIGHT"..1.778f,
		"DEFAULT_EYE_HEIGHT"..1.675f,
		"DEFAULT_IPD"..0.064f,
		"DEFAULT_NECK_TO_EYE_HORIZONTAL"..0.0805f,
		"DEFAULT_NECK_TO_EYE_VERTICAL"..0.075f
	)

	IntConstant(
		"Default measurements empirically determined at Oculus.",

		"DEFAULT_EYE_RELIEF_DIAL"..3
	)

	ConstantType(IntArray::class) { it.asSequence().map { it.toString() }.joinToString(separator = ", ", prefix = "{ ", postfix = " }") }(
		"",

		"DEFAULT_CAMERA_POSITION"..intArrayOf(0, 0, 0, 1, 0, 0, 0)
	)

	StringConstant(
		"",

		"PERF_HUDE_MODE".."PerfHudMode"
	)

	StringConstant(
		"",

		"DEBUG_HUD_STEREO_MODE".."DebugHudStereoMode", // allowed values are defined in enum ovrDebugHudStereoMode
		"DEBUG_HUD_STEREO_GUIDE_SIZE".."DebugHudStereoGuideSize2f", // float[2]
		"DEBUG_HUD_STEREO_GUIDE_POSITION".."DebugHudStereoGuidePosition3f", // float[3]
		"DEBUG_HUD_STEREO_GUIDE_YAWPITCHROLL".."DebugHudStereoGuideYawPitchRoll3f", // float[3]
		"DEBUG_HUD_STEREO_GUIDE_COLOR".."DebugHudStereoGuideColor4f" // float[4]
	)
}