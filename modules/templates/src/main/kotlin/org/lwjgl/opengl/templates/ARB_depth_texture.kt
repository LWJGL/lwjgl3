/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_depth_texture = "ARBDepthTexture".nativeClassGL("ARB_depth_texture", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension defines a new depth texture format. An important application of depth texture images is shadow casting, but separating this from the
		shadow extension allows for the potential use of depth textures in other applications such as image-based rendering or displacement mapping. This
		extension does not define new depth-texture environment functions, such as filtering or applying the depth values computed from a texture but leaves
		this to other extensions, such as the shadow extension.

		${GL14.promoted}
		"""

	IntConstant(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D.",

		"DEPTH_COMPONENT16_ARB" _ 0x81A5,
		"DEPTH_COMPONENT24_ARB" _ 0x81A6,
		"DEPTH_COMPONENT32_ARB" _ 0x81A7
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

		"TEXTURE_DEPTH_SIZE_ARB" _ 0x884A
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

		"DEPTH_TEXTURE_MODE_ARB" _ 0x884B
	)
}