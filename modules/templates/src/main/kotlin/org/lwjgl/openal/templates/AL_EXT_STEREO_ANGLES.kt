/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_STEREO_ANGLES = "EXTStereoAngles".nativeClassAL("EXT_STEREO_ANGLES") {
	documentation =
		"""
		Native bindings to the $extensionName extension.

		This extension allows any stereo source to be "steered" by setting the angles at which the left and right channels should play.
		"""

	IntConstant(
		"""
		Can be used with AL10#Sourcefv() and two angles. The angles are specified anticlockwise relative to the real front, so a normal 60degree front stage is
		specified with {@code alSourcefv(sid,AL_STEREO_ANGLES,+M_PI/6,-M_PI/6)}.

		Angles are always specified in radians, anticlockwise relative to the real front (AL10#SOURCE_RELATIVE is not supported).
		""",

		"STEREO_ANGLES"..0x1030
	)
}