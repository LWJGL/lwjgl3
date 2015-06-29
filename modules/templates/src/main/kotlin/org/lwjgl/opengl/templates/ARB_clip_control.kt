/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_clip_control = "ARBClipControl".nativeClassGL("ARB_clip_control") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides additional clip control modes to configure how clip space is mapped to window space.  This extension's goal is to 1) allow
		OpenGL to effectively match Direct3D's coordinate system conventions, and 2) potentially improve the numerical precision of the Z coordinate mapping.

		${GL45.promoted}
		"""

	IntConstant(
		"Accepted by the {@code origin} parameter of #ClipControl().",

		"LOWER_LEFT" _ 0x8CA1,
		"UPPER_LEFT" _ 0x8CA2
	)

	IntConstant(
		"Accepted by the {@code depth} parameter of #ClipControl().",

		"NEGATIVE_ONE_TO_ONE" _ 0x935E,
		"ZERO_TO_ONE" _ 0x935F
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CLIP_ORIGIN" _ 0x935C,
		"CLIP_DEPTH_MODE" _ 0x935D
	)

	GL45 reuse "ClipControl"
}