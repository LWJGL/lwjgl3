/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_shadow_ambient = "ARBShadowAmbient".nativeClassGL("ARB_shadow_ambient", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows the user to specify the texture value to use when the texture compare function fails. Normally this value is zero. By allowing an
		arbitrary value we can get functionality which otherwise requires an advanced texture combine extension (such as
		${registryLinkTo("NV", "register_combiners")}) and multiple texture units.

		Requires ${ARB_shadow.link} and ${ARB_depth_texture.link}.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

		"TEXTURE_COMPARE_FAIL_VALUE_ARB" _ 0x80BF
	)

}